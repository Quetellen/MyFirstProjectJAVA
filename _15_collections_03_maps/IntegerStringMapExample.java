package com.simplilearn.fsc._15_collections_03_maps;

import java.util.HashMap;
import java.util.Map;

public class IntegerStringMapExample {
	
	/*It is a collection of elements in a key-value format. 
	 * The elements are indexed by key. 
	 * 
	 * It does not allow duplicate keys. But allow duplicate values
	 * It does not keep insertion order. 
	 * 
	 * We use map to searching in memory. 
	 * Time complexity – O(1) - Constant
	 * 
	 * Implements Hash Algorithm
	 * 
	 * LinkedHashMap - Keeps the insertion order
	 * TreeMap - Sorts the map by keys.
	 * 
	 */

	public static void main(String[] args) {
		
		Map <Integer, String> quetellen = new HashMap<>();

		quetellen.put(2001,  "John");
		quetellen.put(4157,  "Jane");
		quetellen.put(6731,  "Mike");
		quetellen.put(9342,  "Pete");
		
		System.out.println(quetellen);
		System.out.println("-----------------");
	
		System.out.println(quetellen.get(6731));
		System.out.println("-----------------");

		System.out.println(quetellen.size());
		System.out.println("-----------------");
		
		System.out.println(quetellen.containsKey(2001));
		System.out.println("-----------------");
		
		System.out.println(quetellen.get(6732));
		System.out.println("-----------------");
		
	}

}
