package com.simplilearn.fsc._04_strings;

public class Strings {

	public static void main(String[] args) {
		
		String str1 ="Simplilearn loves Java";
		//String str1 ="Simplilearn loves \t Java";
		/*
		strg1 = "Hello"; 
		//Here the string was not changed, it was created a new one and the variable strg1 is going to the memory address for the new string.
		*/
		
		System.out.println(str1);
		System.out.println(str1.length());
		
		String str2 = "Hello";
		String str3 = str1 + " " + str2;
		//str3 = str2.concat(" ").concat(str1);
		
		System.out.println(str3);
		
		String str5 = " Hello Java ";
		System.out.println("-->" + str5 + "<--");
		System.out.println("-->" + str5.trim() + "<--");
		
		str5 = str5.trim();
		
		System.out.println("-->" + str5 + "<--");
		String str6 = "HELLO";
		//			   01234
		String str7 = "HELLO";
		String str8 = "hello";
		
		System.out.println(str6.charAt(3));

		System.out.println(str6.contains("ELX"));
		System.out.println(str6.contains("EL"));

		System.out.println(str6.equals(str7));

		System.out.println(str6.equals(str8));
		System.out.println(str6.equalsIgnoreCase(str8));
		
		String str9 = "I love Java";
		//			   012345678910
		
		System.out.println(str9.replace("love","hello"));
		System.out.println(str9.replace("a","hello"));
		System.out.println(str9);
		
		//Substring method
		
		System.out.println(str9.substring(7));
		System.out.println(str9.substring(7,8)); //	System.out.println(str9.substring(7firstIndex,endIndex));
		
		/*DATA TYPE MUTABLE 
		 * String builder and string buffer (use the same space of memory)
		*/
		//STRING BUFFER
		StringBuffer strB = new StringBuffer("Hello");
		strB.append(" Java"); //Here we are overriding the original string and modifying 
		System.out.println(strB);
				

	}

}
