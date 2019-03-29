package com.bridgeit.Algorithm_Programs;

import com.bridgeit.utility.Utility;

public class vendingmechine 
{
	static int note=0;
public static void main(String[] args) 
{
	System.out.println("enter amount");
	int amount=Utility.getInt();
	vendingmechine.notes(amount);
	System.out.println("total number of notes are:"+" "+note);
	
}
public static void notes(int amount)
{
	if(amount ==0)
	{
		return;        // if amount is zero there is no money in vendor machine.
	}
	//calculating thousand  notes
	if(amount>=1000)
	{
		note=note+((int)amount/1000);        //adding the number of notes to the note.
		int thousand=((int)amount/1000);
		System.out.println("number of 1000 notes are:"+" "+thousand);
		if(amount/1000==0)
		{
			return;    //if money divided with 1000 equal to zero no amount is returned.
		}
		else
		{
			amount=amount%1000;      //remaining amount reinitialize to amount.
		}
	}
	//calculating five hundred  notes
		if(amount>=500)   
		{
			note=note+((int)amount/500);         //adding the number of notes to the note.
			int fivehun=((int)amount/500);
			System.out.println("number of 500 notes are:"+" "+fivehun);
			if(amount/500==0)
			{
				return;    
			}
			else
			{
				amount=amount%500;       //remaining amount reinitialize to amount.
			}
		}
		//calculate 100 notes
		if(amount>=100)
		{
			note=note+((int)amount/100);         //adding the number of notes to the note.
			int hun=((int)amount/100);
			System.out.println("number of 100 notes are:"+" "+hun);
			if(amount/100==0)
			{
				return;
			}
			else
			{
				amount=amount%100;     //remaining amount reinitialize to amount.
			}
		}
		//calculate 50 notes
		if(amount>=50)
		{
			note=note+((int)amount/50);  //adding the number of notes to the note.
			int fifty=((int)amount/50);
			System.out.println("number of 50 notes are:"+" "+fifty);
			if(amount/50==0)
			{
				return;
			}
			else
			{
				amount=amount%50;
			}
		}
		//calculate 10  notes
		if(amount>=10)
		{
			note=note+((int)amount/10);    //adding the number of notes to the note.
			int ten=((int)amount/10);
			System.out.println("number of 10 notes are:"+" "+ten);
			if(amount/10==0)
			{
				return;
			}
			else
			{
				amount=amount%10;      //remaining amount reinitialize to amount.
			}
		}
		//calculate 5  notes
		if(amount>=5)
		{
			note=note+((int)amount/5);   //adding the number of notes to the note.
			int five=((int)amount/5);
			System.out.println("number of 5 notes are:"+" "+five);
			if(amount/5==0)
			{
				return;
			}
			else
			{
				amount=amount%5;        //remaining amount reinitialize to amount.
			}
		}
		//calculate 2  notes
		if(amount>=2)
		{
			note=note+((int)amount/2);       //adding the number of notes to the note.
			int two=((int)amount/2);
			System.out.println("number of 2 notes are:"+" "+two);
			if(amount/2==0)
			{
				return;
			}
			else
			{
				amount=amount%2;          //remaining amount reinitialize to amount.
			}
		}
		//calculate 1  notes
		if(amount>=1)
		{
			note=note+((int)amount/1);        //adding the number of notes to the note.
			int one=((int)amount/1);
			System.out.println("number of 1 notes are:"+" "+one);
			if(amount/1==0)
			{
				return;
			}
			else
			{
				amount=amount%1;         //remaining amount reinitialize to amount.
			}
		}
}
}
