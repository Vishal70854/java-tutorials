package com.oopsAdvanced.interfacesExercise;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("Bow Bow");

	}

}

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("Meow Meow");

	}

}

public class AnimalRunner {
	public static void main(String[] args) {
		// create a list of Animal type and print bark method
		Animal[] animalType = { new Dog(), new Cat() };

		// print bark method for all animalType
		for (Animal objectAnimal : animalType) {
			objectAnimal.bark();
		}
	}
}
