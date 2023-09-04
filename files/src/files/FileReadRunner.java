package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		// here "." means the current di
		// get all files names in the current directory
		// Files.list(currentDirectory) returns a stream back
		Path pathFileToRead = Paths.get("./resources/data.txt");

		// read all lines in a file and make it a list in output
		/*
		 * List<String> lines = Files.readAllLines(pathFileToRead);
		 * System.out.println(lines);
		 */

		// Files.lines() returns a Stream<String>
		// it process each line one by one and outputs it
		Files.lines(pathFileToRead).filter(str -> str.contains("a")).map(String::toUpperCase)
				.forEach(System.out::println);

	}

}
