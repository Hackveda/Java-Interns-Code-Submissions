package com.vivek.javacodes7;

import java.util.ArrayList;
import java.util.Spliterator;

public class MySpliterator 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fbPosts = new ArrayList<String>();
		
		fbPosts.add("Post1");
		fbPosts.add("Post2");
		fbPosts.add("Post3");
		fbPosts.add("Post4");
		fbPosts.add("Post5");
		fbPosts.add("Post6");
		
		Spliterator<String> spliterator1 = fbPosts.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		
		System.out.println("SPL1 estimated size of data: " + spliterator1.estimateSize());
		System.out.println("SPL1 exact size: " + spliterator1.getExactSizeIfKnown());
		spliterator1.forEachRemaining(System.out::println);
		System.out.println("SPL1 estimated size of data: " + spliterator1.estimateSize());
		System.out.println("SPL1 exact size: " + spliterator1.getExactSizeIfKnown());

		System.out.println("SPL2 estimated size of data: " + spliterator2.estimateSize());
		System.out.println("SPL2 exact size: " + spliterator2.getExactSizeIfKnown());
		spliterator2.forEachRemaining(System.out::println);
		System.out.println("SPL2 estimated size of data: " + spliterator2.estimateSize());
		System.out.println("SPL2 exact size: " + spliterator2.getExactSizeIfKnown());
	}
}
