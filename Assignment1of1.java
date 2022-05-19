package com.te.packagename;

import java.util.Scanner;

public class Assignment1of1 
{
	public static void main(String[] args)
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter Number to check");
	n=sc.nextInt();
	int s=UserMainCode1.checkSum(n);
		if(s==0)
		{
		System.out.println("Sum of odd digits is even");
		}
		else
		{
			System.out.println("Sum of odd digits is odd");
		}
		
	}
}
