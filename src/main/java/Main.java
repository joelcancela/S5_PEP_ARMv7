import arm.m0.Reader.Reader;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.IOException;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class Main {
	public static void main(String[] args) {
		//First, we got to configure the parser.
		OptionParser parser = new OptionParser("i:"); //: after a character means that an argument is mandatory for this flag.
		OptionSet options = parser.parse(args); //Handle the args of the command line with the options.

		if(options.has("i")){
			try {
				new Reader((String)options.valueOf("i")).convert();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
