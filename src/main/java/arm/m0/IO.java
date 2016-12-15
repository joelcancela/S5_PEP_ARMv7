package arm.m0;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;

/**
 * Input / Output Manager
 * 
 * Override the System.in and System.out by specifying file path.
 * Standard Input and Output are saved in :
 *  - stdIn
 *  - stdOut
 * 
 * @author Nikita ROUSSEAU
 */
public class IO {

	/**
	 * Singleton pattern implementation
	 * Instance handle
	 */
	private static IO instance = null;

	/**
	 * Private default constructor for the implementation of the singleton pattern
	 */
	private IO() {}

	/**
	 * @return IO
	 */
	public static IO getInstance(){
		if (IO.instance == null) {
			IO.instance = new IO();
		}
		return IO.instance;
	}

	public void setOut(String filePath) throws Exception {
		
		if (filePath == null || filePath.isEmpty()) {
			throw new Exception("no output file given.");
		}
		
		filePath = FilenameUtils.normalize(filePath);

		try {
			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream( new File( filePath ).getPath() )), true)); // Auto-Flush flag set
		} catch (FileNotFoundException e) {
			throw new Exception("enable to set output file.");
		}
	}

	public void setIn(String filePath) throws Exception {

		if (filePath == null || filePath.isEmpty()) {
			throw new Exception("no input file given.");
		}
		
		filePath = FilenameUtils.normalize(filePath);

		File file = Paths.get( filePath ).normalize().toFile();

		if (!file.exists() || !file.isFile()) {
			throw new Exception("input file not found.");
		}

		try {
			System.setIn(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// Do nothing, this error is handled above
		}
	}
}
