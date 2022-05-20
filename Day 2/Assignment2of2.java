package com.te.assignmentsday2;

import java.util.Scanner;

public class Assignment2of2 //Write a program to read an integer n, generate fibonacci series and calculate the sum of first n numbers in the series. Print the sum.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int n = sc.nextInt();
		int sum= UserMainCode2of2.getSumOfNfibos(n);
		System.out.println("Sum of those n number of fibonacci series is "+sum);
	}

}
