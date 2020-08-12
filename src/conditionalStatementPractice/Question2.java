package conditionalStatementPractice;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
//		 The variable "name" holds a String user input 
//
//		 Write a conditional statement starting on line 9 that does the following:
//		 If name is equal to "Chen", print "teacher"
//		 For any other input, print "student"
//
//		 Examples:
//		 In: Chen
//		 teacher
//		 In: Faa
//		 student
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a name");	
	String name=scan.nextLine();
		if(name.equals("Chen")) {
			System.out.println("teacher");
			
		}else {
			System.out.println("student");
		}
		
		
		
		

	}

}
