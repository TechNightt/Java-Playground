package com.code_wars.kyu8.area_of_a_square.solution1;

/*
 * Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.<br><br>
 * Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
 */

public class Geometry{
	
	// ***********************************************************************************************
	// * This method is used to calculate area of a square by number that is received by the method. *
	// *******************************************************************************************	****
	public static double squareArea(double A) {
		return Math.floor(A / Math.PI  * A / Math.PI * 400) / 100;
	}
  
}