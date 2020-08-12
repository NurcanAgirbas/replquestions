package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Question03 {

	public static void main(String[] args) {
//		Create the HashSet with list of integers add the below numbers for the list
//		111
//		111
//		111
//		999
//		999
//		999
//		 and print the list using the using Enhanced for loop 
//		output
//		999
//		111
		
		HashSet<Integer>hs=new HashSet<>();
		hs.add(111);
		hs.add(111);
		hs.add(111);
		hs.add(999);
		hs.add(999);
		hs.add(999);
		for(Integer each:hs) {
			
		System.out.println(each);
			
		}

	}

}
