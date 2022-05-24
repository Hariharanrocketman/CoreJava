package com.te.assignmentday5;

import java.util.Scanner;

public class Main4 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a String ");
		String string=sc.nextLine();
		String x = UserMainCode4.removeEvenVowels(string);
		System.out.println("Vowel removed String is: "+x);
	}
}
