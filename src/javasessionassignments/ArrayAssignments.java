package javasessionassignments;

public class ArrayAssignments {

	public static void main(String[] args) {

		/*
		 * 1: Write a program to print the following pattern using for loop:
		 * 
		 *    00 01 02 03 04 05 06 07 08 09     10 11 12 13 14 15 16 17 18 19     20 21
		 * 22 23 24 25 26 27 28 29     30 31 32 33 34 35 36 37 38 39  
		 */

		for (byte a = 0; a <= 3; a++) {
			for (byte b = 0; b <= 9; b++) {
				System.out.print(a + "" + b + " ");
			}
			System.out.println();
		}

		System.out.println("-------------");

		// 2. Write a program to print the elements in the Array

		int numbers[] = new int[5];
		numbers[0] = 100;
		numbers[1] = 125;
		numbers[2] = 149;
		numbers[3] = 153;
		numbers[4] = 180;

		for (byte count = 0; count < numbers.length; count++) {
			System.out.println(numbers[count]);
		}

	}

}
