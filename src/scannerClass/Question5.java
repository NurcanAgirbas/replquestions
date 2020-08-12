package scannerClass;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
//		*******Create a Scanner class
//		Create a program that will take a  boolean value from a user make the variable isTrue. if the input is TRUE or FALSE then output should read.
//		First Output: "Input the boolean value"
//	        Final Output: "The value is ______" 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("input the boolean value");
		boolean isTrue=scan.nextBoolean();
		
		System.out.println("The value is " +isTrue);
	}

}
