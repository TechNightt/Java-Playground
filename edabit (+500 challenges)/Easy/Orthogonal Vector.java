/*********************************************************************************************************************
 Orthogonal Vector

Create a function that takes two vectors as arrays and checks if the two vectors are orthogonal or not. The return value is boolean. Two vectors a and b are orthogonal if their dot product is equal to zero.

Examples
isOrthogonal([1, 2], [2, -1]) ➞ true

isOrthogonal([3, -1], [7, 5]) ➞ false

isOrthogonal([1, 2, 0], [2, -1, 10]) ➞ true

Notes
The two arrays will be of same length.
Check out the Resources tab.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {
	public static boolean isOrthogonal(int[] arr1, int[] arr2) {
		return IntStream.range(0, arr1.length).map(index -> arr1[index] * arr2[index]).reduce((a,b) -> a + b).getAsInt() == 0;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class ChallengeTests {
	public static boolean isOrthogonal(int[] arr1, int[] arr2) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++){
			sum += arr1[i] * arr2[i];
		}
		return sum == 0;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class ChallengeTests {
	public static boolean isOrthogonal(int[] arr1, int[] arr2) {
		int b[]=new int[arr1.length];
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			b[i]=arr1[i]*arr2[i];
		}
		for(int k:b)
		{
			sum=sum+k;
		}
	if(sum==0)
		return true;
		else
			return false;
	}
}



