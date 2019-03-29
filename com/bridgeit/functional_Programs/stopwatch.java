package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class stopwatch 
{    static long starttime=0;
static long stoptime=0;
	
	public static void main(String[] args) 
	{
		System.out.println("enter 1 to start");
		Utility.getInt();
		 Utility.start(starttime);
		System.out.println("enter 2 to stop");
		Utility.getInt();
		Utility.stop(stoptime);
		Utility.ellapsetime(stoptime, starttime);
	}
		
	
}
