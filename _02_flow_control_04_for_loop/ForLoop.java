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
		
		/*traditional for loop*/
		
		int[] array = {1,12,3,7,8,9,4,5,2,11};
		//             0  1 2 3 4 5 6 7 8 9

		for(int i=0; i < 10; i++) {
			
			if (array[i]==5) {
				System.out.println(i);			
				break;
			}
		}
		//Enhanced for-loop, for-each
		
		for (int hello : array) {
			System.out.println(hello);
		}
		
		

	}

}
