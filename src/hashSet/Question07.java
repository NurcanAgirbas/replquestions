package hashSet;

import java.util.HashSet;

public class Question07 {

	public static void main(String[] args) {
		 
//		Create a Set and print the values before deletion and after deletion 
//		Output:
//		My HashSet content:
//		[third, first, second]
//		Clearing HashSet:
//		Content After clear:
//		[]

		HashSet<String>hs=new HashSet<>();
		hs.add("third");
		hs.add("first");
		hs.add("second");
		System.out.println("My HashSet content : "+hs );
		System.out.println("Clearing HashSet : ");
	
		hs.clear();
		System.out.println("Content After clear: " + hs);
	}

}
