import java.io.*;
import java.nio.*;
import java.util.*;

// Calculate slow down ratio after experiment has concluded
public class processModifyMove {

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

	// Process experiment with name args[0]
	public static void main(String[] args) {
		try {
			String f1 = args[0] + "_PL.log";
			String f2 = args[0] + "_nonPL.log";

			// Read in the PL experiment log
			BufferedReader in = new BufferedReader(new FileReader(f1));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			String input_arr[] = new String[lines];

			in = new BufferedReader(new FileReader(f1));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}

			// Read in the non-PL experiment log
			BufferedReader in2 = new BufferedReader(new FileReader(f2));
			int lines2 = 0;
			String str2;

			while((str2 = in2.readLine()) != null){
			    lines2++;
			}
			in2.close();

			String input_arr2[] = new String[lines2];

			in2 = new BufferedReader(new FileReader(f2));

			lines2 = 0;
			while((str2 = in2.readLine()) != null){
				input_arr2[lines2] = str2;
			    lines2++;
			}

			String output_arr [] = new String [(input_arr.length - 1)/2 + 1];
			String output_arr2 [] = new String [(input_arr2.length - 1)/2 + 1];
			String split1 [];
			String split2 [];
			String output_line = "";
			double total_runtime = 0;

			// Process result for PL
			output_arr[0] = input_arr[0];

			for (int i = 1; i < input_arr.length; i = i + 2) {
				output_line = "";
				split1 = input_arr[i].trim().split(",");
				split2 = input_arr[i + 1].trim().split(",");
				total_runtime = Double.parseDouble(split1[5]) + Double.parseDouble(split2[5]);
				for (int j = 0; j < split2.length; j++) {
					if (j == 5) {
						output_line = output_line + Double.toString(total_runtime) + ","; 
					}
					else if (j == split2.length - 1) {
						output_line = output_line + split2[j];
					}
					else {
						output_line = output_line + split2[j] +  ",";
					}
				}
				output_arr[(i + 1)/2] = output_line;
			}

			// Process result for nonPL
			output_arr2[0] = input_arr2[0];

			for (int i = 1; i < input_arr2.length; i = i + 2) {
				output_line = "";
				split1 = input_arr2[i].trim().split(",");
				split2 = input_arr2[i + 1].trim().split(",");
				total_runtime = Double.parseDouble(split1[5]) + Double.parseDouble(split2[5]);
				for (int j = 0; j < split2.length; j++) {
					if (j == 5) {
						output_line = output_line + Double.toString(total_runtime) + ","; 
					}
					else if (j == split2.length - 1) {
						output_line = output_line + split2[j];
					}
					else {
						output_line = output_line + split2[j] +  ",";
					}
				}
				output_arr2[(i + 1)/2] = output_line;
			}

			// Write out result for PL to filename_processed.log
			String f_name = args[0] + "_PL_processed.log";
			BufferedWriter out = new BufferedWriter(new FileWriter(f_name));
			for (int i = 0; i < output_arr.length; i++) {
				out.write(output_arr[i]);
				out.newLine();
			}
			out.close();

			// Write out result for nonPL to filename_processed.log
			f_name = args[0] + "_nonPL_processed.log";
			out = new BufferedWriter(new FileWriter(f_name));
			for (int i = 0; i < output_arr2.length; i++) {
				out.write(output_arr2[i]);
				out.newLine();
			}
			out.close();


		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}