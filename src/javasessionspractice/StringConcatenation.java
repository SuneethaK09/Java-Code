package javasessionspractice;

public class StringConcatenation {

	public static void main(String[] args) {

		String a1 = "Hello";
		String a2 = "World";

		System.out.println(a1 + a2); // Output: HelloWorld
		System.out.println(a1 + "" + a2); // Output: HelloWorld
		System.out.println(a1 + " " + a2); // Output: Hello World

		// Concatenating using concat method
		System.out.println(a1.concat(a2)); // Output: HelloWorld
		System.out.println(a1.concat("").concat(a2)); // Output: HelloWorld
		System.out.println(a1.concat(" ").concat(a2)); // Output: Hello World

		System.out.println(100 + 50 + 20 + "Hello" + "World"); // Output: 170HelloWorld
		System.out.println("Hello" + "World" + 100 + 50 + 20); // Output: HelloWorld1005020
		System.out.println("Hello" + "World" + (100 + 50 + 20)); // Output: HelloWorld170
		System.out.println(12.33 + 23.44 + "hello" + "world"); // 35.77helloworld
		System.out.println(12.33 + 23.44 + "hello" + "world" + (10 + 20 + 30)); // 35.77helloworld60

		char ch = 'a';
		String x = "helloselenium";
		System.out.println(x + ch); // Output: helloseleniuma

		boolean flag = true;
		System.out.println(flag + x); // Output: truehelloselenium

		System.out.println("Hello " + "World" + 5 + " endl" + 2); // Output: Hello World5 endl2

		System.out.println("Hello " + "\n" + " World!");

		// (Hello ) --> Hello with one space at the end. and then it will print in the
		// next line
		// ( World!) --> one leading space and then World!

		// How do you print the numbers 1 to 5 on the same line with spaces?

		System.out.println("1 2 3 4 5"); // Output: 1 2 3 4 5
		System.out.println("1" + " " + "2" + " " + "3" + " " + "4" + " " + "5"); // Output: 1 2 3 4 5

		// Print each word of the given sentence on a new line: I Love Painting
		System.out.println("I" + "\n" + "Love" + "\n" + "Painting");
		/*
		 * Output: I Love Painting
		 */

		// Write a program to output the squares (using multiplication) of numbers from
		// 1 to 5 on separate lines
		System.out.println(1 * 1 + "\n" + 2 * 2 + "\n" + 3 * 3 + "\n" + 4 * 4 + "\n" + 5 * 5);
		/*
		 * Output: 1 4 9 16 25
		 */

	}

}
