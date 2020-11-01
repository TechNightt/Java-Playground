package com.code_wars.kyu8.total_amount_of_points.solution1;

/**
 * 
 * = Kata's Name =<br>
 * Total amount of points<br><br>
 * = Description = <br><br>
 * Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.<br><br>
 * For example: ["3:1", "2:2", "0:1", ...]<br><br>
 * Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:<br><br>
 * if x>y - 3 points<br>
 * if x<y - 0 point<br>
 * if x=y - 1 point<br><br>
 * Notes:<br><br>
 * there are 10 matches in the championship<br>
 * 0 <= x <= 4<br>
 * 0 <= y <= 4
 * 
**/


public class TotalPoints {  
	
	// *************************************************************************************************
	// * This method is used to take collection and counts the points of our team in the championship. *
	// *************************************************************************************************
	public static int points(String[] games) {
	    int count = 0;
	    for(int i = games.length - 1; i >= 0; --i) 
	      if(games[i].split(":")[0].charAt(0) > games[i].split(":")[1].charAt(0)) 
	        count += 3;
	      else if(games[i].split(":")[0].charAt(0) == games[i].split(":")[1].charAt(0))
	        count += 1;   
	    return count;
	}
	
}