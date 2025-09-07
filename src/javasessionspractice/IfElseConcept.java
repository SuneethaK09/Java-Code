package javasessionspractice;

public class IfElseConcept {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;

		if (a > b) {
			System.out.println("hii");
		} else {
			System.out.println("hello");
		}

		//
		if (true) {
			System.out.println("selenium");
		} else { // Dead code --> when we pass a hard code value instead of condition
			System.out.println("Bye!!!");
		}

		// Write a Java program to get a number from the user and print whether it is
		// positive or negative.
		byte by = 35;
		if (by > 0) {
			System.out.println("by is positive number");
		} else {
			System.out.println("by is negative number");
		}

		// Write a Java program to find the greatest number among three numbers
		byte st = 25;
		byte nd = 88;
		byte rd = 85;
		if (st > nd & st > rd) { // F
			System.out.println(st + " is the greatest number");
		} else if (nd > rd) { // T
			System.out.println(nd + " is the greatest number");

		}

		else {
			System.out.println(rd + " is the greatest number");

		}

		// Write a Java program to find the greatest number among four numbers

		byte b1 = 80;
		byte b2 = 90;
		byte b3 = 100;
		byte b4 = 110;

		if (b1 > b2 & b1 > b3 & b1 > b4) { // f & f & f = f
			System.out.println("b1 is the greatest number");
		} else if (b2 > b3 & b2 > b4) { // f & f = f
			System.out.println("b2 is the greatst number");
		} else if (b3 > b4) { // f
			System.out.println("b3 isw the greatest number");
		} else {
			System.out.println("b4 is the greatest number");
		}

		// Write a program to find the given three float numbers (up to three decimals)
		// are same or different

		float f1 = 25.526f;
		float f2 = 25.527f;
		float f3 = 25.529f;

		if (f1 == f2 & f1 == f3) { // f & f = f
			System.out.println("f1 and f2 are equal");
		} else if (f2 == f3) { // f
			System.out.println("f2 and f3 are equal");
		} else {
			System.out.println("f1,f2 and f3 are not equal"); // Output: f1,f2 and f3 are not equal
		}

		// Write a Java program to find the greatest number among four numbers when two
		// numbers have same value
		byte bt1 = 10;
		byte bt2 = 20;
		byte bt3 = 30;
		byte bt4 = 30;

		if (bt1 > bt2 & bt1 > bt3 & bt1 > bt4) { // f & f & f = f
			System.out.println("bt1 is the greatest number");
		} else if (bt2 > bt3 & bt2 > bt4) { // f & f = f
			System.out.println("bt2 is the greatest number");
		} else if (bt3 > bt4) { // f
			System.out.println("bt3 is the greatest number");
		} else {
			System.out.println("bt4 is the greatest number"); // Output: bt4 is the greatest number
		}

	}

}
