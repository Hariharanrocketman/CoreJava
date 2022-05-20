package com.te.assignmentsday2;

public class UserMainCode5of2
{
	static int getLuckySum(int a,int b, int c)
	{
		int sum=a+b+c;
		if(a==13)
		{
			sum=sum-a-b;
		}
		if(b==13)
		{
			sum=sum-b-c;
		}
		if(c==13)
		{
			sum=sum-c;
		}
		if(sum>0)
			return sum;
		else
			return 0;
	}
	
}
