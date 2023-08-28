package com.arrayExampleWithObjects;

import java.util.Arrays;

public class VariableArgument {

	// print the array with variable arguments
	public static void print(int... values) {
		// int... represents variable argument arguments, values acts like an array of
		// multiple arguments
		// print values array using Arrays.toString(values);
		System.out.println(Arrays.toString(values));
	}

	// return the sum of array with variable number of arguments
	public static int sum(int... values) {
		// int... represents variable argument arguments, values acts like an array of
		// multiple arguments
		// print values array using Arrays.toString(values);
		int sumOfArray = 0;
		for (int value : values) { // type varName : arrayName
			sumOfArray += value;
		}
		return sumOfArray;
	}

	public static void main(String[] args) {
		// note : variable argument should be the last argument in function call
		// variable argument example
		// we can pass arguments as comma separated values and in the function it will
		// be converted into an array with the amount of inputs mentioned
		print(1, 2); // arguments can be many and all will be stored in the array
		print(1, 3, 5, 36); // multiple arguments

		System.out.println("sum of array : " + sum(3, 45, 2, 7));
		System.out.println("sum of array : " + sum(9, 5, 22, 3));
	}

}
