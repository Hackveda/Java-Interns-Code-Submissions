package com.vivek.javacodes;

public class Abstraction_1 extends Abstraction_2{
	
	public void anotherMethod()
	{
		System.out.println("Abstract method.");
	}

	public static void main(String[] args) {
		
		Abstraction_2 obj = new Abstraction_1();
		obj.anotherMethod();
		System.out.println(" ");
		obj.myMethod();
	}

}
