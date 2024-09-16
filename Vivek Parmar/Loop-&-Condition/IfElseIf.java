package com.vivek.javacodes2;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scanner.next();
		System.out.print("Enter marks: ");
		int marks = scanner.nextInt();
		scanner.close();
		char grade;
		
		if(marks>=90)
		{
			grade = 'A';
		}
		else if(marks>=80)
		{
			grade = 'B';
		}
		else if(marks>=70)
		{
			grade = 'C';
		}
		else if(marks>=60)
		{
			grade = 'D';
		}
		else if(marks>=40 && marks<60)
		{
			grade = 'P';
		}
		else
		{
			grade = 'F';
		}
		System.out.println(name + ", you got " + grade + ".");
	}

}
