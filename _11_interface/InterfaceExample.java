package com.simplilearn.fsc._11_interface;

/*
 * An Interface is like a contract that must be accomplished by the class
 * that implements the interface.
 */

interface MyInterface {
	//In a interface, you put the method declaration, but not the definition
	void doSomething();
}

interface AnotherInterface extends MyInterface {
	void doSomething2();
}

/*
 * INTERFACE-  The basic purpose of using interface is to achieve abstraction. 
 * We only put the method declaration, and in the CLASS we 
 * define the and implement the method.
 */
class MyClass implements MyInterface {
	
	@Override
	public void doSomething() {
		System.out.print("Class is doing Something");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		
		obj.doSomething();

	}

}
