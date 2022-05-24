package com.te.assignmentsday4;

public class UserMainCode3 
{
	static boolean checkTripplets(int a[])
	{
		boolean b=false;
		for (int i = 0; i < a.length-2; i++)
		{
			if((a[i]==a[i+1])&&(a[i+1])==a[i+2])
			{
				b=true;
			}
		}
		return b;
	}
}
