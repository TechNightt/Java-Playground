/*********************************************************************************************************************
 Return the Sum of the Two Smallest Numbers

Create a function that takes an array of numbers and returns the sum of the two lowest positive numbers.

Examples
sumTwoSmallestNums([19, 5, 42, 2, 77]) ➞ 7

sumTwoSmallestNums([2, 9, 6, -1]) ➞ 8

sumTwoSmallestNums([879, 953, 694, -847, 342, 221, -91, -723, 791, -587]) ➞ 563

sumTwoSmallestNums([3683, 2902, 3951, -475, 1617, -2385]) ➞ 4519

Notes
Don't count negative numbers.
Floats and empty arrays will not be used in any of the test cases.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Challenge {
	public static int sumTwoSmallestNums(int[] arr) {
		int[] posNums = Arrays.stream(arr)
			.filter(n -> n > 0)
			.sorted()
			.toArray();
		return (posNums.length >= 2) ? posNums[0] + posNums[1] : 0;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int sumTwoSmallestNums(int[] arr) {
		int index = 0;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] > 0 && arr[i] < smallest) {
				smallest = arr[i];
				index = i;
			}
		}
		
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; ++i) {
			if (i == index) {
				continue;
			}
			
			if (arr[i] > 0 && arr[i] < small) {
				small = arr[i];
			}
		}
		
		return smallest + small;
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int sumTwoSmallestNums(int[] arr) {
		int smallest = 100000000;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest && arr[i] > 0) {
				smallest = arr[i];
				index = i;
			} 
		}
		int secondSmallest = 100000000;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			if (arr[i] < secondSmallest && arr[i] > 0) {
				secondSmallest = arr[i];
			} 
		}
		return smallest + secondSmallest;
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int sumTwoSmallestNums(int[] arr) {
		int smallest = Integer.MAX_VALUE, secSmallest = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i >= 0 && i < smallest) {
				secSmallest = smallest;
				smallest = i;
			} else if (i >= 0 && i < secSmallest) {
				secSmallest = i;
			}
		}
		return secSmallest + smallest;
	}
}