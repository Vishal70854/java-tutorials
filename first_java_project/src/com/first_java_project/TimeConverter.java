package com.first_java_project;

public class TimeConverter {
	// method to convert hours to minutes
	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		if (hours < 0) {
			return -1;
		}

		return hours * 60;
	}

	// method to convert days to minutes
	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		if (days < 0) {
			return -1;
		}
		return days * 24 * 60;
	}

	public static void main(String[] args) {
		// convert hours to minutes
		int hoursToMinutes = convertHoursToMinutes(10);
		System.out.println("hours to minutes conversion = " + hoursToMinutes);

		// convert days to minutes
		int daysToMinutes = convertDaysToMinutes(5);
		System.out.println("days to minutes conversion = " + daysToMinutes);
	}
}