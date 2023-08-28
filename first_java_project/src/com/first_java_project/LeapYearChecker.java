package com.first_java_project;

public class LeapYearChecker {

	public static boolean isLeapYear(int year) {
		if (year < 1) { // edge case
			return false;
		}

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) { // leap year
					return true;
				} else { // not a leap year
					return false;
				}
			} else { // leap year
				return true;
			}

		} else { // not a leap year
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean leapYear = isLeapYear(2048);
		System.out.println(leapYear);
	}

}
