package methods;

public class Question18 {

	public static void main(String[] args) {
//		 Write a method header on line two with the following specs:  
//  Returns: a String
// Method Name: mixString
// Parameters:
// a String called s1
//	 a String called s2
//Then, starting on line 4, write code that will return the strings combined, one letter at a time, starting with s1.
//See example below for an example.  You can assume that s1 and s2 are equal lengths:
//			 s1 ==> "12345"
//			 s2 ==> "abcde"
//			 mixString(s1,s2) ==> "1a2b3c4d5e"
		  
		 System.out.println ( mixString("12345","abcde")); //should be 1a2b3c4d5e
			System.out.println (mixString("howdy","hello")); //should be hhoewldlyo
		
	}
	static String mixString(String s1,String s2) {
		char str1=' ';
		char str2=' ';
		String mix="";
		for(int i=0;i<s1.length();i++) {
			str1=s1.charAt(i);
			str2=s2.charAt(i);
			mix=mix+str1+str2;
		}return mix;
	}

}
