package ConstructorAssignment;

public class Employee {

	/*
	 * Assignment 3:
	 * 
	 * Create a Java class named "Employee" with the following instance variables:
	 * id (int) name (String) salary (double) 1. Create a constructor for the
	 * Employee class that takes in the id, name, and salary as parameters and
	 * initializes the instance variables. 2. Create getter methods for each of the
	 * instance variables. 3. Create a main method that creates an instance of the
	 * Employee class using the constructor, prints out the employee's information
	 * using the getter methods, and gives the employee a 10% raise using the setter
	 * method for the salary instance variable. Questions: 1. What is the purpose of
	 * a getter method in Java? 2. Can a getter method return void? 3. What is the
	 * access level of a getter method in Java? 4. What is the purpose of a setter
	 * method in Java? 5. Can a setter method return a value other than void?
	 */

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee e = new Employee(1234, "Tom", 15.65);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

		e.setSalary(16.65);

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
