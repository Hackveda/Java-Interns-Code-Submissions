package com.vivek.javacodes7;

import java.util.ArrayList;

public class MyArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList1.add(5);
	
		System.out.println("Printing arrayList1:");
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.get(3));
		System.out.println(arrayList1.get(4));
		System.out.println();
		
		System.out.println("Printing updated arrayList1:");
		arrayList1.add(0, 0);
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.get(3));
		System.out.println(arrayList1.get(4));
		System.out.println(arrayList1.get(5));
		System.out.println();
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.addAll(arrayList1);
		System.out.println("Printing arrayList2:");
		System.out.println(arrayList2.get(0));
		System.out.println(arrayList2.get(1));
		System.out.println(arrayList2.get(2));
		System.out.println(arrayList2.get(3));
		System.out.println(arrayList2.get(4));
		System.out.println(arrayList2.get(5));
		System.out.println();
		
		arrayList2.clear();
		try 
		{
		System.out.println("Printing arrayList2:");
		System.out.println(arrayList2.get(0));
		System.out.println(arrayList2.get(1));
		System.out.println(arrayList2.get(2));
		System.out.println(arrayList2.get(3));
		System.out.println(arrayList2.get(4));
		System.out.println(arrayList2.get(5));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("List is empty or cleared.");
		}
		System.out.println();
		
		ArrayList<Integer> cloneOfarrayList1 = (ArrayList<Integer>) arrayList1.clone();
		arrayList1.clear();
		System.out.println("Cleared arrayList1 after cloning.");
		System.out.println("Printing clone of arrayList1:");
		System.out.println(cloneOfarrayList1.get(0));
		System.out.println(cloneOfarrayList1.get(1));
		System.out.println(cloneOfarrayList1.get(2));
		System.out.println(cloneOfarrayList1.get(3));
		System.out.println(cloneOfarrayList1.get(4));
		System.out.println(cloneOfarrayList1.get(5));
		System.out.println();
		
		System.out.print("Does cloneOfarrayList1 contain 6?- ");
		boolean elementExists = cloneOfarrayList1.contains(6);
		if(elementExists)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
