package methods;

public class Question17 {

	public static void main(String[] args) {
//		Write a method header on line two with the following specs:  
//			Returns: a String
//			Method Name: makeThreeSubstr
//			Parameters:
//			a String called "word"
//			an integer called "startIndex"
//			an integer called "endIndex"
//			Then, starting on line 4, write code that will return 3x the substring (no spaces) from "startIndex" to "endIndex"
//			Examples:
//			makeThreeSubstr("hello",0,2) ==> "hehehe"
//			makeThreeSubstr("shenanigans",3,7) ==> "naninaninani"
		
		Question17 obj=new Question17();
		System.out.println(obj.makeThreeSubstr("nurcan", 3, 6));
		
	}
		String makeThreeSubstr(String word,int startIndex ,int endIndex) {
			String word1=null;
			for(int i=0;i<2;i++) {
	 word1=word.substring(startIndex,endIndex);
	 System.out.println(word1);
		}return word1;

	}

}
