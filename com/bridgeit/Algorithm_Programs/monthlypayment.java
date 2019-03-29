package com.bridgeit.Algorithm_Programs;

import com.bridgeit.utility.Utility;

public class monthlypayment 
{
  public static void main(String[] args) 
  {
	  System.out.println("enter princple loan");
	  int p=Utility.getInt();
	  System.out.println("enter year");
	  int y=Utility.getInt();
	  System.out.println("enter percentage of interst");
	  int r=Utility.getInt();
	  Utility.payment(p, y, r);
	}
}
