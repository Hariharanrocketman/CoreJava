package com.te.assignmentday3;

import java.util.Scanner;

public class Main2 //2.	Difference between largest and smallest elements in an array
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number for the size of the array : ");
		int x = scanner.nextInt();
		int y = UserMainCode2.getBigDiff(x);
		System.out.println("The Difference between largest and smallest elements in an array is : "+y);
		scanner.close();
	}

}
