package com.simplilearn.fsc._09_static;

/*
 * STATIC – Indicates that a member belongs to the class and not to the object
 */

class MyClass {
	
	/*
	 * static attributes are shared across all the objects of the class
	 */
	
	static int  num = 1;
	
	/*
	 * A constant name always needs to be in uppercase. Static is always used 
	 * in attributes with the word final
	 * We normally use static combined with final to create constants on JAVA.
	 */
	static final int HELLO = 1;
	
	/*
	 * Static methods belongs to the class
	 */
	
	static int addNumbers(int a, int b) {
		/*
		 * The method should be static if the logic inside the method 
		 * depends only on the parameters.
		 * 
		 * We cannot access non-static members from static methods
		 */
		return a + b;
	}
	
	void print(int a, int b) {
		System.out.println(addNumbers(a, b));
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		obj1.num = 10;
		
		MyClass obj2 = new MyClass();
		obj2.num = 20;
		
		MyClass obj3 = new MyClass();
		obj3.num = 30;

		//int result = obj3.addNumbers(2,3);
		int result = MyClass.addNumbers(2,3); //This method belongs to the class when became static, so you don`t need to create an obj.
		
		//System.out.println(obj1.num);
		//System.out.println(obj2.num);
		//System.out.println(obj3.num);
		System.out.println(result);
		
		double power = Math.pow(2,  4); //Math is a library with static members 
		System.out.println(power);
		

	}

}
