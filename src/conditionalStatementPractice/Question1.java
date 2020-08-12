package conditionalStatementPractice;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
// IMPORTANT: You must use a Scanner class for this conditional statement
//Input variable in console using 121.
//Find out if a number is Even or ODD
//Please display "Even" if number is even
//and "Odd" if the number is an odd number
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		
		if(num%2==0) {
			System.out.println("This number is even");
		}else if(num%2!=0){
			System.out.println("This number is odd");
		}else {
			System.out.println("Please enter a number");
		}

	}

}
