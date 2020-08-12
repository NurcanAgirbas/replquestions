package stringMethods;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
//		If language is Java
//		It should print the 
//		Java is a programming language.
//		If language is C
//		It should print the 
//		C is a procedural programming language
//		If language is C++
//		It should print the 
//		C++ is a middle-level programming language
//		If any other should print 
//		Doesn't match any programming language

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any programming language");
		String lang=scan.nextLine();
		
		switch(lang) {
		case "C":System.out.println("C is a procedural language");
		break;
		case "C++":System.out.println("C++ is a middle level programming language");
		break;
		default:System.out.println("Doesn't match any programming language");
		}
	}

}
