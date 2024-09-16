package com.vivek.javacodes5;

import java.util.ArrayList;

public class Lambda_P5 {

	public static void main(String[] args) 
	{
		ArrayList<String> arrayListEx1 = new ArrayList<String>();	
		arrayListEx1.add("Vivek");
		arrayListEx1.add("Soham");
		arrayListEx1.add("Ranak");
		
		System.out.println("Names: ");
		arrayListEx1.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		ArrayList<Integer> arrayListEx2 = new ArrayList<Integer>();
		arrayListEx2.add(100);
		arrayListEx2.add(10005);
		arrayListEx2.add(100000);
		
		System.out.println("Numbers: ");
		arrayListEx2.forEach(n ->
		{
			if(n%2 == 0) System.out.println(n);
		}
				);
	}

}
