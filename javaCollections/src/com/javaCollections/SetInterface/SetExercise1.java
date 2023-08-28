package com.javaCollections.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise1 {

	public static void main(String[] args) {
		// exercise is we have a List<Character> and we need to print the unique set of
		// characters
		// condition is to give it in order and other in sorted order

		List<Character> characters = List.of('C', 'W', 'A', 'T', 'D', 'A', 'S', 'C'); // IMMUTABLE LIST

		// LinkedHashSet of characters List
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters); // here order is maintained and unique
		System.out.println("linked hash set where order is maintained - " + linkedHashSet);

		// TreeSet of characters List
		Set<Character> treeSet = new TreeSet<>(characters); // here we will get sorted set of unique characters
		System.out.println("tree hash set where we will get sorted characters - " + treeSet);

		// if we dont care about order and sorted manner then we can use HashSet
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("tree hash set where we will get sorted characters - " + hashSet);

	}

}
