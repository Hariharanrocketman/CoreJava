package com.te.assignmentday9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the no of objects to Store");
		int size=scan.nextInt();
		scan.nextLine();
		Map<String,String> map=new HashMap<String, String>();
		System.out.println("Enter the Map objects");
		for (int i = 0; i < size; i++) 
		{
			map.put(scan.next(), scan.next());
		}
		System.out.println("Enter the input");
		String input=scan.next();
		String str=UserMainCode2.getCapital(map,input);
		System.out.println(str);
	}
}
