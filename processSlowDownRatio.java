import java.io.*;
import java.nio.*;
import java.util.*;

// Calculate slow down ratio after experiment has concluded
public class processSlowDownRatio {

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

			String output_arr[] = new String[lines];

			// Calculate slow-down ratio
			String out_line = "";
			String split1 [];
			String split2 [];
			double slow_down_ratio;
			double pl_runtime;
			double non_pl_runtime;
			for (int i = 0; i < input_arr.length; i++) {
				if (i == 0) {
					output_arr[i] = input_arr[i];
				}
				else {
					out_line = "";
					split1 = input_arr[i].trim().split(",");
					split2 = input_arr2[i].trim().split(",");
					pl_runtime = Double.parseDouble(split1[5]);
					non_pl_runtime = Double.parseDouble(split2[5]);
					slow_down_ratio = pl_runtime/non_pl_runtime;
					split1[9] = Double.toString(slow_down_ratio);
					for (int j = 0; j < split1.length; j++) {
						out_line = out_line + split1[j];
						if (j != split1.length - 1) {
							out_line = out_line + ",";
						}
					}
					output_arr[i] = out_line;
				}
			}

			// Write to given filename
			String f_name = args[0] + ".log";
			BufferedWriter out = new BufferedWriter(new FileWriter(f_name));
			for (int i = 0; i < output_arr.length; i++) {
				out.write(output_arr[i]);
				out.newLine();
			}
			
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}