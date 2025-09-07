package javasessionspractice;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		/*
		 * Post Increment (i++) : Current value of ‘i’ is used and then it is
		 * incremented by 1. Pre Increment (++i) : First ‘i’ is incremented by 1 and
		 * then it’s value is used. Post Decrement (i-- ) : Current value of ‘i’ is used
		 * and then it is decremented by 1. Pre Decrement (--i) : First ‘i’ is
		 * decremented by 1 and then it’s value is used.
		 */

		byte i1 = 11;
		int i2 = i1++ + ++i1;
		// 11 + 13
		System.out.println(i2); // 24
		System.out.println(i1); // 13

		byte x = 001, y = 010, z = 100;

		System.out.println("x= " + x); // 1
		System.out.println("y= " + y); // 8 --> Octal value is considered here
		System.out.println("z= " + z); // 100

		int x2 = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		// 0 8 100 98 10 -1 10 -2

		System.out.println(x2); // -167
		System.out.println(x); // -2
		System.out.println(y); // 9
		System.out.println(z); // 98

		short m = 1010, n = 1010;
		System.out.println(m++ / ++n * n-- / --m); // 0

		char ch = '0';
		System.out.println(ch-- + --ch); // Output: 94
		// ASCII value for 0 = 48 --> 48 + 46

		char c1 = '1';
		System.out.println(c1++); // 1
		System.out.println(++c1); // 3
		System.out.println(c1++ + ++c1); // 3+5 --> 51+53=104

		char c2 = 'a';
		System.out.println(++c2); // Output: b

		char c3 = ' ';
		System.out.println(++c3); // Output: !

		int m1 = 0, n1 = 0;
		int p = --m1 * --n1 * n1-- * m1--; // -1 * -1 * -1 * -1
		System.out.println(p); // Output: 1

		char c0 = "123".charAt(1); // --> charAt(1)=2 as per Index value in String array --> ASCII value for 2 is
									// 50
		System.out.println(c0++ + ++c0); // 50+52=102 Output: 102

		/*
		 * Invalid cases:
		 * 
		 * 1. int i = 11; --> This is not a valid case int j = --(i++); --> invalid
		 * argument to operation ++/--
		 * 
		 * 2. int t = 11++; --> This is not a valid case System.out.println(t); -->
		 * cannot perform Increment/Decrement directly on Numbers
		 * 
		 * 3. char cr = '1'++; --> This is not a valid case System.out.println(ch); -->
		 * invalid argument to operation ++/--
		 * 
		 * 4. boolean b0 = true; --> This is not a valid case b0++;
		 * System.out.println(b0); --> cannot perform Increment/Decrement on boolean
		 * data type
		 * 
		 */

	}

}
