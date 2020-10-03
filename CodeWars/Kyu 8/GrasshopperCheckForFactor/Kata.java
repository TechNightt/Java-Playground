package com.code_wars.kyu8.grasshopper__check_for_factor.solution1;

/**
 * 
 * = Kata's Name 
 * Grasshopper - Check for factor
 * = Description 
 * This function should test if the factor is a factor of base.<br><br>
 * Return true if it is a factor or false if it is not.<br><br>
 * About factors
 * Factors are numbers you can multiply together to get another number.<br><br>
 * 2 and 3 are factors of 6 because: 2 * 3 = 6<br><br>
 * You can find a factor by dividing numbers. If the remainder is 0 then the number is a factor.<br>
 * You can use the mod operator (%) in most languages to check for a remainder<br><br>
 * For example 2 is not a factor of 7 because: 7 % 2 = 1<br><br>
 * Note: base is a non-negative number, factor is a positive number.
 * 
**/


public class Kata {
	
	// *************************************************************
	// * This method checks if the factor is a factor of the base. *
    // ************************************************************* 
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
    
}