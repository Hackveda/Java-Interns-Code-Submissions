package com.vivek.javacodes7;

import java.util.Stack;

public class MyStack 
{
	public static void main(String[] args) 
	{
		Stack<Integer> intStack = new Stack<Integer>();
		System.out.println("Is Stack empty? - " + intStack.empty());
		
		intStack.push(10);
		intStack.push(20);
		System.out.println("Get the top element: " + intStack.peek());
		boolean elementExists = false;
		if(intStack.search(20)>0)
		{
			elementExists = true;
		}
		else
		{
			elementExists = false;
		}
		System.out.println("Does Stack contains 20? - " + elementExists);
		intStack.pop();
		System.out.println("Top element after pop: " + intStack.peek());
	}

}
