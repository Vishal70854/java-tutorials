package com.tips_and_tricks.access.package1;

public class MethodAccessRunnerInsideSamePackage {
	public void publicMethod() {
	}

	protected void protectedMethod() {
	}

	private void privateMethod() {
	}

	void defaultMethod() {
	}

	public static void main(String[] args) {
		ExampleClass ec = new ExampleClass();
		ec.publicMethod();
		ec.protectedMethod();
		ec.defaultMethod();
		// ec.privateMethod(); // can't access private class/method/variable outside
		// that class

	}

}
