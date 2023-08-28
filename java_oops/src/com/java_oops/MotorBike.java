package com.java_oops;

public class MotorBike {

	private int speed;

	// constructor overloading in java
	public MotorBike(int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	// getters
	public int getSpeed() {
		return this.speed;
	}

	// setters
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int newSpeed) {
		setSpeed(this.speed + newSpeed);
	}

	public void decreaseSpeed(int newSpeed) {
		setSpeed(this.speed - newSpeed);
	}

	public void run() {
		System.out.println("running a bike");
	}

	public void changeGears() {
		System.out.println("Gears changed");
	}

}
