package ConstructorAssignment;

public class Car {

	/*
	 * Assignment 4: Create a Java class named "Car" with the following instance
	 * variables: make (String) model (String) year (int) Create a constructor for
	 * the Car class that takes in the make, model, and year as parameters and
	 * initializes the instance variables. Create a default constructor for the Car
	 * class that sets the make, model, and year to "Unknown". Create a main method
	 * that creates three instances of the Car class using both constructors and
	 * prints out their information. Questions: 1. What is the purpose of a default
	 * constructor in Java? 2. Can a default constructor take in parameters? 3. Can
	 * a constructor be overloaded in Java? If so, what does it mean to overload a
	 * constructor? 4. Can you create an object of a Java class without calling a
	 * constructor? 5. How are instance variables accessed and modified outside of
	 * the class they are defined in?
	 */

	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;

	}

	public Car() {
		System.out.println("Default Constructor");

	}

	public static void main(String[] args) {

		Car c = new Car();

		Car c1 = new Car("2k24", "A-01", 2024);
		System.out.println(c1.make + " " + c1.model + " " + c1.year);

	}

}
