package com.te.assignmentsday2;

import java.util.Scanner;

public class Assignment4of2 //Write a program that accepts a positive number as input and calculates the sum of squares of individual digits of the given number.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int n = sc.nextInt();
		int sum= UserMainCode4of2.getSumOfSquaresOfDigits(n);
		System.out.println("Sum of squares of individual digits of the given number is "+sum);
	}

}
