package com.simplilearn.fsc._11_interface;

/*
 * A interface is like a contract that must be accomplished by the classes
 *  that implement the interface
 *  
 *  We declare methods in the interface that must be implemented in the class.
 */
interface Income{
	
	int NUM = 4; // by default this is (public static final int NUM = 4;)
	
	double calculatePay(double salary, double taxes);
	public abstract void DoSomething2();
	
	//As of JAVA 8 -> was created STATIC and DEFAULT methods in interfaces   
	
	default void newFeature2() {
		System.out.println("This is a new festure");
	}
	
	//This one was created to avoid to break somebody else code
	static void newFeature() {
		System.out.println("This is a new festure");
	}
	
}

/*
 * The class is the template for creating Objects
 */

class Employee implements Income{
	String name;
	int age;
	
	@Override
	public double calculatePay(double salary, double taxes) {
		return salary - taxes;
	}
	
	void doSomething() {
		System.out.println("Doing Something");
		
	}

	@Override
	public void DoSomething2() {
		System.out.println("Doing Something");
		
	}
	
	
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		
		Income emp = new Employee();
		
		double pay = emp.calculatePay(1000, 200);
		((Employee)emp).doSomething();
		
		System.out.println(pay);
		System.out.println(Income.NUM);
		
				
	}

}
