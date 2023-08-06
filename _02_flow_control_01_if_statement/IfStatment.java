package com.simplilearn.fsc._02_flow_control_01_if_statement;

public class IfStatment {
	
	public static void main(String[] args) {
		
		int x = 20;
		int y = 18;
		
		if (x > y) {
			System.out.println("x is grater than y ");
		}
		else if (x < y) {
			System.out.println("y is grater than x ");
		}
		else {
			System.out.println("y is grater than x ");
		}
		
		System.out.println("******************************");
	
		/* Ternary Operator*/
		
		String result = "";
		
		if (x > y ) {
			result = "x is greater than y";
		}
		else {
			result = "y is greater than x";
		}
		
		result = (x > y )? "x is greater than y" : "y is greater than x";
		
		System.out.println(result);
		System.out.println("Ternary Operator: " +result);
	}

}
