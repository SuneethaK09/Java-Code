package javasessionspractice;

public class MathOperators {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 20;
		System.out.println(a + b); // 30
		System.out.println(a - b); // -20
		System.out.println(a * b); // 200
		System.out.println(a / b); // 0

		float c1 = 10.0f;
		float c2 = 20.0f;
		System.out.println(c1 / c2); // 0.5

		// System.out.println(1/0); // ArithmeticException
		// System.out.println(0/0); // ArithmeticException

		System.out.println(1.0f / 0); // Infinity
		System.out.println(1 / 0.0f); // Infinity
		System.out.println(1.0f / 0.0f); // Infinity

		System.out.println(0 / 5); // 0
		System.out.println(0 / 5.0f); // 0.0
		System.out.println((0.0f / 5.0f)); // 0.0

		System.out.println(0 / 0.0f); // Not a Number
		System.out.println(0.0f / 0); // NaN
		System.out.println(0.0f / 0.0f); // NaN

	}

}
