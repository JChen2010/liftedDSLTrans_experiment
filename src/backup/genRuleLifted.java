package backup;
import java.io.*;
import java.nio.*;
import java.util.*;

import solver.Z3Model.Z3Bool;
import solver.Z3Solver;
import transformerProcessor.TransformerProcessor;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import transformerProcessor.exceptions.TransformationLayerException;
import transformerProcessor.exceptions.TransformationSourceException;


/*
	Prerequisites:
		Base transformation is named umlGenBase.dsltrans
		Source model is named input.xmi
		Target model is named output.xmi
*/

/*
	# of possible atomic edit rules = 84
		nCreate = nEReferences = 16
		nDelete = nCreate = 16
		nModify = nAttributes = 28
		nMove = sum of (nPossibleParentTypes for each EClass)^2 = 24
			-> use existential matching (n) - 4
	Atomic edit rules defined as in bigtrafo: 
		each set of types passed as arguments is a "rule"
*/

// This version of genRule has been redesigned to work with DSLTrans lifted.
// Produces a predictable superset of the correct presence conditions, which
// is then trimmed in post-processing.
public class genRuleLifted {

//	Execute DSLTrans transformation at rpath in project dir path.
	public static void executeRule(String rpath, String path) {
		final String PROJECT_DIR = path;
		final String TRANS = rpath;

		TransformerProcessor tP = new TransformerProcessor(PROJECT_DIR);
		tP.LoadModel(TRANS);
		
		try {
			tP.Execute();
		} catch (InvalidLayerRequirement e) {
			System.err.println("Error running transformation: " + TRANS);
			e.printStackTrace();
		} catch (TransformationSourceException e) {
			System.err.println("Error running transformation: " + TRANS);
			e.printStackTrace();
		} catch (TransformationLayerException e) {
			System.err.println("Error running transformation: " + TRANS);
			e.printStackTrace();
		}
	}

/**
	* Generates a DSLTrans rule that creates an element of type ctype and
	* name cname as a child of the element pname with type ptype. Dependent
	* on the base transformation umlGenBase.dsltrans. Can be used with
	* any arbitrary metamodel, given an appropriate base transformation.
	*
	* @param  pname The name of the parent of the element to be created.
	* @param  cname The name of the element to be created.
	* @param  ptype The type of the parent.
	* @param  ctype The type of the created element.
	* @param  aname The name of the association between the parent and the created element.
	* @param  root  The name of the root element.
	* @param  rtype The type of the root element.
	* @param  rname The name of the created rule.
	* @param  mode  The mode - "r" for root to created, and "p" for parent to created.
	* @param  roota The root association of the parent element.
*/
	public static int genCreate(String pname, String cname, String ptype, String ctype, String aname, String root, String rtype, String rname, String mode, String roota)
	{
		try {
			// Read in the base transformation
			BufferedReader in = new BufferedReader(new FileReader("umlGenBase.dsltrans"));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			// This array will be updated and written to rname.dsltrans
			String input_arr[] = new String[lines];

			in = new BufferedReader(new FileReader("umlGenBase.dsltrans"));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			// Declare variables for transformation manipulation
			String s;
			String e;
			int start_index = -1;
			int end_index = -1;

			String s1 = "rootBaseType";
			String s2 = "rootBaseName";
			String s3 = "createBaseType";
			String s4 = "createBaseName";
			String s5 = "baseAssociationName";
			String s6 = "parentBaseType";
			String s7 = "parentBaseName";
			String s8 = "Layer3.xmi";
			String s9 = "baseRootAssociation";

			// If mode == r or e, disable parent to created rule.
			if (mode.equals("r") || mode.equals("e")){

				// Find start and end indices of parent to created rule.
				s = "Parent to Created";
				e = "</hasRule>";
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						start_index = i;
					}

					if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
						end_index = i;
						i = input_arr.length;
					}
				}
			}

			// If mode == e, disable both rules
			if (mode.equals("e")) {
				for (int i = start_index; i < end_index; i++) {
					if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
						input_arr[i] = input_arr[i].replace(s2, "DONOTMATCHTHIS");
					}
				}
			}

			start_index = -1;
			end_index = -1;

			// If mode == p or e, disable root to created rule.
			if (mode.equals("p") || mode.equals("e")){

				// Find start and end indices of root to created rule.
				s = "Root to Created";
				e = "</hasRule>";
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						start_index = i;
					}

					if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
						end_index = i;
						i = input_arr.length;
					}
				}
			}

			// Disable the appropriate rule
			for (int i = start_index; i < end_index; i++) {
				if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s2, "DONOTMATCHTHIS");
				}
			}

			start_index = -1;
			end_index = -1;

			// If mode != e, disable existential rule
			if (!(mode.equals("e"))){
				// Find start and end indices of the existential rule.
				s = "Existential Create";
				e = "</hasRule>";
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						start_index = i;
					}

					if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
						end_index = i;
						i = input_arr.length;
					}
				}

				// Disable the appropriate rule
				for (int i = start_index; i < end_index; i++) {
					if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
						input_arr[i] = input_arr[i].replace(s2, "DONOTMATCHTHIS");
					}
				}
			}

			// Find the start and end indices of the create layer
			s = "Base Create Layer";
			e = "</source>";
			start_index = -1;
			end_index = -1;

			for (int i = 0; i < input_arr.length; i++) {
				if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
					start_index = i;
				}

				if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
					end_index = i;
					i = input_arr.length;
				}
			}

			// Generate the transformation based on the parameters given
			for (int i = start_index; i < end_index + 1; i++) {
				// Replace all instances of "rootBaseType" with rtype.
				if(input_arr[i].toLowerCase().contains(s1.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s1, rtype);
				}

				// Replace all instances of "rootBaseName" with root.
				if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s2, root);
				}

				// Replace all instances of "createBaseType" with ctype.
				if(input_arr[i].toLowerCase().contains(s3.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s3, ctype);
				}

				// Replace all instances of "createBaseName" with cname.
				if(input_arr[i].toLowerCase().contains(s4.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s4, cname);
				}

				// Replace all instances of "baseAssociationName" with aname.
				if(input_arr[i].toLowerCase().contains(s5.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s5, aname);
				}

				// Replace all instances of "parentBaseType" with ptype.
				if(input_arr[i].toLowerCase().contains(s6.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s6, ptype);
				}

				// Replace all instances of "parentBaseName" with pname.
				if(input_arr[i].toLowerCase().contains(s7.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s7, pname);
				}

				// Replace Layer3.xmi with output.xmi"
				if(input_arr[i].toLowerCase().contains(s8.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s8, "output.xmi");
				}

				// Replace baseRootAssociation with roota"
				if(input_arr[i].toLowerCase().contains(s9.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s9, roota);
				}
			}

			// Write to rname.dsltrans
			String rule = rname + ".dsltrans";
			BufferedWriter out = new BufferedWriter(new FileWriter(rule));
			for (int i = 0; i < input_arr.length; i++) {
				out.write(input_arr[i]);
				out.newLine();
			}
			
			out.close();
			System.out.println("The generated create rule has been written to:\n" + rule);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	// Function to pre-process input_presence_cond.csv and input.xmi prior to delete
	// rule execution.
	public static int deletePreProcess() {
		try {
			// Read in input_presence_cond.csv
			BufferedReader in = new BufferedReader(new FileReader("input_presence_cond.csv"));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			// This array will be updated and written to testDel_presence_cond.csv
			String input_arr[] = new String[lines];

			in = new BufferedReader(new FileReader("input_presence_cond.csv"));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			// Write to testDel_presence_cond.csv
			BufferedWriter out = new BufferedWriter(new FileWriter("testDel_presence_cond.csv"));
			for (int i = 0; i < input_arr.length; i++) {
				out.write(input_arr[i]);
				out.newLine();
			}
			// At the end of the file, write: Delete;_Del1;true
			out.write("Delete;_Del1;true");
			out.newLine();
			out.close();
		}

		catch (Exception e) {
			System.out.println("deletePreProcess failed!");
		}
		return 0;
	}

