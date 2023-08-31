package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	// generic method
	// returning the type by which it was called
	// here <X> means it's a generic method of type X
	static <X> X doubleValue(X value) {

		return value;
	}

	// generic method to a specified type only by extending the specific class
	// here we have extended List from X and X is the type which user give i.e
	// generic type
	static <X extends List> void duplicate(X list) {

		list.addAll(list);
	}

	// wildcard upper bound method( ? is called wildcard here)
	// this wildcard is called upperBounded wildcards as it extends other class type
	// extends means only one type of value which if Number type can be in the list
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue(); // get double type value from Number type value
		}
		return sum;
	}

	// this wildcard is called lowerBounded wildcard as it can store any Number
	// values in numbers
	// here the provided type is the superclass of Number thats why we use super
	// keyword
	// super means we can have any Number type values in the numbers list as Number
	// is subtype here
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1); // add int type
		numbers.add(1.0); // add double type
		numbers.add(4l);// add long type value
		numbers.add(4.5f); // add float type

	}

	public static void main(String[] args) {
		// calling upperBound wildcard method
		System.out.println("passing integer values - " + sumOfNumberList(List.of(1, 2, 3, 4, 5))); // integer values
		System.out.println("passing double values - " + sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1))); // double //
																											// values
		System.out.println("passing long values - " + sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l))); // long values

		// calling lowerBound wildcard method
		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList); // can add any Number type value in the list
		System.out.println("print for lowerBound wildcard - " + emptyList);

		// calling generic method
		String value = doubleValue(new String()); // passing to generic method
		Integer number = doubleValue(Integer.valueOf(7));// passing to generic method
		ArrayList list1 = doubleValue(new ArrayList());// passing to generic method

		// calling generic method of specific type
		ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
		duplicate(list2); // calling the generic method of type Integer i.e specific type generic method
		System.out.println(list2);

		// here we provided what type of data we are expecting for myList i.e String
		MyCustomList<String> myList = new MyCustomList<>();
		myList.addElement("Element 1");
		myList.addElement("Element 2");

		// get the element at specific index using get(index)
		String element = myList.get(0);
		System.out.println(element);

		System.out.println("String type elements passed - " + myList);
		// here addElement(String ele) is expecting String element but we have given
		// Integer
		// here we will need generics where we can provide any data type without error

		// here we provided what type of data we are expecting for myList i.e Integer
		MyCustomList<Integer> myList2 = new MyCustomList<>();
		myList2.addElement(Integer.valueOf(5));
		myList2.addElement(Integer.valueOf(8));

		// get the element at specific index using get(index)
		Integer element2 = myList2.get(0);
		System.out.println(element2);
		System.out.println("Integer type elements passed - " + myList2);

	}

}
