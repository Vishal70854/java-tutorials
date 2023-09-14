package com.tips_and_tricks.nonaccess.package1;

class Player {
	private String name; // instance variable
	private static int count; // static variable is shared among all instances of class

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public String getName() { // instance method can be only accessed by objects
		// in instance methods we can access instance variables and static variables
		System.out.println("accessing static variable in instance method - " + count);
		return name;
	}

	public void setName(String name) { // instance method can be only accessed by objects
		this.name = name;
	}

	public static int getCount() { // static method can be accessed by using ClassName.staticmethodName
		// in static methods we cannot access instance variables
		// System.err.println(getName()); not allowed in static methods
		return count;
	}
}

public class StaticNonAccessModifier {

	public static void main(String[] args) {
		/*
		 * static variables can be shared among all instances and have common values for
		 * all objects who is accessing it static methods is called using
		 * ClassName.staticmethodname it can also be called using objects but that is
		 * not recommended
		 * 
		 * in static methods we can only access other static methods or static variables
		 * 
		 * in instance methods we can access both static methods/variables and instance
		 * variables/methods+
		 */
		Player player1 = new Player("vishal");// here each player will have different values
		System.out.println(Player.getCount()); // 1 since getcountis called after both objects are created

		Player player2 = new Player("rahul");

		// lets say we want some values in common for each object
		// that's where static is used. with static keyword we will get some common
		// values for all objects of a class

		// get the count of each player. here count is static

		System.out.println(Player.getCount()); // 2

	}

}
