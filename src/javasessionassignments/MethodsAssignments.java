package javasessionassignments;

public class MethodsAssignments {

	int num1 = 100;
	int num2 = 200;
	final float pi = 3.14f;

	// 1.Write a program to print the addition/subtraction/division/multiplication
	// of two numbers
	// entered by user by defining your own method

	public void addition() {
		System.out.println("Addition of two numbers: " + num1 + "&" + num2);
		int total = num1 + num2;
		System.out.println(total);
	}

	public void subtraction() {
		System.out.println("Subtraction of two numbers: " + num1 + "&" + num2);
		int diff = num1 - num2;
		System.out.println(diff);
	}

	public void multiply(int n1, int n2) {
		System.out.println("Multiplication of two numbers: " + n1 + "&" + n2);
		int multiply = n1 * n2;
		System.out.println(multiply);
	}

	public void division() {
		System.out.println("Division of two numbers: " + num1 + "&" + num2);
		int total = num2 / num1;
		System.out.println(total);
	}

	// 2. Define a method that returns the product of two double numbers entered by
	// user.

	public void product(double d1, double d2) {
		System.out.println("Product of two double numbers: " + d1 + "&" + d2);
		double p = d1 * d2;
		System.out.println(p);
	}

	// 3.Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method. 

	public void circleMeasurements() {
		System.out.println("Circumference of Cicle..");
		int r = 5;
		double cf = 2 * pi * r;
		System.out.println(cf);

		System.out.println("Area of Circle");
		double area = pi * r * r;
		System.out.println(area);
	}

	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user.

	public void maxNum(int a, int b, int c) {
		if (a > b & a > c) {
			System.out.println("a is greater: " + a);
		} else if (b > c) {
			System.out.println("b is greater: " + b);
		} else {
			System.out.println("c is greater: " + c);
		}

	}

	public void minNum(int a, int b, int c) {
		if (a < b & a < c) {
			System.out.println("a is lowest number: " + a);
		} else if (b < c) {
			System.out.println("b is lowest number: " + b);
		} else {
			System.out.println("c is lowest number: " + c);

		}

	}

	// 5. Def﻿ine a program to find out whether a given number is even or odd -
	// return true/false

	public boolean numberType(int no) {
		boolean f = true;
		if (no % 2 == 0) {
			System.out.println(no + " is even number");
		} else {
			f = false;
			System.out.println(no + " is odd number");
		}
		return f;

	}

	/*
	 * 6. A person is eligible to vote if his/her age is greater than or equal to
	 * 18. Define a method to find out if he/she is eligible to﻿ vote. - return
	 * true/false
	 */

	public boolean vote(int age) {
		boolean flag = true;
		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			flag = false;
			System.out.println("Not eligible to vote as age is: " + age);
		}
		return flag;

	}

	/*
	 * 7. Write a program which will ask the user to enter his/her marks (out of
	 * 100). Define a method that will display grades according to the marks entered
	 * as below: Marks        Grade 91-100         AA 81-90          AB
	 * 71-80          BB﻿ 61-70          BC 51-60          CD 41-50          DD
	 * <=40          Fail
	 */

	public void marks(int marks) {

		if (marks > 90 & marks < 100) {
			System.out.println("Grade is AA");
		} else if (marks > 80 & marks <= 90) {
			System.out.println("Grade is AB");
		} else if (marks > 70 & marks <= 80) {
			System.out.println("Grade is BB");
		} else if (marks > 60 & marks <= 70) {
			System.out.println("Grade is BC");
		} else if (marks > 50 & marks <= 60) {
			System.out.println("Grade is CD");
		} else if (marks > 40 & marks <= 50) {
			System.out.println("Grade is DD");
		} else {
			System.out.println("Result - Failed");
		}

	}

	/*
	 * 8. Write a program to print the factorial of a number by defining a method
	 * named 'Factorial'. Factorial of any number n is represented by n! and is
	 * equal to 1*2*3*....*(n-1)*n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1
	 * = 2 Also, 1! = 1 0! = 1
	 */

	public void factorial(int number) {

		int fact = 1;
		for (int a = 1; a <= number; a++) {
			fact *= a;
		}
		System.out.println("Factorial of " + number + "=" + fact);

	}

	public static void main(String[] args) {
		MethodsAssignments m = new MethodsAssignments();
		m.addition();
		m.subtraction();
		m.multiply(10, 20);
		m.division();
		m.product(11.11, 12.33);
		m.circleMeasurements();
		m.maxNum(100, 220, 90);
		m.minNum(500, 250, 100);
		boolean f = m.numberType(110);
		System.out.println(f);
		boolean flag = m.vote(16);
		System.out.println(flag);
		m.marks(71);
		m.factorial(5);

	}

}
