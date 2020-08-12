package arrays;

public class Question2DArr_10 {

	public static void main(String[] args) {
		// Write a program to sum the elements in the third row.

		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 2, 2 }, { 1, 2, 3, 4 } };
		int sum=0;
		for(int i=0;i<a.length+1;i++) {
			sum=sum+a[2][i];
		}
		System.out.println(sum);
	}

}
