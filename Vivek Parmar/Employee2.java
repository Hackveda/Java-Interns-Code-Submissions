package com.vivek.javacodes3;

public class Employee2 extends Employee1 
{
	String language;
	
	public void printData()
	{
		super.printData();
		System.out.println("Language: " + language);
	}
}
