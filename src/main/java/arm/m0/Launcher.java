package arm.m0;

import org.apache.commons.cli.*;

import arm.m0.MediaUtils.MediaFactory;

public class Launcher {
	
	public static void main(String[] args) {

		/**
		 * CLI Initialization
		 * 
		 * @see https://commons.apache.org/proper/commons-io/description.html
		 * @see https://commons.apache.org/proper/commons-cli/introduction.html
		 */

		Options options = new Options();
		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		CommandLine cmd;

		options.addOption("i", "--opcodes", true, "the ROM initializer as text file (OPCODES).");
		options.addOption("o", "--out", true, "the generated ROM file for Logisim.");

		/**
		 * CLI Processing
		 */

		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			formatter.printHelp("", options);
			System.exit(0);
			return;
		}
		
		/**
		 * Set output stream if any
		 */

		if (cmd.hasOption("o")) {
			try {
				IO.getInstance().setOut(cmd.getOptionValue("o"));
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}
		}

		/**
		 * Execute
		 */

		try {

			/**
			 * Get the plain text file
			 * containing the OPCODES
			 */
			
			String romAsOpcodes = cmd.getOptionValue("i");
			
			if (romAsOpcodes == null) {
				formatter.printHelp("", options);
				System.exit(0);
				return;
			}

			/**
			 * Generate
			 */
			System.out.print(RomGenerator.generateROM(MediaFactory.getMedia(romAsOpcodes)).toString());

			/**
			 * Exit
			 */
			System.exit(0); // OK
		} catch (Exception e) {
			
			System.err.println(e.getMessage());
            System.exit(1);
		}
	}	
}
