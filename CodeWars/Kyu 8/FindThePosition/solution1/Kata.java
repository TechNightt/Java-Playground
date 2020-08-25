package com.code_wars.kyu8.find_the_position.solution1;

/**
 * Created by Julian Ghoncharenko.<br><br>
 * = Kata's Name =<br>
 * Find the position!<br><br>
 * = Description = <br><br>
 * When provided with a letter, return its position in the alphabet.<br><br>
 * Input :: "a"<br><br>
 * Ouput :: "Position of alphabet: 1"<br><br>
 * This kata is meant for beginners. Rank and upvote to bring it out of beta
 * @author Julian Ghoncharenko
**/
public class Kata {
	
	// *************************************************************************
	// * This method is used to return position of the letter in the alphabet. *
	// *************************************************************************
	public static String position(char alphabet) {
		return "Position of alphabet: " + (alphabet - 96);
	}
  
}