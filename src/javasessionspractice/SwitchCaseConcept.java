package javasessionspractice;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("plz pass the right browser...");
			break;
		}

		// Write a Java program to display the Weekday from a given integer number

		byte weekday = 5;

		switch (weekday) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

}
