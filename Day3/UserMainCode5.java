package com.te.assignmentday3;

public class UserMainCode5 
{
	public static int commonElements(int []a,int []b)
	{
		int r=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					r+=a[i];
					break;
				}
			}
		}
		return r;
	}
}
