package stringMethods;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 * Note: Create a main Method and Scanner class
		 * 
		 * Given a String banana do the following: Print out the following:
		 * "The first 3 letters of ___ is ___"
		 * 
		 * For example, if the input is "banana", your output should be
		 * "The first 3 letters of banana is ban"
		 
		 */
		String new1;
		Scanner scan=new Scanner(System.in);
		new1=scan.nextLine();
		
		String a=new1.substring(0,2);
		System.out.println("The first 3 letters of " + new1+ "is "+a);
		
		}



	}


