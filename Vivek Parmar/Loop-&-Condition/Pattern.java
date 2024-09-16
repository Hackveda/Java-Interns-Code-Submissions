package com.vivek.javacodes2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row(s): ");
		int rows = scanner.nextInt();
		scanner.close();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
