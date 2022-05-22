package com.te.assignmentday3;


public class UserMainCode3 //Write a program to read an int array of odd length, compare the first, middle and the last elements in the array and return the largest. If there is only one element in the array return the same element.
{
	static int checkLargestAmongCorner(int[] a)
	{
		if((a[0]>a[a.length/2])&&(a[0]>a[a.length-1]))
			{
				return a[0];
			}
		else if(a[a.length/2]>a[a.length-1])
			{
				return a[a.length/2];
			}
		else
			{
				return a[a.length-1];
			}
	}
	
}
