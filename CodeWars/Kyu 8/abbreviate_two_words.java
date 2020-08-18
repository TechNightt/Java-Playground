package com.code_wars.kyu8.abbreviate_a_two_word_name.solution1;

/**
  *Kata's Name 
 * Abbreviate a Two Word Name
 *  * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.<br><br>
 * The output should be two capital letters with a dot separating them.<br><br>
 *  *
**/
public class AbbreviateTwoWords {

	// ********************************************************************
	// * This method mutates the received String by specific set of rules. *
    // ********************************************************************
    
    
    
    
    public static String abbrevName(String name) {
		return name.split(" ")[0].toUpperCase().charAt(0) 
	         + "." 
	         + name.split(" ")[1].toUpperCase().charAt(0);
	}
  
}