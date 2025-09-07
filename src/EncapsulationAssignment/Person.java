package EncapsulationAssignment;

public class Person {

	/*
	 * Assignment 1:
	 * 
	 * Objective: The objective of this assignment is to create a class that uses
	 * encapsulation to protect its data and provide getter and setter methods for
	 * accessing the data. Instructions: 1. Create a class called "Person" with the
	 * following private attributes: name (String), age (int), and gender (String).
	 * 2. Create getter and setter methods for each attribute. 3. Write a method
	 * called "printInfo" that prints out the name, age, and gender of the person.
	 * 4. Create an instance of the "Person" class and set its attributes using the
	 * setter methods. 5. Call the "printInfo" method to verify that the data was
	 * set correctly. Questions: 1. What is encapsulation and how does it relate to
	 * object-oriented programming? 2. Why is it important to use getter and setter
	 * methods instead of accessing attributes directly? 3. How can encapsulation
	 * improve the security and reliability of a program? 4. What is the difference
	 * between a private attribute and a public attribute? 5. How does encapsulation
	 * help with code maintainability and scalability?
	 */

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo() {
		System.out.println("Printing the Person information");
		System.out.println(getName() + " " + getAge() + " " + getGender());
	}

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Richard");
		p.setAge(25);
		p.setGender("M");

		p.printInfo();

		p.setName("Richard Merc");
		p.printInfo();

	}

}
