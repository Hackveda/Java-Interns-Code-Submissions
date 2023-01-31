package com.vivek.javacodes4;

public class Test implements Printable, Showable
{
	@Override
	public void show() 
	{
		System.out.println("This is a show method from 'Showable' method.");
	}

	@Override
	public void print() 
	{
		System.out.println("This is a print method from 'Printable' method.");
	}

	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.show();
		obj.print();
	}
}
