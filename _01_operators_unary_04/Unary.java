package com.simplilearn.fsc._01_operators_unary_04;

public class Unary {

	public static void main(String[] args) {
		
		//Post increment

		int a = 4;
		/* This is equivalent
		a = a +1;
		a++;
		*/
		
		int b = a++;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		//Pre increment
		
		a = 4;
		b = ++a;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		//Post decrement

		int c = 4;
		/* This is equivalent
		a = a - 1;
		a--;
		*/
				
		int d = c--;
				
		System.out.println("c= " + c);
		System.out.println("d= " + d);
				
		//Pre decrement
				
		c = 4;
		d = --c;
				
		System.out.println("c= " + c);
		System.out.println("d= " + d);

	}

}
