package com.vivek.javacodes5;

public class Lambda_P2 
{
	public static void main(String[] args) 
	{
		Lambda_P1 obj = ()->
		{
			return "Hello, I am Vivek.";				
		};
		System.out.println(obj.say());
	}

}
