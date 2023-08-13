package com.simplilearn.fsc._07_inheritance;


class Person { //Parent class - Base - SuperClass
	String name;
	int age;
	
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person - " + name + " " + age;
	}
	
}


//DRY Principal - Don`t repeat yourself (reuse code)
class Employee extends Person { //Child class - Derived - SubClass 
	
	int id;
	double salary;
	String position;
	
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
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
	
	
	/* 
	 * Overriding -  It is a type of polymorphism
	 * Is the situation where a method inherited is overridden in the child class
	 */
	
	
	/*
	public String toString() {   // This is overriding 
		return "Employee - " + id + " " + name + " " + age + " " + position;
	}
	*/
	/* There`s an annotation that evaluates if the method exists in the parent class (@Override)
	 * 
	@Override
	public String toString() {   // This is overriding 
		return "Employee - " + id + " " + name + " " + age + " " + position;
	}
	*/
	
	
	
	/*
	 * This was created by Oracle with this path:
	 * Right click -> Source -> Generate toString()
	 */
	
	@Override
	public String toString() {
		return String.format("Employee [id=%s, salary=%s, position=%s, name=%s, age=%s]", id, salary, position, name,
				age);
	}
	
}

class Customer extends Person{
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setId(1);
		emp1.setName("Joe");
		emp1.setAge(40);
		emp1.setSalary(120000);
		emp1.setPosition("Architect");
		
		//Customer cust1 = new Customer();
		
		System.out.println(emp1.toString());
		
		//Person per1 = new Person();
		
		//per1.

	}

}
