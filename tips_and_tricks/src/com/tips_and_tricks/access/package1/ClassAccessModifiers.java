package com.tips_and_tricks.access.package1;

import com.tips_and_tricks.access.package2.ClassAccessModifiersInAnotherPackage;

//public, protected, (default), private
public class ClassAccessModifiers {
	public static void main(String[] args) {

		// public access modifier can be used anywhere
		// default is also same as above
		// private class/method/variable cannot be used outside of that class
		// protected can be used anywhere in the same package

		// example we are creating object of another class from another package
		// since it is public thats why we can access it
		ClassAccessModifiersInAnotherPackage c1 = new ClassAccessModifiersInAnotherPackage();

	}

}
