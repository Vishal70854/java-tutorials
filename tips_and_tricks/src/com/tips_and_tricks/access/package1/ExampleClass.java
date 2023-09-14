package com.tips_and_tricks.access.package1;

import java.security.PublicKey;

public class ExampleClass {
	public void publicMethod() {}
	protected void protectedMethod() {}
	private void privateMethod() {}
	void defaultMethod() {}

	public static void main(String[] args) {
		ExampleClass ec = new ExampleClass();
		ec.publicMethod();
		ec.protectedMethod();
		ec.defaultMethod();
		ec.privateMethod();
	
	
	}

}
