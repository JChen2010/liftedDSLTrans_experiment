import java.io.*;
import java.nio.*;
import java.util.*;

// Executes the DSLTransLifted simulation experiment.
public class experimentHelper {

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
	public static void main(String[] args) {
		try {
			String command = "rm -rf ./src/executeExperiment.java";
			executeCommand(command);
			command = "cp -f ./src/executeExperiment_M_nonPL.java ./src/executeExperiment.java";
			executeCommand(command);
			Thread.sleep(120000);
		} 
		catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}