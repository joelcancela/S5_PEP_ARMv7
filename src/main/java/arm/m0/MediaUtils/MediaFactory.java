package arm.m0.MediaUtils;

import java.io.File;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;

/**
 * Media Factory
 * 
 * Creates a Media object
 * 
 * @author Nikita ROUSSEAU
 */
public class MediaFactory {

	/**
	 * Default constructor
	 */
	private MediaFactory() {
	}

	/**
	 * Creates a new media object that can be manipulated
	 * 
	 * @param String filePath The file path
	 * @return Media
	 * @throws Exception 
	 */
	public static Media getMedia(String filePath) throws Exception {
		
		if (filePath == null || filePath.isEmpty()) {
			throw new Exception("filename attribute is empty.");
		}
		
		filePath = FilenameUtils.normalize(filePath);

		// Chroot the file location to the user directory
		File file = Paths.get( System.getProperty("user.dir") + System.getProperty("file.separator") + filePath ).normalize().toFile();

		if (!file.exists() || !file.isFile()) {
			throw new Exception("'" + file.toPath() + "' does not exist. Working directory is set to '" + System.getProperty("user.dir") + "'");
		}

		return new TextMedia(file);
	}
}
