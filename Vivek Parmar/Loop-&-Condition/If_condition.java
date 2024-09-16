package com.vivek.javacodes2;

import java.util.Scanner;

public class If_condition 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age: ");
		int num = scanner.nextInt();
		scanner.close();
		if(num>=18)
		{
			System.out.println("You can vote.");
		}
		else
		{
			System.out.println("You can not vote.");
		}
	}

}
