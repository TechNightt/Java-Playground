package com.code_wars.kyu8.find_the_smallest_integer_in_the_array.solution1;

/**
 * Given an array of integers your solution should find the smallest integer.<br><br>
 * For example:<br><br>
 * Given [34, 15, 88, 2] your solution will return 2<br>
 * Given [34, -345, -1, 100] your solution will return -345<br><br>
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.

**/
import java.util.Arrays;

public class SmallestIntegerFinder {
	
	// ******************************************************************
	// * This method is used to find the smallest integer in the array. *
	// ******************************************************************
    public static int findSmallestInt(int[] args) {
      return Arrays.stream(args).min().getAsInt();
    }
    
}