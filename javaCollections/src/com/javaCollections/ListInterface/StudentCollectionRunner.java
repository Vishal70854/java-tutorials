package com.javaCollections.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sorts the Student class in ascending order based on it
// take Comparator<Student> of type Student object
class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getId() - student2.getId(); // another way of getting ascending for Integer
		// return Integer.compare(student1.getId(), student2.getId());// sorts based on
		// id in ascending
	}

}

// sorts the Student class in descending order based on it
class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());// sorts based on id in descending
	}

}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// create immutable list of Student
		List<Student> students = List.of(new Student(1, "vishal"), new Student(5, "rahul"), new Student(2, "kapil"));
		System.out.println(students);

		// create a mutable list of Student from students
		List<Student> studentsAL = new ArrayList<Student>(students);
		// we can pass those classes(wrapper classes) which implements the Comparable
		// interface
		// so that it can be sorted directly. since we have List<Student> which do not
		// implement
		// comparable interface thats why we are getting error.
		// solution is to implement Comparable interface and override compareTo() method
		// to provide our need of sorting
		Collections.sort(studentsAL); // way 1
		System.out.println(
				"sorted List<Student> by implemnting Comparable interface and override our own compareTo() method");
		System.out.println("Ascending - " + studentsAL);

		System.out.println("sort by a comparator defined by ourselves");
		Collections.sort(studentsAL, new DescendingStudentComparator()); // way2
		System.out.println("descending - " + studentsAL);
		// another approach for sorting is studentsAL.sort(pass the comparator)
		studentsAL.sort(new AscendingStudentComparator()); // way3
		System.out.println("Ascending by arraylist sortmethod - " + studentsAL);
	}

}
