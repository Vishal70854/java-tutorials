package com.tips_and_tricks.enums;

import java.util.Arrays;

enum Season {
	WINTER, SPRING, SUMMER, FALL;
}

public class EnumRunner {

	public static void main(String[] args) {
		// when we have some static values which will not change and
		// we want to access it directly using ClassName.valueName
		Season season = Season.SPRING;

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);

		// print the name of enum type by getting .name()
		System.out.println(season1.name()); // WINTER

		// print the index of enum types
		System.out.println(season1.ordinal()); // 0 is the index of WINTER
		// we should not use ordinal to set values in enum
		System.out.println(Season.SPRING.ordinal()); // 1 is the index of WINTER

		// get all the enum values using Season.values()
		System.out.println(Arrays.toString(Season.values()));

	}

}
