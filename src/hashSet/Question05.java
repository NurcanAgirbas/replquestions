package hashSet;

import java.util.HashSet;

public class Question05 {

	public static void main(String[] args) {
//		Converting a HashSet to an Array
//		Just add the values as
//		first
//		second
//		third
//		fourth 
//		fifth 
//		Output:
//		HashSet contains: [third, fifth, fourth, first, second] Array elements: third fifth fourth first second

		HashSet hs = new HashSet<>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fifth");
		System.out.print("HashSet contains: " + hs);
		String arr[]=new String[5];
		hs.toArray(arr);
		System.out.print("Array elements : " + " ");
		for(int i=0;i<hs.size();i++) {
			System.out.print( arr[i]+ " ");
		}
	}

}






