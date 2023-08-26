package com.simplilearn.fsc._15_collections_02_sets;

import java.util.HashSet;

public class StringSetExample {
	
	/*
	 * Set is a collection that does not allow duplicates
	 * 
	 * Does not keep the insertion order
	 */

	public static void main(String[] args) {
		
		HashSet<String> quetellen = new HashSet<>();
		
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
