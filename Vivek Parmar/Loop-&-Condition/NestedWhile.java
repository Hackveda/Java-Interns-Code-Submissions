package com.vivek.javacodes2;

public class NestedWhile {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		
		while(i<=8)
		{
			while(j<=8)
			{
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
			j=1;
		}

//		while(i<=8)
//		{
//			while(j<=8)
//			{
//				System.out.print(i);
//				j++;
//			}
//			i++;
//			System.out.println();
//			j=1;
//		}
	}

}
