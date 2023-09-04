package com.exception_handling;

public class TryCatchFinallyPuzzles {
	// will finally be executed -- yes
	public static void method1() {

		try {
			String string = null;
			string.length();

			System.out.println("Try block executed"); // this will not be executed as exception occured above
			return; // if return is there then also finally will be executed.

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Catch block executed");
		} finally {
			System.out.println("Finally block executed");
		}

	}

	// will this method be executed with only try-finally -- yes
	public static void method2() {

		try {
			int[] numbers = { 1, 2, 3, 5 };
			int number = numbers[20]; // exception occured here

			System.out.println("Try block executed"); // this will not be executed as exception occured above
			return; // if return is there then also finally will be executed.

		} finally {
			System.out.println("Finally block executed");
		}

	}

	public static void main(String[] args) {
		//method1(); // check if finally will be executed or not
		method2();
	}

}
