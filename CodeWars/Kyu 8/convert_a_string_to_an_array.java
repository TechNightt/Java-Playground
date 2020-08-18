package com.code_wars.kyu8.convert_a_string_to_an_array.solution1;

/**
 * Convert a string to an array<br><br>
 * = Description = <br><br>
 * Write a function to split a string and convert it into an array of words. For example:<br><br>
 * "Robin Singh" ==> ["Robin", "Singh"]<br><br>
 * "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 **/
public class Solution {

	// ******************************************************
	// * This method is used to convert String to String[]. *
    // ******************************************************

    
    public static String[] stringToArray(String s) {
      return s.split(" ");
    }

}