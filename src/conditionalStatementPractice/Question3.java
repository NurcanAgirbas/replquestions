package conditionalStatementPractice;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
//		The variable "num" holds an integer user input
//		 Write a conditional statement starting on line 9 that does the following:
//		If num is positive, print "__ is positive"
//		If num is negative, print "__ is negative"
//		Examples:
//		In: 5
//		5 is positive
//		In: -2
//		-2 is negative
//		In: 0
//		(no output for zero) 
    
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if(num>0) {
			System.out.println(num + " is positive");
	
		} if(num<0) {
			System.out.println(num + " is negative");
		}else {
			System.out.println("No output for zero");
		}
			
	}

}
