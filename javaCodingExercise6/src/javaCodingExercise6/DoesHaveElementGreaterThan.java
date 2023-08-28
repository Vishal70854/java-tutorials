package javaCodingExercise6;

public class DoesHaveElementGreaterThan {

	/**
	 * This method determines whether there's an element greater than a given number
	 * in an array.
	 *
	 * @param array  The array to search through.
	 * @param number The number to compare with the array elements.
	 * @return True if there's an element greater than the given number in the
	 *         array, false otherwise.
	 */
	public boolean doesHaveElementGreaterThan(int[] array, int number) {

		for (int val : array) {
			if (val > number) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		DoesHaveElementGreaterThan greater = new DoesHaveElementGreaterThan();
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.println(greater.doesHaveElementGreaterThan(arr, 4));
	}
}