package com.oopsAdvanced;

public class Rectangle {
	// state or member variable
	private int length;
	private int width;

	// constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// information about the object
	@Override
	public String toString() {
		return String.format("length - %d, width - %d, area - %d, perimeter - %d", length, width, calculateArea(),
				calculatePerimiter());
	}

	// getters
	public int getLength() {
		return length;
	}

	// setters
	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// behaviours
	public int calculateArea() {
		return length * width;
	}

	public int calculatePerimiter() {
		return (2 * (length + width));
	}

}
