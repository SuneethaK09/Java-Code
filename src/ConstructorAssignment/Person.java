package ConstructorAssignment;

public class Person {

	/*
	 * 1. Create a Java class named "Person" with the following instance variables:
	 * name (String) age (int) gender (char) height (double) Create a constructor
	 * for the Person class that takes in the name, age, gender, and height as
	 * parameters and initializes the instance variables. Create a main method that
	 * creates two instances of the Person class using the constructor and prints
	 * out their information. Questions: 1. What is the purpose of a constructor in
	 * Java? 2. How does a constructor differ from a regular method in Java? 3. Can
	 * a Java class have multiple constructors? If so, how are they differentiated?
	 * 4. What happens if a constructor is not defined in a Java class? If you don’t
	 * implement any constructor in your class, the Java compiler inserts default
	 * constructor into your code on your behalf. You will not see the default
	 * constructor in your source code (the .java file) as it is inserted during
	 * compilation and present in the bytecode (.class file). 5. Can a constructor
	 * call other methods or constructors within the same class?
	 */

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.getDetails();

	}

	// Q-5
	public Person(String name, int age) {
		this("Lisa", 32, 'F', 5.6);
		this.name = name;
		this.age = age;

	}

	// Q-5
	public void getDetails() {
		System.out.println("Getting Employee Details");
	}

	public static void main(String[] args) {

		Person p = new Person("Peter", 28, 'M', 5.11);

		System.out.println(p.name + " " + p.age + " " + p.gender + " " + p.height);

		Person p2 = new Person("Charlie", 30, 'F', 6);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender + " " + p2.height);

		Person p3 = new Person("Tina", 26);
		System.out.println(p3.name + " " + p3.age + " " + p3.gender + " " + p3.height);

	}

}
