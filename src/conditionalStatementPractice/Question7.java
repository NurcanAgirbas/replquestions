package conditionalStatementPractice;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
//	Write a program that shows if you input a number it will display a month associated to it and if you input a number out of bounds of (12) it will display invalid. Display the months
//	to to be displayed on my output.
//	Hint: Add a main method, also import a Scanner Class and use the scanner for int.
//	1 will display January
//	2 will display February
//	3 will display March
//	4 will display April
//	5 will display May
//	6 will display June
//	7 will display July
//	8 will display August
//	9 will display September
//	10 will display October
//	11 will display November
//	12 will display December
//	ANY INPUT outside of 12 should display in output "Invalid"
   
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		if(num==1) {
			System.out.println("January");
		}else if(num==2) {
				System.out.println("February");
		}else if(num==3) {
				System.out.println("March");
		}	else	if(num==4) {
					System.out.println("April");
		}else if(num==5) {
					System.out.println("May");
		}else if(num==6) {
					System.out.println("June");
				
		}else if(num==7) {
					System.out.println("July");
		}else if(num==8) {
					System.out.println("August");
		}else if(num==9) {
					System.out.println("September");
		}else if(num==10) {
					System.out.println("October");
		}else if(num==11) {
					System.out.println("November");
		}else if(num==12) {
					System.out.println("December");
				}else {
					System.out.println("Invalid");
				}
				}
				
				
				
				
				
					
				}
				
			
		
	


