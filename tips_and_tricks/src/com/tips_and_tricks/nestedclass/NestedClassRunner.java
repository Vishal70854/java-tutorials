package com.tips_and_tricks.nestedclass;

class Person { // default class

}

public class NestedClassRunner {
	private int i;

	class InnerClass { // normal inner class
		public void method() {
			i = 5; // accessible since innerclass is accessed via object of Outerclass
		}
	}

	static class StaticNestedClass { // static inner class

	}

	public static void main(String[] args) {
		// InnerClass innerClass = new InnerClass(); // error

		// static nested class can be accessed directly in main since its static
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		// if we want normal inner class to access then we have to create object of
		// NestedClassRunner and from there we will be able to access it

		// inner class instance cannot be created without Outer class object
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}
}
