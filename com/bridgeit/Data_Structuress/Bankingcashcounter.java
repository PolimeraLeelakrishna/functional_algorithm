package com.bridgeit.Data_Structuress;

import com.bridgeit.DS.Utility.Que;

import com.bridgeit.utility.Utility;

public class Bankingcashcounter 
{      static String check =" ";
      static int count=0;
      
	public static void main(String[] args) 
      {
		 int deposit=0;
		 int balance=0;
		 // creating que object
		 Que que=new Que();
		 do
		 {
			 System.out.println("welcome to banking cash counter");
			 System.out.println("enter 1 to diposit cash ");
			 System.out.println("enter 2 to withdraw the cash");
			 System.out.println(" enter number 3 to know the how many peoples are in que");
			 System.out.println("enter 4 to exist ");
			 int number=Utility.getInt();
			 switch(number)    // make choice which process we want.
			 {
			 case 1: System.out.println("enter amount how much deposit");
			           deposit=Utility.getInt();
			           if(deposit>0)  // if deposit greater than zero than only enter.
			           {
			        	 que.Enqueue(deposit);      // entering into que
			        	 System.out.println("you deposited"+deposit+"in bank");
			        	 balance=balance+deposit;  // sum balance with deposit
			        	 System.out.println("your account balance is"+" "+balance);
			           }
			           else
			           {
			        	   System.out.println("enter valid amount");
			        	   break;
			           }break;
			 case 2: System.out.println("enter amount that you want to withdraw");
			          int withdraw=Utility.getInt();
			           if(withdraw>0)
			           { 
			        	   if(withdraw<=deposit)
			        	   {
			        	   que.Dequeue();  // take maney from que.
			        	   balance=balance-withdraw; // remaining balance after withdraw.
			        	   System.out.println("your account balance is"+" "+balance);
			           }
			        	   else
			        	   {
			        		   System.out.println("insufficiant balance");
			        	   }
			 }
			           else
			           {
			        	   System.out.println("enter valid amount");
			        	   break;
			           }break;
			 case 3: count=que.count();  // count number of people enter into que
			          //count++;
			 if(count>0)
			 {
				 System.out.println("number of people in que is"+" "+count);
		 }
			 else
			 {
				 System.out.println("que is empty");
				 break;
			 }break;
			 case 4: System.out.println("exist");
			         System.out.println("...<@ ^ @>...THANK YOU...<@ ^ @>..");
			         System.exit(0);break;    // for existing from bank
			 default:System.err.println("enter valid number");
			         break;
			 }
			         System.out.println("\n Do you want to continue? ");
			         check=Utility.getString();
						System.out.println("(Type yes if you want to continue Press 'yes' otherwise press any key to exit)");
						check=Utility.getString();
					} 
      while(check.compareToIgnoreCase("yes")==0); // looping is happen untill exit from que
}
}
		 
	

