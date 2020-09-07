package com.code_wars.kyu8.area_or_perimeter.solution1;

/**
  * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.<br>
 * If it is a square, return its area. If it is a rectangle, return its perimeter.<br><br>
 * area_or_perimeter(6, 10) --> 32<br>
 * area_or_perimeter(4, 4) --> 16<br><br>
 * Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, otherwise it is a rectangle.
**/

public class Solution {
	
	// *********************************************************************
	// * This method is used to calculate area of a rectangle or a square. *
	// *********************************************************************
    public static int areaOrPerimeter (int l, int w) {
        if(l == w)
          return l * w;
        return l * 2 + w * 2;
    }
    
}