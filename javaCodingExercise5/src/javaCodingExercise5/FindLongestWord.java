package javaCodingExercise5;

public class FindLongestWord {

	/**
	 * This method finds the longest word in a given sentence.
	 *
	 * @param sentence The sentence to find the longest word in.
	 * @return The longest word in the sentence. If sentence is empty, return an
	 *         empty string.
	 */
	public String findLongestWord(String sentence) {

		if (sentence == null || sentence.equals("")) {
			return "";
		}

		String[] words = sentence.split(" "); // split by space
		int maxLength = 0;
		String longestWord = "";

		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}
		return longestWord;

	}

	public static void main(String[] args) {
		FindLongestWord findLongestWord = new FindLongestWord();
		System.out.println(findLongestWord.findLongestWord("THis is a pond of lakes of the village inn austria"));
	}
}
