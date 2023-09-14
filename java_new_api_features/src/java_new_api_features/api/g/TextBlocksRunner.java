package java_new_api_features.api.g;

public class TextBlocksRunner {

	public static void main(String[] args) {
		// example of Text Blocks is shown below
		// write multiple lines of string using """ and end it using """
		// if we write something under"" then that also will be printed with quotes
		// when starting with """ we should always start our string from the next line
		// otherwise it will give compilation error
		String string = """
				"line1"
					line2
						"line3"
							line4
								"line5"
						line6
				""";

		System.out.print(string);

		// note : always try to maintain the format of the text blocks
		String textBlock = """
				line 1 : %s
				line 2 : %s
				line 3
				line 4
				""".formatted("vishal kumar singh", "a permanenent residence of Bihar");
		System.out.println(textBlock);

	}

}
