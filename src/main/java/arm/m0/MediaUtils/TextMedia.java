package arm.m0.MediaUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class TextMedia extends Media {

	/**
	 * line by line reader
	 */
	private LineIterator filePtr = null;

	/**
	 * stores the remaining instruction of the current line as a buffer
	 */
	private StringBuffer lineBuffer = new StringBuffer();

	public TextMedia(File f) throws Exception {

		if (f == null) {
			throw new Exception("bad file.");
		}

		if (f.isFile()) {			
			try {
				this.filePtr = FileUtils.lineIterator(f);
			}
			catch (IOException e) {
				throw new Exception(e.getMessage());
			}
		}
	}

	/**
	 * Reads the next word of the ROM
	 * 
	 * @return String Operator String or The Empty String if EOF reached
	 */
	@Override
	public String getNextWord() {

		String next = "";
		
		// if buffer is empty, populate
		if (this.lineBuffer.length() == 0) {
			
			// EOF
			if (!this.filePtr.hasNext()) {
				return null;
			}

			this.lineBuffer.append(this.filePtr.next().trim());
		}
		
		// fetch the next word
		if (this.lineBuffer.toString().contains(" ")) {
			String[] parts = this.lineBuffer.toString().split(" ");
			next = parts[0];	
		} else {
			next = this.lineBuffer.toString();
		}
		
		// remove from the buffer the word
		this.lineBuffer.delete(0, next.length());
		
		// trim the buffer
		if (this.lineBuffer.length() > 0) {
			if (this.lineBuffer.charAt(0) == ' ') {
				this.lineBuffer.delete(0, 1);
			}
			if (this.lineBuffer.charAt(this.lineBuffer.length() - 1) == ' ') {
				this.lineBuffer.delete(this.lineBuffer.length() - 1, 1);
			}
		}
		
		// Return the next word as String
		return next;
	}
}
