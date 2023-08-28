package com.arrayExampleWithObjects;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// create ArrayList<Integer>
		// syntax :
		// ArrayList<WrapperClass Type> arrayListName = new ArrayList<WrapperClass
		// type>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// add element in arrayList using .add(element)
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(99);

		System.out.println("elements of arrayList are - " + arrayList);

		// remove elements from arrayList using .remove(index)
		arrayList.remove(1);
		System.out.println("elements of arrayList after removing - " + arrayList);

		// access an item using get(index number of array)
		System.out.println(arrayList.get(1));

		// check the size of arraylist using .size() method
		System.out.println("size of array - " + arrayList.size());

		// ArrayList class implements the List interface
		List<Integer> factors = new ArrayList<>();
		factors.add(1);
		factors.add(3);
		System.out.println("printing factors List - " + factors);
		// **********************************
		// ArrayList of String object example
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango"); // add elements in Arraylist
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("grapes");

		System.out.println(fruits);

		// remove an element from arraylist using its index
		fruits.remove(1);
		System.out.println(fruits);

		// get the size of fruits arraylist
		System.out.println(fruits.size());

	}
}
