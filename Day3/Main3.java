package com.te.assignmentday3;

import java.util.Scanner;

public class Main3 //Write a program to read an int array of odd length, compare the first, middle and the last elements in the array and return the largest. If there is only one element in the array return the same element.
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int x = scanner.nextInt();
		int[] y = new int [x];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<y.length;i++)
		{
			y[i]= scanner.nextInt();
		}
		int z=UserMainCode3.checkLargestAmongCorner(y);
		scanner.close();
		System.out.println("Largest among fisrt last and Middle elements array is : "+ z);
	}
}
