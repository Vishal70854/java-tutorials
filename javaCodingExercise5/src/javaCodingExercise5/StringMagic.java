package javaCodingExercise5;

public class StringMagic {

	/**
	 * This method counts the number of uppercase letters in a given string.
	 *
	 * @param str The string to count uppercase letters in.
	 * @return The number of uppercase letters in the string.
	 */
	public int countUppercaseLetters(String str) {
		if (str == null) {
			return -1;
		}
		int countOfUpperCaseLetters = 0;

		for (int i = 0; i < str.length(); i++) {
			char val = str.charAt(i);
			if (Character.isUpperCase(val)) {
				countOfUpperCaseLetters++;
			}
			// if (val >= 65 && val <= 90){ // another solution running
			// countOfUpperCaseLetters ++;
			// }
		}
		return countOfUpperCaseLetters;
	}

	public static void main(String[] args) {
		StringMagic stringMagic = new StringMagic();
		System.out.println(stringMagic.countUppercaseLetters("This Is THe SHoW"));
	}
}
