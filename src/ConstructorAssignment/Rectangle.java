package ConstructorAssignment;

public class Rectangle {

	/*
	 * 2. Create a Java class named "Rectangle" with the following instance
	 * variables: length (double) width (double) Create a default constructor for
	 * the Rectangle class that sets both the length and width to 0.0. Create a
	 * constructor for the Rectangle class that takes in the length and width as
	 * parameters and initializes the instance variables. Create a method in the
	 * Rectangle class named "calculateArea" that returns the area of the rectangle
	 * (length * width). Create a main method that creates two instances of the
	 * Rectangle class using both constructors, calculates and prints out their
	 * respective areas. Questions: 1. What is the purpose of a default constructor
	 * in Java? 2. How can you differentiate between a default constructor and a
	 * constructor that takes in parameters? 3. What is the access level of a
	 * constructor in Java? 4. Can a constructor be private? If so, why would you
	 * want to make a constructor private? 5. Can a constructor call a method from
	 * another class?
	 */

	double length;
	double width;

	public Rectangle() {
		System.out.println("Default constructor");
	}

	public Rectangle(double length, double width) {
		System.out.println("Parameter Constructor");
		this.length = length;
		this.width = width;

	}

	public double calculateArea() {
		double area = length * width;
		System.out.println(area);
		return area;
	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		System.out.println(r.length);
		System.out.println(r.width);

		Rectangle r1 = new Rectangle(15.55, 10);
		r1.calculateArea();

	}

}
