package stringMethods;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
////		 	For you to do:
//			If browser is ChRoME
//			It should print the 
//			Proceed with chrome Browser
//			If browser is FireFOX
//			It should print the 
//			Proceed with firefox Browser
//			If browser is Ie
//			It should print the 
//			Proceed with ie Browser
//			If any other browser 
//			It should print the  
//			Invalid Browser
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the browser name to proceed with execution");
		String browser=scan.nextLine();
		String browser1=browser.toLowerCase();
		
		switch(browser1) {
		
		case "chrome":System.out.println("Proceed with chrome Browser");
		break;
		case "firefox":System.out.println("Proceed with firefox browser");
		break;
		case "Ie":System.out.println("Proceed with ie browser");
		break;
		default:System.out.println("Invalid Browser");
		}


	}

}
