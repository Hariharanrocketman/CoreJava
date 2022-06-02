package com.te.assignmentday9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserMainCode4 {

	static List<String> obtainDestination(Map<String,String> map,String input)
	{
		List<String> list=new ArrayList<String>();
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=map.get(key);
			if(value.equals(input))
			{
				list.add(key);
			}
		}	
		return list;
	}
}
