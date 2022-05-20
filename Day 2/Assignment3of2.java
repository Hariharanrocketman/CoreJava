package com.te.assignmentsday2;

import java.util.Scanner;

public class Assignment3of2 //Write a program to calculate the sum of all the non prime positive numbers less than or equal to the given number.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int n = sc.nextInt();
		int sum= UserMainCode3of2.addNumbers(n);
		System.out.println("Sum of all the non prime positive numbers less than or equal to the given number is  "+sum);
	}

}
