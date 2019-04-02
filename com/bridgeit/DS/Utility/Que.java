package com.bridgeit.DS.Utility;

public class Que 
{
	
		final int maxsize=50;    //giving the capacity of que.
		 int front;       
		 int rear;
		final int[] que=new int[maxsize];  //creating object.
	
	     public Que()   // constructor for re intializing the variables
		{
			front = -1; // in que front and rear starts from  -1
			rear = -1;
		}
	// Enqueue implementation ...................................
	    // which is used for enter the elements in que
		public void Enqueue(int element) 
		{
			if(IsFull())   // if que is full enter elements is not possible 
			{
				System.out.println("Queue is Full");
			}
			if(IsEmpty())   // if que is empty intializing the front and rear to zero
			{
				front = rear = 0;
			}
			else
			{
				rear = (rear+1) % maxsize;  // entering elements into que upto rear%maxsize get zero
			}
			que[rear] = element;  // store the value into the que at rear.
			
		}
	// Is Full mehtod implementation .....................................
		private boolean IsFull() 
		{
			if((rear+1)% maxsize == front)  // condition for checking que is full or not
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	// Dequeue implementation ...................................
		public void Dequeue() 
		{
			if(IsEmpty())
			{
				System.out.println("Queue is Empty");
			}
			else if(front == rear)				// reintializing.
			{
				front = rear = -1;			    // front and rare to -1.
			}
			else
			{
				front = (front+1) % maxsize;     // condition for dedqe the elements from que
			}
			
		}
	// count value implementation ...............................
		public int count() 
		{
			int count = 0;                   
			if(!IsEmpty())  // if que is not empty return the count.
			count = (rear + maxsize - front) % maxsize + 1; //increase the count.
			return count;     //return the count.
		}
	// Is Empty method is implemented ................................
		
		private boolean IsEmpty() 
		{
			if(front==-1 && rear==-1)   //condition for checking whether the que is empty or not 
			{
				return true;    // if condtion satisfied return true.
			}
			else
			{
				return false;  //if condtion not satisfied return false.
			}
		}
		

	}



