package com.code_wars.kyu8.exclamation_marks_series_11_replace_all_vowel_to_exclamation_mark_in_the_sentence.solution1;

/**
 * Examples
 * replace("Hi!") === "H!!"<br>
 * replace("!Hi! Hi!") === "!H!! H!!"<br>
 * replace("aeiou") === "!!!!!"<br>
 * replace("ABCDE") === "!BCD!"<br>
 * Note<br><br>
 * Please don't post issue about difficulty or duplicate. Because:<br><br>
 * That's unfair on the kata creator. This is a valid kata and introduces new people to javascript some regex or loops, depending on how they tackle this problem. --matt c
 **/

 
public class Solution {
	
	// *********************************************************************
	// * This method is used to replace all vowels with exclamation marks. *
	// *********************************************************************
    public static String replace(final String s) {
      String res = "";
      for(int i = 0; i < s.length(); ++i)
        res = ("" + s.charAt(i)).matches("[aeiouAEIOU]") ? res + "!" : res + s.charAt(i);
      return res;
    }
    
}