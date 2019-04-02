package com.bridgeit.Data_Structuress;

import java.io.PrintWriter;

import com.bridgeit.DS.Utility.LinkedList;

import com.bridgeit.utility.Utility;

public class Unorderlist
{
    public static  void main(String[] args) throws Exception 
    {   
    	String outPut;
		String path = "/home/shadowk/hi.txt";// path to get file
		LinkedList<String> list = new LinkedList<String>();
		PrintWriter pw = new PrintWriter("hi.txt");
		String[] word = Utility.fileReadString(path);// storing data into word after
		
		for (int i = 0; i < word.length; i++) 
		{
			list.add(word[i]);
		}
    	
    	list.display();
    	System.out.println("enter word");
    	String element=Utility.getString();
    	boolean check=list.searchele(element);
    	if(check==true)
    	{
    		System.out.println("element is found from the file and remove it");
    		list.delete(element);
    		list.display();
    		outPut=list.getString();
    		System.out.println(outPut);
    		pw.write(outPut);
    	}
    	else
    	{
    		System.out.println("element is not found from file add it ");
    		list.add(element);
    		list.display();
    		outPut=list.getString();
    		pw.write(outPut);
    	}
		pw.close();
	}
}
