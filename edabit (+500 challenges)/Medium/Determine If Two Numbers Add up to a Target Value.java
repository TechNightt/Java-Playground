/*********************************************************************************************************************
 
Determine If Two Numbers Add up to a Target Value

Given two unique integer arrays a and b, and an integer target value v, create a function to determine whether there is a pair of numbers that add up to the target value v, where one number comes from one array a and the other comes from the second array b.

Return true if there is a pair that adds up to the target value and false otherwise.

Examples
sumOfTwo([1, 2], [4, 5, 6], 5) ➞ true

sumOfTwo([1, 2], [4, 5, 6], 8) ➞ true

sumOfTwo([1, 2], [4, 5, 6], 3) ➞ false

sumOfTwo([1, 2], [4, 5, 6], 9) ➞ false
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class SumUpToValue {
	public static boolean sumOfTwo(int[] a, int[] b, int v) {
		return IntStream.of(a).filter(x -> IntStream.of(b).anyMatch(y -> y == v-x)).count() > 0;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class SumUpToValue {
	public static boolean sumOfTwo(int[] a, int[] b, int v) {
		for (int i=0; i<a.length; i++)
			for (int j=0; j<b.length; j++)
				if (a[i]+b[j]==v)
					return true;
		return false;
	}
}



