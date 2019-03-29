package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class headsandtails 
{
	
	public static void main(String[] args) 
	{
		int number=0;        //declaration
		
		do
		{
	        
			System.out.println("enter number to flip the coin");
			number=Utility.getInt();
		}while(!Utility.validation(number));
		double pt=Utility.pecentageoftails(number);
		double ph=100-pt;
		System.out.println("pecentage of tails"+" "+pt);
		System.out.println("percentage of heads"+" "+ph);
		
		
	}
	

}
