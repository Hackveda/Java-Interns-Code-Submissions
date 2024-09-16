package com.vivek.javacodes7;

import java.util.ArrayList;

public class ToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> students = new ArrayList<String>();
		students.add("Vivek");
		students.add("Yadu");
		students.add("Surya");
		
		Object[] arrayOfStudents = students.toArray();
		System.out.println("Element at Index 0 for Array: " + arrayOfStudents[0]);
		System.out.println("HashCode of the array: " + arrayOfStudents.hashCode());
	}

}
