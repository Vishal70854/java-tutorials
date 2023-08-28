package com.javaCharacterExample;

public class MyChar {
	private char ch;

	// constructor overloading in java
	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		// check ascii value of 0 till 9
		return ch >= 48 && ch <= 57; // between 0 and 9

	}

	public boolean isAlphabet() {
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'; // between ('a' to 'z') or ('A' to 'Z')
	}

	public static void printUpperCaseAlphabets() { // prints all small case letters

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println('\n');
	}

	public static void printLowerCaseAlphabets() { // prints all upper case letters

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println('\n');
	}
}
