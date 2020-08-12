package methods;

public class Question16 {

	public static void main(String[] args) {
//		Write a method header on line two with the following specs:
//			Returns: a boolean
//			Method Name: bothEven
//			Parameters:
//			an integer called "num1"
//			an integer called "num2"
//			Then, starting on line 4, write code that will return true if both num1 and num2 are even.  Return false otherwise.
//			Examples:
//			bothEven(4,6) ==> true
//			bothEven(3,4) ==> false
//			bothEven(-1,1) ==> false	
	Question16 obj=new Question16();
	System.out.println(obj.bothEven(2, 5));
	System.out.println(obj.bothEven(4, 6));

	}
	
	boolean bothEven(int num1,int num2) {
		if(num1%2==0 && num2%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
