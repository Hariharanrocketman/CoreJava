package com.te.assignmentday3;

import java.util.Scanner;

public class UserMainCode1 // Given a method with an int array. Write code to find the power of each individual element accoding to its position index, add them up and return as output.
{
	static int getSumOfPower(int x)
	{
		int[] z= new int[x];
		System.out.println("Enter x number of Array elements: ");
		Scanner sc= new Scanner(System.in);
				for(int i=0; i<z.length; i++)
				{
					z[i]=sc.nextInt();
				}
		sc.close();
		int sum=0, temp=0;
				for(int j=0; j<z.length; j++) 
				{
					temp=(int) Math.pow(z[j],j);
					sum=sum+temp;
				}
				return sum;
	}
}
