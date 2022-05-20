package com.te.assignmentsday2;

public class UserMainCode2of2 //Write a program to read an integer n, generate fibonacci series and calculate the sum of first n numbers in the series. Print the sum.
{
	static int getSumOfNfibos(int n)
	{
		int sum=0, fib1=0, fib2=1, fib3=fib1+fib2;
		while(n>0)
			{
				sum=sum+fib1;
				fib1=fib2;
				fib2=fib3;
				fib3=fib1+fib2;
				n--;
			}
		return sum;
	}
}
