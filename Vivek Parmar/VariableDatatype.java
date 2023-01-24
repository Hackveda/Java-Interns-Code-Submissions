package com.vivek.javacodes;

public class VariableDatatype {

	public static void main(String[] args) {
		
		String StringVal = "Datatypes:";
		System.out.println(StringVal);
		
		byte byteVal = 50; 
		System.out.println("1. byte: 'byte' can store whole numbers from -128 to 127.");
		System.out.println("Example: " + byteVal + "\n");
		
		short shortVal = 25000;
		System.out.println("2. short: 'short' can store whole numbers from -32768 to 32767.");
		System.out.println("Example: " + shortVal + "\n");
		
		int intVal = 100000;
		System.out.println("3. int: 'int' can store whole numbers from -2^31 to (2^31 -1).");
		System.out.println("Example: " + intVal + "\n");
		
		long longVal = 100_000_000L;
		System.out.println("4. long: 'long' can store whole numbers from -2^63 to (2^63 -1).");
		System.out.println("Example: " + longVal + "\n");
		
		float floatVal1 = 20.6633f;
		float floatVal2 = 10.3333f;
		float floatVal = floatVal1*floatVal2;
		System.out.println("5. float: 'float' can store numbers from 6 to 7 decimal digits.");
		System.out.println("Example: " + floatVal + "\n");
		
		double doubleVal1 = 20.6666D;
		double doubleVal2 = 10.3333d;
		double doubleVal = doubleVal1*doubleVal2;
		System.out.println("6. double: 'double' can store numbers til 15 decimal digits.");
		System.out.println("Example: " + doubleVal + "\n");
		
		boolean booleanVal = true;
		if(booleanVal) {
			System.out.println("7. boolean: 'boolean' can store 'true' or 'false' values.");
			System.out.println("Example: " + booleanVal + "\n");
		}
		
		char charVal = 'V';
		System.out.println("8. char: 'char' can store single character.");
		System.out.println("Example: " + charVal + "\n");
	}

}
