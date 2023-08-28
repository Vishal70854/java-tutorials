package com.wrapperClassesExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExamples {
	public static void main(String[] args) {
		// note : LocalDate, LocalTime, LocalDateTime
		// these are all immutable. if we print any changed value then it gets created
		// in some other variable and original object is not changed

		LocalDate now = LocalDate.now(); // gets the current date
		System.out.println(now);

		LocalTime nowTime = LocalTime.now(); // gets the current time
		System.out.println(nowTime);

		LocalDateTime nowDateTime = LocalDateTime.now(); // gets current date and time
		System.out.println(nowDateTime);

		// some more methods of LocalDate
		LocalDate today = LocalDate.now();
		System.out.println(today.getYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.plusDays(100)); // what is after 100 days from today
		System.out.println(today.plusMonths(10));

		// **********************************************
		// we have similar methods for LocalDateTime class also and same for LocalTime
		// class
		// set specific date in some variable using LocalDate
		LocalDate yesterday = LocalDate.of(2023, 8, 23);
		System.out.println(yesterday);
		System.out.println(today.withYear(2020));
		System.out.println(today.withDayOfMonth(16));
		System.out.println(today.withMonth(3));
		System.out.println(today.withDayOfYear(120));

		// we can do comparison with Date, Time classes
		System.out.println(today.isBefore(yesterday));
		System.out.println(today.isAfter(yesterday));
	}
}
