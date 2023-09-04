package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		// we will write to a file

		// here "." means the current di
		// get all files names in the current directory
		// Files.list(currentDirectory) returns a stream back
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");

		List<String> list = List.of("apple", "ball", "cat", "dog");

		// write to a file using Files.write()
		Files.write(pathFileToWrite, list);

	}

}
