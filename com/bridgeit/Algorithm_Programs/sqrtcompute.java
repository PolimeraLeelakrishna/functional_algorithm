package com.bridgeit.Algorithm_Programs;

import com.bridgeit.utility.Utility;

public class sqrtcompute
{
	public static void main(String[] args) 
	{
		 System.out.println("enter number");
		 double c=Utility.getDouble();
		 double eplision=1e-15;
		 double t=c;
		 Utility.sqrt(c, eplision, t);
		 }
}
