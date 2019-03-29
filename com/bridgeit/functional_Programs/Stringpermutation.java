package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class Stringpermutation 
{
    public static void main(String[] args) 
    { 
    	System.out.println("Enter string");
        String str = Utility.getString();
        String permute=" ";
        Utility.Permutation(str, permute); 
    }
	
}