package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class  harmonicnumber
{
public static void main(String[] args)
{
	 
	 int number=0;
	 do
	 {
		 System.out.println("enter number");
		 number=Utility.getInt();
		 
	 }while(!Utility.validate(number));
	 Utility.compute(number);
	
}

}
