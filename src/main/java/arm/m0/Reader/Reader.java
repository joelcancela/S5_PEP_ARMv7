package arm.m0.Reader;

import arm.m0.Opcodes.TextToOpcodes;

import java.io.*;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class Reader {
	public String romContent = "";
	public String ramContent = "";
	private BufferedReader reader;

	public Reader(String filename) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader = new BufferedReader(fileReader);
	}

	public void convert() throws IOException {
		int romCount=0;
		int ramCount=0;
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
			if(romCount==8){
				romContent+="\n";
			}
			if(ramCount==8){
				ramContent+="\n";
			}
			String[] tokens = line.split("\\s*(\\s|,)\\s*");
			if(tokens[0].equals("LDR") || tokens[0].equals("STR")){
				ramContent+= TextToOpcodes.convert(tokens)+" ";
				ramCount++;
			}
			else{
				romContent+= TextToOpcodes.convert(tokens)+" ";
				romCount++;
			}



		}
		writeFiles();

	}

	public void writeFiles() throws IOException {
		File romFile = new File("rom.ini");
		File ramFile = new File("ram.ini");
		// creates the file
		romFile.createNewFile();
		ramFile.createNewFile();
		// creates a FileWriter Object
		FileWriter romWriter = new FileWriter(romFile);
		FileWriter ramWriter = new FileWriter(ramFile);
		// Writes the content to the file
		romWriter.write("v2.0 raw \n");
		ramWriter.write("v2.0 raw \n");

		romWriter.write(romContent);
		ramWriter.write(ramContent);

		romWriter.flush();
		ramWriter.flush();
		romWriter.close();
		ramWriter.close();
	}
}
