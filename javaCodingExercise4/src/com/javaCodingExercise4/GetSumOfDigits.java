package com.javaCodingExercise4;

public class GetSumOfDigits {

	public int getSumOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		int sumOfDigits = 0;
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			sumOfDigits += remainder;
			number = number / 10;
		}
		return sumOfDigits;
	}

	public static void main(String[] args) {
		GetSumOfDigits getSum = new GetSumOfDigits();
		System.out.println(getSum.getSumOfDigits(1234));
	}
}
