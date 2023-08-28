package com.javaCollections.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
	public static void main(String[] args) {
		// Hashset operations

		// create immutable set by Set.of(elements)
		Set<String> set = Set.of("apple", "cat", "banana");
//		set.add("apple"); // cannot allow since it immutable
//		System.out.println(set);

		Set<String> set2 = new HashSet<>(set); // contains unique element
		set2.add("apple"); // add unique elements in a set
		System.out.println(set2); // unordered

		// do some operations on hashset
		Set<Integer> numbers = new HashSet<>();
		numbers.add(46396);
		numbers.add(4639);
		numbers.add(463);
		numbers.add(46);
		numbers.add(4);
		System.out.println("hashset is unordered - " + numbers); // unordered

		// if we want to maintain the order in the HashSet then use LinkedHashSet
		Set<Integer> number2 = new LinkedHashSet<>();
		number2.add(46396);
		number2.add(4639);
		number2.add(463);
		number2.add(46);
		number2.add(4);
		System.out.println("linked hash set order is maintained - " + number2);

		// if we want the set in sorted order then use TreeSet
		Set<Integer> number3 = new TreeSet<>();
		number3.add(46396);
		number3.add(4639);
		number3.add(463);
		number3.add(46);
		number3.add(4);
		System.out.println("tree hash set order is maintained - " + number3);
	}
}
