package arrays;

public class Question2DArr_12 {

	public static void main(String[] args) {
//		Write a program that checks if a 2-D integer array is a square array, meaning, if its rows and columns are equal.
//		Hint:
//		int[][] a = {				
//		{1,1,1},
//		{1,1,1},
//		{1,1,1}
//				};
//     should be true
//				
//		int[][] b = {
//  	{1,1,1,1},
//		{1,1,1,1},
//		{1,1,1,1}
//				};
//		//should be false
		int[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b = j;
			}
		}
			if (a.length == a[b].length) {

				System.out.println("true");

			} else {

				System.out.println("false");

			}
		}
	}