/**
	* Generates a DSLTrans rule that deletes an element of name cname. 
	* Dependent on a the base transformation umlGenBase.dsltrans.
	*
	* @param  cname The name of the element to be deleted.
	* @param  aname The name of the association between the parent and the created element.
	* @param  rname The name of the created rule.
*/
	public static int genDelete(String cname, String aname, String rname)
	{
		 
		//	This method creates a copy of the source model with a delete 
		//	class added as a child of the element to be deleted, and
		//	redirects the input of the transformation to this copy. The
		//	base transformation has ->[delete] as a NAC for all elements
		//	copied from the source model.
		
		try {

			long unixTime = System.currentTimeMillis() / 1000L;
			//String delModelName = "test_del_" + Long.toString(unixTime) + ".xmi";
			String delModelName = "testDel.xmi";

			// Block for transformation generation
			{
				// Read in the base transformation
				BufferedReader in = new BufferedReader(new FileReader("umlGenBase.dsltrans"));
				int lines = 0;
				String str;

				while((str = in.readLine()) != null){
				    lines++;
				}
				in.close();

				// This array will be updated and written to rname.dsltrans
				String input_arr[] = new String[lines];

				in = new BufferedReader(new FileReader("umlGenBase.dsltrans"));

				lines = 0;
				while((str = in.readLine()) != null){
					input_arr[lines] = str;
				    lines++;
				}
				in.close();

				String s = "input.xmi";

				// Redirect transformation to test_del_"unixtime".xmi
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						input_arr[i] = input_arr[i].replace(s, delModelName);
					}
				}

				// Disable the create layer (we are creating nothing)

				// Find the start and end indices of the create layer
				s = "Base Create Layer";
				String e = "</source>";
				int start_index = -1;
				int end_index = -1;

				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						start_index = i;
					}

					if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
						end_index = i;
						i = input_arr.length;
					}
				}

				// Write to rname.dsltrans
				String rule = rname + ".dsltrans";
				BufferedWriter out = new BufferedWriter(new FileWriter(rule));
				for (int i = 0; i < input_arr.length; i++) {
					if ((i < start_index) || (i > end_index)) {
						if(input_arr[i].toLowerCase().contains("Layer2.xmi".toLowerCase())){
							input_arr[i] = input_arr[i].replace("Layer2.xmi", "output.xmi");
						}
						out.write(input_arr[i]);
						out.newLine();
					}
				}
				
				out.close();
				System.out.println("The generated delete rule has been written to:\n" + rule);
			}

			// Block for delete model generation
			{
				// Read in the source model
				BufferedReader in = new BufferedReader(new FileReader("input.xmi"));
				int lines = 0;
				String str;

				while((str = in.readLine()) != null){
				    lines++;
				}
				in.close();

				// This array will be updated and written to output
				String input_arr[] = new String[lines];

				in = new BufferedReader(new FileReader("input.xmi"));

				lines = 0;
				while((str = in.readLine()) != null){
					input_arr[lines] = str;
				    lines++;
				}
				in.close();

				String s = "Name=\"" + cname + "\"";
				int cname_index = 0;
				int num_spaces = 0;
				int contains_attr = 0;

				// Find index of cname
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						cname_index = i;
						String temp = input_arr[i];
						num_spaces = temp.indexOf(temp.trim());
						String old = input_arr[i];
						input_arr[i] = input_arr[i].replace("/", "");
						if (input_arr[i].equals(old)) {
							contains_attr = 1;
						}
					}
				}

				// Write to delModelName
				BufferedWriter out = new BufferedWriter(new FileWriter(delModelName));
				for (int i = 0; i < input_arr.length; i++) {
					out.write(input_arr[i]);
					out.newLine();
					// At cname, write a new line for <delete/>
					if(i == cname_index) {
						String new_line = "";
						for (int j = 0; j < num_spaces; j++) {
							new_line = new_line + " ";
						}
						out.write(new_line + "  <delete Name=\"_Del1\"/>");
						out.newLine();
						if (contains_attr == 0) {
							out.write(new_line + "</" + aname + ">");
							out.newLine();
						}
					}
				}
				out.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

