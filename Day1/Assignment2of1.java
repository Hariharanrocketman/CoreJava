package com.te.packagename;

import java.util.Scanner;

public class Assignment2of1 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Positive number");
		n=sc.nextInt();
		int s=UserMainCode2.sumOfSquaresOfEvenDigits(n);
		System.out.println("SumOfSquaresOfEvenDigits is "+s);
	}

}
