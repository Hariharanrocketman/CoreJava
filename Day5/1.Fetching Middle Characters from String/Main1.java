package com.te.assignmentday5;

import java.util.Scanner;

public class Main1  //1.	Fetching Middle Characters from String of even lenght
{
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) 
		{
			System.out.println("Enter a String ");
			String string=sc.next();
			System.out.println("Middle char in the string : "+UserMainCode1.getMiddleChar(string));
		}

}
