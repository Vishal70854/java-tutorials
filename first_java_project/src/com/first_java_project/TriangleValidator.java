package com.first_java_project;

public class TriangleValidator {
	public static boolean isRightAngled(int side1, int side2, int side3) {
		// write your code
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}

		if ((side1 * side1 + side2 * side2 == side3 * side3) || (side2 * side2 + side3 * side3 == side1 * side1)
				|| (side1 * side1 + side3 * side3 == side2 * side2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean angle = isRightAngled(3, 4, 5);
		if (angle) {
			System.out.println("Valid Right angled triangle");
		} else {
			System.out.println("Invalid right angled triangle");
		}
	}

}
