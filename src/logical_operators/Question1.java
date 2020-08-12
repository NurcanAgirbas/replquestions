package logical_operators;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
//		Prompt user with question: "Is it weekend?"
//  	if it is not a weekend --> subject="Manual testing"
//		Otherwise --> subject="Java"
//	    Output of the program should be: "Today you will be learning ____"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekend=true;
         weekend=scan.nextBoolean();
		String str1="Manual Testing";
		String str2="Java";
		
		if(weekend) {
				System.out.println("Today you will be learning " + str2);
		}else {
			System.out.println("Today you will be learning " + str1);
		}
		
		

	}
	}

