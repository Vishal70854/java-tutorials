package javaCodingExercise6;

import java.util.Arrays;

public class ReverseArray {

	/**
	 * This method reverses an array.
	 * 
	 * @param array the array to reverse
	 * @return a new array with elements in reverse order
	 */
	public int[] reverseArray(int[] array) {

		if (array.length < 2) {
			return array;
		}
		int start = 0;
		int end = array.length - 1;

		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}

	public static void main(String[] args) {
		ReverseArray rev = new ReverseArray();
		int[] arr = { 2, 3, 4, 5, 7, 8 };
		int[] revArray = rev.reverseArray(arr);
		System.out.println(Arrays.toString(revArray));
	}
}