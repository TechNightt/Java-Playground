/*********************************************************************************************************************
 
Is the Average of All Elements a Whole Number?

Create a function that takes an array as an argument and returns true or false depending on whether the average of all elements in the array is a whole number or not.

Examples
isAvgWhole([1, 3]) ➞ true

isAvgWhole([1, 2, 3, 4]) ➞ false

isAvgWhole([1, 5, 6]) ➞ true

isAvgWhole([1, 1, 1]) ➞ true

isAvgWhole([9, 2, 2, 5]) ➞ false

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean isAvgWhole(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		
		return sum % arr.length == 0 ? true : false;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
public class Challenge {
	public static boolean isAvgWhole(int[] arr) {
		return (Arrays.stream(arr).sum()%arr.length == 0);
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean isAvgWhole(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) sum += arr[i];
		return sum % arr.length == 0;
	}
}


//#############################################################
//#                        MY SOLUTION 4
