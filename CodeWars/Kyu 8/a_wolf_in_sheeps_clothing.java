package com.code_wars.kyu8.a_wolf_in_sheeps_clothing.solution1;

/**
  * A wolf in sheep's clothing
 * Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.<br><br>
 * Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:<br><br>
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)<br>
 *    7      6      5      4      3            2      1<br><br>
 * If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.<br><br>
 * Note: there will always be exactly one wolf in the array.<br><br>
 * Examples
 * warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1! You are about to be eaten by a wolf!"<br><br>
 * warnTheSheep(["sheep", "sheep", "wolf"]) === "Pls go away and stop eating my sheep"
 * 
**/
public class ZywOo {
	
	// *****************************************************************
	// * This method checks if received array contains specific words. *
    // *****************************************************************
	public static String warnTheSheep(String[] array) {   
		int i = 0;
	    if(array[array.length - 1].equals("wolf"))
	    	return "Pls go away and stop eating my sheep";
	    for(; i < array.length && array[i].equals("sheep"); ++i){}      
	    	return "Oi! Sheep number " + (array.length - 1 - i)
	    		 + "! You are about to be eaten by a wolf!";
	}
  
}