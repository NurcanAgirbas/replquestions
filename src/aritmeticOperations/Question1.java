package aritmeticOperations;

public class Question1 {

	public static void main(String[] args) {
//		Create a class Main, and create a main method.
//		Create a float data type variable name is ed, and the value should be 8.2.
//
//		Multiply the value by itself. and print the result
//
//		Your output should be as following:
//		�The multiplication of ___ times itself is equal to ___�
		
		float ed=8.2f;
		double mult=ed*ed;
		 mult = Math.round(mult*100.0)/100.0;
		System.out.println("The multiplication of " +ed+ " times itself is equal to " + mult);
		

	}

}
