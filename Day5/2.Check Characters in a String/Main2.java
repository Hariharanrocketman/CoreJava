package com.te.assignmentday5;

import java.util.Scanner;

public class Main2   //Write a program to read a string  and to test whether first and last character are same. The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid.
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String ");
		String string=sc.nextLine();
		int xyz = UserCodeMain2.checkCharacters(string);
		if(xyz==1)
		{
			System.out.println("Valid");
		}
		if(xyz==-1)
		{
			System.out.println("Invalid");
		}
	}
}
