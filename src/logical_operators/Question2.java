package logical_operators;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
//		Create a program that prompt user with question:  Do you need a loan?
//If the result is true then prompt user with question: What is your credit score? Otherwise eligibility = "Unknown"
//		Based on the score define users eligibility 
//		if score is below  600 --> eligibility = "Not eligible"
//		if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//		if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//		if score is higher than any other previous values --> eligibility = "Definitely eligible" .   
//
//		The output of the program should be: "The eligibility is ____"
   
		
		boolean loan= true;
		  int cs;
		  String x= "Unknown";
		  String y="Not eligible";
		  String z="Maybe eligible";
		  String t= "Eligible";
		  String w= "Definitely eligible";
		  
		  Scanner scan= new Scanner(System.in);
		  
		  
		  
		  System.out.println("Do you need a loan? ");
		  
		  loan= scan.nextBoolean();
		  
		  
		  if (loan) {System.out.println ("What is your credit score");
		  
		  
		 cs=scan.nextInt();
		  
		    
		    if (cs<600) {System.out.println("The eligibility is "+y);}
		    
		    else if (cs>=600 && cs<700) {System.out.println("The eligibility is "+z);}
		    
		     else if (cs>=700 && cs<800) {System.out.println("The eligibility is "+t);}
		    
		     else if (cs>=800) {System.out.println("The eligibility is "+w);}
		    
	}	
	}
}




