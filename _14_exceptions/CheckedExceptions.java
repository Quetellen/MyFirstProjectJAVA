package com.simplilearn.fsc._14_exceptions;

import java.io.BufferedReader;

/*
 * Checked exceptions don`t inherit from RuntimeExceptions as Unchecked exceptions do.
 * 
 *  Options:
 *  
 *  1. Handle the Checked Exception
 *  2. Throw the exception up to the caller.
 */


public class CheckedExceptions {
	
	void process() {
		// 1. Open the file.
		// 2. Read the file line by line.
		// 3. Close the file.
		
		BufferedReader file = null;
		
		//file = File.open("testfile.txt");
	}

	public static void main(String[] args) {
		
		CheckedExceptions obj = new CheckedExceptions();
		obj.process();
		
	}

}
