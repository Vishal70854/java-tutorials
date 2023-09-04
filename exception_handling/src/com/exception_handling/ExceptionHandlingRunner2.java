package com.exception_handling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended"); // not be printed as exception occured above
	}

	private static void method1() {
		method2();
		System.out.println("method 1 ended");
	}

	private static void method2() {
		try {
			// String string = null;
			// string.length(); // exception/error occured here i.e NullPointerException
			int[] i = { 1, 2 };
			int number = i[3]; // exception occured
			System.out.println("method 2 ended");// this will not be printed since above exception happened

		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception");
			ex.printStackTrace(); // print the stack trace of all exception happened
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace(); // print the stack trace of all exception happened
		} catch (Exception ex) {
			System.out.println("Matched exception");
			ex.printStackTrace(); // print the stack trace of all exception happened
		}
	}

}
