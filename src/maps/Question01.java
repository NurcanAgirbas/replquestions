package maps;

import java.util.HashMap;

public class Question01 {

	public static void main(String[] args) {
//		Create HashMap with String and Integer and print the values directly 
//		Output
//	{FIVE=5, ONE=1, FOUR=4, TWO=2, THREE=3}

		HashMap<String,Integer>hMap=new HashMap<>();
		hMap.put("FIVE", 5);
		hMap.put("ONE",1);
		hMap.put("FOUR", 4);
		hMap.put("THREE", 3);
		System.out.println(hMap);
	}

}
