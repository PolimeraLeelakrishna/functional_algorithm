package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class quadraticequation 
{
	public static void main(String[] args) 
	{
		double root1 = 0,root2 = 0;
		System.out.println("enter the coefficients");
		int a=Utility.getInt();
		int b=Utility.getInt();
		int c=Utility.getInt();
		Utility.quadratic(a, b, c, root1, root2);
		}
}
