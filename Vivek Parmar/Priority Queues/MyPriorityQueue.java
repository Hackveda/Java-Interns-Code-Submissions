package com.vivek.javacodes7;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPriorityQueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); 
		System.out.println("Is 'pq' empty?- " + pq1.isEmpty());
	
		
		MyComparator mComp = new MyComparator();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(mComp);
		
		pq1.add(10);
		pq2.add(10);
		
		pq1.add(5);
		pq2.add(5);
		
		pq1.add(100);
		pq2.add(100);
		
		Iterator<Integer> pqIter1 = pq1.iterator();
		Iterator<Integer> pqIter2 = pq2.iterator();
		
		System.out.println("PQ1 Priority Queue:");
		while(pqIter1.hasNext())
		{
			System.out.println(pqIter1.next());
		}
		
		System.out.println("PQ2 Priority Queue:");
		while(pqIter2.hasNext())
		{
			System.out.println(pqIter2.next());
		}
	}
}
