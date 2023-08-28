package com.LoopExamples;

import java.util.Scanner;

public class DoWhileExampleRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		do {
			System.out.print("Enter a number : ");
			number = scanner.nextInt();
			System.out.println("Cube of " + number + " is : " + number * number * number);
		} while (number >= 0);
		System.out.println("Thanks. Have Fun! ");

	}
}
