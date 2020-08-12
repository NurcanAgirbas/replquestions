package methods;

public class Question12 {

	public static void main(String[] args) {
//		 Write a method header on line two with the following specs:
//			 Returns: a String
//			 Method Name: makeCapital
//			 Parameters: a String named "name"
//			 You should not be writing code on any line other than #2

		Question12 obj=new Question12();
		System.out.println(obj.makeCapital("nurcan"));
	}

	String makeCapital(String name) {
		return name.toUpperCase();
	}
}
