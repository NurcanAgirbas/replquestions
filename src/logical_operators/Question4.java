package logical_operators;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
//		Prompt user to: "Please enter your birthday month number"
//			if user enters 12, 1, 2 --> season="Winter"
//			if user enters 3, 4, 5--> season="Spring"
//			if user enters 6, 7, 8 --> season="Summer"
//			if user enters 9, 10, 11--> season="Fall"
//			if any other number--> "Please enter valid month number" and season="Unknown"
//			The output of the program should be : "You were born in __ 
         
	int num;
	
	String x="Winter";
	String y="Spring";
	String z="Summer";
	String k="Fall";
	String w="Unkown";
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your birthday month number");
	num=scan.nextInt();
	
	if(num==12 || num==1 || num==2) {
		System.out.println("You were born in " +x);
		}else if(num==3 || num==4 || num==5) {
			System.out.println("You were born in " +y);
		}else if(num==6 || num==7 || num==8) {
			System.out.println("You were born in " +z);
		}else if(num==9 || num==10 || num==11) {
			System.out.println("You were born in " +k);
		}else {
			System.out.println("Please enter valid number ");
			System.out.println("You were born in " +w);
		}
	}

}
