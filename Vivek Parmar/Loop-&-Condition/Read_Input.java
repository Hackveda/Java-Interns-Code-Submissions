package com.vivek.javacodes2;

import java.util.Scanner;

public class Read_Input {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		int numsOfElements = scanner.nextInt();
		
		int[] storageArray = new int[numsOfElements]; 
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<numsOfElements; i++) 
		{
			storageArray[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Array elements: ");
		for(int i=0; i<numsOfElements; i++)
		{
			System.out.println(storageArray[i]);
		}
	}

}