/**
	* Generates a DSLTrans rule that creates an element of type ctype and
	* name cname as a child of the element pname with type ptype. Dependent
	* on the base transformation umlGenBase.dsltrans. Can be used with
	* any arbitrary metamodel, given an appropriate base transformation.
	*
	* @param  pname The name of the parent of the element to be modified.
	* @param  cname The name of the element to be modified.
	* @param  ptype The type of the parent.
	* @param  ctype The type of the modified element.
	* @param  aname The name of the association between the parent and the modified element.
	* @param  root  The name of the root element.
	* @param  rtype The type of the root element.
	* @param  rname The name of the created rule.
	* @param  attr  The attribute to be modifed.
	* @param  attrv The value to set the modified attribute to.
	* @param  mode  The mode - "r" for root to created, and "p" for parent to created.
*/
	public static int genModify(String pname, String cname, String ptype, String ctype, String aname, String root, String rtype, String rname, String attr, String attrv, String mode) {

		// Generate a source model with the element to be modified deleted.
		genDelete(cname, aname, rname + "_del");
		String cwd = System.getProperty("user.dir");
		executeRule(cwd + "/" + rname + "_del" + ".dsltrans", cwd);

		// Recreate the element to be modified with the target attribute value.
		try {
			// Read in the base transformation
			BufferedReader in = new BufferedReader(new FileReader("umlGenBaseM.dsltrans"));
			int lines = 0;
			String str;

			while((str = in.readLine()) != null){
			    lines++;
			}
			in.close();

			// This array will be updated and written to rname.dsltrans
			String input_arr[] = new String[lines];

			in = new BufferedReader(new FileReader("umlGenBaseM.dsltrans"));

			lines = 0;
			while((str = in.readLine()) != null){
				input_arr[lines] = str;
			    lines++;
			}
			in.close();

			// Add attribute to transformation
			String new_s = "createBaseType";
			int ctype_index1 = 0;
			int num_spaces1 = 0;
			int ctype_index2 = 0;
			int num_spaces2 = 0;
			int first = 0;

			// Find index of cname
			for (int i = 0; i < input_arr.length; i++) {
				if(input_arr[i].toLowerCase().contains(new_s.toLowerCase())){
					String temp = input_arr[i];
					if (first == 0) {
						ctype_index1 = i;
						num_spaces1 = temp.indexOf(temp.trim());
						first = 1;
					}
					else if (first == 1) {
						ctype_index2 = i;
						num_spaces2 = temp.indexOf(temp.trim());
					}
				}
			}

			// Declare variables for transformation manipulation
			String s;
			String e;
			int start_index = -1;
			int end_index = -1;

			String s1 = "rootBaseType";
			String s2 = "rootBaseName";
			String s3 = "createBaseType";
			String s4 = "createBaseName";
			String s5 = "baseAssociationName";
			String s6 = "parentBaseType";
			String s7 = "parentBaseName";
			String s8 = "Layer3.xmi";

			// If mode == r, disable parent to created rule.
			if (mode.equals("r")){

				// Find start and end indices of parent to created rule.
				s = "Parent to Created";
				e = "</hasRule>";
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						start_index = i;
					}

					if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
						end_index = i;
						i = input_arr.length;
					}
				}
			}

			// If mode == p, disable root to created rule.
			if (mode.equals("p")){

				// Find start and end indices of root to created rule.
				s = "Root to Created";
				e = "</hasRule>";
				for (int i = 0; i < input_arr.length; i++) {
					if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
						start_index = i;
					}

					if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
						end_index = i;
						i = input_arr.length;
					}
				}
			}

			// Disable the appropriate rule
			for (int i = start_index; i < end_index; i++) {
				if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s2, "DONOTMATCHTHIS");
				}
			}

			// Find the start and end indices of the create layer
			s = "Base Create Layer";
			e = "</source>";
			start_index = -1;
			end_index = -1;

			for (int i = 0; i < input_arr.length; i++) {
				if(input_arr[i].toLowerCase().contains(s.toLowerCase())){
					start_index = i;
				}

				if ((start_index != -1) && (input_arr[i].toLowerCase().contains(e.toLowerCase()))){
					end_index = i;
					i = input_arr.length;
				}
			}

			// Generate the transformation based on the parameters given
			for (int i = start_index; i < end_index + 1; i++) {
				// Replace all instances of "rootBaseType" with rtype.
				if(input_arr[i].toLowerCase().contains(s1.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s1, rtype);
				}

				// Replace all instances of "rootBaseName" with root.
				if(input_arr[i].toLowerCase().contains(s2.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s2, root);
				}

				// Replace all instances of "createBaseType" with ctype.
				if(input_arr[i].toLowerCase().contains(s3.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s3, ctype);
				}

				// Replace all instances of "createBaseName" with cname.
				if(input_arr[i].toLowerCase().contains(s4.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s4, cname);
				}

				// Replace all instances of "baseAssociationName" with aname.
				if(input_arr[i].toLowerCase().contains(s5.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s5, aname);
				}

				// Replace all instances of "parentBaseType" with ptype.
				if(input_arr[i].toLowerCase().contains(s6.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s6, ptype);
				}

				// Replace all instances of "parentBaseName" with pname.
				if(input_arr[i].toLowerCase().contains(s7.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s7, pname);
				}

				// Replace Layer3.xmi with output.xmi"
				if(input_arr[i].toLowerCase().contains(s8.toLowerCase())){
					input_arr[i] = input_arr[i].replace(s8, "output.xmi");
				}
			}

			// Write to rname.dsltrans
			String rule = rname + ".dsltrans";
			BufferedWriter out = new BufferedWriter(new FileWriter(rule));
			for (int i = 0; i < input_arr.length; i++) {
				out.write(input_arr[i]);
				out.newLine();
				// At ctype, write a new line for <attribute ... >
				if ((i == ctype_index1) || (i == ctype_index2)) {
					String new_line = "";
					if (i == ctype_index1) {
						for (int j = 0; j < num_spaces1; j++) {
							new_line = new_line + " ";
						}
					}
					else {
						for (int j = 0; j < num_spaces2; j++) {
							new_line = new_line + " ";
						}
					}
					out.write(new_line + "  <attribute attributeName=" + "\"" + attr + "\"" + ">");
					out.newLine();
					out.write(new_line + "    <attributeValue xsi:type=\"dsltrans:Atom\" value=\"" + attrv + "\"/>");
					out.newLine();
					out.write(new_line + "  </attribute>");
					out.newLine();
				}
			}
			
			out.close();
			System.out.println("The generated modify rule has been written to:\n" + rule);

			// execute the rule
			executeCommand("mv ./input.xmi ./test_tmp.xmi");
			executeCommand("mv ./output.xmi ./input.xmi");
			executeRule(cwd + "/" + rname + ".dsltrans", cwd);
			executeCommand("mv ./test_tmp.xmi ./input.xmi");

			System.out.println("The target model has been written to output.xmi.\n");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	/**
	* Generates a DSLTrans rule that moves element ename to a new
    * location under a parent of type ptype.
	*
	* @param  pname The name of the new parent of the element to be moved.
	* @param  cname The name of the element to be moved.
	* @param  ptype The type of the new parent.
	* @param  ctype The type of the moved element.
	* @param  daname The association between the parent and the moved element.
	* @param  caname The association between the new parent and the moved element.
	* @param  root  The name of the root element.
	* @param  rtype The type of the root element.
	* @param  rname The name of the created rule.
	* @param  roota The name of the root association of the parent.
	*/
