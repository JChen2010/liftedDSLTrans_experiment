package backup;
import java.io.*;
import java.nio.*;
import java.util.*;

/* TODO: make this a little less bootlegged (looks like 1st year coding style atm)
		- have the deletes/add use the same algorithm as in genPL to run randomly
		- fix cv ratio: get result from console.log
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

	// Give type of transformation (c, d, m, mv), nRulesA, nFeatA, and nClone as arguments
	// Need to rewrite this function to take parameters as args and run via CLI
	public static void main(String[] args) {
		try {
			//System.setOut(new PrintStream(new FileOutputStream("console_output.log")));
			String log = "executeExperiment_results.log";
			int [] nFeaturesA = {100};
			int [] nRulesA = {15};

			//int [] nFeaturesA = {20};
			//int [] nRulesA = {11, 12};

			// Randomly generate rule
				// For d, m, and mv, randomly pick an eligible node (for m, set Name = Name_m)
				// For create, randomly pick a node type, and randomly select an eligble parent

			// Set arguments
			String trans_name = "delete_COMMENT_from_MODEL";
			//String[] arguments = {"d", "Author", "comments", trans_name};
			String[] arguments = {"d", "C_1_Author", "comments", trans_name};
			
			//String[] arguments = {}


			//String [][] args_arr = new String[8][];
			//args_arr[0] = {"d", "Author", "comments", trans_name}

			// Disable full runs for now - too much memory usage
			//for (int y = 1; y < 6; y++){
				//for (int x = 0; x < args_arr.length; x++) {
				//	arguments = args_arr[x];
					for (int i = 0; i < nFeaturesA.length; i++) {
						for (int j = 0; j < nRulesA.length; j++) {
							// Find the directory of the product line and copy files to cwd
							// String dirName = "PL_x" + y + "_" + nFeaturesA[i] + "_" + nRulesA[j];
							
							//String dirName = "PL_x1_" + nFeaturesA[i] + "_" + nRulesA[j];
							String dirName = "PL_x1_" + nFeaturesA[i] + "_" + nRulesA[j];
							String command;

							//command = "cp -f ./clone_x" + y + "/" + dirName + "/input.xmi .";
							//command = "cp -f ./clone_x1/" + dirName + "/input.xmi .";
							//command = "cp -f ./clone_x2/" + dirName + "/input.xmi .";
							command = "cp -f ./clone_x5/" + dirName + "/input.xmi .";
							executeCommand(command);
							
							//command = "cp -f ./clone_x" + y + "/" + dirName + "/input_presence_cond.csv .";
							//command = "cp -f ./clone_x1/" + dirName + "/input_presence_cond.csv .";
							//command = "cp -f ./clone_x2/" + dirName + "/input_presence_cond.csv .";
							command = "cp -f ./clone_x5/" + dirName + "/input_presence_cond.csv .";
							executeCommand(command);

							// Execute transformation and record time
							long startTime = System.nanoTime();
							genRuleLifted.main(arguments);
							long endTime = System.nanoTime();
							// duration in seconds
							double duration = (double)((endTime - startTime) / 1000000000.0);

							// Calculate c/v ratio

							// Read in the base transformation
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

							double variables = (double)input_arr[0].trim().split("\\s+").length - 1.0;
							double clauses = (double)input_arr.length - 1;

							BufferedWriter out = new BufferedWriter(new FileWriter(log, true));
							String s;

							// Change dirName to represent clone number
							//String dirName = "PL_x1_" + nFeaturesA[i] + "_" + nRulesA[j];
							dirName = "PL_x5_" + nFeaturesA[i] + "_" + nRulesA[j];

							// Write parameters
							s = "Transformation: Delete, " + trans_name;
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
						}
					}
				//}
			//}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}