package com.simplilearn.fsc._05_oop;

/*
 * 1. Attributes
 * 2. Constructors (blocks of code, especial type of method)
 * 3. Methods
 */

class Employee {
	/*
	 * Attributes, Properties, Fields, Instance Variables
	 */
	
	int id;
	String name;
	double salary;
	String position;
	
	/*
	 * A Constructor is a special method that is used to initialize the objects.
	 * It is called automatically when we create the object.
	 * 
	 * Types: 
	 * 1. Default constructor: created automatically by Java if the class doesn`t have any constructor 
	 *
	 * If you pass a constructor like the ones bellow you also need to have a default one.
	 *  
	 * 2. No-Arg Constructor: A constructor that takes no parameters
	 * 3. Parameterized constructor: A constructor that takes parameters 
	 */
	
	//Take no parameters 
	Employee(){
		this.id = 0;
		this.name = "";
		this.salary = 0.0;
		this.position = "";
	}
	
	//Taking two parameters 
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//Taking all the parameters 
	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	
	
	//Mutators - Getters and Setters
	



	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	double calculateBonus(double percentage) {
		
		double empBonus = salary * percentage / 100;
		
		return empBonus;
		//return salary * percentage / 100; 
	}
	
	//Method is a block of code that runs when it is called.
	//Return type - method name- parameters - block of codes
		
	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Position: " + position);
	}
}

public class MyClass {

	public static void main(String[] args) {
		
		//EMP1
		/*
		 * The example EMP1 is not recommended to use because you violate a rule, 
		 * you break the concept of encapsulation
		 */
		
		Employee emp1 = new Employee(); //Here we created  an OBJECT or INSTANCE of class employee
		
		emp1.id = 1020; // Breaking the concept of OOP - ENCAPSULATION
		emp1.name = "John";
		emp1.salary = 8000;
		emp1.position = "Manager"; 
	
		emp1.display();
		double bonus = emp1.calculateBonus(10); 
		System.out.println( "Bonus: " + bonus);
		
		System.out.println("-------------------");
		
		
		//EMP2
		//When you don`t have the data
		
		Employee emp2 = new Employee();
		emp2.setId(1030);
		emp2.setName("Salary");
		emp2.setSalary(100000);
		emp2.setPosition("Director");
		
		emp2.display();
		bonus = emp2.calculateBonus(5);
		System.out.println( "Bonus: " + bonus);
		
		System.out.println("-------------------");

		//EMP3
		//When you have the data
		
		Employee emp3 = new Employee(1040,"Mike", 90000, "Accountant");
		
		emp3.display();
		bonus = emp3.calculateBonus(5);
		System.out.println( "Bonus: " + bonus);
		
		System.out.println("-------------------");
		
		//EMP4
		//When you have some of the data
				
		Employee emp4 = new Employee(1040,"Martha");
		emp4.setSalary(200000);
		emp4.setPosition("Teacher");
				
		emp4.display();
		bonus = emp4.calculateBonus(5);
		System.out.println( "Bonus: " + bonus);
		

	}

}
