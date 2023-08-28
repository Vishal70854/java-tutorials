package com.first_java_project;

public class isValidTriangle {
	public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
		// write your code here
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}
		int degree = angle1 + angle2 + angle3;

		return degree == 180;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean degree = isValidTriangle(10, 80, 90);
		if (degree) {
			System.out.println("Valid Triangle");
		} else {
			System.out.println("Invalid Triangle");
		}
	}
}