// NOTE: must not have a output.xmi present in directory prior to running
	public static int genMove(String cname, String ptype, String ctype, String daname, String caname, String root, String rtype, String rname, String roota) {

		// Generate a source model with the element to be modified deleted.
		genDelete(cname, daname, rname + "_del");
		String cwd = System.getProperty("user.dir");
		executeRule(cwd + "/" + rname + "_del" + ".dsltrans", cwd);
		System.out.println("CHECKPOINT 1");

		// Check if file exists in directory
		File f;
		int check = 0;

		while(check == 0) {
			f = new File("./output.xmi");
			if(f.exists()) {
			    check = 1;
			}
		}
		check = 0;
		System.out.println("CHECKPOINT 2");

		if(ptype.equals("Model")) {
			genCreate("bCMS", cname, ptype, ctype, caname, root, rtype, rname, "r", roota);
		}
		else {
			genCreate("DONOTMATCHTHIS", cname, ptype, ctype, caname, root, rtype, rname, "e", roota);
		}

		// execute the rule

		executeCommand("mv ./input.xmi ./" + rname + "_test_tmp.xmi");
		while(check == 0) {
			f = new File("./" + rname + "_test_tmp.xmi");
			if(f.exists()) {
			    check = 1;
			}
		}
		check = 0;
		System.out.println("CHECKPOINT 3");

		executeCommand("mv ./output.xmi ./input.xmi");
		while(check == 0) {
			f = new File("./input.xmi");
			if(f.exists()) {
			    check = 1;
			}
		}
		check = 0;
		System.out.println("CHECKPOINT 4");

		executeRule(cwd + "/" + rname + ".dsltrans", cwd);
		while(check == 0) {
			f = new File("./output.xmi");
			if(f.exists()) {
			    check = 1;
			}
		}
		check = 0;
		System.out.println("CHECKPOINT 5");

		executeCommand("mv ./" + rname + "_test_tmp.xmi ./input.xmi");

		System.out.println("The target model has been written to output.xmi.\n");
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

	public static void main(String[] args) {
		/* 
			args[0] determines which function to run:
				"c" - create
				"d" - delete
				"m" - modify
				"mv" - move
		*/

		//TODO: let working dir be passed as an argument instead of using cwd
		String cwd = System.getProperty("user.dir");

		if(args[0].equals("c")) {
			genCreate(args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10]);
			
			executeRule(cwd + "/" + args[8] + ".dsltrans", cwd);
			System.out.println("The target model has been written to output.xmi.\n");
		}

		else if (args[0].equals("d")) {
			genDelete(args[1], args[2], args[3]);
			deletePreProcess();
			executeRule(cwd + "/" + args[3] + ".dsltrans", cwd);
			executeCommand("cp input.xmi output.xmi");
			System.out.println("The target model has been written to output.xmi.\n");
		}

		else if (args[0].equals("m")) {
			genModify(args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11]);
		}

		else if (args[0].equals("mv")) {
			genMove(args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
		}
	}
}