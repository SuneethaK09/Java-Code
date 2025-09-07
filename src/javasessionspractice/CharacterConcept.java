package javasessionspractice;

public class CharacterConcept {

	public static void main(String[] args) {

		/*
		 * ASCII: characters: value: universal Unicode : 16000 : ASCII table
		 * 
		 * a-z: 97 to 122 A-Z: 65 to 90 0-9: 48 to 57
		 * 
		 * ""+anything ---> concatenate num+num --> addition char + char --> addition
		 * (char to ASCII number conversion) char +"" --> concatenate ""+"" -->
		 * concatenate
		 */

		char ch = 'a';
		char bh = 'b';

		System.out.println(ch + bh); // 97+98=195

		System.out.println(ch); // a

		System.out.println(ch - bh); // 97-98=-1

		System.out.println(ch / 2); // 97/2= 48

		System.out.println('a' + 'A'); // 97+65=162

		System.out.println('$' + 'a'); // 36+97=133

		System.out.println(' ' + 1); // 32+1=33

		System.out.println("hello" + "world" + ch + bh); // helloworldab
		System.out.println("hello" + "world" + (ch + bh)); // helloworld195

		char th = ' ';
		System.out.println(th + 0);// 32+0=32

		char yh = 'a';// 97
		// Type casting: converting from the value from char to other Numerical data
		// types (such as byte,int,short,lpng)
		System.out.println((byte) yh); // 97
		// System.out.println((short)yh); // 97
		// System.out.println((int)yh); // 97

		System.out.println((char) 97 + (char) 98); // 'a'+'b'=97+98=195
		System.out.println('a' + " " + 'b');// a b

		System.out.println((char) 0); // Output: nothing

		int k = 'a';
		System.out.println(k); // 97

		float f1 = 'b';
		System.out.println(f1); // 98.0

	}

}
