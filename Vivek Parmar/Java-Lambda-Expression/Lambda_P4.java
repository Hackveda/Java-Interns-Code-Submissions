package com.vivek.javacodes5;

public class Lambda_P4 {

	public static void main(String[] args) 
	{
		Lambda_P3 obj = (String name)->
		{
			System.out.print(name + " Parmar.");
		};
		
		obj.normalMsg();
		obj.abstractMsg("Vivek");
	}

}
