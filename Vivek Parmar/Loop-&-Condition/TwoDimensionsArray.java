package com.vivek.javacodes2;

import java.util.Scanner;

public class TwoDimensionsArray {

	public static void main(String[] args) {
		
		System.out.println("Enter 2D array size: ");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		
		System.out.println("Enter array elements: ");
		int storage2DArray[][] = new int[rows][columns];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				storage2DArray[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		System.out.println("Entered Data: ");
		for(int[] x:storage2DArray)
		{
			for(int y:x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
