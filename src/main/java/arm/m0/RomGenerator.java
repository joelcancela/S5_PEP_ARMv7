package arm.m0;

import arm.m0.MediaUtils.Media;

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
		String w = media.getNextWord();

		while (w != null) {

			// Append
			rom.append(w);

			// Get next
			w = media.getNextWord();
		}
		
		return rom;
	}
}
