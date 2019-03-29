package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class replacestring 
{
	public static void main(String[] args) 
	{
		String st1,st2,st3,st4; //initializing strings.
		System.out.println("enter String");
		st1=Utility.getString();
		int len=st1.length();
		//length of the string should be minimum three characters.
		if(len>3)                              
		System.out.print("enter String what replace :");
		st2=Utility.getString();	
		System.out.print("enter String replace with :");
		st3=Utility.getString();
		//computation for replacing old string with new string.
		st4=st1.replace(st2, st3);
		System.out.println("string after replacing is :"+" "+st4 );
		}
}
