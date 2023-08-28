package com.javaCodingExercise3;

public class MyChar {

	// Method to determine if a character is a vowel
	public boolean isVowel(char ch) {

		// Use a switch statement to check for each vowel, both lowercase and uppercase
		switch (ch) {

		case 'a', 'e', 'i', 'o', 'u':
		case 'A', 'E', 'I', 'O', 'U':
			return true;
		default:
			return false;
		}

	}

	public static void main(String[] args) {
		MyChar myChar = new MyChar();
		System.out.println(myChar.isVowel('B'));
	}
}
