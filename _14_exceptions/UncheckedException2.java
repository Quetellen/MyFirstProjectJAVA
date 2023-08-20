package com.simplilearn.fsc._14_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException2 {

	void process() {
		//Scanner scan = null;
		
		int num = -1;
		int result =0;
		
		while (num<=0) {
	
		try	(Scanner scan = new Scanner(System.in)){
		
			System.out.println("Please Input a Number");
		
			String str = scan.next();
			
			num = Integer.valueOf(str);
		
			result = 100/num;		
			
		}
		catch(InputMismatchException | ArithmeticException ex) {
			
			//ex.printStackTrace();
			
			System.out.println("Dear User, your input is invalid, Please try again!");
			
		}
		/*
		 * this is not a good approach because you don`t know what exception 
		 * you are handling, unless you still want to handle an error but you
		 * don`t know yet which one it is.
		 */
		
		//catch(Exception ex) {
			
		//ex.printStackTrace();
			
		//System.out.println("Dear User, your input is invalid, Please try again!");
			
		//}
		}
		System.out.println("The result is: " + result);
	}
	
	
	public static void main(String[] args) {
		
		UncheckedException2 obj = new UncheckedException2();
		obj.process();

	}

}
