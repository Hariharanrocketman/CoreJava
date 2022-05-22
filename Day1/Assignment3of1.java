package com.te.packagename;

import java.util.Scanner;

public class Assignment3of1 
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		n=sc.nextInt();
		int s=UserMainCode3.reverseNumber(n);
		System.out.println("Reversed number is "+s);

	}

}
