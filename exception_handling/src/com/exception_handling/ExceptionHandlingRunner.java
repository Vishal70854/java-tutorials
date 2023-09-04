package com.exception_handling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended"); // not be printed as exception occured above
	}

	private static void method1() {
		method2();
		System.out.println("method 2 ended");
	}

	private static void method2() {
		String string = null;
		string.length(); // exception/error occured here
		System.out.println("method 1 ended");// this will not be printed since above exception happened
	}

}
