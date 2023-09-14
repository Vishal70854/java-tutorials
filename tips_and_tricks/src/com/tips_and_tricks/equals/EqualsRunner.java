package com.tips_and_tricks.equals;

import java.util.Objects;

class Client {
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	// whenever we implement equals() we should also implement hashcode() method
	// hashcode () should distribute the objects evenly among the buckets
	// if two objects are equal then their hashcode should be equal
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object that) { // comparing two objects
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Client other = (Client) that;
		return id == other.id;
	}

	// equals method for class to compare object and their values
	// hashcode method for class

}

public class EqualsRunner {

	public static void main(String[] args) {
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);

		System.out.println(c1.equals(c2)); // true bcoz of equals method as reference for both variables are equal even
											// if value is same since object is reference type
		System.out.println(c1.equals(c3)); // false as different id's

	}

}
