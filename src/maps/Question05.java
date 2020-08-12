package maps;

import java.util.HashMap;
import java.util.Map;

public class Question05 {

	public static void main(String[] args) {

//		How do you replace a value associated with a given key in the HashMap?
//
//		add the follow values
//		map.put("ONE","AAA");
//		map.put("TWO","BBB");
//		map.put("THREE","CCC");
//		map.put("FOUR","DDD");
//		map.put("FIVE","EEE");
//		print the key and values pairs
//
//		replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//		PRINT THE VALUES AFTER REPLACING

		Map<String, String> map = new HashMap<>();

		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");

		System.out.println("HashMap Before Replace :");

		for (String list : map.keySet()) {

			System.out.println(list + " : " + map.get(list));

		}

		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");

		System.out.println("------------------");

		System.out.println("HashMap After Replace :");

		for (String list : map.keySet()) {

			System.out.println(list + " : " + map.get(list));

		}

	}

}
