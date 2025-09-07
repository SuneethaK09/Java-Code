package javasessionspractice;

public class DataTypes {

	public static void main(String[] args) {

	// 1. Write a program to add two strings:
		
		String a = "Hello";
		String b = "Suneetha K";
		System.out.println(a+b); // Output: HelloSuneetha K
		
		
	// 2. Write a Java program to print the sum of two numbers
		
		byte c = 74;
		byte d = 36;
		System.out.println(c+d); // Output: 110
		
	// 3. Write a Java program to print the division of two numbers
		
		byte e = 50/3;
		System.out.println(e); // Output: 16
		
	/* 4. Write a Java program to compute the specified expressions and print the output. Go to the editor.
			Test Data:
			((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5)) */
		
		float f = 25.5f;
		float f1 = 3.5f;
		float f2 = 40.5f;
		float f3 = 4.5f;
		float F = (f*f1 - f1*f1);
		float F0 = (f2-f3);
		System.out.println(F); // 77.0
		System.out.println(F0); // 36.0
		System.out.println(F/F0); // Output: 2.1388888
		
	// 5. Try to concat "Hello Selenium" with a character 't'
		
		String g = "Hello Selenium";
		char h = 't';
		System.out.println(g+h); // Output: Hello Seleniumt
		  //without declaring the variables
		System.out.println("Hello Selenium" + 't'); // Output: Hello Seleniumt
		
	/* 6. Create three int variables having values like : 100, 200, 3400. 
	  Add them and concatenate and generate this output String : "Your Total  amount is: 3700" */
		
		int i1 = 100;
		int i2 = 200;
		int i3 = 3400;
		int Total = i1+i2+i3; // 3700
		System.out.println("Your Total amount is: " + Total); // Output: Your Total amount is: 3700
		
	
	// 7. Print the ASCII value of the character 'h'
		char j = 'h';
		System.out.println((byte)j); // Type casting --> 104
		System.out.println(j+0); // ASCII addition --> 104+0 = 104
		
		
	//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character
		char k = 'd';
		System.out.println(k+3);  //Arithmetic addition --> 100+3=103
		
	//9. Write a program to find the square of the number 3.9
		float l = 3.9f;
		System.out.println((l*l)); // 3.9*3.9 = 15.210001
		
		
		
		
		
		
		
		
		

	}

}
