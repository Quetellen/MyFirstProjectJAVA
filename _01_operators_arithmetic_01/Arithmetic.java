package com.simplilearn.fsc._01_operators_arithmetic_01;

public class Arithmetic {

	public static void main(String[] args) {
		
		int a = 8; //operand
		int b = 3; //operand
		
		int sum = a + b;
		int sub = a - b;
		int div = a / b; //The result is not correct because this is an int and the operand are int
		int mul = a * b;
		
		double div2 = (double)a / b; // We are casting the a so the operand becomes a double and the result comes back correct.
		
		System.out.println("Addition is " + sum);
		System.out.println("Subtraction is " + sub);
		System.out.println("Division is " + div);
		System.out.println("Multiplication is " + mul);
		System.out.println("Division2 is " + div2);
		
		
		/* This is used to know if a number is odd or even*/		
		int mod = a % b; //Returns the remainder of the division
		
		System.out.println("Remainder is " + mod);


	}

}