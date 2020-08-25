package com.code_wars.kyu8.find_numbers_which_are_divisible_by_given_number.solution1;

/**
 * Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.<br><br>
 * Example<br>
 * divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
**/
import java.util.Arrays;




public class EvenNumbers {
	
	// ***************************************************************************************************
	// * This method is used to check and return all numbers in array that are divisible by the divider. *
	// ***************************************************************************************************	
	public static int[] divisibleBy(int[] numbers, int divider) {
		return Arrays.stream(numbers)
					 .filter(i -> i % divider == 0)
					 .toArray();
	}
  
}