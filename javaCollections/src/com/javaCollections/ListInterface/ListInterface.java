package com.javaCollections.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// List.of() is a static method in List Interface which will create a list of
		// List.of is immutable i.e once created cannot be changed
		// specified type
		// this is one way to create list of
		// String/Integer/Float/Long/Double/Character/Byte/Boolean
		List<String> words = List.of("Apple", "Banana", "Mango");
		System.out.println(words);

		// get the length of arraylist using size() method
		System.out.println(words.size()); // 3

		// check if list is empty by isEmpty()
		System.out.println(words.isEmpty()); // false

		// access an element in list using get(index)
		System.out.println(words.get(0)); // Apple

		// check if an element exists in arraylist using contains(element)
		System.out.println(words.contains("pineapple")); // false

		// find out locations of specific element in arrayList using indexOf(element)
		System.out.println(words.indexOf("Mango")); // 2

		// we cannot make changes in List created by List.of()

		// *******************************************************

		// create new ArrayList
		List<String> wordsArrayList = new ArrayList<String>(words);// arraylist of words
		System.out.println(wordsArrayList);

		// create new ArrayList
		List<String> wordsLinkedList = new LinkedList<String>(words);// linkedlist of words
		System.out.println(wordsLinkedList);

		// create new ArrayList
		List<String> wordsVector = new Vector<String>(words);// vector of words
		System.out.println(wordsVector);

		// some operations on arrayList
		wordsArrayList.add("monkey"); // add element at end of ArrayList
		wordsArrayList.add(2, "giraffe"); // add element at specific index

		System.out.println("updated ArrayList - " + wordsArrayList);

		// add another ArrayList in an ArrayList by using add(element)
		List<String> newList = List.of("Yak", "Zebra");// immutable arraylist
		wordsArrayList.addAll(newList);

		System.out.println("new ArrayList by adding newList - " + wordsArrayList);

		// update some items by using set(index, element)
		wordsArrayList.set(4, "fish");
		System.out.println("arraylist after updating - " + wordsArrayList);

		// delete element from arraylist by using remove(element) or remove(index)
		wordsArrayList.remove("giraffe"); // remove giraffe from arraylist
		wordsArrayList.remove(1); // remove element at index 1
		System.out.println("arraylist after removing elements - " + wordsArrayList);

		// *******************************************************
		// linked list operations

		// System.out.println(wordsLinkedList.contains("pineapple")); // false

		// add elements in linked list by using add(element)
		wordsLinkedList.add("cat");
		System.out.println("added in LinkedList - " + wordsLinkedList);

		// update element in linked list by using set(index, element)
		wordsLinkedList.set(1, "linkedin");
		System.out.println("updated item in linked list - " + wordsLinkedList);

		// remove item from linkedlist by using remove(element) or remove(index)
		wordsLinkedList.remove(2); // remove 2nd element from linked list
		System.out.println("remove item from linked list - " + wordsLinkedList);

		// *******************************************************
		// vector operations

		/// add elements in vector by using add(element)
		wordsVector.add("rat");
		System.out.println("added in vector - " + wordsVector);

		// update element in vector by using set(index, element)
		wordsVector.set(3, "naukri");
		System.out.println("updated item in vector - " + wordsVector);

		// remove item from vector by using remove(element) or remove(index)
		wordsVector.remove(0); // remove 2nd element from linked list
		System.out.println("remove item from vector - " + wordsVector);

		// *********************************************************
		// create list1, list2, list3 , mergelist and merge all 3 lists in mergelist
		List<String> list1 = List.of("hello", "hi");
		List<String> list2 = List.of("bad", "boy", "lolo");
		List<String> list3 = List.of("mamma", "papa", "bow meow shuu wooof");

		List<String> mergeList = new ArrayList<String>();
		mergeList.addAll(list1);
		mergeList.addAll(list2);
		mergeList.addAll(list3);
		System.out.println(mergeList);

		// *********************************************
		// iterate over the arraylist

		List<String> wordsList = List.of("Apple", "Bat", "rat"); // immutable List<String>
		// normally iterate over arraylist by simple loop
//		for (int i = 0; i < wordsList.size(); i++) {
//			System.out.println(wordsList.get(i));
//		}

		// using enhanced for loop for iterating over the list
//		for (String word : wordsList) {
//			System.out.println(word);
//		}

		// we can use iterator to iterate over array list elements
//		Iterator<String> wordsIterator = wordsList.iterator();
//		while (wordsIterator.hasNext()) {
//			System.out.println(wordsIterator.next());
//		}

		// delete elements of Arraylist or collections using iterator
		// through iterator we can delete elements easily using remove() as it is not
		// possible through loops
		List<String> wordsAI = new ArrayList<>(wordsList);// created a mutable List<String> with same elements as
															// wordsList
		Iterator<String> iterator = wordsAI.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println("wordsAI after deleting element using iterator - " + wordsAI);
		// **************************************************

		// create a list of Integers and iterate over it
		List<Integer> integerList = List.of(2, 34, 64, 7); // create immutable list
//		for (int i = 0; i < integerList.size(); i++) {
//			System.out.println(integerList.get(i));// print each element of arraylist
//		}

		// iterate using the enhanced for-loop
//		for (Integer element : integerList) {
//			System.out.println(element);
//		}

		// iterate using the iterator
		Iterator<Integer> intIterator = integerList.iterator();
		while (intIterator.hasNext()) {
			System.out.println(intIterator.next());
		}

		// ************************************************************
		// some more additional info about List/ArrayList
		List values = List.of("a", 'b', 1, 2.3); // accepts each type as one type of wrapper class is not mentioned
		System.out.println("accepts all values as one wrapper class type is not mentioned for list - " + values);

		List<Integer> numbers = List.of(101, 102, 103, 104, 105); // immutable list
		List<Integer> numberAL = new ArrayList<>(numbers);
		System.out.println(numberAL.indexOf(101)); // gives the index 0
		// sSystem.out.println(numberAL.remove(101)); // out of bound error as
		// remove(element) or remove(index)
		// so to remove an element from collection classes we need to convert it into
		// wrapper classes
		System.out.println(numberAL.remove(Integer.valueOf(101)));
		System.out.println("removed 101 from numberAL - " + numberAL);

		// ********************************************************
		// sorting in ArrayList using Collections package and static sort() method
		List<Integer> newNumbers = new ArrayList<Integer>();
		newNumbers.add(6);
		newNumbers.add(9);
		newNumbers.add(5);
		newNumbers.add(4);
		newNumbers.add(2);
		System.out.println("before sorting - " + newNumbers);
		// sort list using collections
		Collections.sort(newNumbers);
		System.out.println("after sorting - " + newNumbers);
	}

}
