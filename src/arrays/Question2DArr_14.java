package arrays;

public class Question2DArr_14 {

	public static void main(String[] args) {
		// Write a program that prints the total number of elements that are negative
		// AND odd
		int[][] a1 = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int z = 0;
		for (int[] x : a1) {

			for (int y : x) {

				if (y < 0 & y % 2 != 0) {

					y = z;

				}

			}
		}

		System.out.println(a1[z].length - 1);

	}

}
