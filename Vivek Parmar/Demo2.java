package com.vivek.javacodes3;

public class Demo2 extends Demo1
{

	public static void main(String[] args) 
	{
		Demo2 obj = new Demo2();
		obj.emp_info("Vivek", 22);
		System.out.println();
		obj.emp_info(22, "Vivek");
	}

}
