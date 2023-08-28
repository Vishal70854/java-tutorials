package com.SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// BiNumber class assignment
		// BiNumber number = new BiNumber(2, 3);
		// System.out.println(number.add());
		// System.out.println(number.multiply());
		// number.double1();
		// System.out.println(number.getNumber1());

		// binary, octal, hexadecimal, decimal conversion
		// System.out.println(Byte.MAX_VALUE);
		// int binaryInt = 0b1010;
		// long binaryLong = 0B1010l;

		// System.out.println(binaryInt + " " + binaryLong);

		// BigDecimal in java
		// BigDecimal number1 = new BigDecimal("45.34234234");
		// System.out.println(number1);

		// BigDecimal _a = new BigDecimal("0.03");
		// BigDecimal _b = new BigDecimal("0.04");
		// BigDecimal _c = _b.subtract(_a);
		// System.out.println(_c); //0.01

		// simple interest calculator
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
