package com.vivek.javacodes3;

public class Employee 
{
	public static void main(String[] args) 
	{
		Employee1 emp1 = new Employee1();
		emp1.name = "Soham";
		emp1.age = 22;
		emp1.salary = 45000.00;
		
		Employee2 emp2 = new Employee2();
		emp2.name = "Parsh";
		emp2.age = 23;
		emp2.salary = 50000.00;
		emp2.language = "Java";
		
		Employee3 emp3 = new Employee3();
		emp3.name = "Jain";
		emp3.age = 21;
		emp3.salary = 55000.00;
		emp3.language = "C++";
		emp3.databaseTool = "MySQL";
		
		emp1.printData();
		System.out.println();
		emp2.printData();
		System.out.println();
		emp3.printData();
	}

}
