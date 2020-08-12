package scannerClass;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
//		******Must use the scanner class
//		Write a program that takes a user's name and prints it. 
//		Step 1:"Hello, please Enter user name" should read First in your output
//		Step 2:"your name is "+ any variable name should read Second in your output
//		Hint: you are not restricted for any name you can use any name
    
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello please enter a username");
		String name=scan.nextLine();
		System.out.println("your name is " + name);
	}

}
