package com.ifStatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		// taking user input from user using Scanner class
		// Type obj = new Type(argument)
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number1 : ");
		int number1 = scanner.nextInt();

		System.out.println("the first number is - " + number1);

		System.out.print("Enter the number2 : ");
		int number2 = scanner.nextInt();
		System.out.println("the second number is - " + number2);

		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.print("Enter your choice : ");
		int choice = scanner.nextInt();
		performOperationsUsingNestedIfElse(number1, number2, choice); // call ifelse method
		performOperationsUsingNestedSwitch(number1, number2, choice); // call switch method
	}

	private static void performOperationsUsingNestedIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println(number1 + number2);
		} else if (choice == 2) {
			System.out.println(number1 - number2);
		} else if (choice == 3) {
			System.out.println(number1 * number2);
		} else if (choice == 4) {
			System.out.println(number1 / number2);
		} else {
			System.out.println("Enter a valid choice from 1, 2, 3, 4");
		}
	}

	// switch example
	private static void performOperationsUsingNestedSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 * number2);
			break;
		case 4:
			System.out.println(number1 / number2);
			break;
		default:
			System.out.println("Enter a valid choice from 1, 2, 3, 4");
			break;
		}

	}

}
