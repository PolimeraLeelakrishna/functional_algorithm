package com.bridgeit.utility;

import java.util.Arrays;
import java.util.Scanner;

public class Utility 

{
	static Scanner sc=new Scanner(System.in);
	//for integer value
	public static int getInt()
	{
		int num=sc.nextInt(); 
		return num;
	
	}
	//for string value
	public static String getString()
	{	
		String s=sc.nextLine();
		return s;
	}
	//for boolean
	public static boolean getBoolean()
	
	{
		boolean b=sc.nextBoolean();
		return b;
	}
	//for float value
	public static float getFloat()
	{
		float f=sc.nextFloat();
		return f;
	}
	//for double value
	public static double getDouble()
	{
		double d=sc.nextDouble();
		return d;
	}
//***************************************************************************************
	                        //coupon number
	
	 public static int getcoupon(int number)
	 {
		int coupon=(int) (Math.random()*number);   // return a random coupon between 0 and n-1
		return coupon;
	  }
    // return number of cards you collect before obtaining one of each of the n types
	public static int collect(int number)
	{
		//if is collected is true the card type is already collected.
		boolean[] iscollected=new boolean[number];
		int count=0;                //number of cards collected.
		int distinct=0;             //number of distinct card type collected.
		while(distinct<number)
		{   
			int get=getcoupon(number);  //pick a random card.
			count++;                    //count number of cards collected.
			if(!iscollected[get])
			{
				 distinct++;              //discovered a new card type.
	             iscollected[get] = true;
			}
		}
		return count;
	}
  //***************************************************************************************
	                            // distance
	public static double distance(int number1 , int number2 )
	{
	int origin=(int) ((Math.pow(number1, 2)-0)+(Math.pow(number2, 2)-0));
	double distance=Math.sqrt(origin);
	return distance;
 }
	
//*****************************************************************************************
	                      //prime factors
	 public static void prime(int number)
	   {
		//looping for number of times 
		   for(int i=2;i<number;i++)
		   {
			  while(number%i==0)       // happen looping until get all prime factors
			  {
				  if(i>=2)         //except 1 checking prime factors.
				  {
					  System.out.println(" "+i);
				  }
				  number=number/i; 
			  }
				  
		   }	  
	     }
//*****************************************************************************************
	                         //gambler
	 public static void numberofwins(int number,int stake,int goal)
		{   int win=0;
		    int bets=0;
		    for(int i=0;i<=number;i++)
			{
				int cash=stake;     
				while(cash>0 && cash<goal) // looping is happen until cash less than zero and cash less than goal
				{
				bets++;           // every loop tells that how many bets.
				if(Math.random()<0.5) // random function gives random values.
				{
					cash++;    
				}
				else
				{
					cash--;
				}
			}
			
				if(cash==goal)
				{
					win++;
				}
			}
			double d=100*win/number;
			double d1=100-d;
			System.out.println("number of wins"+win);
			System.out.print("percentage of wins"+d);
			System.out.println("percentage of loose"+d1);
			System.out.println("number of bets"+bets);
	}
//  **************************************************************************************
	             //Harmonic number  
	 
	 public static void compute(int number)
	 {
	 	double result=0;
	 	for(int i=1;i<=number;i++)
	 	{
	 		result=result+1.0/i;        // equation for calculating harmonic number. 
	 		System.out.println(result+" ");
	 	}
	 }
	 public static boolean validate(int number)  // checking given number is valid or not
	 {
	 	if(number<=0)
	 	{
	 		return false;
	 	}return true;
	 }

//**************************************************************************************
	                   //percentage of heads and tails
	 public static double pecentageoftails(int number)
		{
			int tail=0;
			for(int i=0;i<=number;i++)
			{
				if(Math.random()<0.5)    //random function it gives random values from 0 to 1.
				{
					tail++;
				}
			}
			double d=100*tail/number;
			return d;
			}
		public static boolean validation(int number) //function for validation whether given number is possitive or negetive. 
		{
			if(number>0)
			{
				return true;
			}return false;
		}
//*****************************************************************************************
		              //leap year
		public static void isleapyear(int year)
		{
		if(year>999)
		{
			if(year%4==0 && year%100!=0 || year%400==0)
			{
				System.out.println(+year+" "+"is leap year");
			}
			else
			{
				System.out.println(year+" "+"year is not leap year");
			}
		}
		else
		{
			System.out.println("give 4 digit number");
		}
			
	}
//****************************************************************************************
		                 //power of two and check leap year
		
