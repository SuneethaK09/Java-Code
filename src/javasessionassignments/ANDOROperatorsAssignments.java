package javasessionassignments;

public class ANDOROperatorsAssignments {

	public static void main(String[] args) {

		/*
		 * 1: Voter Eligibility Write a program to check if a person is eligible to
		 * vote: - The person should be 18 or older. - The person must be a citizen of
		 * the country. Use both & and && to show the difference in behavior
		 */

		byte Age = 20;
		boolean Citizenship = true;

		if (Age >= 18 & Citizenship) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}

		if (Age >= 18 && Citizenship == false) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}

		/*
		 * 2: Login Check Assume two boolean values: boolean isUsernameCorrect = true;
		 * boolean isPasswordCorrect = false; Use: - & and && to print whether login is
		 * successful or not. - | and || to explore the behavior when one of the
		 * credentials is correct
		 */

		boolean isUsernameCorrect = true;
		boolean isPasswordCorrect = false;

		if (isUsernameCorrect & isPasswordCorrect) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}

		if (isUsernameCorrect && isPasswordCorrect) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}

		if (isUsernameCorrect | isPasswordCorrect) {
			System.out.println("Atleast one credential is correct (|)");
		} else {
			System.out.println("Both credentials are incorrect (|)");
		}

		if (isUsernameCorrect || isPasswordCorrect) {
			System.out.println("Atleast one credential is correct (||)");
		} else {
			System.out.println("Both credentials are incorrect (||)");
		}

		/*
		 * 3: Discount Eligibility A user is eligible for a discount if: - Their total
		 * purchase amount is above 1000 - OR they are a premium member Use || and | to
		 * check discount eligibility
		 */

		short TotalBill = 950;
		boolean isPremiumMember = true;

		if (TotalBill >= 1000 | isPremiumMember) {
			System.out.println("Customer is eligible for discount (|)");
		} else {
			System.out.println("Customer is not eligible for discount (|)");
		}

		if (TotalBill >= 1000 || isPremiumMember == false) {
			System.out.println("Customer is eligible for discount (||)");
		} else {
			System.out.println("Customer is not eligible for discount (||)");
		}

		/*
		 * 4. Find the Greatest of Four Numbers Write a program to find the greatest of
		 * four numbers using logical && and if-else
		 */

		short a = 100;
		short b = 600;
		short c = 500;
		short d = 400;

		if (a > b && a > c && a > d) {
			System.out.println("a is the greatest number with value:" + " " + a);
		} else if (b > c && b > d) {
			System.out.println("b is the greatest number with value:" + " " + b);
		} else if (c > d) {
			System.out.println("c is the greatest number with value:" + " " + c);
		} else {
			System.out.println("d is the greatest number with value:" + " " + d);
		}

		/*
		 * Short-Circuit Behavior Create a method printMessage() that prints a message
		 * and returns true. Use this method in: if (x > 5 || printMessage()) Then
		 * change to: if (x > 5 | printMessage()) Observe the output difference
		 */

		int x = 10;

		if (x > 5 || printMessage()) {
			System.out.println("Condition passed");
		}

		if (x > 11 | printMessage()) {
			System.out.println("Condition passed");
		}

		/*
		 * 6: Access Control A user can access a secure area if: - They are an admin -
		 * OR (they are a user AND their access level is above 5) Write boolean logic
		 * using isAdmin, isUser, accessLevel
		 */

		boolean isAdmin = true;
		boolean isUser = true;
		int accessLevel = 5;

		if (isAdmin || (isUser && accessLevel >= 5)) {
			System.out.println("Access granted");
		} else {
			System.out.println("No privilage to access");
		}

	}

	private static boolean printMessage() {
		System.out.println("Inside printMessage()");
		return true;

	}

}
