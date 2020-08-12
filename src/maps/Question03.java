package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Question03 {

	public static void main(String[] args) {
//		Add the following values to the Map
//		map.put("Shiva",222);
//		map.put("Sandish",333);
//		map.put("Asel",555);
//		map.put("Sumair",666);
//
//		Print all keys using iterator
		
		Map<String,Integer>map=new HashMap<>();
		map.put("Shiva", 222);
		map.put("Sandish", 333);
		map.put("Asel",555);
		map.put("Sumair", 666);
		
		Iterator<Map.Entry<String, Integer>> newMap= map.entrySet().iterator();
		while(newMap.hasNext()) {
			Map.Entry<String, Integer>entry=newMap.next();
			System.out.println(entry.getKey());
		}
	}

}
