package com.LoopExamples;

public class MyNumber {
	private int number;

	// constructor overloading with a parameter for MyNumber class
	public MyNumber(int number) {
		this.number = number;
	}

	// check if number is prime or not
	public boolean isPrime() {
		int count = 0;
		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				if (number == i) {
					count += 2;
				} else {
					count += 1;
				}
			}

		}
		return count == 0;
	}

	// get sum of number from 1 till number
	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	// get sum of divisors
	public int getSumOfDivisors() {
		int sumOfDivisors = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sumOfDivisors += i;
			}
		}
		return sumOfDivisors;
	}

	// print a triangle number
	public void printANumberTriangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
