package com.te.assignmentsday4;

import java.util.Scanner;

public class Main6 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a positive Integer: ");
		int f=sc.nextInt();
		System.out.println("The Integer is an Perfect number : "+ UserMainCode6.getPerfection(f));
	}
}