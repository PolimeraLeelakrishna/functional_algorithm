package com.bridgeit.Algorithm_Programs;

import com.bridgeit.utility.Utility;

public class temparatureconversion 
{
	public static void main(String[] args)
	{
		
		System.out.println("enter number to convert celsius to fahrenheit");
		int cel=Utility.getInt();
		Utility.celsiustofahre(cel);
		System.out.println("enter number to convert fahrenheit to celsius");
		int fah=Utility.getInt();
		Utility.fahrentocelsius(fah);
	}
}


