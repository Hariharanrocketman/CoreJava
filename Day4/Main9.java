package com.te.assignmentsday4;

import java.util.Scanner;

public class Main9 
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
		System.out.println("The sum of even in the array or odd(-1): "+UserMainCode9.sumElements(arr));
	}
}
