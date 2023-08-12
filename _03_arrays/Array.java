package com.simplilearn.fsc._03_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int i0= 4;
		int i1= 5;
		int i2= 7;
		int i3= 2;
		int i4= 14;
		int i5= 35;
		int i6= 46;
		int i7= 71;
		int i8= 28;
		int i9= 19;
		
		int[] array = {4,5,7,2,14,35,46,71,28,19, 100, 102}; //Declaring and initializing the array because you already have the values
		//         0 1 2 3 4  5   6  7  8  9
		
		//ARRAY LIST
		
		//List<Integer> list = new ArrayList<>();
		//list.size();
		
		//int [] array2 = new int[10];
	
		
		array[4] = 91;
		array[array.length-1] =67; // changing the last array
		
		System.out.println(Arrays.toString(array));
		
		
		//System.out.print(array[10]);
	
		//for arrays is better to use the for each loop
		/*
		 * Arrays Javadoc 17 (you can search that to look
		 *  for the class and documentations and find the method that you are looking for)
		 * */
		
		/*
		for (int num: array) {
			System.out.print(num + "\n");
		}*/
	
		for (int i=0; i<array.length; i++) {
			System.out.print(array[1]);
		}
		
		
		
		/*
		int[] b = new int [10]; //Declaring and allocating values for the array
		*/
		
		// All the values in the ARRAY must be the same type
	
		//int size = 20; // get the size from rs.size()
		// a = new int [size];
		
		String[] brands = {"Toyota", "Ford", "Nissan", "BMW"};
		
		String [] d = new String[4];
		d[0] = "John";
		d[1] = "Jane";
		
		System.out.println(Arrays.toString(d));
		
		//MULTIDINMENTIONAL ARRAYS
		int [][] e = { {3,4},{5,6}, {-1,4} };
		//                0      1
		System.out.println(e[2][0]);
		
		for (int i=0; i<e.length; i ++) {
			for (int j=0; j<e[i].length; j++) {
				System.out.println(e[i][j] + ",");
			}
			System.out.println("\n");
		}
		
		
	
	}
}
