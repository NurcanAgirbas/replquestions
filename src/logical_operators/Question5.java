package logical_operators;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
//		Take 2 boolean inputs from a user:
//			"Are you thirsty?"
//			"Are you sleepy?"
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//			The output should be:   "Looks like you need ___ "
    
		Scanner scan=new Scanner(System.in) ;
			System.out.println("Are you thirsty?");
			boolean bl=scan.nextBoolean();
			System.out.println("Are you sleepy?");
			boolean sl=scan.nextBoolean();
		 String drink1 ="Coffee";
		 String drink2="Water";
		 String drink3="Tea";
		 String k="Nothing";
		 if(bl==true && sl==false) {
			 System.out.println("Looks like you need " + drink2);
		 }else if(bl==true && sl==true) {
			 System.out.println("Looks like you need " +drink1);
		 }else if(bl==false && sl==true) {
			 System.out.println("Looks like you need "+ drink3);
		 }else {
			 System.out.println("Looks like you need " +k);
		 }
		}
	}


