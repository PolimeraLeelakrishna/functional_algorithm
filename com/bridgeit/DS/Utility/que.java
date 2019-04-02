package com.bridgeit.DS.Utility;

public class que<T>
{     

     LinkedList<T> list=new LinkedList<T>();
     private Object arr[];
     private int rear;
     public int front;
     public static int capacity;
     private int count;
     
     //calling constructer to initialize array sze
     public que()
     {   int size=0;
    	 arr = new Object[size];
 		capacity = size;
 		front = 0;
 		rear = -1;
 		count = 0;
 	}
     
	
		// TODO Auto-generated constructor stub
	

	// creating node class 
    public static class Node<T>
    {
    	T data;
    	Node<T> next;
    	Node(T d)
    	{
    		this.data=d;
    		this.next=null;
    	}
    }
    // check que is full or not
    public boolean isfull()
    {
    	if(size()==capacity)
    	{
    		return true;
    	}
    	return false;
     }
    
   // for check que is empty or not
    public boolean isempty()
    {
    	if(size()==0)    // if size is zero than que is empty
    	{
    		return true;
    	}
    	return false;
    }
    // for checking the size of the que
	private int size() {
		
		return count;
	}
	// this function is used for enter to que object
	public void enque(T data)
	{
		
		@SuppressWarnings("unused")
		Node<T> new_node = new Node<T>(data);
		//if(isfull())
		//{
			//System.out.println("over flow/program get terminated");
			//System.exit(1);
		//}
		rear=rear+1%capacity;
		arr[rear]=list.addlast(data);
		count++;
	}
	// this function is used for removing data from que
	
	
	public void deQueue() {
		if (isempty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		} else {
			System.out.println("Removing " + arr[front]);

			front = (front + 1) % capacity;
			count--;     // decrease the count
		}
	
     }
	// this is used for print the data present in the que
	public void show() {
		/* for loop to display all elements in queue */
		for (int i = 0; i < count; i++) {
			System.out.print(arr[front + i] + " ");
		}
		System.out.println();
	}

}

