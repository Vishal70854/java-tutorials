package com.java_oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorBike ducati = new MotorBike(5); // create object of MotorBike
		MotorBike honda = new MotorBike(55);// create object of MotorBike
		System.out.println(honda.getSpeed());
		ducati.changeGears();

		// set the speed using setters
		ducati.setSpeed(10);
		// System.out.println(ducati.getSpeed());

		honda.setSpeed(15);
		// System.out.println(honda.getSpeed());

		// increase instance speed of MotorBike
		ducati.increaseSpeed(100);
		honda.increaseSpeed(50);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		// decrease instance speed of MotorBike
		ducati.decreaseSpeed(800);
		honda.decreaseSpeed(40);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
