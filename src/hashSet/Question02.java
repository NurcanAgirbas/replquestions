package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Question02 {

	public static void main(String[] args) {
//		Write program  to iterate the values (use Iterator) through HashSet
//		Add the values as
//		first
//		second
//		third
//		fourth 
//		fifth 
//		Output:
//		first
//		second
//		third
//		fourth
//		fifth
//		Does HashSet contains first element? true
		
		HashSet<String>hs=new HashSet<>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		
		Iterator<String>it=hs.iterator();
		while(it.hasNext()) {
		Object obj=it.next();
			System.out.println(obj+ " ");
			
		}
		System.out.println("Does HashSet contains first element? "  + hs.contains("first"));
		
	}

	
	}


