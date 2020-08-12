package arrays;

public class Question03 {

	public static void main(String[] args) {
//		Write a program that creates an array with the following
//  	values{s, a, y,  b, n, c, t,  d, a, e, x} and prints the values 
//		starting at index 0 and multiple of 2 using a for loop.
//
//		Hint: syntax

	char[] arr={'s', 'a', 'y', 'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
      for(int i=0; i<arr.length;i++) {
    	  if(i%2==0) {
    		  System.out.print(arr[i]+ "");
    	  }
      }
	}

}
