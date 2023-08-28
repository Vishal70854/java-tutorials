package com.arrayExampleWithObjects;

import java.util.Arrays;

public class Person {

	// find the longest word in a week
	private static String findMostNumberOfLetters(String[] letterStrings) {
		int max = Integer.MIN_VALUE;
		String longestWordString = "";
		for (String letter : letterStrings) { // typeOfEachVariable varName : arrayName
			if (letter.length() > max) {
				max = letter.length();
				longestWordString = letter;
			}
		}
		return longestWordString;
	}

	// prints days of week in reverse order
	private static void printDaysOfWeekInReverse(String[] letterStrings) {
		for (int i = letterStrings.length - 1; i >= 0; i--) {
			System.out.print(letterStrings[i] + " ");
		}

	}

	public static void main(String[] args) {

		Person[] persons = new Person[5]; // array of Person object
		persons[1] = new Person(); // create a constructor and assign it to persons[1]
		System.out.println(Arrays.toString(persons));// print persons array in string format

		// create new Person array with initialized values
		Person[] persons2 = { new Person(), new Person() };
		System.out.println(Arrays.toString(persons2)); // prints array as string

		// create array of String objects
		// for String object we dont need to mention new. java will automatically create
		// it for us

		String[] fruit = { "Apple", "Banana", "Mango" };
		System.out.println(Arrays.toString(fruit));

		// exercise
		String[] letterStrings = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println(findMostNumberOfLetters(letterStrings));

		printDaysOfWeekInReverse(letterStrings);

	}

}
