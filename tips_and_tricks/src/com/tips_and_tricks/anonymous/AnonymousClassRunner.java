package com.tips_and_tricks.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String animal1, String animal2) {
		// sort by length of animal name
		return Integer.compare(animal1.length(), animal2.length());
	}

}

public class AnonymousClassRunner {
	public static void main(String[] args) {
		// List.of() creates a list of immutable objects
		List<String> animals = new ArrayList<>(List.of("Monkey", "Ant", "cat", "Ball", "Elephant"));
		Collections.sort(animals); // sort alphabetically using Collections.sort()
		System.out.println("Sort by name - " + animals);

		// sort it by using our own comparator i.e sort by length of word
		Collections.sort(animals, new LengthComparator());
		System.out.println("Sortby length by our own comparator class - " + animals);

		// performing anonymous class example
		// instead of creating our comparator class we will directly implement it
		// in Collections.sort()

		// here lengthComparator is an instance of Comparator class
		// a class without a name is a anonymous class
		System.out.println("Example of anonymous class : ");
		Comparator<String> lengthComparator = new Comparator<String>() {
			@Override
			public int compare(String animal1, String animal2) {
				// sort it in descending order by length of each word
				return Integer.compare(animal2.length(), animal1.length());
			}
		};

		System.out.println("tried anonymous classes - " + lengthComparator);
	}

}
