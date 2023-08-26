package com.simplilearn.fsc._15_collections_02_sets;

import java.util.TreeSet;

public class TreeSetExample3 {
	
	/*
	 * Set is a collection that does not allow duplicates
	 * 
	 * Sorts the elements in the set, but it comes with a cost.
	 * The performance is NOT as good as the traditional HashSet
	 * 
	 */

	public static void main(String[] args) {
		
		TreeSet<String> quetellen = new TreeSet<>();
		
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
