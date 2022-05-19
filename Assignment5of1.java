package com.te.packagename;

import java.util.Scanner;

public class Assignment5of1 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		n=sc.nextInt();
		int s=UserMainCode5.countSeven(n);
		System.out.println("count of seven is "+s);
	}

}
