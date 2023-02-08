package com.vivek.javacodes7;

import java.util.ArrayDeque;
import java.util.Iterator;

public class StackUsingDeque 
{
	public static void main(String[] args)
	{
		ArrayDeque<String> myDeque = new ArrayDeque<String>();
		
		myDeque.add("Vivek");
		System.out.println("1.First Element: " + myDeque.getFirst());
		myDeque.addFirst("Subhav");
		System.out.println("2.First Element(Updated): " + myDeque.getFirst());
		myDeque.addLast("Roham");
		myDeque.offerFirst("Naman");
		myDeque.offer("Aaran");
		System.out.println("3.First Element(Updated): " + myDeque.getFirst());
		System.out.println("4.Last Element: " + myDeque.getLast());
		System.out.println("5.Deque contains 'Subhav'?: " + myDeque.contains("Subhav"));
		System.out.println("6.Iterating all elements in descending order: ");
		
		Iterator<String> myIterator = myDeque.descendingIterator();
		while(myIterator.hasNext())
		{
			System.out.println("  " + myIterator.next());
		}
	}

}
