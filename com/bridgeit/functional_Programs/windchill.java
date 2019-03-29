package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class windchill 
{
	public static void main(String[] args) 
	{
		System.out.println("give temparatre");
		double  t=Utility.getDouble();
		double  fahrenheit=t*(9/5)+32;
		System.out.println("give speed in km/hr");
		double v=Utility.getDouble();
		double kmpermiles=v/1.6;
	    double w=35.74+0.6215*kmpermiles+(0.4275*kmpermiles-35.75)*Math.pow(fahrenheit, 0.16);
		System.out.println("temparature in fahreheit="+" "+fahrenheit);
		System.out.println("wind speed in km/miles ="+" "+kmpermiles);
		System.out.println("wind chill="+" "+w );
	}

}

