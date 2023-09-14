package java_new_api_features.api.f;

public class SwitchExpressionRunner {

	public static String findDayOfWeek(int day) {
		// in switch statements we need fallthrough i.e we need to have break statements
		// after each case otherwise it will execute other cases also
		String dayOfWeek = "";

		switch (day) {
		case 0:
			dayOfWeek = "Sunday";
			break;
		case 1:
			dayOfWeek = "Monday";
			break;
		case 2:
			dayOfWeek = "Tuesday";
			break;
		case 3:
			dayOfWeek = "Wednesday";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		return dayOfWeek;
	}

	// method with switch expression. it is very similar to lambda expression
	public static String findDayOfWeekWithSwitchExpression(int day) {
		// in switch expressions we do not need break as we do not have fallthrough

		String dayOfWeek = switch (day) {
		case 0 -> { // if we want to do some logic in case then do it in {}
			System.out.println("do some complex logic");
			yield "Sunday"; // we can return value via yield here
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		}; // we need to give semicolon so that the code will compile

		return dayOfWeek;
	}

	public static void main(String[] args) {

	}

}
