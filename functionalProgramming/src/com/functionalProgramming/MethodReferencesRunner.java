package com.functionalProgramming;

import java.util.List;

public class MethodReferencesRunner {
	public static void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		/*
		 * method references are very useful and make our code more readable we can
		 * provide the className::methodName and that will do the work it can be called
		 * by instance methods as well as class methods if we have a custom method then
		 * use the className::methodName
		 */
		// created stream of String values directly
		System.out.println("get length by normal functional programming");
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(e -> System.out.println(e));

		// method references example
		// forEach(System.out::println)
		// here System.
		System.out.println("get length by method reference in forEach(className::methodName)");
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);

		// method references example
		// here we can give Class::method in each stream method for easiness
		// map(String::length) we are giving String class and perform length method
		System.out.println("get length by method reference in map(className::methodName)");
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);

		// find the max numbers from the list of integers
		// using method references
		// if not even number found then return 0 by orElse(0)
		System.out.println(
				"get max element by method reference in filter(className::methodName) and map(className::methodName)");
		Integer max = List.of(32, 543, 6, 2, 5, 776, 76).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare).orElse(0);
		System.out.println("max element - " + max);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
