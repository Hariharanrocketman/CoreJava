package com.te.assignmentsday2;

import java.util.Scanner;

public class Assignments5of2 //Write a Program that accepts three integer values (a,b,c) and returns their sum. However, if one of the values is 13 then it does not count towards the sum and the next number also does not count. So for example, if b is 13, then both b and c do not count.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = UserMainCode5of2.getLuckySum(a,b,c);
		System.out.println("Sum of the three using logic is "+sum);
	}

}
