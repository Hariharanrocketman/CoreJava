package com.te.packagename;

public class UserMainCode4 
{
	static int getUnique(int n)
	{
		int rem,rem1,nt1,nt2,count=0;
		nt1=n;
		nt2=n;
		
		while(nt1>0)
		{
			rem=nt1%10;
			while(nt2>0)
			{
				rem1=nt2%10;
		if(rem==rem1)
		{
			count++;
		}
		nt2=nt2/10;
		}
		nt1=nt1/10;
		}
		return count;
	}
}
