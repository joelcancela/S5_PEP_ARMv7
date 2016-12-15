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
	public String[] getNextLine() {

		String[] next;
		StringBuffer buff = new StringBuffer();

		// EOF
		if (!this.filePtr.hasNext()) {
			return null;
		}
		
		buff.append(this.filePtr.next().trim());
		if (!buff.toString().contains(" ")) {
			return null;
		}

		next = buff.toString().split(" ");
		if (next.length != 2) {
			return null;
		}

		return next;
	}
}
