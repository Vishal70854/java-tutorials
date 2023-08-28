package com.arrayExampleWithObjects;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// int[] marks = { 97, 98, 100 };
		Student student = new Student("vishal", 97, 98, 100); // passed variable argument for marks array
		Student student1 = new Student("raju", 97, 98);
		Student student2 = new Student("kaju", 97, 98, 87, 90);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal averageBigDecimal = student.getAverageMarks();

		System.out.println("number of marks : " + number);
		System.out.println("sum of marks : " + sum);
		System.out.println("maximum marks : " + maximumMark);
		System.out.println("minimum marks : " + minimumMark);
		System.out.println("average marks : " + averageBigDecimal);

		// get information about the student object
		System.out.println(student);

		// add new mark in marks arraylist
		student.addNewMark(78);
		System.out.println(student);
		// delete a mark from marks arraylist
		student.deleteMarkAtIndex(1);
		System.out.println(student);

	}

}
