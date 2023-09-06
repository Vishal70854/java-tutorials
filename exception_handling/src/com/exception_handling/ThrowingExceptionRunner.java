package com.exception_handling;

class Amount {
	// fields
	private String currency;
	private int amount;

	// constructor
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	// throws is used in the signature of a method to indicate that this method
	// might throw
	// one of the listed type exceptions.
	public void add(Amount that) throws CurrenciesDoNotMatchException { // checked exception
		if (!this.currency.equals(that.currency)) { // currencies dont match. exception
			// throw new Exception("Currencies do not match - " + this.currency + " != " +
			// that.currency);
			// throw keyword is used explicitly to throw an exception from a method or any
			// block
			// of code. throw keyword is mainly used to throw custom exceptions.
			throw new CurrenciesDoNotMatchException(
					"Currencies do not match - " + this.currency + " != " + that.currency); //
			// throw our own custom
			// exception

			// ***********************************************************
			// we can throw custom unchecked exception but for that we dont need to
			// explicitly
			// use throws keyword and dont need to throw in method declaration.
			/*
			 * throw new UncheckedExceptionClass("Currencies do not match - " +
			 * this.currency + " != " + that.currency);
			 */

		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

// throw a custom checked exception by extending Exception class
class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

//throw a custom unchecked exception by extending RuntimeException class
class UncheckedExceptionClass extends RuntimeException {
	public UncheckedExceptionClass(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		// Runtime exception is unchecked exception and we dont need to
		// explicity throw exception for that
		// the class extending only Exception class is checked exception and it has to
		// be explicitly handled by either throws or try-catch. ex -
		// InterruptedException

		// if we are creating unchecked exception then we dont need to explicitly need
		// to mention throws explictly(dont need to handle explicitly)
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20); // changed currency of amount2 ..exception
		amount1.add(amount2); // exception may occur here
		System.out.println(amount1);

	}

}
