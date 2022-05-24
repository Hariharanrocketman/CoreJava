package com.te.assignmentsday4;

public class UserMainCode5 
{
	static boolean searchSequence(int a[])
	{
		boolean b=false;
		for (int i = 0; i < a.length-2; i++)
		{
			if( (a[i]==1) && (a[i+1]==2) && (a[i+2]==3) )
			{
				b=true;
			}
		}
		return b;
	}
}
