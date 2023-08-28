package com.javaCodingExercise2;

public class Square {

	private int side;

	public Square(int side) {
		// TODO: Initialize side with the passed value
		this.side = side;
	}

	public int calculateArea() {
		// TODO: Calculate and return the area of the square
		if (this.side <= 0) {
			return -1;
		}
		return this.side * this.side;

	}

	public int calculatePerimeter() {
		// TODO: Calculate and return the perimeter of the square
		if (this.side <= 0) {
			return -1;
		}
		return 4 * this.side;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square(25);
		System.out.println(square.calculateArea() + " " + square.calculatePerimeter());

	}

}
