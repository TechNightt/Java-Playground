/*********************************************************************************************************************
 
Difference of Max and Min Numbers in Array

Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
	public static int differenceMaxMin(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1]-arr[0];
	}
}






//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int differenceMaxMin(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1 ; i < arr.length ; i++) {
			if (arr[i] > min) {
				min = arr[i];
			} else if (arr[i] < max) {
				max = arr[i];
			}
		} 
		
		return min-max;
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int differenceMaxMin(int[] arr) {
		int zI = arr[0];
		int max = zI;
		int min = zI;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		} return max - min;
	}
}


