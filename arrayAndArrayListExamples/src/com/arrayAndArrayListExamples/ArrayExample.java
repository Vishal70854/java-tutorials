package com.arrayAndArrayListExamples;

import java.util.Arrays;

class Person {

}

public class ArrayExample {

	public static void main(String[] args) {
		// declaration of array
		int[] arr = {}; // declared an array named arr with no element

		int[] arr1 = { 1 }; // array with 1 element
		int[] arr2 = { 1, 2 }; // array with 2 element

		int[] marks = { 1, 2, 3 }; // declared an array marks with 3 elements
		int sum = 0;
		for (int mark : marks) { // get the sum of elements of the array
			sum += mark;
		}
		System.out.println(sum);

		// another way of declaring array with new keyword
		// Type[] arrayName = new Type[sizeOfArray];
		int[] arr3 = new int[5]; // array of size 5 with all values initialized as 0 by default
		arr3[0] = 20;
		arr3[1] = 40;
		arr3[2] = 90;
		arr3[3] = 50;
		arr3[4] = 150;
		System.out.println(arr3[2]); // accessing an item using its index in an array
		// System.out.println(arr3); // prints the address of arr3

		// get the length of the array using length property. note here length is not a
		// method
		System.out.println(arr3.length);

		// create an array marks with length 8 and loop around the array and find the
		// max element
		int[] marks1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int max = 0;
		for (int i = 0; i < marks1.length; i++) {
			if (marks1[i] > max) {
				max = marks1[i];
			}
		}
		System.out.println(max);

		// ************************************************
		// some more examples on array declaration of int, double, boolean, objects
		// int array example
		int[] marks2 = new int[5]; // array of size 5 with default values as 0 for each item
		System.out.println(marks2[1]);
		// double array example
		double[] d1 = new double[5];// array of size 5 with default values as 0.0 for each item
		System.out.println(d1[2]);
		// boolean array example
		boolean[] b1 = new boolean[5]; // default initialization for each element is false
		System.out.println(b1[3]);

		// array of objects
		// in line 2 we created Person class for understanding purpose
		Person[] person = new Person[5]; // default initialization is null as it does not refer to any object currently
		System.out.println(person[4]);

		// if we want to print the entire array
		// it can be done by Arrays.toString(arrayName)
		int[] myMarks = { 100, 99, 92, 94, 90 };
		System.out.println(Arrays.toString(myMarks)); // prints entire array as a string

		// fill arrays with a default value
		int[] a = new int[5]; // 5 length array with default value as 0
		Arrays.fill(a, 100); // now all elements will have default value of 100
		System.out.println(a[3]);

		// compare if 2 arrays are equal using Arrays.equals(arr1, arr2) method
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 1, 2, 3 };
		System.out.println(Arrays.equals(a1, a2)); // true

		int[] a3 = { 1, 3, 2 };
		System.out.println(Arrays.equals(a1, a3)); // false

		// sort array in java using Arrays.sort(arrayName)
		Arrays.sort(a3);
		for (int num : a3) {
			System.out.print(num + " ");
		}

	}

}
