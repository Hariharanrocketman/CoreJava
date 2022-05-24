package com.te.assignmentsday4;

import java.util.Scanner;

public class Main1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter the elements of array ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		b=UserMainCode1.removeTens(a);
		System.out.println("tens removed array");
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		sc.close();
	}

}
