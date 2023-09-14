package java_new_api_features.api.d;

public class StringNewApiRunner {

	public static void main(String[] args) {
		/*
		 * getting to know all String utility methods in java
		 * 
		 */
		System.out.println(" ".isBlank());// check if any not whitespace character exists

		// here " " is replaced by "@" symbol
		System.out.println(" L R ".trim().replace(" ", "@")); // remove space from both ends
		System.out.println(" L R ".stripLeading().replace(" ", "@")); // remove space from front
		System.out.println(" L R ".stripTrailing().replace(" ", "@")); // remove space from back

		// if we have a string and we want to break it into multiple lines then we can
		// do it via stream
		// this indicates a stream of String -> "line1\nline2\nline3\nline4".lines(
		"line1\nline2\nline3\nline4".lines().forEach(System.out::println);

		// if we want to transform a string to something else then we will use
		// transform()
		// get all characters/ substring starting from index 2
		System.out.println("UPPER".transform(s -> s.substring(2)));

		// to format the string we can use formatted()
		String myString = "My name is %s. My age is %d";
		System.out.println(myString.formatted("Vishal", 24));

	}

}
