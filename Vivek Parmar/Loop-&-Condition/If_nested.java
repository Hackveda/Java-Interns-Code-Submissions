package com.vivek.javacodes2;

public class If_nested 
{
	public static void main(String[] args) 
	{
		int i=5, j=27;
		if(i<j)
		{
			if(j>1)
			{
				System.out.println("i and j: " + i + " & " + j);
			}
			else 
			{
				System.out.println("j is lesser than 1.");
			}
		}
		else
		{
			System.out.println("i is greater than j.");
		}
	}
}
