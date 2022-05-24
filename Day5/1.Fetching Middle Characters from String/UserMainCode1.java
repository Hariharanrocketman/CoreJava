package com.te.assignmentday5;

public class UserMainCode1 
{
	public static String getMiddleChar(String str)
	{
		String s="";
		char s1=str.charAt((str.length()/2)-1);
		char s2=str.charAt(str.length()/2);
		 s=s+s1+s2;
		//System.out.println(s);
		return s;
	}
}
