package com.simplilearn.fsc._15_collections_03_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerStringLinkedMapExample2 {
	
	/*
	 * It KEEPS the insertion order but the performance is not the same!!!
	 * The Insertions are unique. Does NOT take duplicate KEY
	 */

	public static void main(String[] args) {
		
		Map <Integer, String> quetellen = new LinkedHashMap<>();

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
