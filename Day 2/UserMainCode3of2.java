package com.te.assignmentsday2;

public class UserMainCode3of2 // Write a program to calculate the sum of all the non prime positive numbers less than or equal to the given number.
{
	static int addNumbers(int n)
	{
		int sum=1, i=2;
		for(;i<=n;i++)
		{
			int x=2;
			while(x<=i/2)
			{
				if(i%x==0)
				{
					break;
				}
				x++;
			}
			if(x<=i/2)
			{
				sum= sum+i;
			}
		}
		return sum;
	}
}
