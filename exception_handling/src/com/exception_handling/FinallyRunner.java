package com.exception_handling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		/*
		 * note - the order of catch block should be from top to down i.e subclasses to
		 * Class ex - InterruptedException -> Exception (sequence of catch block)
		 */
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5]; // exception occured

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally { // finally will always be executed whether there is exception or not
			System.out.println("Before scanner class");
			if (scanner != null) {
				scanner.close(); // we need to close scanner to remove wastage of memory
			}
		}
		System.out.println("Just before closing out the MAIN");
	}
}