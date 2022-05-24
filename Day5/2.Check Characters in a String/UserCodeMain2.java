package com.te.assignmentday5;

public class UserCodeMain2
{
	static int checkCharacters(String str) 
	{
		//System.out.println(str.length());
		if (str.charAt(0) == str.charAt(str.length()-1)) 
		{
			return 1;
		}
		else
			return -1;
	}
}
