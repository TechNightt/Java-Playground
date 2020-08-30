package com.code_wars.kyu8.kata_example_twist.solution1;

/**
 * 
 * This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).<br><br>
 * Add the value "codewars" to the array websites/Websites 1,000 times.<br><br>
 * String[] websites = {};<br>
 * return websites;
 * 
**/



import java.util.ArrayList;

public class KataExampleTwist {
	
	// **************************************************************************
	// * This method is used to add word "codewars" to an ArrayList 1000 times. *
    // **************************************************************************		
    public static String[] kataExampleTwist() {
      ArrayList<String> arr = new ArrayList<String>();
      for(int i = 1000; i >= 1; --i)
        arr.add("codewars");
      return arr.toArray(new String[arr.size()]);
    }
    
}