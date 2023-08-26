package com.simplilearn.fsc._15_collections_01_lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	
	/*
	 * ArrayList is a JAVA Collection that implements the List interface
	 * 
	 * 1. ArrayLists keep the insertion order
	 * 2. Can hold duplicate values
	 * 
	 * LikedList: Uses a linked list internally. Are more efficient than a 
	 * ArrayList if you are going to modify the elements in the list frequently 
	 */

	public static void main(String[] args) {
		
//Here we are declaring the list    =   Her we are allocating memory 
		LinkedList<String> quetellen = new LinkedList<>();

		quetellen.add("John"); //0
		quetellen.add("John"); //1
		quetellen.add("Jane"); //2
		quetellen.add("Mike"); //3
		quetellen.add("Pete"); //4
		quetellen.add("Mike"); //5
		
		
		for(String str:quetellen) {
			System.out.println(str);
			
		}
		
		System.out.println("*******************");
		
		for (int i = 0; i < quetellen.size(); i++) {
			System.out.println(quetellen.get(i));
		}
		
		System.out.println("*******************");
		
		System.out.println(quetellen.get(3));
		
		System.out.println("*******************");
		
		quetellen.add(3, "Nick");
		
		System.out.println(quetellen);
		
		System.out.println("*******************");
		
		quetellen.set(3,"Lili");
		
		System.out.println(quetellen);
		
		System.out.println("*******************");

		quetellen.remove(0);

		System.out.println(quetellen);
	
		System.out.println("*******************");
	
		boolean b = quetellen.remove("Mike1");
	
		System.out.println(b);
		
		System.out.println("*******************");

		quetellen.clear();
		
		System.out.println(quetellen);
		
		
		System.out.println("*******************");
		
		
		
	
	
	
	}

}
