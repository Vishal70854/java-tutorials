package java_new_api_features.api.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		// List.copyOf() returns an unmodifiable list containing elements of collection
		// copyOf() exists for List, Set and Map interface. we can use for any of the
		// collections

		List<String> names = new ArrayList<>();
		names.add("ravi"); // element added in ArrayList
		names.add("vishal");
		names.add("ravi");
		names.add("manoj");
		doNotChange(names); // it will add elements in the list
		System.out.println(names);

		// to create unmodifiable list we can use List.of() also
		// here we will use List.copyOf() which creates an unmodifiable list
		List<String> copyOfNames = List.copyOf(names);

		doNotChange(copyOfNames); // it will throw exception as copyOf will create unmodifiable list
		System.out.println(copyOfNames);

		// Set copyOf() implementation
		Set<String> setNames = new HashSet<String>();
		setNames.add("hello");
		setNames.add("bye");
		setNames.add("hey");

		Set<String> copyOfSetNames = Set.copyOf(setNames);
		doNotChangeSet(copyOfSetNames); // throw exception as it is unmodifiable set
		System.out.println(copyOfSetNames);

		// Map copyOf() implementation
		Map<String, String> mapNames = new HashMap<>();
		mapNames.put("hello", "word");
		mapNames.put("bye", "word");
		mapNames.put("hey", "word");

		Map<String, String> copyOfMapNames = Map.copyOf(mapNames);
		doNotChangeMap(copyOfMapNames); // throw exception as it is unmodifiable map
		System.out.println(copyOfMapNames);

	}

	private static void doNotChangeMap(Map<String, String> copyOfMapNames) {
		copyOfMapNames.put("kumar", "sanu");

	}

	private static void doNotChangeSet(Set<String> setNames) {
		setNames.add("singh");

	}

	private static void doNotChange(List<String> names) {
		names.add("should not be allowed");

	}
}
