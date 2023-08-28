package javaCodingExercise5;

public class GetRightmostDigit {

	/**
	 * This method finds the rightmost digit in a given string.
	 *
	 * @param str The string to find the rightmost digit in.
	 * @return The rightmost digit in the string. If no digit is found, return -1.
	 */
	public int getRightmostDigit(String str) {
		int strLen = str.length();
		if (strLen == 0) {
			return -1;
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			char currentCharacter = str.charAt(i);
			if (Character.isDigit(currentCharacter)) {
				return Character.getNumericValue(currentCharacter);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		GetRightmostDigit getRightmostDigit = new GetRightmostDigit();
		System.out.println(getRightmostDigit.getRightmostDigit("this 5 is a 6 out of 8 in a road9"));
	}
}
