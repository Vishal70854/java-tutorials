package javaCodingExercise6;

public class AreSumsEqual {

	private int[] array1;
	private int[] array2;

	public AreSumsEqual(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		return sum1 == sum2;
	}

	private int calculateSum(int[] array) {

		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		return sum;

	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		AreSumsEqual equal = new AreSumsEqual(arr1, arr2);
		System.out.println(equal.areSumsEqual());
	}
}