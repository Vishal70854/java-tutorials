package com.LoopExamples;

public class ForEachLoopExample {

	public static void main(String[] args) {
		/*
		 * For-each is another array traversing technique like for loop, while loop,
		 * do-while loop introduced in Java5.
		 * 
		 * 
		 * It starts with the keyword for like a normal for-loop. Instead of declaring
		 * and initializing a loop counter variable, you declare a variable that is the
		 * same type as the base type of the array, followed by a colon, which is then
		 * followed by the array name. In the loop body, you can use the loop variable
		 * you created rather than using an indexed array element.
		 * 
		 * It’s commonly used to iterate over an array or a Collections class (eg,
		 * ArrayList)
		 */
		/*
		 * Syntax:
		 * 
		 * for (type var : array) { statements using var; }
		 */

		// array declaration

		int ar[] = { 10, 50, 60, 80, 90 };

		for (int element : ar) { // type varName : arrayName
			System.out.print(element + " ");
		}

		// another example to get maximum marks and iterate over array using for-each
		// loop
		int[] marks = { 125, 132, 95, 116, 110 };

		int highest_marks = maximum(marks);
		System.out.println("\nThe highest score is " + highest_marks);
	}

	public static int maximum(int[] numbers) {
		int maxSoFar = numbers[0];

		// for each loop
		for (int num : numbers) { // type varName : arrayName
			if (num > maxSoFar) {
				maxSoFar = num;
			}
		}
		return maxSoFar;
	}

}
