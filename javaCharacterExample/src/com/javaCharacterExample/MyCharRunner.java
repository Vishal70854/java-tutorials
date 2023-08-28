package com.javaCharacterExample;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isDigit());

		MyChar.printLowerCaseAlphabets(); // static methods can be called directly using class name.methodName()
		MyChar.printUpperCaseAlphabets();
	}

}
