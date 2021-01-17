package com.code_wars.kyu6.detect_pangram.solution1;

/**
 * 
 * = Kata's Name =<br>
 * Detect Pangram<br><br>
 * = Description = <br><br>
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).<br><br>
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 * 
**/
public class PangramChecker {
	
	// ************************************************************************
	// * This method is used to detect if a given String is a pangram or not. *
	// ************************************************************************	
	public boolean check(String sentence){
	    byte[] arr = new byte[26];
	    for (int i = sentence.length() - 1; i >= 0; i--) 
	      if(sentence.toLowerCase().charAt(i) >= 'a' && sentence.toLowerCase().charAt(i) <= 'z')
	        arr[sentence.toLowerCase().charAt(i) - 'a']++;    
	    for (int i = arr.length - 1; i >= 0; i--) 
	      if(arr[i] == 0)
	        return false;   
	    return true;
	}
  
}