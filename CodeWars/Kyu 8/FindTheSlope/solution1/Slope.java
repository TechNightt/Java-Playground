package com.code_wars.kyu8.find_the_slope.solution1;

/**
 * Given an array of 4 integers<br>
 * [a,b,c,d] representing two points (a, b) and (c, d), return a string representation of the slope of the line joining these two points.<br><br>
 * For an undefined slope (division by 0), return undefined . Note that the "undefined" is case-sensitive.<br><br>
 *    a:x1<br>
 *    b:y1<br>
 *    c:x2<br>
 *    d:y2```<br><br>
 * Assume that ```[a,b,c,d]``` and the answer are all integers <br>
 * (no floating numbers!).<br>
 * Slope: <https://en.wikipedia.org/wiki/Slope><br>
**/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Slope {
	
	// *************************************************************************************************************
	// * This method is used to return a string representation of the slope of the line joining these two points.. *
	// *************************************************************************************************************
	public String slope(int[] ps) {
		if(ps[2] - ps[0] == 0) 
			return"undefined";
		return String.valueOf((ps[3] - ps[1]) / (ps[2] - ps[0]));
	}

}