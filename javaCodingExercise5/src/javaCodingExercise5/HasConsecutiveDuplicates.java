package javaCodingExercise5;

public class HasConsecutiveDuplicates {

	/**
	 * This method checks if a given string has two consecutive identical
	 * characters.
	 *
	 * @param str The string to check for consecutive duplicates.
	 * @return true if the string has consecutive duplicates, false otherwise.
	 */
	public boolean hasConsecutiveDuplicates(String str) {

		if (str == null) {
			return false;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		HasConsecutiveDuplicates consecutive = new HasConsecutiveDuplicates();
		System.out.println(consecutive.hasConsecutiveDuplicates("abcdeefg"));
	}
}
