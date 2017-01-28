import arm.m0.Reader.RAMConverter;
import arm.m0.Reader.ROMConverter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.IOException;

/**
 * Main class
 */
public class Main {
	public static void main(String[] args) {
		//First, we got to configure the parser.
		OptionParser parser = new OptionParser(); //: after a character means that an argument is mandatory for this flag.
		parser.accepts("rom").withRequiredArg();
		parser.accepts("ram").withRequiredArg();
		OptionSet options = parser.parse(args); //Handle the args of the command line with the options.


		if (options.has("rom")) {
			try {
				new ROMConverter((String) options.valueOf("rom")).convert();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (options.has("ram")) {

			try {
				new RAMConverter((String) options.valueOf("ram")).convert();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
