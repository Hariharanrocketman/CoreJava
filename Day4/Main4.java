package com.te.assignmentsday4;

import java.util.Scanner;

public class Main4 //Write a program to accept an int array as input, and calculate the median of the same.
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of the Array : ");
		int size=sc.nextInt();
		int[] x=new int[size];
		System.out.println("Enter the Elements of the Array : ");
		for(int i=0;i<size;i++) {
			x[i]=sc.nextInt();
		}
		System.out.println("the median of the array elemnt is : "+UserMainCode4.calculateMedian(x));
		
		

	}

}
