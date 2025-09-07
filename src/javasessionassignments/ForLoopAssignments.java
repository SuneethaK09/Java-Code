package javasessionassignments;

public class ForLoopAssignments {

	public static void main(String[] args) {

		//1. Print A-Z, a-z, 0-9 with the respective ASCII numbers on the console using for loop
		
		char c = 'Z';
		for(char ch = 'A'; ch<=c; ch++) {
			System.out.println(ch + "=" + (byte)ch);
		}
		
		System.out.println("-------------------------");
		
		char c1 = 'a';
		for(char ch1 = c1; ch1<='z'; ch1++) {
			System.out.println(ch1+"="+(byte)ch1);
		}
		
		System.out.println("-------------------------");
		
		char c2 = '0';
		for (char ch2 = c2; ch2<='9'; ch2++) {
			System.out.println(ch2+"="+(byte)ch2);
		}
		
		System.out.println("-------------------------");
		
		/* 2. WAP to print following output:
				I am Batman﻿
				I am Batman﻿
				I am Batman﻿
				I am Batman﻿
				I am Batman    */
		
		String s = "I am Batman";
		 for(int count=1; count<=5; count++) {
			 System.out.println(s);
			  if (count==5) {
				 break;
			 }
		 }
		
		 System.out.println("-------------------------");
		  
		/* 3. WAP to print following output:
			I am Batman 1
			I am Batman 2
			I am Batman 3
			I am Batman 4
			I am Batman 5
			I am Batman 6
			I am Batman 7
			I am Batman 8
			I am Batman 9 */
		 
		 String s2 = "I am Batman";
		 byte b = 9;
				 
			 for(byte num=1; num<=b; num++) {
				 System.out.println(s2+" "+num);
				 }
		 
			 System.out.println("-----------------------");
		 
		 /* 4. WAP to print 10 to 1 using for, while and do-while loop    */
		
			 byte revnum = 10;
			 
			 for(byte nm=revnum; nm>=1; nm--) {
				 System.out.println(nm);
			 }
			 
			 System.out.println("------------------------");
			 
			 
		/* 5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using for loop    */ 
			 
			 byte mul = 100;
			 for(byte no=1; no<=mul; no++ ) {
				 if(no%5==0) {
					 System.out.println(no);
				}
				 
			 }
			 
			 System.out.println("------------------------");
			 
			 /* 6. Print all odd and even numbers between 1 to 100    */
			 
			 byte num = 100;
			 for(byte number=1; number<=num; number++) {
				 if(number%2==0) {
					 System.out.println(number+": "+"even number");
					 }
				 else {
					 System.out.println(number+": "+"odd number");
				 }
			 }
			 
			 System.out.println("------------------------");
			 
			 for (byte no=1;;no++) {
				 if(no%2==0) {
					 System.out.println(no+" -> even no.");
				 }
				 else {
					 System.out.println(no+" -> odd no.");
				 }
				 if(no==num) {
					break; 
				 }
			 }
			 
			 
			 System.out.println("------------------------");
			 
			 /* 7. Print the following series: 
					1.0 2.0 3.0  ...... 10.0  
					0 9 18 27 36 …99             */
			 
			 for(float f=1; f<=10; f++) {
				 System.out.println(f);
			 }
			 
			 System.out.println("------------------------");
			 
			 byte table = 100;
			 for(byte tbl=1; tbl<=table; tbl++) {
				 if(tbl%9==0) {
					 System.out.println(tbl);
				 }
			 }
			 
			 System.out.println("------------------------");
			 
			 /* 8. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘. */
			 
			 
			 for(char alpha='a'; alpha<='z'; alpha++) {
					if(alpha =='a') {
						System.out.println(alpha);
					 }
					if(alpha =='e') {
						System.out.println(alpha);
					 }
					if(alpha =='i') {
						System.out.println(alpha);
					 }
					if(alpha =='o') {
						System.out.println(alpha);
					 }
					if(alpha =='u') {
						System.out.println(alpha);
					 }
					
//					if(alpha =='u' | alpha =='o' | alpha =='i' | alpha =='e' | alpha =='a') {
//						System.out.println(alpha);
//					 }
			 }
			 
			 System.out.println("------------------------");
			 
			 
			 /* 9. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow" */
			 
			 byte numbers = 10;
			 for(byte ns=1; ns<=numbers; ns++) {
				System.out.println(ns);
				 if (ns%7==0) {
					 System.out.println("bye, see you tomorrow");
					break;
				}
			 }
			 
			 
		
	}

}
