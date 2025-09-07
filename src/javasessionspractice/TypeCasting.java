package javasessionspractice;

public class TypeCasting {

	public static void main(String[] args) {

		/*
		 * Widening Casting (automatically) - converting a smaller type to a larger type
		 * size byte -> short -> char -> int -> long -> float -> double
		 * 
		 * Narrowing Casting (manually) - converting a larger type to a smaller size
		 * type double -> float -> long -> int -> char -> short -> byte
		 */

		// Widening or Implicit conversion:

		byte b = 56;
		short bs = b;
		System.out.println(bs); // Output: 56 // byte to short --> Widening or Implicit conversion

		short s = 290;
		int si = s;
		System.out.println(si); // Output: 290 // short to int --> Widening or Implicit conversion

		byte b1 = 101;
		char b1c = (char) b1;
		System.out.println(b1c); // Output: 101 // byte to char --> Widening but we need to explicitly convert to
									// char

		char c = 'n';
		int ci = c;
		System.out.println(ci); // Output: 110 // char to int --> Widening or Implicit conversion

		short sh = 127;
		char csh = (char) sh;
		System.out.println(csh); // Output:  // short to char --> Widening or Implicit conversion

		int i = 2570;
		float fi = i;
		System.out.println(fi); // Output: 2570.0 // int to float --> Widening or Implicit conversion

//		long l = 1234567891495L;
//		double fl = l;
//		System.out.println(fl); // Output:1.234567891495E12 // long to double --> Widening or Implicit conversion
//		
//		float ff = l;
//		System.out.println(ff); // Output: 1.234568E12 // long to float --> Widening or Implicit conversion
//		

		// Narrowing or Explicit conversion:

		double d = 199999.99;
		int di = (int) d;
		System.out.println(di); // Output: 199999 // double to float --> Narrowing or Explicit conversion

		float fl = 22222222.22f;
		int fli = (int) fl;
		System.out.println(fli); // Output: 199999 // double to float --> Narrowing or Explicit conversion

		int in = 115;
		char inc = (char) in;
		System.out.println(inc); // Output: s // int to char --> Narrowing or Explicit conversion

		char cc = 'N';
		byte cb = (byte) cc;
		System.out.println(cb); // Output: 78 // char to byte --> Narrowing or Explicit conversion

		short st = 198;
		byte bt = (byte) st; // byte range = --128 to 127 --> = -256
		System.out.println(bt); // 198-256= -58 // short to byte --> Narrowing or Explicit conversion

		float ft = -2000.0f;
		byte ftb = (byte) ft; // (-2000+256+256+256----)
		System.out.println(ftb); // 48 --> to convert to byte, it will keep on adding with 256

		int inn = 385;
		byte binn = (byte) inn;
		System.out.println(binn); // Output: -127 // 385-256 = 129 (out of range) --> 129-256 = -127

		char cr = ':';
		byte crb = (byte) cr;
		System.out.println(crb); // 58

//		float flt = 125000.00f;
//		long fltl = (long)flt;
//		System.out.println(fltl); // Output: 125000 // float to long --> Narrowing or Explicit conversion

	}

}
