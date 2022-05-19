package com.te.packagename;

public class UserMainCode5 
{
	public static int countSeven(int n)
	{
		int rem, count=0;
		while(n>0)
		{
			rem=n%10;
			if(rem==7)
			{
				count++;
			}
			n=n/10;
		}
		return count;
	}
}
