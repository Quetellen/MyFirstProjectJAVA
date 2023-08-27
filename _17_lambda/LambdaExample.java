package com.simplilearn.fsc._17_lambda;

@FunctionalInterface
interface Sayable{
	String say();
}


public class LambdaExample {

	public static void main(String[] args) {
		
		/*MyClass obj = new MyClass();  We don`t have to do this because we don`t 
		 * need to create a class with a lambda expression */

		/*
		 * LAMBDA EXPRESSION COMPONENTS
		 * 
		 * 1. List of parameters 
		 * 2. Arrow token
		 * 3. Body
		 * 
		 * BREAKING DOWN THE LAMBDA EXPRESSION
		 * -Initializing the OBJECT - 
		 * 			Sayable obj = 
		 * -List of PARAMETERS-
		 *  		() 
		 * -ARROW TOKEN-
		 *  		->
		 * -BODY-
		 *  		{
						return "I love Java";
							};
					System.out.println(obj.say());
		 * 
		 */
		Sayable obj = () ->{
						return "I love Java";
							};
					System.out.println(obj.say());
	}

}