		 public static void pow(int number)
	      {
	       if(number<31)
		    {
		      int result=0;
		
			for(int i=0;i<=number;i++)
			{
				 result=(int) Math.pow(2,i);
			}
			if(result>999)
			{
			 
			 if((result % 4 == 0) && (result % 100 != 0) || (result % 400 == 0))
			    	
		    {
		    	System.out.println(result+" "+" "+"is leap year");
		    	
		    }
		}
		    	else
		    	{
		    		System.out.println(result+" ");
		    	}
			
		}
	else
	{
		 System.out.println("number is  over flow");
	}
	      }
//****************************************************************************************
		                    //quadratic equation
		 public static void quadratic( int a,int b,int c, double root1,double root2)
			{
				
				double dtmnt=Math.pow(b, 2)-4*a*c;
				if(dtmnt>0)
				{
					root1=(int)(-b + Math.sqrt(dtmnt))/(2*a);
					root2=(int)(-b - Math.sqrt(dtmnt))/(2*a);
					       System.out.println("the roots are"+" "+root1+","+root2);
				}
					else if (dtmnt==0)
					{
						root1=root2=(int)-b/(2*a);
						System.out.println("roots are"+root1);
						
					}
					else
					{
						double real=(int)(-b + Math.sqrt(dtmnt))/(2*a);
						double imaginary=(int)(-a - Math.sqrt(dtmnt))/(2*a);
						System.out.println("the real and imaginary parts are"+" "+real+"  i"+imaginary+","+real+"  i"+imaginary);
				}	
			}

//********************************************************************************************
		                    //stop watch
		 public static void start(long starttime)
			{
				 starttime=System.currentTimeMillis();
				 System.out.println(starttime);
			}
			public static void stop(long stoptime)
			{
				 stoptime=System.currentTimeMillis();
				 System.out.println(stoptime);
			}
			public static void ellapsetime(long stoptime ,long starttime)
			{
				 double ellapse=(stoptime-starttime)/1000.0;
				 System.out.println("ellapse time is" +ellapse);
				 
           }
//********************************************************************************************
			         //find triplets
			
