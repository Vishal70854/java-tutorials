package com.oopsAdvanced.interfaces;

public class Project {

	public static void main(String[] args) {
		// ComplexAlgorithm algorithm = new RealAlgorithm();
		// System.out.println(algorithm.complexAlgorithm(10, 20));//30

		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20)); // 200

		/*
		 * abstract class can extends another abstract class and the concrete class
		 * should implement all abstract methods inside it an interface can extend
		 * another interface using extends. (it cannot use implements) note - we can
		 * implements interface using abstract class and we can override some of the
		 * abstract methods or all methods(depends on us) if some concrete class
		 * implements interface then it should implement all abstract methods in
		 * interface we can create only constants in the form of variables. i.e all
		 * variables are static and final in interface we can have default method which
		 * can be implemented.
		 */

	}

}
