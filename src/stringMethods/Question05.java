package stringMethods;

public class Question05 {

	public static void main(String[] args) {
		/* 
		(the output should be one per line)

		Print out the position of the first occurrence of "c"
		Print out the position of the first occurrence of " "
		Print out the position of the first occurrence of the variable target1
		Print out the position of the first occurrence of the variable target2 */
		
		 String str = "abracadabra alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
		    
		    int index=str.indexOf("c");
		    System.out.println(index);
		    
		    int index1=str.indexOf(" ");
		    System.out.println(index1);
		    
		    int tar1=str.indexOf(target1);
		    System.out.println(tar1);
		    
		    int tar2=str.indexOf(target2);
		    System.out.println(tar2);

	}

}
