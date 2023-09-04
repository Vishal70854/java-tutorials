package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		// get all files names in the current directory
		// Files.list(currentDirectory) returns a stream back
		Path currentDirectory = Paths.get(".");
//		Files.list(currentDirectory).forEach(System.out::println);

		// walk through the current directory recursively by using Files.walk(directory,
		// num)
		// Files.walk(currentDirectory, 1) returns a stream back using method references
		// from functional programming
		// here 1 refers to the level of recursive search calls for the files

		// filter stream that contains only .java in it

		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);

	}

}
