package conditionalStatementPractice;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
//		Write a program to take values of length and width from user and check if it the shape of the object is square or rectangle. 
//		Examples:
//        Please enter the length 18
//		Please enter the width 16
//		The shape of your object is rectangle
//
//		Please enter the length 16 
//		Please enter the width 16 
//		The shape of your object is square
      
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the length");
		int length=scan.nextInt();
		System.out.println("Please enter the width");
		int width=scan.nextInt();
	
		if(length>width) {
			System.out.println("The shape of your object is rectangle");
		}else if(length==width) {
			System.out.println("The shape of your object is square");
		
		}
	}

}
