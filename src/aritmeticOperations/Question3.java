package aritmeticOperations;

public class Question3 {

	public static void main(String[] args) {
//		Create a class Main, and create a main method.
//		Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
//		Your program should say. “The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __”

		int width=5;
		int height=8;
		int perimeter=width+width+height+height;
		int area=width*height;
		System.out.println("The perimeter of a rectangle with width " +width+ " and height " +height+ " is equal to " +perimeter+
				" and the area equals to " + area);
	}

}
