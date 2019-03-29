package com.bridgeit.Algorithm_Programs;



import com.bridgeit.utility.Utility;

public class Anagram 
{     static char[] arr,arr1,ch1,ch2;
	public static void main(String[] args) 
	{
		System.out.println("enter 1st string");
		String s1=Utility.getString();
		 arr=s1.toCharArray();          // convert strings into array 
		System.out.println("enter 2nd string");
		String s2=Utility.getString();
		 arr1=s2.toCharArray();
		int len=s1.length()-1;
		int leng=s2.length()-1; 
		ch1=Utility.sort(s1, leng, arr);   // sort the elements in array 
		ch2=Utility.sort1(s2, leng, arr1); // by sor
		Utility.checkAnagram(len, leng, arr, arr1); //this is check the lengths and compare given strings.
	}
	
	
}

