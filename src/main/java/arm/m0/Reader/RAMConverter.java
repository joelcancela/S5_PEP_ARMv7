package arm.m0.Reader;

import java.io.*;

/**
 * Created by Joel CANCELA VAZ on 03/01/2017.
 */
public class RAMConverter {
	public String ramContent = "";
	private BufferedReader reader;

	public RAMConverter(String filename) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader = new BufferedReader(fileReader);
	}

	public void convert() throws IOException {
		int ramCount = 0;
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
			String[] tokens = line.split(" ");
			for (String s : tokens) {
				if (ramCount % 8 == 0) {
					ramContent += "\n";
				}
				ramContent += String.format("%x", Integer.parseInt(s, 10)) + " ";
				ramCount++;
			}
		}
		writeRAM();

	}

	public void writeRAM() throws IOException {
		File ramFile = new File("ram.ini");
		// creates the file
		ramFile.createNewFile();
		// creates a FileWriter Object
		FileWriter ramWriter = new FileWriter(ramFile);
		// Writes the content to the file
		ramWriter.write("v2.0 raw");

		ramWriter.write(ramContent);

		ramWriter.flush();
		ramWriter.close();
	}
}
