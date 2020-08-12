package maps;

import java.util.HashMap;

public class Question04 {

	public static void main(String[] args) {
//		How do you remove a key-value pair from a HashMap if and only if the specified key 
//		is currently mapped to given value?
//		Another version of remove() method which takes two arguments – one is key and another one is value,
//		 removes the mapping for the specified key only if it is currently mapped to given value.
//		add the follow values
//		map.put("ONE","AAA");
//		map.put("TWO","BBB");
//		map.put("THREE","CCC");
//		map.put("FOUR","DDD");
//		map.put("FIVE","EEE");
//		print the key and values pairs
//		remove
//		"ONE","AAA"
//		"FOUR","DDD"
//		PRINT THE VALUES

		HashMap<String, String>map=new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		
  System.out.println("HashMap Before Remove :");
          
          for(String key : map.keySet()){
            
        System.out.println(key+ " : "+ map.get(key));
            
          }

        System.out.println("------------------");
        
        System.out.println("HashMap After Remove :");
    
    map.remove("ONE","AAA");
    map.remove("FOUR","DDD");
    
    for(String nmap: map.keySet()){
      System.out.println(nmap+ " : "+ map.get(nmap));
      
    }
    
		 
	}

}
