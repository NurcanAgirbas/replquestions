package maps;

import java.util.HashMap;
import java.util.Map;

public class Question02 {

	public static void main(String[] args) {
//		Create HashMap with String and Integer.
//		Print only the key values by using the Enhanced for loop 
//		add values like ("ONE",1);
//		Output 		 
//		FIVE
//		ONE
//		FOUR
//		TWO
//		THREE
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("ONE", 1);
		hm.put("TWO", 2);
		hm.put("THREE", 3);
		hm.put("FOUR", 4);
		hm.put("FIVE", 5);
		for(Map.Entry<String, Integer>num:hm.entrySet()) {
			System.out.print(num.getKey()+" ");
		}
		
		
		
	}

}
