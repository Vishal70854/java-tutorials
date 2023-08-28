package com.javaCodingExercise4;

public class FactorialCalculator {

	public int calculateFactorial(int number) {
		if (number < 0) {
			return -1;
		}
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		return factorial;
	}

	public static void main(String[] args) {
		FactorialCalculator factorialCalculator = new FactorialCalculator();
		System.out.println(factorialCalculator.calculateFactorial(5));
	}
}
