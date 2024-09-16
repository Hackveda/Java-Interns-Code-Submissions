package com.vivek.javacodes;

public class NestedWhile {

	public static void main(String[] args) {
		
		int col = 1;
		int row = 1;
		while(col<=10) {
			while(row<=5) {
				System.out.print("*");
				row++;
			}
			col++;
			System.out.print("\n"); //System.out.println("");
			row = 1;
		}
	}
}