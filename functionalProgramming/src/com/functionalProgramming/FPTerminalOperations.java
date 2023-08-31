package com.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPTerminalOperations {

	public static void main(String[] args) {
		/*
		 * terminal operations means we will have a stream and after some calculations
		 * we will get only 1 element or 1 value as output ex : reduce(), max(), min()
		 */

		// get the sum of 1 to 10 in a stream
		// reduce(start, (num1, num2) -> num1+num2) it will get the sum of num1+num2 and
		// place
		// it 0's place and again do it for entire list till only 1 value is not
		// returned
		IntStream stream1 = IntStream.range(1, 11);
		System.out.println(stream1.reduce(0, (n1, n2) -> n1 + n2));

		// get the maximum value in a stream
		List<Integer> list1 = List.of(23, 54, 75, 12, 46, 98, 56);
		// here .max() will take n1, n2 ans parameter and then find the max element
		// .get() will give the maximum element as output
		Integer maxInteger = list1.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(maxInteger);

		// get the minimum value in a stream
		List<Integer> list2 = List.of(23, 54, 75, 12, 46, 98, 56);
		Integer minInteger = list1.stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(minInteger);

		// get the list of odd numbers.
		// we need to print the list not the elements by forEach()
		// it can be done by .collect(Collectors.toList())
		List<Integer> filteredList1 = list2.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
		System.out.println(filteredList1);

		// get the list of even numbers.
		// we need to print the list not the elements by forEach()
		// it can be done by .collect(Collectors.toList())
		List<Integer> filteredList2 = list2.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredList2);

		// create a list of stream of squares of numbers from 1 to 10
		// get the numbers from 1 to 10 in a stream
		// boxed() is used to convert intstream pipeline to stream()
		IntStream stream2 = IntStream.range(1, 11);
		List<Integer> squareList = stream2.map(e -> e * e).boxed().collect(Collectors.toList());
		System.out.println("square of each number - " + squareList);

	}

}
