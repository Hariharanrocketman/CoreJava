package com.te.assignmentsday4;

import java.util.Arrays;

public class UserMainCode4 //Write a program to accept an int array as input, and calculate the median of the same.
{
	static int calculateMedian(int[] x) 
	{
		int y=0;
		Arrays.sort(x);
		if(x.length%2==0) 
		{
			y=x[x.length/2-1]+x[x.length/2];
			y=Math.round(y);
		}
		else
			y=x[x.length/2];
		return y;
	}
}
