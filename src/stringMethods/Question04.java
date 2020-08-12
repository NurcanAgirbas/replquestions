package stringMethods;

public class Question04 {

	public static void main(String[] args) {
		/*
		Validate if the string ends with "u" prints the Boolean value accordingly
		Validate if the string ends with "world" prints the Boolean value accordingly
		Validate if the string ends with "are" prints the Boolean value accordingly
		Validate if the string ends with "you" prints the Boolean value accordingly */

		String s1="hello how are you"; 
		boolean value=s1.endsWith("u");
		System.out.println(value);
		
		boolean value1=s1.endsWith("world");
		System.out.println(value1);
		
		boolean value2=s1.endsWith("are");
		System.out.println(value2);
		
		boolean value3=s1.endsWith("you");
		System.out.println(value3);
		
	}

}
