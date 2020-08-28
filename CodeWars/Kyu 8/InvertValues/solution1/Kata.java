package com.code_wars.kyu8.invert_values.solution1;

/**
 * 
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.<br><br>
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]<br>
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]<br>
 * invert([]) == []
 * 
 * **/

 
import java.util.Arrays;

public class Kata {
	
	// ***************************************************
	// * This method is used to invert numbers in array. *
    // ***************************************************
	public static int[] invert(int[] array) {
		return Arrays.stream(array).map(i -> -1 * i).toArray();
	}
  
}