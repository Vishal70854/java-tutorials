package javaCodingExercise6;

public class FindSecondLargestElement {

	/**
	 * This method finds and returns the second largest element in the given array.
	 * 
	 * @param array the array in which to find the second largest element
	 * @return the second largest element in the array
	 */

	public int findSecondLargestElement(int[] array) {
		// TODO: Write your code here
		int len = array.length;
		if (len < 2) {
			return -1;
		}
		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;

		for (int element : array) {
			if (element > largestElement) {
				secondLargestElement = largestElement;
				largestElement = element;
			} else if (element > secondLargestElement && element != largestElement) {
				secondLargestElement = element;
			}
		}
		if (secondLargestElement == Integer.MIN_VALUE) {
			return -1;
		}
		return secondLargestElement;

	}

	public static void main(String[] args) {
		FindSecondLargestElement grElement = new FindSecondLargestElement();
		int[] arr = { 5, 4, 6, 6, 2, 9 };
		System.out.println(grElement.findSecondLargestElement(arr));
	}
}