package com.bridgeit.functional_Programs;

import com.bridgeit.utility.Utility;

public class sumofthreeintegers 
{
	public static void main(String[] args)
	{
		System.out.println("enter number of values given");
		int num=Utility.getInt();
		int[] arr=new int[num];
		int len=arr.length;
		System.out.println("enter numbers for array");
		for(int i=0;i<=len;i++)
		{
			arr[i]=Utility.getInt();
		}
		Utility.triplets( arr, len);
	}
}
	
			
		
		
	


