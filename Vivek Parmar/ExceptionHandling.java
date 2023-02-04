package com.vivek.javacodes6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{	
		//Maximum heart beat of the user
		
		try
		{
			System.out.println("___:Maximum Heart Rate Calculator:___");
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();
			
			int max_heart_rate = 220 - age;
			
			System.out.println("Your maximum heart rate is " + max_heart_rate + ".");
			
			scanner.close();
		} 
		catch(InputMismatchException e) 
		{
			System.out.println("Please enter age in number format.");
		}
	}

}
