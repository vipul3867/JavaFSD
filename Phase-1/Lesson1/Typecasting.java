package com.simplilearn.first;

public class Typecasting {
public static void main(String[] args) {
		
	//implicit conversion
		
	     System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=b;
		System.out.println("Value of c: "+c);
		
		long d=b;
		System.out.println("Value of d: "+d);
		
		double e=b;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		
	//explicit conversion
		
		double x=85.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}




