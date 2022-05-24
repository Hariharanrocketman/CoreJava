package com.te.assignmentsday4;

import java.util.Scanner;

public class Main5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the sixe of the array: ");
		int f=sc.nextInt();
		int[] arr=new int[f];
		System.out.println("Enter the array elemnts: ");
		for(int i=0;i<f;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array consist of [1,2,3]: "+UserMainCode5.searchSequence(arr));
	}
}
