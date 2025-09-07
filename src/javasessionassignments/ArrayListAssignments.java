package javasessionassignments;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAssignments {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to create a new array list, add some colors (string)
		 * and print out the collection
		 */

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("orange");
		colors.add("purple");
		colors.add("blue");
		System.out.println(colors.size());
		System.out.println(colors);
		for (byte clr = 0; clr <= colors.size() - 1; clr++) {
			System.out.println(colors.get(clr));
		}

		/*
		 * 2. Write a Java program to insert an element into the array list at the first
		 * and last positions.
		 */

		colors.add(0, "black");
		colors.add(colors.size(), "white");
		System.out.println(colors.size());
		System.out.println(colors);

		/*
		 * 3. Write a Java program to retrieve an element (at a specified index) from a
		 * given array list
		 */

		System.out.println(colors.get(1));
		System.out.println(colors.get(4));

		/*
		 * 4. Write a Java program to update specific array element by given element  
		 */

		colors.set(2, "red");
		System.out.println(colors);

		/* 5. Write a Java program to remove the third element from a array list */

		colors.remove(3);
		System.out.println(colors);

		/* 6. Write a Java program to search an element in a array list */

		if (colors.contains("yellow")) {
			System.out.println("yellow is present");
		} else {
			System.out.println("yellow is not present");
		}

		/* 7. Write a Java program to reverse elements in a array list */

		for (int revclr = colors.size() - 1; revclr >= 0; revclr--) {
			System.out.println(colors.get(revclr));
		}

		/* 8. Write a Java program to extract a portion of a array list */
		List<String> clrList = colors.subList(1, 3);
		System.out.println(clrList);

		/*
		 * 9. Write a Java program to print all elements in a array list using for each
		 * loop
		 */
		for (String allColors : colors) {
			System.out.println(allColors);
		}

		/* 10. Write a Java program to empty an array list */
		// colors.removeAll(colors);

		/*
		 * 11. Write a Java program to trim the virtual capacity of an array list
		 * current list size
		 */

//		colors.trimToSize();
//		System.out.println(colors.size());

		System.out.println("-----------");

		/*
		 * 12. Write a program to print all elements in reverse order using for each
		 * loop
		 */
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Radison");
		aList.add("Remo");
		aList.add("Richard");
		aList.add("Robby");
		aList.add("Rubeena");

		int counter = aList.size() - 1;
		for (String e : aList) {
			System.out.println(aList.get(counter));
			counter--;
		}

		System.out.println("-----------");

//		System.out.println(aList.size());
//		System.out.println(aList);

	}

}
