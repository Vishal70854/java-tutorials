package com.functionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 7, 34, 2, 9, 1);
		List<String> list = List.of("apple", "bat", "cat", "rat", "dog");

		// calling method which do filter in a stream in functional programming
		// printWithFPWithFiltering(list);

		// get only odd values from numbers list using FunctionalProgramming(FP)
		// printOddWithFP(numbers);

		// get only even values from numbers list using FunctionalProgramming(FP)
		// printEvenWithFP(numbers);

		// int sum = normalSum(numbers);
		// System.out.println("sum with normal iteration - " + sum);

		// get the sum by functional programming using reduce() method in stream()
		// int sum = printSumWithFP(numbers);
		// System.out.println("sum using functional programming - " + sum);

		// get the sum of odd no's by functional programming using reduce() method in
		// stream()
		int sum1 = printSumOddWithFP(numbers);
		System.out.println("sum odd using functional programming - " + sum1);

		// get the sum of odd no's by functional programming using reduce() method in
		// stream()
		int sum2 = printSumEvenWithFP(numbers);
		System.out.println("sum even using functional programming - " + sum2);
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

	// getting sum of list values using normal iteration of loop
	public static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer num : numbers) {
			sum += num;
		}
		return sum;
	}

	// get the sum using functional programming i.e using reduce() in stream()
	public static int printSumWithFP(List<Integer> numbers) {
		// here 0 is the starting point and for each number1 and number 2 do the sum of
		// both
		// and place in place of 0. finally the sum of whole list is returned.
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	// get the sum using functional programming i.e using reduce() in stream()
	public static int printSumOddWithFP(List<Integer> numbers) {
		return numbers.stream().filter(num -> (num % 2 == 1)).reduce(0, (number1, number2) -> number1 + number2);
	}

	// get the sum using functional programming i.e using reduce() in stream()
	public static int printSumEvenWithFP(List<Integer> numbers) {
		return numbers.stream().filter(num -> (num % 2 == 0)).reduce(0, (number1, number2) -> number1 + number2);

	}

}
