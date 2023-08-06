package com.simplilearn.fsc._02_flow_control_03_while_loop;

public class WhileLoop {

	public static void main(String[] args) {


		int i =0;
		
		while (i < 10) {
			
			i++;

			if (i==5) {
				continue;
			}

			System.out.println(i);
			// i= i + 2;
			// i += 3;
		}
		
		
		System.out.println("**************");
		
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}

}
