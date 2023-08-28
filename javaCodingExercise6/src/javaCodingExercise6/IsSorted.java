package javaCodingExercise6;

public class IsSorted {

	/**
	 * This method checks if the input array is sorted in ascending order.
	 * 
	 * @param array the array to check
	 * @return true if the array is sorted, false otherwise
	 */
	public boolean isSorted(int[] array) {

		if (array.length < 2) {
			return true;
		}

		boolean isSortedArray = true;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				isSortedArray = false;
				break;
			}
		}
		return isSortedArray;
	}

	public static void main(String[] args) {
		IsSorted sorted = new IsSorted();
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(sorted.isSorted(arr));
	}
}