package com.oopsAdvanced;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("new market", "gurgaon", "133434");
		Customer customer = new Customer("vishal", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("old market", "gurgaon", "283848");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);

	}

}
