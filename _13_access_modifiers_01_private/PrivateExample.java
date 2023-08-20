package com.simplilearn.fsc._13_access_modifiers_01_private;
/*
 * Private is an access modifier that can only be applied for attributes,
 * constructors and methods.
 */
	//private members are visible within the class only
	//private members are not inherited 

class MyClass {
	
	private int num;
	
	
	int getNum() {
		return num;
	}

	void setNum(int num) {
		this.num = num;
	}

	//private MyClass() {
	//	
	//}
	
	void printClass() {
		//do another thing first, and then call the print method
		this.print();
	}
	
	private void print() {
		System.out.println("My class" + this.num);
	}
}

class MyChild extends MyClass {
	void doSomething() {
		
		this.setNum(4);
		System.out.println(this.getNum());
	}
}



public class PrivateExample {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		//obj.num = 4;
		
		Math.pow(2, 3);
		
		//obj.print();

	}

}
