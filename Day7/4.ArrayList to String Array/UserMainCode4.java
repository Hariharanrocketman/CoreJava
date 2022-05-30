package com.te.assignmentday7;

import java.util.List;

public class UserMainCode4 {
		
	public static String[] convertToStringArray(List<String> list)
	{
		Object[] obj=list.toArray();
		String [] str= new String[obj.length];
		for (int i = 0; i < str.length; i++) {
			str[i]=obj[i].toString();
		}
		return str;
	}

}
