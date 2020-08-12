package scannerClass;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
//		**** Must use the Scanner Class 
//		Write  a program that take user first name and Surname  and  print out  his /her  first name and then Surname.
//		First Condition: "Please Enter First Name" should print first with input
//		Second Condition:"Please Enter Surname" should print second with input
//		Final Output: First Name+ Surname on one line on output. Make sure there is a space between First Name and Surname.
 
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter First Name");
		String firstName;
		firstName=scan.nextLine();
		System.out.println("Please enter Surname");
		String surName=scan.nextLine();
		
		System.out.println(firstName+ " " + surName);
	}

}
