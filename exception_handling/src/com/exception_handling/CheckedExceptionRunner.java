package com.exception_handling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		/*
		 * throws is a keyword in Java that is used in the signature of a method to
		 * indicate that this method might throw one of the listed type exceptions. The
		 * caller to these methods has to handle the exception using a try-catch block
		 * or by using throws keyword.
		 * 
		 * unchecked exception don't need to be handled explicitly..
		 * 
		 * only checked exceptions ex - InterruptedException needs to be handled
		 * explicitly
		 */

		/*
		 * note - the order of catch block should be from top to down i.e subclasses to
		 * Class ex - InterruptedException -> Exception (sequence of catch block)
		 */

//		try {	// handling checked exception
//			someOtherMethod();
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		someOtherMethod2();

	}

	// we do not need to handle unchecked exception ex RuntimeException
	private static void someOtherMethod2() throws RuntimeException {

	}

	// we have to handle checked exception ex InterruptedException using either
	// throws keyword or try-catch block
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);

	}

}
