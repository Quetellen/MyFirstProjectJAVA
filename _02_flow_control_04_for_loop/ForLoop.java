package com.simplilearn.fsc._02_flow_control_04_for_loop;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		while (i < 10) {
			System.out.println(i);
			i++;
			// i= i + 2;
			// i += 3;
		}
		*/
		
		/*
		for(int i=0; i < 10; i++) {
			System.out.println(i);
		}
		*/
		int[] array = {1,2,3,4,5};
		//Enhanced for-loop, for-each
		
		for (int hello : array) {
			System.out.println(hello);
		}
		
		

	}

}
