package com.oopsAdvanced.interfaces;

// normal interface with a method
interface Interface1 {
	public void draw1();
}

// an interface can extends another interface
interface Interface2 extends Interface1 {
	public void draw2();
}

// abstract class can implements interface and can define some or all of the methods of Interface
abstract class AbstractClass implements Interface2 {
	@Override
	public void draw2() {
		System.out.println("draw2");
	}
}

// now we have to extends abstract class and implement all unimplemented methods
class ImplementInterface extends AbstractClass {

	@Override
	public void draw1() {
		System.out.println("draw1");

	}

}

// we can have default type methods in interface
interface Interface3 {
	default void print() {
		System.out.println("we can have default methods with definition in interface");

	}
}

//simply implementing Interface3 but haven't done any method definition since it does not contain any
class Test implements Interface3 {

}

public interface InterfaceExample {
	public static void main(String[] args) {
		ImplementInterface implementInterface = new ImplementInterface();
		implementInterface.draw1();
		implementInterface.draw2();

		// calling a default method from Interface3
		Test test = new Test();
		test.print();
	}
}
