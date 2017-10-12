import java.io.*;
import java.nio.*;
import java.util.*;

/* TODO: make this a little less bootlegged
		- have the deletes/add use the same algorithm as in genPL to run randomly
		- put runs into methods and call them in main
*/	
// This MUST be ran through eclipse.
public class executeExperiment {

	// Execute shell commands.
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

	// Executes a transformation on a product line
	// Arguments: nClone, nFeat, nRule, tName, trans_args[]
	// For transformation arguments, any placeholder name works (they are not saved)
	public static void main(String[] args) {
		try {
			//System.setOut(new PrintStream(new FileOutputStream("console_output.log")));

			String log = "executeExperiment_results_PL.log";
			//FOR NON-PL:
			//String log = "executeExperiment_results_nonPL.log";

			//int [] nFeaturesA = {100};
			//int [] nRulesA = {15};

			//int [] nFeaturesA = {20};
			//int [] nRulesA = {11, 12};

			// Randomly generate rule
				// For d, m, and mv, randomly pick an eligible node (for m, set Name = Name_m)
				// For create, randomly pick a node type, and randomly select an eligble parent

			// Set arguments
			//String trans_name = "delete_COMMENT_from_MODEL";
			//String[] arguments = {"d", "Author", "comments", trans_name};
			//String[] arguments = {"d", "C_1_Author", "comments", trans_name};
			
			//String[] arguments = {}
			int nClone = Integer.parseInt(args[0]);
			int nFeaturesA = Integer.parseInt(args[1]);
			int nRulesA = Integer.parseInt(args[2]);
			String trans_name = args[3];
			String[] arguments = Arrays.copyOfRange(args, 4, args.length);

			//String [][] args_arr = new String[8][];
			//args_arr[0] = {"d", "Author", "comments", trans_name}

			// Rewrite to execute single transformation using CLI
			//for (int y = 1; y < 6; y++){
				//for (int x = 0; x < args_arr.length; x++) {
				//	arguments = args_arr[x];
					//for (int i = 0; i < nFeaturesA.length; i++) {
						//for (int j = 0; j < nRulesA.length; j++) {

			// String dirName = "PL_x" + y + "_" + nFeaturesA[i] + "_" + nRulesA[j];
			//String dirName = "PL_x1_" + nFeaturesA[i] + "_" + nRulesA[j];
			//String dirName = "PL_x" + nClone + "_" + nFeaturesA[i] + "_" + nRulesA[j];

			// Find the directory of the product line and copy files to cwd
			String dirName = "PL_x" + nClone + "_" + nFeaturesA + "_" + nRulesA;

			String command;

			//command = "cp -f ./clone_x" + y + "/" + dirName + "/input.xmi .";
			//command = "cp -f ./clone_x1/" + dirName + "/input.xmi .";
			//command = "cp -f ./clone_x2/" + dirName + "/input.xmi .";
			command = "cp -f ./clone_x" + nClone +"/" + dirName + "/input.xmi .";
			executeCommand(command);
			
			//command = "cp -f ./clone_x" + y + "/" + dirName + "/input_presence_cond.csv .";
			//command = "cp -f ./clone_x1/" + dirName + "/input_presence_cond.csv .";
			//command = "cp -f ./clone_x2/" + dirName + "/input_presence_cond.csv .";
			command = "cp -f ./clone_x" + nClone + "/" + dirName + "/input_presence_cond.csv .";
			executeCommand(command);

			// Remove presence conditions from input_presence_cond.csv
			//FOR NON-PL
			/*
			BufferedWriter out1 = new BufferedWriter(new FileWriter("input_presence_cond.csv"));

			out1.write("(xor _A _B)");
			out1.newLine();
			out1.close();
			*/
			// Execute transformation and record time
			long startTime = System.nanoTime();
			genRuleLifted.main(arguments);
			long endTime = System.nanoTime();
			// duration in seconds
			double duration = ((endTime - startTime) / 1000000000.0);

			int term_count = 0;
			{
				// Read in output presence conditions
				BufferedReader in = new BufferedReader(new FileReader("output_presence_cond.csv"));
				int lines = 0;
				String str;

				while((str = in.readLine()) != null){
				    lines++;
				}
				in.close();

				String input_arr[] = new String[lines];
				in = new BufferedReader(new FileReader("output_presence_cond.csv"));

				lines = 0;
				while((str = in.readLine()) != null){
					input_arr[lines] = str;
				    lines++;
				}
				in.close();

				// Hashtable of names with value: [length, index]
				Hashtable<String, int[]> nameTable = new Hashtable<String, int[]>();
				String [] split;
				String re = "";
				int [] tmp_key;
				int [] entry = new int[2];

				for (int i = 1; i < input_arr.length - 1; i++) {
					split = input_arr[i].trim().split(",");
					re = "";
					for (int j = 0; j < split.length - 1; j++) {
						re = re + split[j];
					}
					
					if (nameTable.containsKey(re)) {
						// Replace old index with new index
						tmp_key = nameTable.get(re);
						if (input_arr[i].length() > tmp_key[0]) {
							tmp_key[0] = input_arr[i].length();
							tmp_key[1] = i;
							nameTable.put(re, tmp_key);
						}
					}
					// Create new entry
					else {
						entry = new int[2];
						entry[0] = input_arr[i].length();
						entry[1] = i;
						nameTable.put(re, entry);
					}
				}

				// Write out result
				BufferedWriter out = new BufferedWriter(new FileWriter("output_presence_cond.csv"));
				for (int i = 0; i < input_arr.length - 1; i++) {
					// Write only if this is the longest copy
					split = input_arr[i].trim().split(",");
					re = "";
					for (int j = 0; j < split.length - 1; j++) {
						re = re + split[j];
					}

					if (i == 0) {
						out.write(input_arr[i]);
						out.newLine();
					}
					else if (i == nameTable.get(re)[1]) {
						// Replace nulls
						input_arr[i] = input_arr[i].replace("null", "true");
						out.write(input_arr[i]);
						out.newLine();
					}
				}
				out.close();
			}

			// Read in the output presence conditions
			BufferedReader in = new BufferedReader(new FileReader("output_presence_cond.csv"));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			String input_arr[] = new String[lines];
			in = new BufferedReader(new FileReader("output_presence_cond.csv"));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			// Calculate the number of terms (non-unique)
			for (int i = 0; i < input_arr.length - 1; i++) {
				String str1 = input_arr[i];
				int last_index = 0;
				while(last_index != -1){
				    last_index = str1.indexOf("_F",last_index);
				    if(last_index != -1){
				        term_count ++;
				        last_index += 2;
				    }
				}
				last_index = str1.indexOf("_M", 0);
				if (last_index != -1) {
					term_count ++;
				}
			}

			// Find number of clauses and variables
			double variables = (double)input_arr[0].trim().split("\\s+").length - 1.0;

			int conj_c = 0;
			String tmpS;

			for (int k = 0; k < input_arr.length; k++) {
				tmpS = input_arr[k].replace("and", "");
				conj_c = conj_c + ((input_arr[k].length() - tmpS.length())/3);
			}

			// Since all clauses are atomic
			double clauses = (double)term_count;

			// FOR NON-PL: this consumes too much memory, rework
			/*
			// Remove presence conditions from input_presence_cond.csv
			BufferedWriter out1 = new BufferedWriter(new FileWriter("input_presence_cond.csv"));

			out1.write("(xor _A _B)");
			out1.newLine();
			out1.close();

			// Run the transformation again (on non-PL) and record the time
			startTime = System.nanoTime();
			genRuleLifted.main(arguments);
			endTime = System.nanoTime();
			*/

			// duration in seconds
			double duration_no_pl = ((endTime - startTime) / 1000000000.0);

			// Write to output log
			BufferedWriter out = new BufferedWriter(new FileWriter(log, true));
			String s;

			// Change dirName to represent clone number
			//String dirName = "PL_x1_" + nFeaturesA[i] + "_" + nRulesA[j];
			//dirName = "PL_x" + nClone + "_" + nFeaturesA[i] + "_" + nRulesA[j];
			dirName = "PL_x" + nClone + "_" + nFeaturesA + "_" + nRulesA;

			// Write parameters (CSV format)
			// (name, nClone, input size, nFeat, nRule, runtime, clauses, variables, c/v, duration/duration_no_pl)
			double cv_ratio = clauses/variables;
			int input_size = (int)Math.pow(2, (double)(nClone - 1)) * 321 + 1;
			int iClauses = (int)clauses;
			int iVar = (int)variables;
			double slow_down_ratio = duration/duration_no_pl;
			s =  trans_name + "," + nClone + "," + input_size + "," + nFeaturesA + "," + nRulesA + "," + Double.toString(duration) + "," + iClauses + "," + iVar + "," + Double.toString(cv_ratio) + "," + Double.toString(slow_down_ratio);
			out.write(s);
			out.newLine();
			out.close();

			/* Old output
			s = "Transformation: " + trans_name;
			out.write(s);
			out.newLine();
			s = "Product Line: " + dirName;
			out.write(s);
			out.newLine();
			// Write runtime
			s = "Runtime: " + Double.toString(duration) + "s";
			out.write(s);
			out.newLine();
			// Write Clause Variable ratio
			double cv_ratio = clauses/variables;
			s = "CV Ratio: " + Double.toString(cv_ratio);
			out.write(s);
			out.newLine();
			out.newLine();
			out.close();
			*/
						//}
					//}
				//}
			//}
			Thread.sleep(15000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}