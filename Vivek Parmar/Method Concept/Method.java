package com.vivek.javacodes;

public class Method {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		float product = a*b;
		System.out.println("Method: " + product);	
		Method_2 obj1 = new Method_2();
		System.out.println("Method-2: " + obj1.main(args));
		System.out.println("Method-2: " + Method_2.main(args));
		Method_4 obj2 = new Method_4();
		System.out.println("Method-3: " + Method_3.main(args));
		System.out.println("Method-4: " + obj2.name);
	}
}
