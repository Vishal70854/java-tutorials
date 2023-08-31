package com.javaCodingExercise7;

public class ShapeRunner {

	public static void main(String[] args) {
		// Circle object
		Circle circle = new Circle("Vishal", 5);
		System.out.println("circle area - " + circle.calculateArea());

		// rectangle object
		Rectangle rectangle = new Rectangle("rahul", 6, 8);
		System.out.println("rectangle area - " + rectangle.calculateArea());

	}

}
