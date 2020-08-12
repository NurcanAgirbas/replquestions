package arrays;

public class Question2DArr_11 {

	public static void main(String[] args) {
	//Write a program that prints the highest value in the array.


		int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
		int largest=a[0][0];
		for(int i=0;i<a.length;i++) {
		for(int x=0;x<a[i].length;x++) {
			if(a[i][x]>largest) {
				largest=a[i][x];
			}
		}
		}System.out.println(largest);
	}

}
