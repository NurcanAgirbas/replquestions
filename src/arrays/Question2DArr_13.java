package arrays;

public class Question2DArr_13 {

	public static void main(String[] args) {
//		Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.
//
//		For example, the if we run rowSums for the following 2D array:
//		{
//		  {1,1,2}, //sum = 4
//		  {3,1,2}, //sum = 6
//		  {3,5,3}, //sum = 11
//		  {0,1,2}  //sum = 3
//		}
//
//
//		Then we should get the following array back:
//		4
//		6
//		11
//		3
		int a[][] = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 }, // sum = 3
		};

		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < a.length - 1; i++) {

			sum = sum + a[0][i];
			sum1 = sum1 + a[1][i];
			sum2 = sum2 + a[2][i];
			sum3 = sum3 + a[3][i];
		}

		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
