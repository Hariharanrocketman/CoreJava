package com.te.assignmentday9;

import java.util.HashMap;

public class UserMainCode5 {

	public static HashMap<String, String> getStateId(String [] id)
	{
		HashMap<String, String> map= new HashMap<String, String>();
		for (int i = 0; i < id.length; i++) 
		{
			map.put(id[i].toUpperCase().substring(0, 3),id[i]);
		}
		return map;
	}
}
