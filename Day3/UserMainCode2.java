package com.te.assignmentday3;

import java.util.Arrays;

import java.util.Scanner;

public class UserMainCode2 //2.	Difference between largest and smallest elements in an array
{
	static int getBigDiff(int x) 
	{
		int[] z= new int[x];
		System.out.println("Enter x number of Array elements: ");
		Scanner scanner= new Scanner(System.in);
		int i=0;
				for(; i<z.length; i++)
				{
					z[i]=scanner.nextInt();
				}
		scanner.close();
		i--;
		int diff=0;
		if(i==0)
			return z[i];
		else if(i>0) {
			Arrays.sort(z);
			diff= z[i]-z[0];
		}
		return diff;		
	}
}
