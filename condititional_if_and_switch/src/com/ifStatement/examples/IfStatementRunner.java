package com.ifStatement.examples;

public class IfStatementRunner {
	public static void puzzle() {
		int k = 15;
		if (k > 15) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

	public static void main(String[] args) { // main method
		int i = 25;
		if (i == 25) {
			System.out.println("i == 25");
		} else {
			System.out.println("i != 25 ");
		}

		// call the puzzle method(since its static method it can be called without
		// object)
		puzzle();
	}
}
