package com.te.packagename;

public class UserMainCode2 
{
	static int sumOfSquaresOfEvenDigits(int n)
	{ 
		int rem=0,sq=0,sum=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				sq=rem*rem;
			}
			sum=sum+sq;
			n=n/10;
			sq=0;
		}
		return sum;
	}
}
	
