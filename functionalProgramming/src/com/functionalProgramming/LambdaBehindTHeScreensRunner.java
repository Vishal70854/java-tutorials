package com.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// behind the scenes for filter method in stream
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;

	}

}

//behind the scenes for forEach() method in stream
class ForEachConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);

	}

}

// implementing map function stream
class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {

		return number * number;
	}

}

public class LambdaBehindTHeScreensRunner {

	public static void main(String[] args) {
		List.of(23, 54, 68, 21).stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(e -> System.out.println(e));

		// filter(new EvenNumberPredicate())
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);

		// by implementing the EvenNumberPredicate we are filtering a stream of integers
		List.of(23, 54, 68, 21).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));

		// forEach(new ForEachConsumer()
		// void forEach(Consumer<? super T> action);
		// void accept(T t);
		// by implementing the ForEachConsumer we are filtering a stream of integers
		List.of(23, 54, 68, 21).stream().filter(new EvenNumberPredicate()).forEach(new ForEachConsumer());

		// map function behind the screens i.e overriding methods which work in
		// background
		// .map(n -> n * n)
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
		List.of(23, 54, 68, 21).stream().map(new NumberSquareMapper()).filter(new EvenNumberPredicate())
				.forEach(new ForEachConsumer());
	}

}
