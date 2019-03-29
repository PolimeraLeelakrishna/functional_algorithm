package com.bridgeit.Algorithm_Programs;

import com.bridgeit.utility.Utility;

public class dayofweek 
{
	public static void main(String[] args) 
	{
		System.out.print("enter month number:");
		int m=Utility.getInt();               
		System.out.print("enter day number:");
		int d=Utility.getInt();
		System.out.print("enter year:");
		int y=Utility.getInt();
		Utility.day(m, y, d);  // day function calling from static utility class .
		
}
}
