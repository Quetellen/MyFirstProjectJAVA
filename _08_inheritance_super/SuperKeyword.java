package com.simplilearn.fsc._08_inheritance_super;
/* 
 * The super keyword is a reference variable that refer
 *  the immediate parent class.
 */

class Parent {
	
	String color = "Parent color";
	
	//Parent() {
	//	System.out.println("Parent Constructror")
	//}
	
	Parent(String color){
		this.color = color;
		System.out.println("Parent Constructor");
	}
	
	void doSomething() {
		System.out.println("Parent Doing Something");
		
	}
}

class Child extends Parent {
	
	String color = "Child color";
	
	
	Child() {
		super("New Color");
		System.out.println("Child Constructror");
	}
	
	
	void displayColor() {
		System.out.println(this.color);
		System.out.println(super.color);
	}
	@Override
	void doSomething() {
		System.out.println("Child Doing Something");
		super.doSomething();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.displayColor();
		obj.doSomething();

	}

}
