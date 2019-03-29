package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class leapyear 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the year : ");
		int year=Utility.getInt();
		Utility.isleapyear(year);
	}		
}
