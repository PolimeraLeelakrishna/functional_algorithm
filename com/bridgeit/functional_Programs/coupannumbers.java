package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;


public class coupannumbers 
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter number");
		int number=Utility.getInt();
        int count=Utility.collect(number);
		System.out.println(count);
	}
}
