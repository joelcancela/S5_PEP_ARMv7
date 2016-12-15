package arm.m0;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.imageio.ImageIO;

import arm.m0.v1.MediaUtils.Media;
import arm.m0.v1.Opcodes.Opcode;

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
		Opcode instruction = media.getNextInstruction();

		while (instruction != null) {

			// Append
			rom.append(instruction);

			// Get next
			instruction = media.getNextInstruction();
		}
		
		return rom;
	}
}
