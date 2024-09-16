package com.vivek.javacodes5;

public interface Lambda_P3
{
	void abstractMsg(String name);
	
	default void normalMsg() 
	{
		System.out.print("Hi, ");
	}
}
