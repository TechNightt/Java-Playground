package com.code_wars.kyu8.a_needle_in_the_haystack.solution1;

/**
  * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 * After your function finds the needle it should return a message (as a string) that says
 * "found the needle at position " plus the index it found the needle, so
 * findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
 * should return "found the needle at position 5"

**/
public class Kata {
	
	// *********************************************************
	// * This method is used to find String 'needle' in array. *
	// *********************************************************
    
    
    
    public static String findNeedle(Object[] haystack) {
		for(int i = haystack.length - 1; i >= 0; --i)
			if(haystack[i] instanceof String && haystack[i].toString().equals("needle"))
				return "found the needle at position " + i;
		return null;
	}
  
}