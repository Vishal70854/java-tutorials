package com.wrapperClassesExample;

public class WrapperClassesExample {

	public static void main(String[] args) {
		// Integer Wrapper class
		// when we want to represent our primitive data type as object we use wrapper
		// classes
		int i = 5; // primitive data type

		// *********************************************************

		// 2 ways of creating Wrapper class objects

		Integer i1 = new Integer(6); // not used after Java 9
		Integer i2 = new Integer(6);
		System.out.println(i1 == i2); // false as i1 and i2 are stored at different location

		Integer i3 = Integer.valueOf(6);
		Integer i4 = Integer.valueOf(6);
		System.out.println(i3 == i4); // true as it compares value and points to same location

		// note : we can create wrapper class object without creating instance
		// used most commonly for creating wrapper class as it follows Integer.valueOf()
		// pattern
		Integer seven = 7; // autoboxing- convert primitive type to wrapper class object
		System.out.println(seven);

		Integer sevenAgain = 7; // seven and sevenAgain refers to same location as it follows Integer.valueOf(7)
		System.out.println(seven == sevenAgain); // both refers to same location.

		// constants in wrapper class
		System.out.println(Integer.MIN_VALUE); // get minimum value of Integer
		System.out.println(Integer.MAX_VALUE); // get maximum value of Integer
		System.out.println(Integer.SIZE); // get the size of integer in bits
		System.out.println(Integer.BYTES); // get the size of integer in bytes

		// *********************************************************
		// Float wrapper classs
		Float f1 = new Float(5); // int argument
		Float f2 = new Float(5);
		System.out.println(f1 == f2); // f1, f2 points to different location and it is comparing references

		Float f3 = new Float(5.44f); // float argument
		System.out.println(f3);

		Float f4 = new Float(4.5); // double argument
		System.out.println(f4);

		// *********************************************************
		// Character wrapper class
		Character ch1 = new Character('c'); // 'c'
		System.out.println(ch1);

		// Character ch1 = new Character(123); // compiler error

		// *********************************************************
		// Boolean wrapper class
		Boolean b1 = new Boolean(true); // true
		Boolean b2 = new Boolean("True"); // true
		Boolean b3 = new Boolean(false); // false
		Boolean b4 = new Boolean("False"); // false
		Boolean b5 = new Boolean("something else"); // false
		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4 + " " + b5);

	}

}
