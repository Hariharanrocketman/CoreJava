package com.te.assignmentday5;

import java.util.Scanner;

public class Main3 
{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String ");
		String string=sc.next();
		System.out.println("Enter an Integer ");
		int abc=sc.nextInt();
		System.out.println("The New String is  : "+UserMainCode3.formNewWord(string, abc));
	}

}
