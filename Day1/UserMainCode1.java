package com.te.packagename;

public class UserMainCode1
{
	static int checkSum(int n)
	{ 
		int rem,sum=0;
		while(n>0)
		{
		rem=n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
		n=n/10;
		} 
		return sum%2;
	}
}
