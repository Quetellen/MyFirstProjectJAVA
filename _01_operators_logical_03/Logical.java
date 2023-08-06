package com.simplilearn.fsc._01_operators_logical_03;

public class Logical {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		boolean and = a && b; // returns true only if both operands are true
		boolean or = a || b; // returns true if at least one of the operands is true
		boolean not = !a; //returns the reverse
		
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
	}

}