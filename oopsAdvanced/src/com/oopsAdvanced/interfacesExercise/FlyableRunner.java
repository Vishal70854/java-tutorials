package com.oopsAdvanced.interfacesExercise;

interface Flyable {
	public void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird fly with wings");

	}

}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Aeroplane fly with fuel");

	}

}

public class FlyableRunner {

	public static void main(String[] args) {

//		Flyable flyingObjects = new Bird();	// type is Flyable and created Bird() constructor since it implements Flyable
//		Flyable flyingObjects1 = new Aeroplane();

		// create an array of Flyable objects
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		// loop and invoke fly method for all objects
		for (Flyable objFlyable : flyingObjects) {
			objFlyable.fly();
		}

	}

}
