package conditionalStatementPractice;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
//	IMPORTANT: Must use a Scanner class//
//	Write a java program that prints out true if ( x * y ) return a positive value. Else prints out false if  (x * y) return a negative value. 
// Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number"-for the 2nd number
// Step 2: Create the if condition to check the X and Y value validation for the sign value
// Step 3: If it is positive value user would get True if it negative value user would get false

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int x=scan.nextInt();
		System.out.println("Please enter second number");
		int y=scan.nextInt();

         if(x*y>0) {
        	 System.out.println("True");
         }else {
        	 System.out.println("false");
         }
		
	}

}
