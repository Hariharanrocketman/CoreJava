package com.te.assignmentsday4;

import java.util.Scanner;

public class Main3 //Given an integer array, Write a program to find if the array has any triplets. A triplet is a value if it appears 3 consecutive times in the array.
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the sixe of the array: ");
		int f=sc.nextInt();
		int[] arr=new int[f];
		System.out.println("Enter the array elemnts: ");
		for(int i=0;i<f;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array consist of Tripplets: "+UserMainCode3.checkTripplets(arr));
		
		

	}

}
