package com.tips_and_tricks.access.package2;

import com.tips_and_tricks.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {
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
		ec.publicMethod(); // only public is accessible everywhere
		// ec.protectedMethod(); // cannot access protected outside a package
		// ec.defaultMethod(); // cannot access default outside a package
		// ec.privateMethod(); // can't access private class/method/variable outside
		// that class

	}

}
