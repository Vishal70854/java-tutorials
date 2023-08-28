package com.javaCollections.ListInterface;

public class Student implements Comparable<Student> {
	// state
	private int id;
	private String name;

	// constructor
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// information about object using toString()
	@Override
	public String toString() {
		return id + " " + name;
	}

	// here we have implemented Comparable class and override compareTo() method
	// which is somewhat timetaking
	// we can directly implement Comparator interface in the place we we want to
	// sort based on our requirement
	// and override compare() method there.
	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id); // return (x < y) ? -1 : ((x == y) ? 0 : 1);
		// this method sorts the Student objects in ascending order of id
		// if we want it in descending order then we will give
		// return Integer.compare(that.id, this.id)
	}
}
