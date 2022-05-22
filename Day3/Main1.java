package com.te.assignmentday3;

import java.util.Scanner;

public class Main1 // Given a method with an int array. Write code to find the power of each individual element accoding to its position index, add them up and return as output.
	{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number for x: ");
		int x= scanner.nextInt();
		int y = UserMainCode1.getSumOfPower(x);
		System.out.println("Sum of the power of the array elment is :"+y);
		scanner.close();
	}
}
