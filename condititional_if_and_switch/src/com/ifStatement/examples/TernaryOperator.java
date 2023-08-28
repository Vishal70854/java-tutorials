package com.ifStatement.examples;

public class TernaryOperator {
	public static void main(String[] args) {
		int i = 5;
		// if-e
		if (i % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

		// using ternary operator
		// syntax :
		// variable = (condition) ? true : false;
		boolean isEven = (i % 2 == 0) ? true : false; // ternary operator return boolean value
		System.out.println(isEven);

		String evenString = (i % 2 == 0) ? "Yes" : "No"; // ternary operator return String value
		System.out.println(evenString);
	}
}
