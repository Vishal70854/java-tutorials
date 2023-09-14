package java_new_api_features.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		/*
		 * Type Inference is a concept where java infers the type of variable at compile
		 * time // List<List<Stringr>> newList = List.of(names1, names2); // instead of
		 * doing this here java will automatically check and get the type of newList i.e
		 * List<List<String>> var newList = List.of(names1, names2); // var will be
		 * replaced by java and its type will be taken care by java
		 * 
		 * note : var abc = null; dont give null to var type
		 *
		 * we can make our code more readable by giving the type as var as sometimes it
		 * can be very confusing to give type to some variables/arrays type inference is
		 * very useful when giving var as type and java will automatically convert it on
		 * our behalf
		 */
		List<String> names1 = List.of("vishal", "kumar", "singh");
		List<String> names2 = List.of("adam", "eve");
		// List<List<Stringr>> newList = List.of(names1, names2); // instead of doing
		// this

		// here java will automatically check and get the type of newList
		// si.e List<List<String>>
		var newList = List.of(names1, names2);
		newList.stream().forEach(System.out::println);

		// we can use it on loops as well
		for (var i = 0; i < 10; i++) { // var will automatically take type as int
			System.out.println(i);
		}

		// we can use enhanced for loop also
		for (var name : names1) { // var will automatically take type as String
			System.out.println(name);
		}

		// we can use var in stream also
		// use var in place of Stream<String> and java will automatically convert
		// it on our behalf at compile time thus it improves readability.
		var getName = names2.stream().filter(s -> s.length() < 4);
		getName.forEach(System.out::println);
	}

}
