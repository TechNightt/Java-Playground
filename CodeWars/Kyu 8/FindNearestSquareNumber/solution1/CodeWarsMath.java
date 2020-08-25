package com.code_wars.kyu8.find_nearest_square_number.solution1;

/**
  * Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.<br><br>
 * Goodluck :)<br><br>
 * Check my other katas:<br><br>
 * Alphabetically ordered<br><br>
 * Case-sensitive!<br><br>
 * Not prime numbers
**/



public class CodeWarsMath {
	
	// ******************************************************************************************
	// * This method is used to find nearest square of a number that is received by the method. *
	// ******************************************************************************************	
	public static int nearestSq(final int n){
		return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
	}
  
}