			public static void triplets(int[] arr,int len )
			{
				int count=0;
				for(int i=0;i<len-2;i++)
				{
					for(int j=i+1;j<len-1;j++)
					{
						for(int k=j+1;k<len;k++)
						{
							if(arr[i]+arr[j]+arr[k]==0)
							{
								System.out.print("triplets are"+" "+arr[i]+" "+arr[j]+" "+arr[k]);
								count++;
							}
						}
					}
				}
					if(count==0)
				    {
					System.out.println("given array there is no triplets");
				  } 
				      System.out.println("number of triplets"+" "+count);
					}
//********************************************************************************************
			public static void Permutation(String str, String permute) 
			{ 
				if (str.length() == 0) 
				{
					System.out.println(permute + " "); 
			    } 
			    for (int i = 0; i < str.length(); i++) 
			    { 
			              //convert string to array.
			    	char ch = str.charAt(i); 
			             // Rest of the string after excluding  
			        String ros = str.substring(0,i)+str.substring(i + 1);  
			                // recursive function.
			        Permutation(ros,permute + ch); 
			    } 
			} 
//*********************************************************************************************
			             //two D array
			public static void twodArray()
		    {
		    	System.out.println("ente 1 for integer values");
		    	System.out.println("enter 2 for double values");
		    	System.out.println("enter 3 for boolean vlaues");
		    	int choice=Utility.getInt(); 
		    	switch(choice)     
		    	{
		    	case 1: System.out.print("enter number of rows:");
		    	        int rows=Utility.getInt();
		    	        System.out.print("enter number of coloumns :");
		    	        int coloumns=Utility.getInt();
		    	        int[][] arr=new int[rows][coloumns];  // for giving values to array
		    	        int length=arr.length;
		    	        for(int i=0;i<length;i++)
		    	        {
		    	        	for(int j=0;j<length;j++)
		    	        	{
		    	        	   arr[i][j]= Utility.getInt();
		    	        	}
		    	        }
		    	        for(int i=0;i<length;i++)
		    	        {
		    	        	for(int j=0;j<length;j++)
		    	        	{
		    	        		System.out.print(arr[i][j]+" ");
		    	        	}
		    	        	System.out.println();
		    	}
		    	   break;
		    	case 2: System.out.print("enter number of rows:");
		        int rowd=Utility.getInt();
		        System.out.print("enter number of coloumns :");
		        int coloumnd=Utility.getInt();
		        double[][] arrd=new double[rowd][coloumnd];
		        int lengthd=arrd.length;
		        for(int i=0;i<lengthd;i++)
		        {
		        	for(int j=0;j<lengthd;j++)
		        	{
		        	   arrd[i][j]= Utility.getInt();  // giving values to array
		        	}
		        }
		        for(int i=0;i<lengthd;i++)
		        {
		        	for(int j=0;j<lengthd;j++)
		        	{
		        		System.out.print(arrd[i][j]+" ");  // printing the given values in  two d array
		        	}
		        	System.out.println( );
		}
		        
		        break;
		    	case 3: System.out.print("enter number of rows:");
		        int rowb=Utility.getInt();
		        System.out.print("enter number of coloumns :");
		        int coloumnb=Utility.getInt();
		        boolean[][] arrb=new boolean[rowb][coloumnb];   
		        int lengthb=arrb.length;
		        for(int i=0;i<lengthb;i++)
		        {
		        	for(int j=0;j<lengthb;j++)
		        	{
		        	   arrb[i][j]= Utility.getBoolean();     // giving values to array
		        	}
		        }
		        for(int i=0;i<lengthb;i++)
		        {
		        	for(int j=0;j<lengthb;j++)
		        	{
		        		System.out.print(arrb[i][j]+" ");  // printing the given values in  two d array
		        	}
		        	System.out.println( ); 
		}
		        System.out.println();
		        break;
		    }
		}
			
//********************************************************************************************
	                     //anagram
	
