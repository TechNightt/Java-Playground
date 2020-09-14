/*********************************************************************************************************************
 Nth Smallest Element

Given an unsorted array, create a function that returns the nth smallest element (the smallest element is the first smallest, the second smallest element is the second smallest, etc).

Examples
nthSmallest([1, 3, 5, 7], 1) ➞ 1

nthSmallest([1, 3, 5, 7], 3) ➞ 5

nthSmallest([1, 3, 5, 7], 5) ➞ -1

nthSmallest([7, 3, 5, 1], 2) ➞ 3

Notes
n will always be >= 1.
Each number in the array will be distinct (there will be a clear ordering).
Given an out of bounds parameter (e.g. an array is of size k), and you are asked to find the m > k smallest element, return -1.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

import java.util.Arrays;
public class Challenge {
	public static int nthSmallest(int[] arr, int n) {
		Arrays.sort(arr);
		return n <= arr.length ? arr[n - 1] : -1;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
public class Challenge {
	public static int nthSmallest(int[] arr, int n) {
		Arrays.sort(arr);
		 if(n > arr.length) return -1;
		 else return arr[n-1];
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int nthSmallest(int[] arr, int n) {
		if(arr.length < n) return -1;
		
		//finding the first min
		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		int tmp;
		for(int i = 1; i < n; i++)
		{
			tmp = max;
			for(int j = 0; j < arr.length; j++)
				if(arr[j] <= tmp && arr[j] > min) tmp = arr[j];
			min = tmp;
		}
		
		return min;
	}
}





//#############################################################
//#                        MY SOLUTION 4



import java.util.Arrays;
public class Challenge {
	
		 public static int nthSmallest(int[] arr, int n) {
        Arrays.sort(arr);
        return n > arr.length? -1 : arr[n-1];
    }
	
}