package com.javaCollections.SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations {
	public static void main(String[] args) {
		// some operations on Tree Set since it gives output in sorted order
		Set<Integer> numberSet = new TreeSet<>(Set.of(32, 56, 43, 98, 65, 12));
		System.out.println(numberSet);// get numberSet in sorted order

	}
}
