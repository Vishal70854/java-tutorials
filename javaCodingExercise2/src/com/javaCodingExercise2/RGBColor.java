package com.javaCodingExercise2;

//RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {

	// The Red, Green, Blue color values range from 0 to 255.
	private int red;
	private int green;
	private int blue;

	// Constructor for RGBColor class which initializes the color with provided red,
	// green and blue values.
	public RGBColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	// Getter method to get the red value of the color.
	public int getRed() {
		return this.red;
	}

	// Getter method to get the green value of the color.
	public int getGreen() {
		return this.green;
	}

	// Getter method to get the blue value of the color.
	public int getBlue() {
		return this.blue;
	}

	// Method to invert the color. The inversion is done by subtracting each color
	// component from 255.
	public void invert() {
		// write your code here
		this.red = 255 - this.red;
		this.green = 255 - this.green;
		this.blue = 255 - this.blue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGBColor color = new RGBColor(22, 34, 54);
		System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue());

		color.invert();

		// get the inverted color value for red, green, blue
		System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue());

	}

}
