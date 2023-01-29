package com.vivek.javacodes2;

public class Nested_loop 
{
	public static void main(String[] args) 
	{
		System.out.println("i     j");
		System.out.println("-------");
		for(int i=1; i<=3; i++) 
		{
			for(int j=1; j<=5; j++) 
			{
				System.out.println(i + "     " + j);
			}
			System.out.println("-------");
			System.out.println("-------");
		}
	}
}
