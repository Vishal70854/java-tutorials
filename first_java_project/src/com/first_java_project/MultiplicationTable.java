package com.first_java_project;

import java.util.Scanner;

public class MultiplicationTable {

	// example showing method overloading of printTable
	public void printTable(int number) {
		printTable(number, 1, 10);
	}

	// method overloading
	public void printTable(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", number, i, number * i).println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for which you want the table to be printed : ");
		int number = sc.nextInt();

		// create instance of MultiplicationTable class
		MultiplicationTable table = new MultiplicationTable();
		// method overloading example
//		table.printTable(number);

		table.printTable(number);

	}
}
