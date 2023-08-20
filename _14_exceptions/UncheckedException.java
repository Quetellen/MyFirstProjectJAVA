package com.simplilearn.fsc._14_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	void process() {
		
		Scanner scan = null;
	
		try {
			scan = new Scanner(System.in);
		
			System.out.println("Please Input a Number");
		
			int num = scan.nextInt();
		
			int result = 100/num;		
			
			System.out.println("The result is: " + result);
		}
		catch(InputMismatchException | ArithmeticException ex) {
			
			ex.printStackTrace();
			
			System.out.println("Dear User, your input is invalid, Please try again!");
			
		}
		/*
		 * this is not a good approach because you don`t know what exception 
		 * you are handling, unless you still want to handle an error but you
		 * don`t know yet which one it is.
		 */
		
		catch(Exception ex) {
			
		ex.printStackTrace();
			
		System.out.println("Dear User, your input is invalid, Please try again!");
			
		}
		finally {
			System.out.println("Always Executed");
			scan.close();
		}
	}
	
	
	public static void main(String[] args) {
		
		UncheckedException obj = new UncheckedException();
		obj.process();

	}

}
