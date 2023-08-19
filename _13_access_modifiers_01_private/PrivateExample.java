package com.simplilearn.fsc._13_access_modifiers_01_private;
/*
 * Private is an access modifier that can only be applied for attributes,
 * constructors and methods.
 */

class MyClass {
	
	private int num;
	void print() {
		System.out.println("My class" + this.num);
	}
}


public class PrivateExample {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		//obj.num = 4;

	}

}
