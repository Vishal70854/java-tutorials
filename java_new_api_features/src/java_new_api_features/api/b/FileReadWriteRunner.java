package java_new_api_features.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
	public static void main(String[] args) throws IOException {
		/*
		 * reading and writing contents of a file by using readString() and
		 * writeString() methods. it will read and write all contents of a file into a
		 * string, decoding from bytes to characters
		 */
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);

		// replace contents in a file
		String newFileContent = fileContent.replace("line", "Lines");

		Path newFilePath = Paths.get("./resources/sample-new.txt");
		Files.writeString(newFilePath, newFileContent);
	}
}
