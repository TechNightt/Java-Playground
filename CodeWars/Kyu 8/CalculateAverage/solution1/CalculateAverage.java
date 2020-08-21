package com.code_wars.kyu8.calculate_average.solution1;

/**
* Write function avg which calculates average of numbers in given list.
**/



 //#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


import java.util.Arrays;

public class Kata {
	
	// ***********************************************************************************
	// * This method returns average of numbers in array that is received by the method. *
    // ***********************************************************************************
	public static double find_average(int[] array){
		return Arrays.stream(array).average().getAsDouble();
	}
  
}