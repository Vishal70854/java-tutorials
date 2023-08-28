package com.ifStatement.examples;

public class CodingExerciseIfElseAndSwitch {
	public static void main(String[] args) {
		System.out.println(isWeekDay(4));
		System.out.println(determineNameOfMonth(12));
		System.out.println(determineNameOfDay(5));
	}

	// used if-else statements here
	public static String determineNameOfMonth(int monthNumber) {

		if (monthNumber == 1) {
			return "January";
		} else if (monthNumber == 2) {
			return "February";
		} else if (monthNumber == 3) {
			return "March";
		} else if (monthNumber == 4) {
			return "April";
		} else if (monthNumber == 5) {
			return "May";
		} else if (monthNumber == 6) {
			return "June";
		} else if (monthNumber == 7) {
			return "July";
		} else if (monthNumber == 8) {
			return "August";
		} else if (monthNumber == 9) {
			return "September";
		} else if (monthNumber == 10) {
			return "October";
		} else if (monthNumber == 11) {
			return "November";
		} else if (monthNumber == 12) {
			return "December";
		} else {
			return "None";
		}

	}

	// used switch statements here
	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Enter valid day number";
		}
	}

	public static boolean isWeekDay(int dayNumber) {
		return dayNumber >= 0 && dayNumber <= 6;
	}
}
