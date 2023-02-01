package com.vivek.javacodes5;

public class Ex2 extends Ex1
{
	public static void main(String[] args)
	{
		Ex2 obj = new Ex2();
//		System.out.println(obj.a); //it will throw an error, because 'a' is private
		System.out.println("B: " + obj.b);
		System.out.println("C: " + obj.c);
		System.out.println("D: " + obj.d);
	}

}
