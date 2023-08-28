package javaCodingExercise6;

import java.util.ArrayList;
import java.util.List;

public class DetermineMultiples {
	/**
	 * This method generates a list of multiples of a given number less than a
	 * specified limit.
	 * 
	 * @param number the number to find multiples of
	 * @param limit  the upper bound for the multiples
	 * @return a List of multiples of the number less than the limit
	 */
	public List<Integer> determineMultiples(int number, int limit) {

		List<Integer> multiplesOfANumber = new ArrayList<Integer>();
		if (number <= 0 || limit <= 0) {
			return multiplesOfANumber;
		}

		for (int i = number; i < limit; i += number) {
			multiplesOfANumber.add(i);
		}
		return multiplesOfANumber;
	}

	public static void main(String[] args) {
		DetermineMultiples multiples = new DetermineMultiples();
		List<Integer> listOfMultiples = multiples.determineMultiples(3, 20);
		System.out.println(listOfMultiples);
	}
}