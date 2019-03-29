package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class euclideanDistance 
{
	public static void main(String[] args) 
	{
		System.out.println("enter 1st point number");
		int number1=Utility.getInt();
		System.out.println("enter 2nd point number");
		int number2=Utility.getInt();
	   double euclidian=Utility.distance(number1, number2);
	   System.out.println(euclidian);
	}
		

}
