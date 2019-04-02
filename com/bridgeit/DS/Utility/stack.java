package com.bridgeit.DS.Utility;

public class stack<T>
{
	
     Node top;
     public class Node 
     {
 		T data;
 		Node next;
  }
     public void push(T ch)
     {
    	 Node node=new Node();
    	 node.data=ch;   // adding data by using reffrence variable
    	 node.next=top;  // make every add element as top
    	 top=node;      // top is node after entering all elements
     }
     
   //This function is used for display all elements in the stack  
     public void peek()
     {
    	 if(top==null)
    	 {
    		 System.out.println("stack is empty");
    	 }
    	 else
    	 {
    		 Node n=top;  // giving the top value to n.
    		 while(n.next!=null)
    		 {
    			 System.out.println(n.data);  //printing the data
    			 n=n.next;
    		 }
    		 System.out.println(n.data);  // printing the last value because of last node contain
    		                              // null value so it dosnt print in the while loop.		 
    		 }
     }
     public boolean isempty()
     {
    	 if(top==null)   // condition for to check whether the stack is empty or not
    	 {
    		 return true;
    	 }
    	 return false;
     }
     public void pop()
     {
    	 if(top==null)
    	 {
    	 System.out.println("Arthamatic is not balanced ");
    	 System.exit(0);
    	 }
          top=top.next; // when we remove the eliment then it decrease the top value.
                        // so we change the reference value
}
}
