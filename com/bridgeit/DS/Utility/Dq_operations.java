package com.bridgeit.DS.Utility;

public class Dq_operations 
{
	//initializing variables.
    int size;
    int front;
    int rear;
    char[] ch;
    int chsize;
    ///constructor for reintializing size of array.
   public Dq_operations(int chsize)   
    {
    	this.chsize=chsize;
    	ch=new char[chsize];
    }
    //adding element at front.
    public void addfront(char data)
    {
    	ch[front]=data; // give element at front
    	front++;        
    	size++;         // incrementing size of que.
    }
    // adding element at rear
    public void addRear(char data)
    {
        if(rear==0)
        {
            rear=chsize;  // intializing the size 
        }
        ch[rear-1]=data;  //adding element at rear.				
        rear--;		      // decrementing rear.
        size++;           // increase size of que.
    }
    // get element from the front
    public char getFront()
    {
        char output=ch[front]; // get front value
        front++;						
        return output;         // return the value from front in the que
        
    }
   // get the element from the rear
    public char getRear()      
    {
        rear=size-1;             // at the size of maximum index.			
        char output=ch[rear];    // get the value and store it in output.		
        rear--;                  //decreasing rear mean decreasing the index value.
        return output;           // return output
    }
   // for know the size of que.
    public int size()
    {
        return size;       // return the size of que.			
    }
    // this function is used for printing present elements in the que. 
    public void show()
    {
        
        for(int i=0;i<size;i++)
        {
            System.out.println(ch[i]);
        }
    }
}

