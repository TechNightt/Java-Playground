package com.code_wars.kyu8.find_maximum_and_minimum_values_of_a_list.solution1;

/**
 * 
  * Your task is to make two functions, max and min (maximum and minimum in PHP and Python) that take a(n) array/vector of integers list as input and outputs, respectively, the largest and lowest number in that array/vector.<br><br>
 * #Examples<br><br>
 * max({4,6,2,1,9,63,-134,566}) returns 566<br>
 * min({-52, 56, 30, 29, -54, 0, -110}) returns -110<br>
 * max({5}) returns 5<br>
 * min({42, 54, 65, 87, 0}) returns 0<br><br>
 * #Notes<br><br>
 * You may consider that there will not be any empty arrays/vectors.
**/

import java.util.Arrays;

public class Kata {

	// *******************************************************
	// * This method is used to fin minimum number is array. *
	// *******************************************************
	public int min(int[] list) {
		return Arrays.stream(list).min().getAsInt();
	}
	
	// *******************************************************
	// * This method is used to fin maximum number is array. *
	// *******************************************************
	public int max(int[] list) {
		return Arrays.stream(list).max().getAsInt();
	}
  
}