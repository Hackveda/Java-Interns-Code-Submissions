package com.vivek.javacodes6;

import java.util.Scanner;

public class ThrowException 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		
		if(age <= 0)
		{
			throw new NumberFormatException();
		}
		else if(age >= 120) 
		{
			throw new NumberFormatException();
		}
		
		System.out.println("->Your maximum Heart-rate is " + (220 - age) + ".");
		
		scanner.close();
	}

}

