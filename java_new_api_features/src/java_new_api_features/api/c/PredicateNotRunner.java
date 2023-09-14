package java_new_api_features.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		/*
		 * if we want to use predicate to filter things then it is shown below lets say
		 * we want odd numbers using method reference in functional programming then we
		 * can do it using .negate() as .negate() is only used for List/Set/Map types if
		 * we want to negate using method reference then we have to use
		 * Predicate.not(evenNumberPredicate) under filter()
		 */
		List<Integer> numbers = List.of(1, 2, 3, 4, 65, 7, 8, 9, 56);
		// using Predicate to filter numbers list i.e by functional programming
		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		System.out.print("*****************************************\n");

		// lets say we want only the odd numbers using the above statement
		// we can use .negate() under filter to use it
		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
		System.out.print("*****************************************\n");

		// using Predicate.not() under filter() to get all odd numbers
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
		System.out.print("*****************************************\n");
	}
}
