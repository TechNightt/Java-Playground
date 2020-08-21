package com.code_wars.kyu8.century_from_year.solution1;

/**
 * Given a year, return the century it is in.<br><br>
 * Input , Output Examples ::<br>
 * centuryFromYear(1705)  returns (18)<br>
 * centuryFromYear(1900)  returns (19)<br>
 * centuryFromYear(1601)  returns (17)<br>
 * centuryFromYear(2000)  returns (20)<br><br>
 * Hope you enjoy it .. Awaiting for Best Practice Codes<br><br>
 * Enjoy Learning !!!
**/



 //#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Solution {
	
	// ************************************************************************
	// * This method is used to calculate the century out of number of years. *
    // ************************************************************************
	public static int century(int number) {
		return number % 10 > 0 || number % 100 > 0 ? number / 100 + 1 : number / 100;
	}	
  
}