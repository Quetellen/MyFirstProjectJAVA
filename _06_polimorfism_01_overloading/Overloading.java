package com.simplilearn.fsc._06_polimorfism_01_overloading;

/*
 * Is the situation where in the same class, two or more methods/contructors
 * have the same name but different parameters.
 * 
 * can you overload a class? NO
 * YOU CAN ONLU OVERLOAD METHODOS OR CONSTRUCTORS
 */

class MyClass {
	int num;
	String str;
	
	/*
	 * Constructor Overloading
	 */
	MyClass(){
		
	}
	
	MyClass(int num){
		this.num = num;
	}
	
	MyClass(String str){
		this.str = str;
	}
	
	MyClass(int num, String str){
		this.num = num;
		this.str = str;
	}
	MyClass(String str, int num){
		this.str = str;
		this.num = num;
	}
	
	
	/*
	 * Method overloading
	 */
	//This method returns the concatenation of two parameters
	
	String concatenate(String str, int num) {
		return str + " " + num;
	}
	
	String concatenate(int num, String str) {
		return num + " " + str;
	}
	
	String concatenate(String str) {
		return "Hello" + str;
	}
	
	
	
}

public class Overloading {

	public static void main(String[] args) {
	
			//This is using constructor overloading
			MyClass obj1 = new MyClass();
			MyClass obj2 = new MyClass(10);
			MyClass obj3 = new MyClass("Hello");
			MyClass obj4 = new MyClass(1, "Hello");
			MyClass obj5 = new MyClass("Hello", 1);
			
			//this is using method overloading
			System.out.println(obj1.concatenate("Hello", 1));
			System.out.println(obj1.concatenate(1, "Hello"));
			System.out.println(obj1.concatenate("Hello"));

	}

}
