package com.te.assignmentsday2;

public class UserMainCode1of2 //1.	Palindrome - In Range
{
	static int addPalindromes(int a, int b)
	{
		int sum=0;
		for(int i=a; i<=b; i++)
		{
			int reverse=0;
			int tempi=i;
			while(tempi>0)
				{
					int x=tempi%10;
					reverse = reverse*10 + x;
					tempi= tempi/10;					
				}
			if(i==reverse)
				{
					sum= sum+reverse;
				}
		}
		return sum;
	}
}
