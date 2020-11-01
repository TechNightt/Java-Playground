package com.code_wars.kyu8.triple_trouble.solution1;

/**
 *
 * = Kata's Name =<br>
 * Triple Trouble<br><br>
 * = Description = <br><br>
 * Triple Trouble<br><br>
 * Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!<br><br>
 * E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"<br><br>
 * Note: You can expect all of the inputs to be the same length.
 * 
**/


public class Kata {
	
	// **************************************************************************
	// * This method is used to return group of all letters next to each other. *
	// **************************************************************************	
	public static String tripleTrouble(String one, String two, String three) {
	    String res = "";
	    for(int i = 0; i < one.length(); ++i)
	      res += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
	    return res;
	}
  
}