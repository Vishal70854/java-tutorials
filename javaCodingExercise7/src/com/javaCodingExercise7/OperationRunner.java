package com.javaCodingExercise7;

public class OperationRunner {

	public static void main(String[] args) {
		System.out.println("add, multiply, divide operation using interface");

		// addition
		Add add = new Add();
		System.out.println("add - " + add.perform(2, 3));

		// subtraction
		Subtract subtract = new Subtract();
		System.out.println("subtract - " + subtract.perform(3, 1));

		// divide
		Divide divide = new Divide();
		System.out.println("divide - " + divide.perform(4, 2));

	}

}
