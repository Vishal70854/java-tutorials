package com.javaCodingExercise2;

public class Point {

	// x-coordinate of the point
	private int x;

	// y-coordinate of the point
	private int y;

	// Constructor for the Point class
	public Point(int x, int y) {
		this.x = x; // Assigning x-coordinate of the point
		this.y = y; // Assigning y-coordinate of the point
	}

	// Method to get the x-coordinate of the point
	public int getX() {
		return x;
	}

	// Method to get the y-coordinate of the point
	public int getY() {
		return y;
	}

	// TODO: Implement the method to move the point by dx and dy in x and y
	// direction respectively
	public void move(int dx, int dy) {
		// Your code here
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	// TODO: Implement the method to calculate the distance from this point to
	// another point
	public double distanceTo(Point other) {
		int diffX = other.x - this.x;
		int diffY = other.y - this.y;
		return Math.sqrt(diffX * diffX + diffY * diffY);

		// Your code here
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point(12, 32);
		Point point2 = new Point(21, 18);
		point.move(10, 8);

		System.out.println(point.getX() + " " + point.getY());

		System.out.println(point.distanceTo(point2));

	}

}
