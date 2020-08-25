package com.code_wars.kyu8.find_the_position.solution1;

/**
 * When provided with a letter, return its position in the alphabet.<br><br>
 * Input :: "a"<br><br>
 * Ouput :: "Position of alphabet: 1"<br><br>
 * This kata is meant for beginners. Rank and upvote to bring it out of beta
**/
public class Kata {
	
	// *************************************************************************
	// * This method is used to return position of the letter in the alphabet. *
	// *************************************************************************
	public static String position(char alphabet) {
		return "Position of alphabet: " + (alphabet - 96);
	}
  
}