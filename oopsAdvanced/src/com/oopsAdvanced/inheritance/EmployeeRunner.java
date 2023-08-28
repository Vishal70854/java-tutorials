package com.oopsAdvanced.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("rakesh", "analyst");

//		employee.setName("vishal");
		employee.setPhoneNumber("4235235");
		employee.setEmail("vishal@gmail.com");
//		employee.setTitle("software engineer");
		employee.setEmployer("abc.xyz");
		employee.setEmployerGrade('A');
		employee.setSalary(234.2434);

		System.out.println(employee);
	}

}
