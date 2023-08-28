package com.oopsAdvanced.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("vishal", "abc.xyz");
		student.setName("vishal");
		student.setEmail("vishal@gmail.com");

		System.out.println(student.getName()); // "vishal"
		System.out.println(student.getYear()); // 0
		System.out.println(student.getEmail()); // "vishal@gmail.com"

		// create Person class object
		// note : every class by default extends Object class which provides a wide
		// variety of methods, one of them is mentioned below
		Person person = new Person("kania"); // for testing purpose
		person.setName("rahul");
		person.setEmail("rahul@gmail.com");
		person.setPhoneNumber("343353536345");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person); // internally call person.toString()

	}

}
