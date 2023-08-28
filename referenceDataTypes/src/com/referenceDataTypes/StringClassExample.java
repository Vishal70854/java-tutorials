package com.referenceDataTypes;

public class StringClassExample {
	public static void main(String[] args) {
		String string = "Test";
		// get the character of string using str.charAt(index number)
		System.out.println(string.charAt(0)); // 'T' // get character at mentioned index
		System.out.println(string.charAt(1)); // 'e'
		System.out.println(string.charAt(2)); // 's'
		System.out.println(string.charAt(3)); // 't'

		// get the length of string
		System.out.println("length of string is - " + string.length()); // 4

		// get the substring from the string using substring(starting index of string )
		String textString = "This is a lot of text again";
		System.out.println(textString.substring(5)); // given only starting index of substring
		// given starting(inclusive) and ending index(exclusive) of substring
		System.out.println(textString.substring(5, 9));

		// prints individual character in new line
		for (int i = 0; i < textString.length(); i++) {
			System.out.println(textString.charAt(i));
		}

		// note: *****************************************
		// in indexOf("substring") we will get the starting index of substring or
		// character
		// in charAt(index) we will get the character at the mentioned index
		// in lastIndexOf("substring") we will get index of substring or character from
		// last

		// check if a substring is present in a string using indexOf(substring to be
		// searched)
		System.out.println(textString.indexOf("lot")); // get first index of 'l'
		System.out.println(textString.charAt(10)); // get character at index 10

		// get the index of any char or substring using lastIndexOf("substring to be
		// searched") starting from last to first index
		System.out.println(textString.lastIndexOf('i'));

		// check if a word exists in a string using contains("substring")
		System.out.println(textString.contains("text")); // returns boolean value

		// check if a string starts with a given word using startsWith("substring")
		System.out.println(textString.startsWith("This")); // returns boolean value

		// check if a string ends with a given word using endsWith("substring")
		System.out.println(textString.endsWith("Againing")); // returns boolean value

		// check if a string is empty using isEmpty()
		System.out.println(textString.isEmpty()); // returns boolean value

		// check if two strings are equal using equals() method
		String str = "value";
		System.out.println(str.equals("value")); // returns boolean value

		// concatenate a string with another string using concat("string")
		String name = "Vishal";
		String name2 = name.concat(" is awesome");
		System.out.println(name2); // "vishal is awesome" (reference to another string with the
									// mentioned value)
		System.out.println(name); // vishal since string is immutable

		// convert string character using upperCase() or lowerCase()
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);

		// remove spaces from start and end of a string using trim()
		System.out.println(name2.trim());

		// using join() method to separate a list of string
		System.out.println(String.join(",", "A", "B", "C", "D")); // separated by ","
		System.out.println(String.join(".", "1", "2", "3")); // separated by "."

		// replace a character in a string using replace('character')
		String val = "This is it";
		System.out.println(val.replace('i', 'z')); // it changes string and stores it in some other variable with
													// different location
		System.out.println(val); // no change in val as string is immutable

	}
}
