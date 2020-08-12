package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question06 {

	public static void main(String[] args) {
//		Create set of string values 
//		Please add the below values and see the result 	 
//		add("India"); 
//		add("Australia"); 
//		add("South Africa"); 
//		add("India");
//		add("America");
//		add("America");
//		Output:
//		[America, Australia, India, South Africa]
		
		Set<String>st=new TreeSet<>();
		st.add("India");
		st.add("Australia");
		st.add("South Africa");
		st.add("India");
		st.add("Ammerica");
		st.add("America");
		System.out.println(st);

	}

}
