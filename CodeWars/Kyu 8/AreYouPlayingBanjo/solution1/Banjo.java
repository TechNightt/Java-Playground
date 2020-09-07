package com.code_wars.kyu8.are_you_playing_banjo.solution1;

/**
 * Create a function which answers the question "Are you playing banjo?".<br>
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!<br><br>
 * The function takes a name as its only argument, and returns one of the following strings:<br><br>
 * name + " plays banjo" <br>
 * name + " does not play banjo"<br><br>
 * Names given are always valid strings.

**/


public class Banjo {
	
	// ************************************************************************************************
	// * This method is used to check if String that received by the method includes specified words. *
	// ************************************************************************************************
	public static String areYouPlayingBanjo(String name) {
		return name.toLowerCase().charAt(0) == 'r' ? name + " plays banjo"  : name + " does not play banjo";
	}
	
}