package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class gambler 
{
	public static void main(String[] args) 
	{
		
		int stake,goal,number;
		
		System.out.println("enter stake");
		  stake=Utility.getInt();
		System.out.println("enter goal");
		 goal=Utility.getInt();
		System.out.println("enter number of trails");
		 number=Utility.getInt();
		 Utility.numberofwins(number, stake, goal);
	}
	
}
