package com.simplilearn.fsc;

public class Variable {

	public static void main(String[] args) {
		
		/*Java has two variable types
		 * 1.Primitive
		 * 2.Non Primitive
		 */
		
		//Integer Data Types	
		
		int a = Integer.MIN_VALUE; // <-- Mostly used 4 bytes
		long b = Long.MAX_VALUE; //8 bytes
		short c = Short.MAX_VALUE; //2 bytes
		byte d = Byte.MIN_VALUE; // 1 byte
		
		//Decimal Data Types
		
		double e = 3.4525999999; // 8 bytes, recognize until 15 digits after the dot
		float f = 3.4523567F; // 4 bytes, only recognize 7 digits after the dot
		
		
		//Text Data Type
		
		
		char g = 'A';
		char[] s = {'S', 'i', 'm', 'p', 'l', 'g'};
		
		String h = "Simplilearn"; //It is a non-primitive Built-in class
		
		Boolean i = false; // 1 bite
		
		var j = 5.4;
		
		var k = "Hello world";
		
		System.out.println("The MIN value of a is "+ a);
		System.out.println("The MAX value of b is "+ b);
		System.out.println("The MAX value of c is "+ c);
		System.out.println("The MIN value of d is "+ d);
		System.out.println("The value of e is "+ e);
		System.out.println("The value of f is "+ f);
		
		System.out.println("The value of g is "+ g);
		System.out.println("The value of h is "+ h);
		System.out.println("The value of s is "+ s);
		System.out.println("The value of s is "+ new String(s)); // assigning a new value to s
		System.out.println("The value of i is "+ i);
		System.out.println("The value of j is "+ j);
		System.out.println("The value of k is "+ k);
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if ( str1 == str2 ) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Different");		
		}
		
	
		System.out.println(str1);
		
	}

}
