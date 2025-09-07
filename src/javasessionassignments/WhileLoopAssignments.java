package javasessionassignments;

public class WhileLoopAssignments {

	public static void main(String[] args) {

		// 1. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
		// using while loop

		char c = 'a';
		while (c <= 'z') {
			System.out.println(c + "=" + (byte) c);
			c++;
		}

		System.out.println("-------------------------");

		char ca = 'A';

		while (ca <= 'Z') {
			System.out.println(ca + "=" + (byte) ca);
			ca++;
		}

		System.out.println("-------------------------");

		char cb = '0';

		while (cb <= '9') {
			System.out.println(cb + "=" + (byte) cb);
			cb++;
		}

		System.out.println("-------------------------");

		/* 2. WAP to print 10 to 1 using while loop */

		byte revord = 10;

		while (revord >= 1) {
			System.out.println(revord);
			revord--;
		}

		System.out.println("-------------------------");

		/*
		 * 3. Write a program in Java to print "Hello World" ten times using while loop
		 */

		int h = 1;
		String s = "Hello";
		while (h <= 10) {
			System.out.println(s);
			h++;
			if (h == 11) {
				break;
			}
		}

		System.out.println("------------------------");

		/*
		 * 4. Write a program in Java to print all the multiplication of 5 from 1 to 100
		 * using while loop
		 */

		byte multi = 1;

		while (multi <= 100) {
			if (multi % 5 == 0) {
				System.out.println(multi);
			}
			multi++;
		}

		System.out.println("------------------------");

		/* 5. Print all odd and even numbers between 1 to 100 */

		byte nbr = 1;

		while (nbr <= 100) {
			if (nbr % 2 == 0) {
				System.out.println(nbr + " is even");
			} else {
				System.out.println(nbr + " is odd");
			}
			nbr++;
		}

		System.out.println("------------------------");

		/*
		 * 6. Print the following series:  1.0 2.0 3.0  ...... 10.0  0 9 18 27 36 …99
		 */

		float series = 1f;

		while (series <= 10) {
			System.out.println(series);
			series++;
		}

		System.out.println("------------------------");

		byte nt = 1;
		while (nt <= 100) {
			if (nt % 9 == 0) {
				System.out.println(nt);
			}
			nt++;
		}

		System.out.println("------------------------");

	}

}
