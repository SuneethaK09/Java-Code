package javasessionassignments;

public class DoWhileLoopAssignments {

	public static void main(String[] args) {

		// 1.Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console do-while loop

		char c = '0';
			do {
			System.out.println(c + "=" + (byte)c);
			c++;
		}	
			while (c<='9');
		
		System.out.println("-------------------------");
		
		char ch1 = 'A';
		
		do {
			System.out.println(ch1+"="+(byte)ch1);
			ch1++;
		}
			while(ch1<='Z');
		
				
		System.out.println("-------------------------");
		
		char ch2 = 'a';
		
		do {
			System.out.println(ch2+"="+(byte)ch2);
			ch2++;
		}
			while (ch2<='z');
			
		System.out.println("-------------------------");
		
		/* 2. WAP to print 10 to 1 using for, while and do-while loop    */
		 
		 byte reverse = 10;
		 
		 do {
			 System.out.println(reverse);
			 reverse--;
		 }
		 while(reverse>=1);
		 
		 System.out.println("----------------------");
		 
		
		/* 3. Write a program in Java to print all the multiplication of 5 from 1 to 100 using do-while loop          */
		
		 byte multiply = 1;
		 
		 do {
			 // System.out.println(multiply);
			 multiply++;
			 if(multiply%5==0) {
		 		System.out.println(multiply);
			 }
			}
		 		while(multiply<=100);
		
		 System.out.println("----------------------");
		 
		 /* 4. Print all odd and even numbers between 1 to 100    */
		 
		 byte nmbr = 1;
		 
		 do {
			 if(nmbr%2==0) {
				 System.out.println(nmbr+" = even");
			 }
			 else {
				 System.out.println(nmbr+ " = odd");
			 }
			 nmbr++;
			 }
		 		while(nmbr<=100);
	
		 System.out.println("----------------------");
		 
		 /* 5. Print the following series: 
			1.0 2.0 3.0  ...... 10.0  
			0 9 18 27 36 …99             */
	
		 float ft = 1f;
		 
		 do {
			 System.out.println(ft);
			 ft++;
		 }
		 	while(ft<=10);
		 
		 System.out.println("----------------------");
		 
		 byte nn = 1;
		 
		 do {
			 if(nn%9==0) {
				 System.out.println(nn);
			 }
			 nn++;
		 }
		
		 while(nn<=100);
		
		 System.out.println("----------------------");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
