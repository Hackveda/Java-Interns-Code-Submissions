package com.vivek.javacodes3;

public class Employee3 extends Employee2
{
	String databaseTool;
	
	public void printData()
	{
		super.printData();
		System.out.println("Database Tool: " + databaseTool);
	}
}
