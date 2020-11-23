/*********************************************************************************************************************
 Product of Remaining Elements

Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to the product of all other elements excluding itself.

Examples
canPartition([2, 8, 4, 1]) ➞ true
// 8 = 2 x 4 x 1

canPartition([-1, -10, 1, -2, 20]) ➞ false

canPartition([-1, -20, 5, -1, -2, 2]) ➞ true

Notes
The array may contain duplicates.
Multiple solutions can exist, any solution is sufficient to return true.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
	public static boolean canPartition(int[] arr) {
		long count=Arrays.stream(arr).filter(x -> x == 0).count();
		int prod = Arrays.stream(arr).reduce(1,(e1, e2) -> e1*e2);
		if(count==1)
			return false;
		return prod==0 || Arrays.stream(arr).anyMatch(x->x==prod/x);
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;

public class Challenge {
	public static boolean canPartition(int[] arr) {
		return Arrays.stream(arr).filter(x -> x == 0).count() != 1
			&& Arrays.stream(arr).filter(
				x -> x * x == Arrays.stream(arr).reduce((n, m) -> n * m).orElse(0)
			).count() > 0;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.ArrayList;
import java.util.Arrays;
public class Challenge {
	public static boolean canPartition(int[] arr) {
		for(int n : arr){
			int p=Arrays.stream(arr).filter(e->e!=n).reduce(1, (a, b) -> a * b);
			if(Arrays.stream(arr).filter(e->e==n).count()>1)
				 p=p*n;
			if(p==n)
				return true;
		}
		return false;
		
	}
}


//#############################################################
//#                        MY SOLUTION 4



import java.util.*;
public class Challenge {
	public static boolean canPartition(int[] arr) {
		
		Arrays.sort(arr);
		int high=arr[arr.length-1];
		int low= arr[0];
		int mult=1;
		int mult1=1;
		
		for(int i=1;i<arr.length;i++){
			mult=mult*arr[i];
		}
		for(int i=arr.length-2;i>=0;i--){
			mult1=mult1*arr[i];
		}
		
		if(high==mult1 || low==mult){
			return true;
		}else{
			return false;
		}
		
	}
}