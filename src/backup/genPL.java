package backup;
import java.io.*;
import java.util.ArrayList;
import java.util.Date; 
import java.util.List;
import java.util.*;
import java.lang.Math;

// Product lines generated via atomic add and delete rules.
public class genPL {

/**
	* Updates input_presence_cond.csv with new presence conditions
	* based on the previously executed rule based on the following logic:
	* 	- for an added element, attach the rule as a presence condition 
	* 	- for a deleted element, attach negation of the rule
	* Always run after a call to genRule. This method works with edit 
	* rules that perform atomic changes. The model instance for the created
	* product line will be stored in input.xmi.
	*
	* @param  mode The type of rule: addition ('a') or deletion ('d')
	* @param  ename The name of the element added/deleted.
	* @param  type The type of the element added/deleted.
	* @param  fname The name of the feature associated with this rule.
*/
	public static int processRule(String mode, String ename, String type, String fname)
	{
		try {

			// Read in current set of presence conditions
			BufferedReader in = new BufferedReader(new FileReader("input_presence_cond.csv"));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			// This array will be updated and written to input_presence_cond.csv
			String input_arr[] = new String[lines + 1];

			in = new BufferedReader(new FileReader("input_presence_cond.csv"));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			int fname_exists = 0;

			// Add the rule as a new feature
			String feature_line = input_arr[0].substring(1, input_arr[0].length() - 1);
			String features[] = feature_line.split(" ");
			for (int i = 0; i < features.length - 1; i++) {
				features[i] = features[i + 1];
			}
			features[features.length - 1] = fname;

			String new_features = "(or";
			for (int i = 0; i < features.length; i++) {
				if (!((i == features.length - 1) && (fname_exists == 1))) {
					new_features = new_features + " " + features[i];
				}
				if (features[i].equals(fname)) {
					fname_exists = 1;
				}
			}
			new_features = new_features + ")";
			input_arr[0] = new_features;

			// If the rule was an addition, attach the rule as a presence condition to the added element. For addition, replace input.xmi with output.xmi (the instance with the added element).
			if (mode.equals("a")) {
				String new_element = type + ";" + ename + ";" + fname;
				input_arr[input_arr.length - 1] = new_element;

				// Replace input.xmi
				executeCommand("cp -rf ./output.xmi ./input.xmi");
			}

			// If the rule was a deletion, attach the negation of the rule as a presence condition to the deleted element. For deletion, remove output.xmi and keep input.xmi (only need to add presence condition).
			else if (mode.equals("d")) {

				// Find the deleted element (will always find if rule executed successfully)
				String line_split[] = new String[0];
				int index = -1;
				for (int i = 1; i < input_arr.length; i++) {
					System.out.println("ARR: " + input_arr[i]);
					
					if(input_arr[i] != null){
						line_split = input_arr[i].split(";");
						System.out.println("LINE: " + line_split[1]);
						if (line_split[1].equals(ename)){
							index = i;
							i = input_arr.length;
						}
					}
				}

				// Add the negation of the rule
				line_split[2] = "(and " + line_split[2] + " " + "(not " + fname + "))";
				String new_element_line = "";
				for (int i = 0; i < line_split.length; i++) {
					new_element_line = new_element_line + line_split[i] + ";";
				}
				new_element_line = new_element_line.substring(0, new_element_line.length() - 1);

				// Update input_arr
				input_arr[index] = new_element_line;
			}

			// Update input_presence_cond
			BufferedWriter out = new BufferedWriter(new FileWriter("input_presence_cond.csv"));
			System.out.println("New presence conditions:");
			for (int i = 0; i < input_arr.length; i++) {
				if (!(mode.equals("d") && (i == input_arr.length - 1))) {
					System.out.println(input_arr[i]);
					out.write(input_arr[i]);
					out.newLine();
				}
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
/*
	Helper to execute shell commands.
*/
	public static String executeCommand(String command) {

	    StringBuffer output = new StringBuffer();

	    Process p;
	    try {
	        p = Runtime.getRuntime().exec(command);
	        p.waitFor();
	        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

	        String line = "";           
	        while ((line = reader.readLine())!= null) {
	            output.append(line + "\n");
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return output.toString();
	}

	/* 3 dimensions:
			size of domain model: clone 1-5 times
			# of features: run genRule -> processRule w/ unique fname nFeat times
			# of rules/feature: randomly select # from normal distribution (13.5, 1) 					 and run processRule that many times per feature.
		This method is meant to execute from a dir containing an input.xmi (source
		model), input_presence_cond.csv and genRule (gen + executes rules).
		nFeat is the number of features, and deleteA is an array of names of
		elements that are allowed to be deleted. If deleteA is close in size to
		addA, then the percentage each will be selected should be ~50%. The sizes of
		addA + deleteA needs to be greater than nFeat * avg(nRules). We are choosing
		to restrict each element to only be deleted once for simplicity.

		Structure of delA:
		[[cname, ctype, aname], [cname, ctype, aname], ...]
		To call genDelete - (cname, aname, anyname)

		Structure of addA:
		[[pname, cname, ptype, ctype, aname, mode], ...]
		To call genCreate - (pname, cname, ptype, ctype, aname, "bCMS", "Model", anyname, mode)
	*/
	public static int createExpPL (int nFeat, ArrayList<String[]> delA, ArrayList<String[]> addA) {
		int size = 0;

		// Call processRule with unique fname nFeat times
		for (int i = 0; i < nFeat; i++) {
			// Normally distribute the number of features per rule
		    Random randGauss = new Random();
		    int nRules = (int)(Math.round(randGauss.nextGaussian() + 13.5));
		    String pname, cname, ptype, ctype, aname, a_mode;

		    // Call processRule with the same fname nRules times.
		    for (int j = 0; j < nRules; j++) {
				// Randomly select between add or delete rule
				Random rand = new Random();
				String mode;
			    int randomMode = rand.nextInt(2);
			    
			    //Add
			    if ((randomMode == 0) && (addA.size() != 0)) {
			    	// Set parameters
			    	mode = "a";
			    	size = addA.size();
			    	pname = addA.get(size - 1)[0];
			    	cname = addA.get(size - 1)[1];
			    	ptype = addA.get(size - 1)[2];
			    	ctype = addA.get(size - 1)[3];
			    	aname = addA.get(size - 1)[4];
			    	a_mode = addA.get(size - 1)[5];
			    	addA.remove(size - 1);

			    	// Generate and execute create rule
			    	String create_args[] = {"c", pname, cname, ptype, ctype, aname, "bCMS", "Model", "anyname", a_mode};
			    	//genRule.main(create_args);
			    	// Process the rule
			    	processRule(mode, cname, ctype, "_F" + i);
			    }
			    // Delete
			    else {
				    if (delA.size() != 0) {
				    	// Set parameters
				    	mode = "d";
				    	size = delA.size();
				    	cname = delA.get(size - 1)[0];
				    	ctype = delA.get(size - 1)[1];
				    	delA.remove(size - 1);

				    	// Process the rule - no need to execute
				    	System.out.println("NAME: " + cname);
				    	System.out.println("TYPE: " + ctype);
				    	processRule(mode, cname, ctype, "_F" + i);
				    }
				    else if (addA.size() != 0) {
				    	// Set parameters
				    	mode = "a";
				    	size = addA.size();
				    	pname = addA.get(size - 1)[0];
				    	cname = addA.get(size - 1)[1];
				    	ptype = addA.get(size - 1)[2];
				    	ctype = addA.get(size - 1)[3];
				    	aname = addA.get(size - 1)[4];
				    	a_mode = addA.get(size - 1)[5];
				    	addA.remove(size - 1);

				    	// Generate and execute create rule
				    	String create_args[] = {"c", pname, cname, ptype, ctype, aname, "bCMS", "Model", "anyname", a_mode};
				    	//genRule.main(create_args);
				    	// Process the rule
				    	processRule(mode, cname, ctype, "_F" + i);
				    }
				}
		    }
		}

		return 0;
	}

	public static void main(String[] args) {
		//processRule(args[0], args[1], args[2], args[3]);

		/* 
		Test: 
		createExpPL (int nFeat, ArrayList<String[]> delA, ArrayList<String[]> addA) 
		*/


		//String del_array [][] = {{"GPS", "Class", "dclasses"}, {"Crisis", "Class", "dclasses"}, {"Fireman", "Class", "dclasses"}, {"FireTruck", "Class", "dclasses"}, {"PoliceCar", "Class", "dclasses"}, {"PoliceOfficer", "Class", "dclasses"}, {"Route", "Class", "dclasses"}, {"RouteFireTruck", "Class", "dclasses"}, {"BCMSSystem", "Class", "dclasses"}, {"CommunicationCompromiser", "Class", "dclasses"}, {"CommunicationInfrastructure", "Class", "dclasses"}, {"Credential", "Class", "dclasses"}, {"FScoordinator", "Class", "dclasses"}, {"FSCSystem", "Class", "dclasses"}, {"GovermentAgency", "Class", "dclasses"}, {"PScoordinator", "Class", "dclasses"}, {"PSCSystem", "Class", "dclasses"}, {"RoutePlan", "Class", "dclasses"}, {"RoutePoliceCar", "Class", "dclasses"}, {"TimeoutLog", "Class", "dclasses"}, {"Victim", "Class", "dclasses"}, {"Witness", "Class", "dclasses"}, {"PScoordinatorNoEncryption", "Class", "dclasses"}, {"FScoordinatorNoEncryption", "Class", "dclasses"}, {"PSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystem", "Class", "dclasses"}, {"PSCSystem", "Class", "dclasses"}};

		String del_array [][] = {{"Witness", "Class", "dclasses"}, {"PScoordinatorNoEncryption", "Class", "dclasses"}, {"FScoordinatorNoEncryption", "Class", "dclasses"}, {"PSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystem", "Class", "dclasses"}, {"PSCSystem", "Class", "dclasses"}};
		ArrayList<String[]> delA = new ArrayList<String[]>(Arrays.asList(del_array));

		String add_array [][] = {{"Domain", "Cr1", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr2", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr3", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr4", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr5", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr6", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr7", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr8", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr9", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr10", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr11", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr12", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr13", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr14", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr15", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr16", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr17", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr18", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr19", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr20", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr21", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr22", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr23", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr24", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr25", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr26", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr27", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr28", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr29", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr30", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr31", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr32", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr33", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr34", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr35", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr36", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr37", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr38", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr39", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr40", "DomainModel", "Class", "dclasses", "p"}};
		ArrayList<String[]> addA = new ArrayList<String[]>(Arrays.asList(add_array));

		createExpPL(2, delA, addA);
	}
}