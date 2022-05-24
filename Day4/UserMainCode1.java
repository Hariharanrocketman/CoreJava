package com.te.assignmentsday4;

public class UserMainCode1 
{
	public static int[] removeTens(int[] a)
	{
		int b[]=new int[a.length];
		int j=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%10!=0)
			{
				b[j]=a[i];
				j++;
			}
		}
		return b;
	}
}
