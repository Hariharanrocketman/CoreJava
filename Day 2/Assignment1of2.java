package com.te.assignmentsday2;

import java.util.Scanner;

public class Assignment1of2 //1.	Palindrome - In Range
{
	public static void main(String[] args)
	{
		int lower;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers :");
		lower = sc.nextInt();
		int higher = sc.nextInt();
		int sum = UserMainCode1of2.addPalindromes(lower, higher);
		System.out.println("Sum of Palindrome is "+sum);
	}

}
