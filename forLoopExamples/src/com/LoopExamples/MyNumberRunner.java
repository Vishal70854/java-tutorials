package com.LoopExamples;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("check if a number is prime or not -> ");
		MyNumber myNumber = new MyNumber(6);
		System.out.println(myNumber.isPrime());

		System.out.print("get the sum of N numbers -> ");
		System.out.println(myNumber.sumUptoN());

		System.out.print("get the sum of the divisors of a number - > ");
		System.out.println(myNumber.getSumOfDivisors());

		// print a triangle number
		System.out.println("Print a triangle matrix with numbers :");
		myNumber.printANumberTriangle();
	}

}
