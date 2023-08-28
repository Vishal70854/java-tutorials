package com.first_java_project;

public class PerfectNumberChecker {

	public static boolean isPerfectNumber(int number) {
		if (number <= 0) {
			return false;
		}
		long sum = 1;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				// its a factor of number
				if (i * i == number) {
					sum += i;
				} else {
					sum += i + (number / i);
				}

			}
		}

		return sum == number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean checkPerfectNumber = isPerfectNumber(28);
		System.out.println(checkPerfectNumber);

	}

}
