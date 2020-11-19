/*********************************************************************************************************************
 Recursion: Array Sum

Write a function that finds the sum of an array. Make your function recursive.

Examples
sum([1, 2, 3, 4]) ➞ 10

sum([1, 2]) ➞ 3

sum([1]) ➞ 1

sum([]) ➞ 0

Notes
Return 0 for an empty array.
Check the Resources tab for info on recursion.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Program {
	public static int sum(int[] arr) {
 if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }


        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
	public static int sum(int[] arr) {
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			result = arr[i]+result;
		}
		return result;
	}
}

