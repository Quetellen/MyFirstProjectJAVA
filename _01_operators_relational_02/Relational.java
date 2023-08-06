package com.simplilearn.fsc._01_operators_relational_02;

public class Relational {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		/*We should ONLY use relational operators with primitives*/
		
		boolean equalTo =  a==b; /* Used to compare values*/
		boolean notEqual =  a!=b; /* Used to compare values*/
		boolean graterThan =  a>b; /* Used to compare values*/
		boolean lessThan =  a<b; /* Used to compare values*/
		boolean graterThanEqual =  a>=b; /* Used to compare values*/
		boolean lessThanEqual =  a<=b; /* Used to compare values*/
		
		System.out.println("Equal To " + equalTo);
		System.out.println("Not Equal To " + notEqual);
		System.out.println("Grater Than " + graterThan);
		System.out.println("Less Than " + lessThan);
		System.out.println("Grater Than Equal " + graterThanEqual);
		System.out.println("Less Than Equal " + lessThanEqual);
		
		/* This is why we don`t compare Non-primitives values*/
		
		String s1 = new String("Hello"); // This is saved in a different memory address
		String s2 = new String("Hello"); // This is saved in a different memory address
		/* So, JAVA thinks you want to compare the memory address
		 * of the non-primitive values. That`s why the result is false even though
		 * they have the same string value ("Hello").
		 * */
		boolean bstr = s1==s2;
		
		System.out.println(bstr); // Prints false because they are non-primitives values

	}

}
