package com.first_java_project;

public class SumOfSquares {

	public static int getSumOfSquares(int n) {
		if (n < 0) {
			return -1;
		}
		int sumOfNumbers = 0;
		for (int i = 1; i <= n; i++) {
			sumOfNumbers += (i * i);
		}
		return sumOfNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = getSumOfSquares(3);
		System.out.println("sum of squares = " + number);
	}

}
