package com.javaCodingExercise4;

public class GetLastDigit {

	public int getLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		return number % 10;
	}

	public static void main(String[] args) {
		GetLastDigit getLast = new GetLastDigit();
		System.out.println(getLast.getLastDigit(12345));
	}
}