	public static char[] sort(String s1 ,int len,char[] arr) // function for sorting first string
	{
		for(int i=0;i<len;i++)                    
		{
			for(int j=i+1;j<=len;j++)      
			{ 
				char temp=0;
				if(arr[j]<arr[i])
				{
					temp=arr[i];               
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static char[] sort1(String s2 ,int leng,char[] arr1)  // function for sorting 2nd string
	{    
		char temp=0;
	for(int i=0;i<leng;i++)
	{
		for(int j=i+1;j<=leng;j++)
		{ 
			
			if(arr1[j]<arr1[i])
			{
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			}
		}
	}return arr1;
}
	public static void checkAnagram(int len,int leng,char[] ch1,char[] ch2)
	{
		if(len==leng)
		{
			if(Arrays.equals(ch1,ch2))       //comparing two given strings after sorting 
			{
				System.out.println("Given strings are anagram");
			}
			else
			{
				System.out.println("given Strings are not anagram");
			}
		}
		else
		{
			System.out.println("lengths are not matching");
		}
		
	}

//****************************************************************************************
                      //prime numbers
	
public static void primenumber(int number)
{      
       int i=0;
	for( i=1;i<=number;i++)
	{
		int count=0;
	 for(int j=2;j<=i/2;j++)   // one number is divided with multiple numbers 
	 {
		 if(i%j==0)      // if number is divided with any number that is not prime number
		 {
			 count++;    // count increasing 
			 break;
			
		 }
	 }		 if(count==0)
		 {
			System.out.println(i+" ");
	}
}
}

//*****************************************************************************************
                              // bubble sort
     
public static void bbsort(int[] arr1,int len)
{

	char temp=0; 
for(int i=0;i<len;i++)           
{
	for(int j=i+1;j<=len;j++)  // compare getting value with next values
	{ 
		if(arr1[j]<arr1[i])   // if previous value is less than present value swap two values
		{
			temp=(char) arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=temp;
		}
	}
	
}
for(int i=0;i<=len;i++)          // after sorting print the values
{
	System.out.print(arr1[i]+" ");
}

}

//***************************************************************************************************
                                    //insertion sort
public static void insertion(int[] arr,int len)
{
	  int i,j,temp;
	  for( i=0;i<=len;i++)
	  {
		  j=i;       
		  temp=arr[i]; // array value store in temp variable.
		  while(j>0 &&  temp <arr[j-1])
		  {
			  arr[j]=arr[j-1];   //swap the two variables
			  j=j-1; // declare j is j-1 for storing temp variable to j.
		  }
		  arr[j]=temp;
	  }
	  for(int k=0;k<=len;k++)               // after sorting
	  {
	  	System.out.print(arr[k]+" ");
	  }
}

//***********************************************************************************************
                                 //day of week

  public static void day(int m,int y,int d)
  {
switch(m)   // it works on month.
{
case 1: System.out.println("january");
break;
case 2: System.out.println("february");
break;
case 3: System.out.println("march");
break;
case 4: System.out.println("april");
break;
case 5: System.out.println("may");
break;
case 6: System.out.println("june");
break;
case 7: System.out.println("july");
break;
case 8: System.out.println("august");
break;
case 9: System.out.println("september");
break;
case 10: System.out.println("october");
break;
case 11:System.out.println("november");
break;
case 12: System.out.println("december");
break;
default: System.out.println("invalid month number");
break;
}
 int y1 = y - (14 - m) / 12;
    int x = y1 + y1/4 - y1/100 + y1/400;
    int k = m + 12 * ((14 - m) / 12) - 2;
    int dow = (d + x + (31*k)/12) % 7;
    switch(dow)
    {
    case 0:System.out.println("sunday");break;
    case 1:System.out.println("monday");break;
    case 2:System.out.println("tueday");break;
    case 3:System.out.println("wednesday");break;
    case 4:System.out.println("thursday");break;
    case 5:System.out.println("friday");break;
    case 6:System.out.println("saturday");break; 
    default:
    }
}

//*************************************************************************************************
                              //temperature conversion
public static void celsiustofahre(int cel)
{
	int temp=(cel*9/5)+32;  // convert temp from celsius to fahrenheit.
	System.out.println("temperature in fahrenheit :"+" "+temp);
	
}
public static void fahrentocelsius(int fah)
{
	int temp=(fah-32)*5/9;    // convert temp from celsius to fahrenheit.
	System.out.println("temperature in celsius"+" "+temp);
	}


//************************************************************************************************
                              //monthly payment
public static void payment(int p,int y,int r)
{

	double r1=r/12*100;     //intrest for 
	int monthsperyear=y*12;  
	double pay=p*r1/1-(Math.pow(1+r1 , (-monthsperyear)));
	System.out.println("payment is :"+" "+pay);
}


//*************************************************************************************************
                           //compute square root

public static void sqrt(double c,double eplision,double t )
{
	while (Math.abs(t - c/t) > eplision*t)  //
	{
        t = (c/t + t) / 2.0;

}System.out.println(t);
}


//*******************************************************************************************
                         //decimal to binary

public static void decimaltobinary(int num,int[] store)
{
	int count=0;  // count variable for 
	int k=0;
	int ones=0;
	int temp=num;
	//counter for binary array
	int i=0;
	while(num>0)    // looping happening till number greater than zero  
	{
		store[i]=num%2;  // store the remainder 
		num=num/2;
		i++;    
		
	}
	
	for(int j=i-1;j>=0;j--)       // printing the output in reverse order.
	{
		 System.out.print(store[j]); // print output in binary format.
		 if(store[j]==1)
		 { 
			 ones++;               // binary value 1 increase count.
			 count=count+1;
		 }
		 else{
			 count=count+1;       // if binary value 0 increase count.
		 }
	}
		 System.out.println();
		System.out.print(temp+"=");
		k=count;            //Initializing count with k.
		for(int j=k;j>=0;j--)    //calculating from last binary value to first value.
		{
			if(store[j]==1)
			{
				if(ones!=1)      
				{
			                                                                                                           ones--;
				System.out.print((int)Math.pow(2,count)+"+");
				count--;
			}
			else
			{
				System.out.print((int)Math.pow(2,count));
				count--;
				
			}
				
		}
			
  }
}
}



