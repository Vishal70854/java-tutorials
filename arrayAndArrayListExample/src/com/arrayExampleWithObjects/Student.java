package com.arrayExampleWithObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {// int... marks now acts as an array with variable number of arguments
		// TODO Auto-generated constructor stub
		this.name = name;
		for (int mark : marks) { // type varName : arrayName
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int num : marks) {
			sum += num;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int total = getNumberOfMarks();

		// BigDecimal name = new BigDecimal(sum).divide(total), precision, rounding to
		// up or down)
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(total), 3, RoundingMode.UP);
		return average;
	}

	// get information about class/object using toString() method
	@Override
	public String toString() {
		return name + " " + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);

	}

	public void deleteMarkAtIndex(int index) {
		marks.remove(index);

	}

}
