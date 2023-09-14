package java_new_api_features.api.h;

public class RecordsRunner {

	// record will automatically create constructor, getter, setters for us
	// improves time and code readability
	record Person(String name, String emailString, String phoneNumber) {
	}

	public static void main(String[] args) {
		/*
		 * we are learning about record classes where we will get constructor, getters,
		 * setters of a class directly without creating it by ourselves. we can do it
		 * via following command
		 * 
		 * record Person(String name, String emailString, String phoneNumber) {}
		 */

		// create instance of Person record class
		Person person = new Person("vishal", "vishal@gmail.com", "123-456-7890");
		Person person1 = new Person("vishal", "vishal@gmail.com", "123-456-7890");
		Person person2 = new Person("vishal2", "vishal@gmail.com", "123-456-7890");
		System.out.println(person); // Person[name=vishal, emailString=vishal@gmail.com, phoneNumber=123-456-7890]

		// check if objects are equal or not
		System.out.println(person.equals(person1)); // true as both object are same and have same record
		System.out.println(person.equals(person2));// false

		// get member variable values of person
		System.out.println(person.name()); // vishal // get member variable values
	}

}
