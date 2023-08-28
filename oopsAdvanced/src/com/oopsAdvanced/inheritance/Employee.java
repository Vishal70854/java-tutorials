package com.oopsAdvanced.inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private char employerGrade;
	private double salary;

	// note:
	// from a subclass constructor the super class constructor with no argument is
	// called automatically
	// if super class constructor has argument then we have to manually call it in
	// subclass constructor i.e
	// super(arguments )
	// because when we invoke sub class constructor always superclass constructor
	// gets called first then sub class constructor gets executed

	// constructor
	public Employee(String name, String title) {
		super(name);// automatically super() is called whenever child class constructor is invoked.
					// since Parent class constructor needs name as argument thats why we have to
					// pass super(name)
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("title - %s, " + "employer - %s, employeeGrade - %s, salary - %f",
				title, employer, employerGrade, salary);
	}

	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployerGrade() {
		return employerGrade;
	}

	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
