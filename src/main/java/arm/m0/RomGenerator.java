package arm.m0;

import arm.m0.MediaUtils.Media;
import arm.m0.Opcodes.OpcodeFactory;

public class RomGenerator {

	/**
	 * Generate 
	 * 
	 * @param media
	 * @return ROM
	 * @throws Exception
	 */
	public static Rom generateROM(Media media) throws Exception {

		Rom rom = new Rom();
		OpcodeFactory f = new OpcodeFactory();

		String[] line = media.getNextLine();

		while (line != null) {
			
			String op = line[0];
			String args = line[1];

			// Append
			rom.append(f.getOpcode(op, args));

			// Get next
			line = media.getNextLine();
		}
		
		return rom;
	}
}
