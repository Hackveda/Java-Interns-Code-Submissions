package com.vivek.javacodes6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter No.1: ");
			int num1 = scanner.nextInt();
			
			System.out.print("Enter No.2: ");
			int num2 = scanner.nextInt();
			
			int num3 = sum(num1, num2);
			System.out.println("The answer is " + num3 + ".");
			scanner.close();
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Please enter only numbers.");
		}
	}
	
	private static int sum(int a, int b) 
	{
		int num4 = 0;
		
		try
		{
			num4 = a+b;
		}
		catch(Exception e)
		{
			System.out.println("There is an error in calculation.");
		}
		finally {
			System.out.println("->'finally' executed.");
			return num4;
		}
	}
}
