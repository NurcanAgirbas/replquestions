package methods;

public class Question14 {

	public static void main(String[] args) {
//		 Write a method header on line two with the following specs:
//			 Returns: a double
//			 Name: negate
//			 Parameters: a double called "num"
//
//			 Then, starting on line 4, write the code that will return the opposite value of num (if it's positive, make it negative, otherwise make it positive)
//
//			 Examples:
//			 4 ==> -4
//			 -10 ==> 10
//			 1 ==> -1
	Question14 obj=new Question14();
	System.out.println(obj.negate(4));
	System.out.println(obj.negate(-8));
		
	}
	double negate(double num) {
		return -num;
	}

}
