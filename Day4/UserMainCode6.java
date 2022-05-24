package com.te.assignmentsday4;

public class UserMainCode6
{
 static boolean getPerfection(int x) {
	 int sum=0;
	 for(int i=1 ; i<=x ; i++)
	 {
		 if(x%i==0) 
		 {
			 if(i>x/2)
				 break;
			 else
				 sum=sum+i;	 
		 }	 
	 }
	if(sum==x)
	 return true;
	else
		return false;
	
 }
}
