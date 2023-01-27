package com.vivek.javacodes;

public class StringOperation {

	public static void main(String[] args) {
		
		String name = " Vivek Parmar ";
		String firstName = "Vivek";
		String lastName = "Parmar";
		
		System.out.println("Name: " + name.strip());
		System.out.println("Username: " + firstName.concat(lastName+7));
		if(name.contains(firstName) && name.contains(lastName)) {
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + lastName);
		}
		
		System.out.println();
		
		System.out.println("Length of first name: " + firstName.length());
		System.out.println("Length of last name: " + lastName.length());
		
		System.out.println("");
		System.out.println("FIRST NAME: " + firstName.toUpperCase());
		System.out.println("last name: " + lastName.toLowerCase());
		
	}
}
