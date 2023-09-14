package com.tips_and_tricks.nonaccess.package1;

final class FinalClass {

}

//class SomeClass extends FinalClass{ // a class cannot final class
//	
//}

class SomeClass {
	final public void doSomething() {

	}
}

class ExtendingSomeClass extends SomeClass {
//	@Override
//	final public void doSomething() { // we cannot overwrite final method
//
//	}
}

public class FinalNonAccessModifier {

	public static void main(String[] args) {
		// final keyword can be used with class/methods/variables and once
		// a body is declared final then it cannot be changed, nor inherited nor
		// overwrite

		int i = 5;
		i = 7; // changing variable value

		// test with final
		final int j = 10;

		// j = 21; // final variables cannot be changed once declared

	}

}
