package com.te.assignmentday9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {

		static Scanner scan=new Scanner(System.in);
		public static void main(String[] args)
		{
			System.out.println("Enter the no of objects to Store");
			int size=scan.nextInt();
			Map<Integer,String> map=new HashMap<Integer, String>();
			System.out.println("Enter the Map objects");
			for (int i = 0; i < size; i++) 
			{
				map.put(scan.nextInt(), scan.nextLine());
			}
			String str=UserMainCode1.getMaxkeyValue(map);
			System.out.println(str);
		}

}
