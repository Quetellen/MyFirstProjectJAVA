package com.simplilearn.fsc._10_final;

/*
 * The final modifier(the keyword) can be applied on 
 * Classes, Methods and Variables 
 * 
 * A final class cannot be extended. 
 * ex.: the built in class String in JAVA cannot be extended.
 */


class Parent{
	
	/*
	 * A final method cannot be overriden in the Child class
	 */
	//final void print() {
	//	System.out.println("I am thr Parent class");
	//}
	void print() {
		System.out.println("I am thr Parent class");
	}
}

class Child extends Parent{
	
	@Override
	void print() {
		System.out.println("I am thr Child class");
	}
}

public class FinalKeyword {
	/* Instance variable / Attribute /Property / Field*/
	static final int NUM =4;

	public static void main(String[] args) {
		
		/* Local variables can be final*/
		
		final int hello;
		
		hello = 5;

	}

}
