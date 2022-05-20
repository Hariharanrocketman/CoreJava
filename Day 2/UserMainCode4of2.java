package com.te.assignmentsday2;

public class UserMainCode4of2 // Write a program that accepts a positive number as input and calculates the sum of squares of individual digits of the given number.
{
	static int getSumOfSquaresOfDigits(int n)
	{
		int sum=0;
		while(n>0) 
		{
			int digit=n%10;
			sum=sum+digit*digit;
			n=n/10;			
		}
		return sum;
	}
}
