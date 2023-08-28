package com.oopsAdvanced;

public class Fan {
	// state
	private String make; // member variable
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 0 to 5

	// constructor
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// behaviour
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// provide information about object to the user
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
	}
}
