package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		/*
		 * A stream is not a data structure instead it takes input from the Collections,
		 * Arrays or I/O channels.
		 */
		List<String> list = List.of("apple", "bat", "cat", "dog");
		// printWithFP(list);
		List<Integer> numbers = List.of(2, 3, 5, 1, 4, 8, 13);
		// printNumbersWithFP(numbers);

		// calling method which do filter in a stream in functional programming
		// printWithFPWithFiltering(list);

		// get only odd values from numbers list using FunctionalProgramming(FP)
		// printOddWithFP(numbers);

		// get only even values from numbers list using FunctionalProgramming(FP)
		printEvenWithFP(numbers);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	/********** functional programming example using stream from here **********/
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	// print each number in a list using functional programming
	public static void printNumbersWithFP(List<Integer> numbers) {
		// print each number using stream in functional programming
		numbers.stream().forEach(num -> System.out.println("num - " + num));
	}

	// using filter() in functional programming
	public static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element after filtering - " + element));
	}

	// filter out odd number from list of numbers in a stream
	public static void printOddWithFP(List<Integer> numbers) {
		numbers.stream().filter(num -> (num % 2 != 0)).forEach(num -> System.out.println("odd element - " + num));
	}

	// filter out even number from list of numbers in a stream
	public static void printEvenWithFP(List<Integer> numbers) {
		numbers.stream().filter(num -> (num % 2 == 0)).forEach(num -> System.out.println("even element - " + num));
	}
}