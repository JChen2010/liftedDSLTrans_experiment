import java.io.*;
import java.util.ArrayList;
import java.util.Date; 
import java.util.List;
import java.util.*;
import java.lang.Math;

// Product lines generated via atomic add and delete rules
public class genPL {

	// Helper to create clones of bCMS.xmi - double first then use this
	// function to set all names to C_n_OrigName.
	/*
		Number of original unique names = 321 + bCMS = 322 (do not clone bCMS)
		Clone_x2: 643
		Clone_x3: 1285
		Clone_x4: 2569
		Clone_x5: 5137
	*/
	public static int createClone (String mname) {
		try {
			// Read in current core model
			BufferedReader in = new BufferedReader(new FileReader(mname));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			// This array will be updated and written to input_presence_cond.csv
			String input_arr[] = new String[lines + 1];

			in = new BufferedReader(new FileReader(mname));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			int name_count = 1;
			int first = 0;
			String s1 = "Name=\"";
			String s1_r;

			// Perform name substitutions
			for (int i = 0; i < input_arr.length - 1; i++) {
				// Replace all names with C_n_Name
				if(input_arr[i].toLowerCase().contains(s1.toLowerCase())){
					if (first == 0) {
						first = first + 1;
					}
					else {
						s1_r = "Name=\"C_" + name_count + "_";
						input_arr[i] = input_arr[i].replace(s1, s1_r);
						name_count = name_count + 1;
					}
				}
			}

			// Write out result
			BufferedWriter out = new BufferedWriter(new FileWriter(mname));
			for (int i = 0; i < input_arr.length - 1; i++) {
				//System.out.println(input_arr[i]);
				out.write(input_arr[i]);
				out.newLine();
			}
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	// Function to add unique names to core model - use with bCMS.xmi (inplace)
	/* Final counts:
		transitions - 76
		properties - 92
		pseudostates - 18
		states - 43
	*/
	public static int processCoreNames(String mname) {
		try {
			// Read in current core model
			BufferedReader in = new BufferedReader(new FileReader(mname));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			// This array will be updated and written to input_presence_cond.csv
			String input_arr[] = new String[lines + 1];

			in = new BufferedReader(new FileReader(mname));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			int transition_count = 1;
			int property_count = 1;
			int pseudostate_count = 1;
			int state_count = 1;

			String s1 = "<transitions/>";
			String s2 = "<properties/>";
			String s3 = "<states xsi:type=\"test:Pseudostate\" Name=\"\"/>";
			String s4 = "<states xsi:type=\"test:State\" Name=\"\"/>";

			String s1_r, s2_r, s3_r, s4_r;

			// Perform name substitutions
			for (int i = 0; i < input_arr.length - 1; i++) {
				// Replace all instances of <transitions/> with <transitions Name="T_n"/>
				if(input_arr[i].toLowerCase().contains(s1.toLowerCase())){
					s1_r = "<transitions Name=\"T_" + transition_count + "\"/>";
					input_arr[i] = input_arr[i].replace(s1, s1_r);
					transition_count = transition_count + 1;
				}

				// Replace all instances of <properties/> with <properties Name="P_n"/>
				if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
					s2_r = "<properties Name=\"P_" + property_count + "\"/>";
					input_arr[i] = input_arr[i].replace(s2, s2_r);
					property_count = property_count + 1;
				}

				// Replace all instances of "<states xsi:type="test:Pseudostate" Name=""/>" with <states xsi:type="test:Pseudostate" Name="PS_n"/>.
				if(input_arr[i].toLowerCase().contains(s3.toLowerCase())){
					s3_r = "<states xsi:type=\"test:Pseudostate\" Name=\"PS_" + pseudostate_count + "\"/>";
					input_arr[i] = input_arr[i].replace(s3, s3_r);
					pseudostate_count = pseudostate_count + 1;
				}

				// Replace all instances of "<states xsi:type="test:State" Name=""/>" with <states xsi:type="test:State" Name="S_n"/>.
				if(input_arr[i].toLowerCase().contains(s4.toLowerCase())){
					s4_r = "<states xsi:type=\"test:State\" Name=\"S_" + state_count + "\"/>";
					input_arr[i] = input_arr[i].replace(s4, s4_r);
					state_count = state_count + 1;
				}
			}

			// Write out result
			BufferedWriter out = new BufferedWriter(new FileWriter(mname));
			for (int i = 0; i < input_arr.length - 1; i++) {
				//System.out.println(input_arr[i]);
				out.write(input_arr[i]);
				out.newLine();
			}
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

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

			String new_features = "(xor";
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

			int delFind = 0;

			// If the rule was an addition, attach the rule as a presence condition to the added element. For addition, replace input.xmi with output.xmi (the instance with the added element).
			if (mode.equals("a")) {
				String new_element = type + ";" + ename + ";" + fname;
				input_arr[input_arr.length - 1] = new_element;

				// Replace input.xmi - * No longer necessary (input.xmi adjust in createExpPL)
				//executeCommand("cp -rf ./output.xmi ./input.xmi");
			}

			// If the rule was a deletion, attach the negation of the rule as a presence condition to the deleted element. For deletion, remove output.xmi and keep input.xmi (only need to add presence condition).
			else if (mode.equals("d")) {

				// Find the deleted element (will always find if rule executed successfully)
				// * Since we are not executing the rule, must account for failure to find.

				String line_split[] = new String[0];
				int index = -1;
				for (int i = 1; i < input_arr.length; i++) {
					//System.out.println("ARR: " + input_arr[i]);
					
					if(input_arr[i] != null){
						line_split = input_arr[i].split(";");
						//System.out.println("LINE: " + line_split[1]);
						if (line_split[1].equals(ename)){
							delFind = 1; // for better readability than checking index == -1
							index = i;
							i = input_arr.length;
						}
					}
				}

				// If deleted element already exists, add negation of rule to that line
				if (delFind == 1) {
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
				// If deleted element does not exist, add new line with negation of rule
				else {
					String new_element = type + ";" + ename + ";" + "(not " + fname + ")";
					input_arr[input_arr.length - 1] = new_element;
				}
			}

			// Update input_presence_cond
			BufferedWriter out = new BufferedWriter(new FileWriter("input_presence_cond.csv"));
			//System.out.println("New presence conditions:");
			for (int i = 0; i < input_arr.length; i++) {
				if (!(mode.equals("d") && (i == input_arr.length - 1))) {
					//System.out.println(input_arr[i]);
					out.write(input_arr[i]);
					out.newLine();
				}
			}

			if (mode.equals("d") && (delFind == 0)) {
				out.write(input_arr[input_arr.length - 1]);
				out.newLine();
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

		NOTE - modified to apply rule programatically instead of executing transformation.

		Structure of delA:
		[[cname, ctype, aname], [cname, ctype, aname], ...]
		To call genDelete - (cname, aname, anyname)

		Structure of addA:
		[[pname, cname, ptype, ctype, aname, mode], ...]
		To call genCreate - (pname, cname, ptype, ctype, aname, "bCMS", "Model", anyname, mode)
	*/
	public static int createExpPL (int nFeat, ArrayList<String[]> delA, ArrayList<String[]> addA, int nRules) {
		int size = 0;

		// Call processRule with unique fname nFeat times
		for (int i = 0; i < nFeat; i++) {
			// Normally distribute the number of features per rule
		    /* Approximate distribution instead by selecting 5 points with varying probability - give as input instead of taking gaussian sample here.
		    Random randGauss = new Random();
		    int nRules = (int)(Math.round(randGauss.nextGaussian() + 13.5));
		    */

		    String pname, cname, ptype, ctype, aname, a_mode, paname;
		    String paname_split[];

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
			    	String rName = "";

			    	paname = "";
			    	// Generate and execute create rule
			    	/*
			    	String create_args[] = {"c", pname, cname, ptype, ctype, aname, "bCMS", "Model", "anyname", a_mode};
			    	genRule.main(create_args);
			    	*/

			    	// Execute create rule programatically
			    	try {
						// Read in input.xmi
						BufferedReader in = new BufferedReader(new FileReader("input.xmi"));
						int lines = 0;
						String str;

						while((str = in.readLine()) != null){
						    lines++;
						}
						in.close();

						// This array will be updated and written to input.xmi.
						String input_arr[] = new String[lines];

						in = new BufferedReader(new FileReader("input.xmi"));

						lines = 0;
						while((str = in.readLine()) != null){
							input_arr[lines] = str;
						    lines++;
						}
						in.close();

						// Find the parent of the created element.
						String s = "Name=\"" + pname + "\"";
						int pname_index = 0;
						int num_spaces = 0;
						int contains_attr = 0;

						// Find index of pname
						for (int x = 0; x < input_arr.length; x++) {
							if(input_arr[x].toLowerCase().contains(s.toLowerCase())){
								pname_index = x;
								String temp = input_arr[x];
								num_spaces = temp.indexOf(temp.trim());
								String old = input_arr[x];
								input_arr[x] = input_arr[x].replace("/", "");
								if (input_arr[x].equals(old)) {
									contains_attr = 1;
								}

								// Extract paname from line
								paname_split = input_arr[x].trim().split("\\s+");
								paname = paname_split[0].substring(1);
							}
						}

						// Randomly remove a leaf node from the model
						Random randLeaf = new Random();
	    				int randRemove = randLeaf.nextInt(5000) + 1;
	    				int randRemoveIndex = 0;
	    				String [] rName_split;

	    				while (randRemove > 0) {
	    					for (int x = 0; x < input_arr.length; x++) {
	    						if (input_arr[x].contains("/>")) {
	    							randRemove = randRemove - 1;
	    							if (randRemove == 0) {
	    								// Delete this element
	    								if (x != pname_index) {
											rName_split = input_arr[x].trim().split("\\s+");
											// Find Name=\" in line
											for (int z = 0; z < rName_split.length; z++) {
												if (rName_split[z].contains("Name=\"")) {
													//Extract the name
													rName = rName_split[z];
													rName = rName.substring(rName.indexOf("\"") + 1);
													rName = rName.substring(0, rName.indexOf("\""));
													//System.out.println("rName: " + rName);
													z = rName_split.length;
												}
											}
		    								randRemoveIndex = x;
		    								x = input_arr.length;
		    							}
		    							else {
		    								randRemove = randRemove + 1;
		    							}
	    							}
	    						}
	    					}
	    				}

						// Write to input.xmi
						BufferedWriter out = new BufferedWriter(new FileWriter("input.xmi"));
						for (int x = 0; x < input_arr.length; x++) {

							// Do not write at randRemoveIndex
							if (x != randRemoveIndex) {
								out.write(input_arr[x]);
								out.newLine();
							}

							// At pname, write a new line for the created element
							if(x == pname_index) {
								String new_line = "";
								for (int y = 0; y < num_spaces; y++) {
									new_line = new_line + " ";
								}
								out.write(new_line + "  <" + aname + " Name=\"" + cname + "\"/>");
								out.newLine();
								if (contains_attr == 0) {
									/***** EXTRACT PANAME *****/
									out.write(new_line + "</" + paname + ">");
									out.newLine();
								}
							}
						}
						out.close();
					}

					catch (Exception e) {
						e.printStackTrace();
					}

			    	// Process the rule
			    	processRule(mode, cname, ctype, "_F" + i);

			    	// Remove the deleted element from the presence conditions
			    	try {
						// Read in input_presence_cond.csv
						BufferedReader in = new BufferedReader(new FileReader("input_presence_cond.csv"));
						int lines = 0;
						String str;

						while((str = in.readLine()) != null){
						    lines++;
						}
						in.close();

						// This array will be updated and written to input_presence_cond.csv.
						String input_arr[] = new String[lines];

						in = new BufferedReader(new FileReader("input_presence_cond.csv"));

						lines = 0;
						while((str = in.readLine()) != null){
							input_arr[lines] = str;
						    lines++;
						}
						in.close();

						// Write to input_presence_cond.csv
						BufferedWriter out = new BufferedWriter(new FileWriter("input_presence_cond.csv"));
						for (int x = 0; x < input_arr.length; x++) {
							// Do not write if rName is found
							if (!(input_arr[x].contains(rName))) {
								out.write(input_arr[x]);
								out.newLine();
							}
						}
						out.close();
					}

					catch (Exception e) {
						e.printStackTrace();
					}
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
				    	//System.out.println("NAME: " + cname);
				    	//System.out.println("TYPE: " + ctype);
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
				    	String rName = "";

				    	paname = "";
				    	// Generate and execute create rule
				    	/*
				    	String create_args[] = {"c", pname, cname, ptype, ctype, aname, "bCMS", "Model", "anyname", a_mode};
				    	genRule.main(create_args);
				    	*/

				    	// Execute create rule programatically
				    	try {
							// Read in input.xmi
							BufferedReader in = new BufferedReader(new FileReader("input.xmi"));
							int lines = 0;
							String str;

							while((str = in.readLine()) != null){
							    lines++;
							}
							in.close();

							// This array will be updated and written to input.xmi.
							String input_arr[] = new String[lines];

							in = new BufferedReader(new FileReader("input.xmi"));

							lines = 0;
							while((str = in.readLine()) != null){
								input_arr[lines] = str;
							    lines++;
							}
							in.close();

							// Find the parent of the created element.
							String s = "Name=\"" + pname + "\"";
							int pname_index = 0;
							int num_spaces = 0;
							int contains_attr = 0;

							// Find index of pname
							for (int x = 0; x < input_arr.length; x++) {
								if(input_arr[x].toLowerCase().contains(s.toLowerCase())){
									pname_index = x;
									String temp = input_arr[x];
									num_spaces = temp.indexOf(temp.trim());
									String old = input_arr[x];
									input_arr[x] = input_arr[x].replace("/", "");
									if (input_arr[x].equals(old)) {
										contains_attr = 1;
									}

									// Extract paname from line
									paname_split = input_arr[x].trim().split("\\s+");
									paname = paname_split[0].substring(1);
								}
							}

							// Randomly remove a leaf node from the model
							Random randLeaf = new Random();
		    				int randRemove = randLeaf.nextInt(5000) + 1;
		    				int randRemoveIndex = 0;
		    				String [] rName_split;

		    				while (randRemove > 0) {
		    					for (int x = 0; x < input_arr.length; x++) {
		    						if (input_arr[x].contains("/>")) {
		    							randRemove = randRemove - 1;
		    							if (randRemove == 0) {
		    								// Delete this element
		    								if (x != pname_index) {
												rName_split = input_arr[x].trim().split("\\s+");
												// Find Name=\" in line
												for (int z = 0; z < rName_split.length; z++) {
													if (rName_split[z].contains("Name=\"")) {
														//Extract the name
														rName = rName_split[z];
														rName = rName.substring(rName.indexOf("\"") + 1);
														rName = rName.substring(0, rName.indexOf("\""));
														z = rName_split.length;
													}
												}
			    								randRemoveIndex = x;
			    								x = input_arr.length;
			    							}
			    							else {
			    								randRemove = randRemove + 1;
			    							}
		    							}
		    						}
		    					}
		    				}

							// Write to input.xmi
							BufferedWriter out = new BufferedWriter(new FileWriter("input.xmi"));
							for (int x = 0; x < input_arr.length; x++) {

								// Do not write at randRemoveIndex
								if (x != randRemoveIndex) {
									out.write(input_arr[x]);
									out.newLine();
								}

								// At pname, write a new line for the created element
								if(x == pname_index) {
									String new_line = "";
									for (int y = 0; y < num_spaces; y++) {
										new_line = new_line + " ";
									}
									out.write(new_line + "  <" + aname + " Name=\"" + cname + "\"/>");
									out.newLine();
									if (contains_attr == 0) {
										/***** EXTRACT PANAME *****/
										out.write(new_line + "</" + paname + ">");
										out.newLine();
									}
								}
							}
							out.close();
						}

						catch (Exception e) {
							e.printStackTrace();
						}

				    	// Process the rule
				    	processRule(mode, cname, ctype, "_F" + i);

				    	// Remove the deleted element from the presence conditions
				    	try {
							// Read in input_presence_cond.csv
							BufferedReader in = new BufferedReader(new FileReader("input_presence_cond.csv"));
							int lines = 0;
							String str;

							while((str = in.readLine()) != null){
							    lines++;
							}
							in.close();

							// This array will be updated and written to input_presence_cond.csv.
							String input_arr[] = new String[lines];

							in = new BufferedReader(new FileReader("input_presence_cond.csv"));

							lines = 0;
							while((str = in.readLine()) != null){
								input_arr[lines] = str;
							    lines++;
							}
							in.close();

							// Write to input_presence_cond.csv
							BufferedWriter out = new BufferedWriter(new FileWriter("input_presence_cond.csv"));
							for (int x = 0; x < input_arr.length; x++) {
								// Do not write if rName is found
								if (!(input_arr[x].contains(rName))) {
									out.write(input_arr[x]);
									out.newLine();
								}
							}
							out.close();
						}

						catch (Exception e) {
							e.printStackTrace();
						}
				    }
				}
		    }
		}

		return 0;
	}

	// Generates an add array of size elements. The format of the add array is:
	// [[pname, cname, ptype, ctype, aname, mode], ...]
	public static String[][] genAddArray(int size) {

		String [][] add_array = new String [size][6];
		// [[ptype, ctype, aname, paname], ...] - 12 types
		//int num_types = 12;
		//String [][] add_types = {{"Model", "Comment", "comments", "N/A"}, {"Model", "StateMachine", "statemachines", "N/A"}, {"Model", "Association", "associations", "N/A"}, {"Model", "Class", "classes", "N/A"}, {"Model", "DomainModel", "models", "N/A"}, {"StateMachine", "Region", "regions", "statemachines"}, {"Region", "Transition", "transitions", "regions"}, {"Class", "Property", "properties", "dclasses"}, {"DomainModel", "Association", "dassociations", "models"}, {"DomainModel", "Class", "dclasses", "models"}, {"DomainModel", "Comment", "dcomments", "models"}, {"Class", "Property", "properties", "classes"}};

		// Do not add directly to model
		int num_types = 7;
		String [][] add_types = {{"StateMachine", "Region", "regions", "statemachines"}, {"Region", "Transition", "transitions", "regions"}, {"Class", "Property", "properties", "dclasses"}, {"DomainModel", "Association", "dassociations", "models"}, {"DomainModel", "Class", "dclasses", "models"}, {"DomainModel", "Comment", "dcomments", "models"}, {"Class", "Property", "properties", "classes"}};

		Random randType, randMatch;
		int randAdd, randMatchIndex;
		String ptype, ctype, aname, cname, pname, paname;

		// Create array of length size
		for (int i = 1; i < size + 1; i++) {
			// Randomly select an add type
			randType = new Random();
	    	randAdd = randType.nextInt(num_types);
		    int num_pMatches = 0;

	    	// Set values for cname, ptype, ctype, aname, and paname
	    	ptype = add_types[randAdd][0];
	    	ctype = add_types[randAdd][1];
	    	aname = add_types[randAdd][2];
	    	cname = "Cr_" + i;
	    	pname = "";

	    	paname = add_types[randAdd][3];

	    	// If ptype is Model, then pname is bCMS
	    	if (ptype.equals("Model")) {
	    		pname = "bCMS";
	    	}
	    	// Else, search input.xmi (for paname) and randomly select a pname
	    	else {
		    	ArrayList<String> pMatches = new ArrayList<String>();

			    try {
					// Read in model (input.xmi)
					BufferedReader in = new BufferedReader(new FileReader("input.xmi"));
					int lines = 0;
					String str;

					while((str = in.readLine()) != null){
					    lines++;
					}
					in.close();

					String input_arr[] = new String[lines + 1];

					in = new BufferedReader(new FileReader("input.xmi"));

					lines = 0;
					while((str = in.readLine()) != null){
						input_arr[lines] = str;
					    lines++;
					}
					in.close();

					String s = "<" + paname;
					String [] paname_split;
					// Search for <paname 
					for (int x = 0; x < input_arr.length - 1; x++) {
						if (input_arr[x].toLowerCase().contains(s.toLowerCase())) {
							paname_split = input_arr[x].trim().split("\\s+");
							// Find Name=\" in line
							for (int j = 0; j < paname_split.length; j++) {
								if (paname_split[j].contains("Name=\"")) {
									//Extract the name
									pname = paname_split[j];
									pname = pname.substring(pname.indexOf("\"") + 1);
									pname = pname.substring(0, pname.indexOf("\""));
									pMatches.add(pname);
									num_pMatches = num_pMatches + 1;
									j = paname_split.length;
								}
							}
						}
					}
					// Generate random number between 0 and num_pMatches
					randMatch = new Random();
					if (num_pMatches != 0) {
		    			randMatchIndex = randMatch.nextInt(num_pMatches);
		    			pname = pMatches.get(randMatchIndex);
	    			}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			// Set add_array[i - 1] - [pname, cname, ptype, ctype, aname, mode]
			if (num_pMatches != 0) {
				String [] temp_arr = {pname, cname, ptype, ctype, aname, "N/A"};
				add_array[i - 1] = temp_arr;
			}
			else {
				i = i - 1;
			}
		}

		return add_array;
	}

	// Generates a del array of size elements. The format of the del array is:
	// [[cname, ctype, aname], [cname, ctype, aname], ...]
	/*
		Steps:
			- iterate through elements (by looking for Name="...")
			- get cname and aname from parsing the line
			- get ctype from aname-ctype map
			- add to del_array
	*/
	public static String [][] genDelArray() {
		
		// Create aname to ctype map - [[aname, ctype], ...]
		// This maps the aname to the type of its contained end
		String [][] aname_ctype = {{"comments", "Comment"}, {"statemachines", "StateMachine"}, {"associations", "Association"}, {"classes", "Class"}, {"models", "DomainModel"}, {"regions", "Region"}, {"transitions", "Transition"}, {"properties", "Property"}, {"general", "Generalization"}, {"dassociations", "Association"}, {"dclasses", "Class"}, {"dcomments", "Comment"}};

    	int num_elements = 0;
    	String cname = "";
    	String ctype = "";
    	String aname = "";
    	String [][] del_array = {{""}};

	    try {
			// Read in model (input.xmi)
			BufferedReader in = new BufferedReader(new FileReader("input.xmi"));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			String input_arr[] = new String[lines + 1];

			in = new BufferedReader(new FileReader("input.xmi"));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			String s = "Name=\"";

			// Count number of elements
			for (int x = 0; x < input_arr.length - 1; x++) {
				// If this is an element
				if (input_arr[x].toLowerCase().contains(s.toLowerCase())) {
					num_elements = num_elements + 1;
				}
			}
			
			String [] line_split;
			int del_array_index = 0;
			del_array = new String [num_elements - 1][3];

			// Search for Name=""
			for (int x = 0; x < input_arr.length - 1; x++) {
				// If this is an element
				if ((input_arr[x].toLowerCase().contains(s.toLowerCase())) && (!(input_arr[x].contains("\"bCMS\"")))) {

					line_split = input_arr[x].trim().split("\\s+");
					// Find Name=\" in line
					for (int j = 0; j < line_split.length; j++) {
						// Extract the name
						if (line_split[j].contains("Name=\"")) {
							cname = line_split[j];
							cname = cname.substring(cname.indexOf("\"") + 1);
							cname = cname.substring(0, cname.indexOf("\""));
						}
						// Extract the aname
						if (line_split[j].contains("<")) {
							aname = line_split[j].substring(1);
						}
					}

					// Find the ctype from the aname-ctype map
					for (int y = 0; y < aname_ctype.length; y++) {
						if (aname_ctype[y][0].equals(aname)) {
							ctype = aname_ctype[y][1];
							y = aname_ctype.length;
						}
					}

					// Add this entry to del_array
					String [] tmp_arr = {cname, ctype, aname};
					del_array[del_array_index] = tmp_arr;
					del_array_index = del_array_index + 1;
				}
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return del_array;
	}

	public static void main(String[] args) {
		//processRule(args[0], args[1], args[2], args[3]);
		//processCoreNames("bCMS.xmi");
		//createClone("bCMS.xmi");

		/* 
		Test: createExpPL (int nFeat, ArrayList<String[]> delA, ArrayList<String[]> addA) 

		Structure of delA:
		[[cname, ctype, aname], [cname, ctype, aname], ...]
		To call genDelete - (cname, aname, anyname)

		Structure of addA:
		[[pname, cname, ptype, ctype, aname, mode], ...]
		To call genCreate - (pname, cname, ptype, ctype, aname, "bCMS", "Model", anyname, mode)
		*/

		//String del_array [][] = {{"GPS", "Class", "dclasses"}, {"Crisis", "Class", "dclasses"}, {"Fireman", "Class", "dclasses"}, {"FireTruck", "Class", "dclasses"}, {"PoliceCar", "Class", "dclasses"}, {"PoliceOfficer", "Class", "dclasses"}, {"Route", "Class", "dclasses"}, {"RouteFireTruck", "Class", "dclasses"}, {"BCMSSystem", "Class", "dclasses"}, {"CommunicationCompromiser", "Class", "dclasses"}, {"CommunicationInfrastructure", "Class", "dclasses"}, {"Credential", "Class", "dclasses"}, {"FScoordinator", "Class", "dclasses"}, {"FSCSystem", "Class", "dclasses"}, {"GovermentAgency", "Class", "dclasses"}, {"PScoordinator", "Class", "dclasses"}, {"PSCSystem", "Class", "dclasses"}, {"RoutePlan", "Class", "dclasses"}, {"RoutePoliceCar", "Class", "dclasses"}, {"TimeoutLog", "Class", "dclasses"}, {"Victim", "Class", "dclasses"}, {"Witness", "Class", "dclasses"}, {"PScoordinatorNoEncryption", "Class", "dclasses"}, {"FScoordinatorNoEncryption", "Class", "dclasses"}, {"PSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystem", "Class", "dclasses"}, {"PSCSystem", "Class", "dclasses"}};

		//String del_array [][] = {{"Witness", "Class", "dclasses"}, {"PScoordinatorNoEncryption", "Class", "dclasses"}, {"FScoordinatorNoEncryption", "Class", "dclasses"}, {"PSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystemNoEncryption", "Class", "dclasses"}, {"FSCSystem", "Class", "dclasses"}, {"PSCSystem", "Class", "dclasses"}};

		//String add_array [][] = {{"Domain", "Cr1", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr2", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr3", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr4", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr5", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr6", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr7", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr8", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr9", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr10", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr11", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr12", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr13", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr14", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr15", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr16", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr17", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr18", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr19", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr20", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr21", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr22", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr23", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr24", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr25", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr26", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr27", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr28", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr29", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr30", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr31", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr32", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr33", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr34", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr35", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr36", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr37", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr38", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr39", "DomainModel", "Class", "dclasses", "p"}, {"Domain", "Cr40", "DomainModel", "Class", "dclasses", "p"}, {"Class2", "Cr41", "Class", "Property", "properties", "p"}};

		// del_array for test input.xmi
		//String del_array [][] = {{"Class1", "Class", "classes"}, {"Class2", "Class", "classes"}, {"Class3", "Class", "dclasses"}, {"Comment1", "comment", "dcomment"}, {"Architecture", "DomainModel", "models"}, {"Property", "Prop1", "properties"}, {"Region", "R1", "regions"}};



		//String add_array [][] = genAddArray(10000);
		//String del_array [][] = genDelArray();

		//ArrayList<String[]> addA = new ArrayList<String[]>(Arrays.asList(add_array));
		//ArrayList<String[]> delA = new ArrayList<String[]>(Arrays.asList(del_array));

		//System.out.println("ADD ARRAY: " + Arrays.deepToString(add_array) + "\n");
		//System.out.println("DEL ARRAY: " + Arrays.deepToString(del_array) + "\n");

		// Create 5*5*5 product lines as outlined in experiment
		// nFeatures - 20, 40, 60, 80, 100 (from splot-research.org, 907/923 < 100)
		// nRules - 11, 12, 13, 14, 15

		int [] nFeaturesA = {20, 40, 60, 80, 100};
		int [] nRulesA = {11, 12, 13, 14, 15};
		int nClone = Integer.parseInt(args[0]);

		// Product line stored in folder: PL_xnClone_nFeatures_nRules
		executeCommand("mkdir backup");
		for (int i = 0; i < nFeaturesA.length; i++) {
			for (int j = 0; j < nRulesA.length; j++) {
				String add_array [][] = genAddArray(10000);
				String del_array [][] = genDelArray();
				ArrayList<String[]> addA = new ArrayList<String[]>(Arrays.asList(add_array));
				ArrayList<String[]> delA = new ArrayList<String[]>(Arrays.asList(del_array));
				executeCommand("cp ./input.xmi ./backup/");
				executeCommand("cp ./input_presence_cond.csv ./backup/");
				createExpPL(nFeaturesA[i], delA, addA, nRulesA[j]);
				String dirName = "PL_x" + nClone + "_" + nFeaturesA[i] + "_" + nRulesA[j];
				String command = "mkdir " + dirName; 
				executeCommand(command);
				command = "cp ./input.xmi ./" + dirName + "/";
				executeCommand(command);
				command = "cp ./input_presence_cond.csv ./" + dirName + "/";
				executeCommand(command);
				executeCommand("cp ./backup/input.xmi .");
				executeCommand("cp ./backup/input_presence_cond.csv .");
			}
		}
	}
}