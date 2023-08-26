package com.simplilearn.fsc._15_collections_02_sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExample2 {
	
	/*
	 * Set is a collection that does not allow duplicates
	 *
	 * KEEP the insertion order, implements a LinkedList internally
	 * but the performance is NOT as good as the traditional HashSet
	 */

	public static void main(String[] args) {
		
		Set<String> quetellen = new LinkedHashSet<>();
		
		quetellen.add("John");
		quetellen.add("John");
		quetellen.add("Jane");
		quetellen.add("Mike");
		quetellen.add("Pete");
		quetellen.add("Mike");

		System.out.println(quetellen);	
		System.out.println("--------------------");
	
		quetellen.remove("John");
		System.out.println(quetellen);
		System.out.println("--------------------");
		
		System.out.println(quetellen.size());
		System.out.println("--------------------");
		
		System.out.println(quetellen.contains("Jane"));
		System.out.println("--------------------");
		
		System.out.println(quetellen.contains("Jane1"));
		
		
		
		
		
		
		
		
		
		
	}

}
