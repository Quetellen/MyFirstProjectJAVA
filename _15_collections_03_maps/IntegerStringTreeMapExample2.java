package com.simplilearn.fsc._15_collections_03_maps;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.TreeMap;

public class IntegerStringTreeMapExample2 {
	
	/*
	 * It does NOT KEEP the insertion order!!!
	 * The Insertions are unique. Does NOT take duplicate KEY
	 */

	public static void main(String[] args) {
		
		Map <Integer, String> quetellen = new TreeMap<>();

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
		
		//for(Entry<Integer,String> entry: quetellen.entrySet()) {
		//	System.out.println(quetellen.getKey() + "," + entry.getValue());
		//	
		//}
		
		
		
		
	}

}
