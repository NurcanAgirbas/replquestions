package stringMethods;

public class Question06 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * (all output should be one per line)
		 * 
		 * Output 1: print str starting at index 5 and going to the end 
		 * Output 2: print str starting at index 7 and ending at index 10
		 * Output 3: print "harambe" this
		 * must not be a new string must be from str Output 4: print "t f" this must not
		 * be a new string must be from str on one line
		 */
		 String str = "laptops out for harambe";
	     
		 String out=str.substring(5);
		 System.out.println(out);
		 
		 String out1=str.substring(7,10);
		 System.out.println(out1);
		 
		 String out2=str.substring(3);
		 System.out.println(str);
		 
		

	}

}
