package com.code_wars.kyu8.duck_duck_goose.solution1;

/**
 * 
 * = Kata's Name =<br>
 * Duck Duck Goose<br><br>
 * = Description = <br><br>
 * The objective of Duck, duck, goose is to walk in a circle, tapping on each player's head until one is chosen.<br><br>
 * Task: Given an array of Player objects (an array of associative arrays in PHP) and an index (1-based), return the name of the chosen Player(name is a property of Player objects, e.g Player.name)<br><br>
 * Example:<br><br>
 * duck_duck_goose([a, b, c, d], 1) should return a.name<br>
 * duck_duck_goose([a, b, c, d], 5) should return a.name<br>
 * duck_duck_goose([a, b, c, d], 4) should return d.name<br>
 * // PHP only<br>
 * duck_duck_goose([$a, $b, $c, $d], 1); // => $a["name"]<br>
 * duck_duck_goose([$a, $b, $c, $d], 5); // => $a["name"]<br>
 * duck_duck_goose([$a, $b, $c, $d], 4); // => $d["name"]
 * 
**/
public class Kata {
	
	// ************************************************************************
	// * This method is used to return what is explained in Kata description. *
	// ************************************************************************	
	public static String duckDuckGoose(Player[] players, int goose) {
		goose = goose % players.length;
		goose = goose == 0 ? players.length : goose;
		return players[goose - 1].name;
	}
  
}


