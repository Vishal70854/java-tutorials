package com.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPIntermediateOperations {
	public static void main(String[] args) {
		/*
		 * intermediate operations are those which will take a stream of values and
		 * after some calculations it will give out more or less size stream again ex -
		 * filter(), map(), sorted(), distinct() etc
		 */
		// examplesOfIntermediateOperation();

		// Exercise 1 - print squares of first 10 numbers!
		IntStream numbers = IntStream.range(1, 10);
		// printSquareWithFP(numbers);

		// Exercise 2 - map all string values of list to lower case
		List<String> list = List.of("Apple", "Ant", "BAt");
		// sprintLowerCaseWithFP(list);

		// Exercise 3 - print the length of each element in a stream of list
		printLengthOfEachElementWithFP(list);
	}

	// print the length of each element in a stream of list
	public static void printLengthOfEachElementWithFP(List<String> list) {
		list.stream().map(str -> str.length()).forEach(str -> System.out.println("length of each word - " + str));
	}

	// change all of the strings to lowercase using map
	private static void printLowerCaseWithFP(List<String> list) {
		list.stream().map(str -> str.toLowerCase()).forEach(str -> System.out.println("to lower case - " + str));

	}

	// get the square of each number of stream using map
	// here number is already a stream thats why we haven't used stream()
	private static void printSquareWithFP(IntStream numbers) {
		numbers.map(e -> e * e).forEach(e -> System.out.println("square - " + e));

	}

	private static void examplesOfIntermediateOperation() {
		// intermediate operations are those which takes input as stream ans convert it
		// into another stream ex : filter(), forEach(), sorted(), distinct() etc.

		// sort the stream of integers using functional programming
		List<Integer> numbers = List.of(4, 52, 7, 433, 1, 8, 6, 8, 4);
		numbers.stream().sorted().forEach(e -> System.out.println("sorted " + e)); // sort stream of integers

		// find all distinct elements from the list of integers
		numbers.stream().distinct().forEach(e -> System.out.println("distinct " + e)); // find distinct stream of
																						// integers

		// get the square of each number using map() in stream()
		numbers.stream().map(e -> e * e).forEach(e -> System.out.println("square " + e));

		// get the even numbers from the stream
		numbers.stream().filter(e -> (e % 2 == 0)).forEach(e -> System.out.println("even " + e));
	}
}
