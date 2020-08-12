package scannerClass;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
//	Write a program to take user name, age and mobile number in single line.
//	First Output: "Enter your name"
//	Second Output: "Enter your mobile number"
//	Third Output: "Enter your age"
//	Final Output: "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"
//Note: this final output is an example must use a variable for Weqas for name, 70 as a variable, and mobile number as a Variable when you use scanner must be able to input these values
//
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println("Enter your mobile number");
		int mob=scan.nextInt();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		System.out.println("Your name is " +name+ " ," + " your age is " + age+ " and your number is " + mob);
	}

}
