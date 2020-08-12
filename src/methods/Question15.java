package methods;

public class Question15 {

	public static void main(String[] args) {
//		 Write a method header on line two with the following specs:  
//			 Returns: a char
//			 Method Name: getChar
//			 Parameters:
//			 a String called "word"
//			 an integer called "index"
//			 Then, starting on line 4, write code that will return the character in "word" at the index "index"
//			 Examples:
//			 getChar("hello",1) ==> 'e'

		Question15 obj=new Question15();
		System.out.println(obj.getChar("hello", 1));

	}

	char getChar(String word,int index) {
		
		char str;
		return str=word.charAt(index);
	}
}
