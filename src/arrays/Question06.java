package arrays;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
//		Write a program that creates an array of integers of size 11.
//		Add the years 2010 to 2020 to your array one by one using a for-loop and then print all those values
//		Hint: 
//		2010
//		2011
//		2012
//		2013
//		2014
//		2015
//		2016
//		2017
//		2018
//		2019
//		2020

		Scanner scan=new Scanner(System.in);
		int[] years=new int[11];
		for(int y=0;y<years.length;y++) {
		years[y]=y+2010;	
		System.out.println(years[y]);
		}
	}

}
