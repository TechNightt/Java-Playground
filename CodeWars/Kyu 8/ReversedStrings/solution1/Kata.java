package com.code_wars.kyu8.reversed_strings.solution1;

/**
 * 
 * Complete the solution so that it reverses the string value passed into it.<br><br>
 * Kata.solution("world") //returns "dlrow"
 * 
 * 
**/



public class Kata {

	// ***********************************************************************
	// * This method is used to return reversed string value passed into it. *
	// ***********************************************************************
	public static String solution(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}