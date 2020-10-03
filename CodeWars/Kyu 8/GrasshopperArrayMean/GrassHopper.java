package com.code_wars.kyu8.grasshopper__array_mean.solution1;

/**
 * = Kata's Name =<br>
 * Grasshopper - Array Mean<br><br>
 * = Description = <br><br>
 * Find Mean<br><br>
 * Find the mean (average) of a list of numbers in an array.<br><br>
 * Information<br><br>
 * To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.<br><br>
 * For an example list of 1, 3, 5, 7<br><br>
 * 1. Add all of the numbers<br><br>
 * 1+3+5+7 = 16<br><br>
 * 2. Divide by the number of values in the list. In this example there are 4 numbers in the list.<br><br>
 * 16/4 = 4<br><br>
 * 3. The mean (or average) of this list is 4
 * 
**/


import java.util.Arrays;

public class GrassHopper {
	
	// ******************************************************
	// * This method returns average from array of numbers. *
    // ******************************************************  
    public static int findAverage(int[] nums) {
        return (int)Arrays.stream(nums).average().getAsDouble();
    }
    
}