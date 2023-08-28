package javaCodingExercise6;

import java.util.ArrayList;
import java.util.List;

public class DetermineAllFactors {

	/**
	 * This method returns all factors of a given number in an ArrayList.
	 * 
	 * @param number the number to find factors of
	 * @return a List of factors of the number
	 */
	public List<Integer> determineAllFactors(int number) {

		if (number <= 0) {
			return new ArrayList<>();
		}
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static void main(String[] args) {
		DetermineAllFactors factors = new DetermineAllFactors();
		List<Integer> listOfFactors = factors.determineAllFactors(12);
		System.out.println(listOfFactors);
	}
}