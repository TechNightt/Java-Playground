/*********************************************************************************************************************
 
Get the Sum of All Array Elements
Create a function that takes an array and returns the sum of all numbers in the array.

Examples
sum([2, 7, 4]) ➞ 13

sum([45, 3, 0]) ➞ 48

sum([-2, 84, 23]) ➞ 105
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   

import java.util.Arrays;

public class Program {
  public static int arraySum(int[] arr) {
		return Arrays.stream(arr).sum();
	}
}


