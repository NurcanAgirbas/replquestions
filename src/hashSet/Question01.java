package hashSet;

import java.util.HashSet;

public class Question01 {

	public static void main(String[] args) {
//		Add values in the hash set  
//		Red
//		Pink
//		Yellow
//		White
//		Black
//		print the colors 
//		and get total number of colors available in the set
//		Output:
//		Original Hash Set: [Red, Pink, White, Yellow, Black]
//		Size of the Hash Set: 5
		
		HashSet<String>hashset=new HashSet<>();
		hashset.add("Red");
		hashset.add("Pink");
		hashset.add("Yellow");
		hashset.add("White");
		hashset.add("Black");
		System.out.println("Original Hash Set : " + hashset);
		System.out.println("Size of the Hash Set : " + hashset.size());
		
	}

}
