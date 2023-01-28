package com.vivek.javacodes;

public class ArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("First method: ");
		int[] numsArray = new int[10];
		numsArray[0] = 0;
		numsArray[1] = 1;
		numsArray[2] = 2;
		numsArray[3] = 3;
		numsArray[4] = 4;
		numsArray[5] = 5;
		numsArray[6] = 6;
		numsArray[7] = 7;
		numsArray[8] = 8;
		numsArray[9] = 9;
		
		for(int i = 0; i<numsArray.length; i++) {
			System.out.println(numsArray[i]);
		}
		
		System.out.println();
		
		System.out.println("Second method: ");
		char[] charArrays =  {'a','b','c','d','e','f'};
		System.out.println(charArrays[0]);
		System.out.println(charArrays[1]);
		System.out.println(charArrays[2]);
		System.out.println(charArrays[3]);
		System.out.println(charArrays[4]);
		System.out.println(charArrays[5]);
	}

}
