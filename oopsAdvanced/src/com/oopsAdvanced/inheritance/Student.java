package com.oopsAdvanced.inheritance;

public class Student extends Person { // inheriting Person class attributes and method using extends keyword

	private String college;
	private int year;

	// constructor
	public Student(String name, String college) {
		super(name);// automatically super() is called whenever child class constructor is invoked.
					// since Parent class constructor needs name as argument thats why we have to
					// pass super(name)
		this.college = college;
	}

	// getters and setters
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
