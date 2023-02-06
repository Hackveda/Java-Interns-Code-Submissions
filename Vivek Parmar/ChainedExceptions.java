package com.vivek.javacodes6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChainedExceptions 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please enter your height in cms: ");
			float height = scanner.nextFloat();
			
			double idealWeight = 50 + (0.91 * (height - 152.4));
			System.out.println("Your ideal weight should be " + idealWeight + "KG.");
			
			scanner.close();
		}
		catch(InputMismatchException e)
		{
			throw new NumberFormatException();
		}
	}

}
