package javasessionassignments;

public class SwitchCaseAssignments {

	public static void main(String[] args) {

		/*
		 * 1: Browser Launch Write a switch case to launch a browser. Supported
		 * browsers: chrome, firefox, safari, edge, opera. Print a message for
		 * unsupported browsers.
		 */

		String browser = "opera";

		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome browser");
			break;
		case "firefox":
			System.out.println("Launch Firefox browser");
			break;
		case "safari":
			System.out.println("Launch Safari browser");
			break;
		case "edge":
			System.out.println("Launch Edge browser");
			break;
		case "opera":
			System.out.println("Launch opera browser");
			break;

		default:
			System.out.println("Please provide valid input");
			break;
		}

		/*
		 * : Day of the Week Write a switch case program that prints the name of the day
		 * when a number from 1 to 7 is given
		 */

		byte day = 5;

		switch (day) {
		case 1:
			System.out.println("Day = Monday");
			break;
		case 2:
			System.out.println("Day = Tuesday");
			break;
		case 3:
			System.out.println("Day = Wednesday");
			break;
		case 4:
			System.out.println("Day = Thursday");
			break;
		case 5:
			System.out.println("Day = Friday");
			break;
		case 6:
			System.out.println("Day = Saturday");
			break;
		case 7:
			System.out.println("Day = Sunday");
			break;

		default:
			System.out.println(day + " " + "is Invalid input");
			break;
		}

		/*
		 * Vowel or Consonant Write a switch case program to check whether a character
		 * is a vowel (a, e, i, o, u) or a consonant
		 */

		char alphabet = 'u';

		switch (alphabet) {
		case 'a':
			System.out.println("Alphabet " + alphabet + " is vowel");
			break;
		case 'e':
			System.out.println("Alphabet " + alphabet + " is vowel");
			break;
		case 'i':
			System.out.println("Alphabet " + alphabet + " is vowel");
			break;
		case 'o':
			System.out.println("Alphabet " + alphabet + " is vowel");
			break;
		case 'u':
			System.out.println("Alphabet " + alphabet + " is vowel");
			break;

		default:
			System.out.println("Alphabet " + alphabet + " is consonant");
			break;
		}

		/*
		 * 4: User Roles Create a switch case that prints the permissions based on user
		 * roles
		 */

		String Role = "User";

		switch (Role) {
		case "Admin":
			System.out.println("Administrator permission");
			break;
		case "User":
			System.out.println("User permission");
			break;
		case "Manager":
			System.out.println("Special approval permission");
			break;

		default:
			System.out.println("Invalid role");
			break;
		}

		/*
		 * 5: OS Selection Write a switch case to detect the Operating System type
		 */

		String OS = "Windows";

		switch (OS) {
		case "iOS":
			System.out.println("OS type is" + " " + OS);
			break;
		case "Windows":
			System.out.println("OS type is" + " " + OS);
			break;
		case "Linux":
			System.out.println("OS type is" + " " + OS);
			break;
		case "Andriod":
			System.out.println("OS type is" + " " + OS);
			break;

		default:
			System.out.println(OS + " " + "is Invalid input");
			break;
		}

		/*
		 * 6: Payment Mode Write a switch statement for payment methods
		 */

		String PaymentMode = "Debit Card";

		switch (PaymentMode) {
		case "Cheque":
			System.out.println("Payment is done by" + " " + PaymentMode);
			break;
		case "Bank Transfer":
			System.out.println("Payment is done by" + " " + PaymentMode);
			break;
		case "Phonepe":
			System.out.println("Payment is done by" + " " + PaymentMode);
			break;
		case "Gpay":
			System.out.println("Payment is done by" + " " + PaymentMode);
			break;
		case "Credit Card":
		case "Debit Card":
			System.out.println("Payment is done by" + " " + PaymentMode);
			break;

		default:
			System.out.println("Invalid payment method");
			break;
		}

		/*
		 * 7: Environment Config Based on the environment passed, print the URL used for
		 * testing
		 */

		String Env = "SIT";

		switch (Env) {
		case "Dev":
			System.out.println("lauch http://app.dev.common.loginservlet");
			break;
		case "ST":
			System.out.println("lauch http://app.st.common.loginservlet");
			break;
		case "SIT":
			System.out.println("lauch http://app.sit.common.loginservlet");
			break;
		case "RBAC":
			System.out.println("lauch http://app.rbac.common.loginservlet");
			break;
		case "UAT":
			System.out.println("lauch http://app.uat.common.loginservlet");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}

		/*
		 * 8: Department Info Pass an employee department name and print a message
		 */

		String EmpDept = "HR Dept";

		switch (EmpDept) {
		case "Infra Dept":
			System.out.println("Employee department is" + " " + EmpDept);
			break;
		case "HR Dept":
			System.out.println("Employee department is" + " " + EmpDept);
			break;
		case "Admin Dept":
			System.out.println("Employee department is" + " " + EmpDept);
			break;
		case "Help Desk Dept":
			System.out.println("Employee department is" + " " + EmpDept);
			break;

		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
