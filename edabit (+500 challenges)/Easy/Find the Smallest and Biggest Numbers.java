/*********************************************************************************************************************
 Find the Smallest and Biggest Numbers
Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.

Examples
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]

minMax([2334454, 5]) ➞ [5, 2334454]

minMax([1]) ➞ [1, 1]

Notes
All test arrays will have at least one element and are valid.

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;

public class Challenge {
	public static double[] minMax(double[] arr) {
		Arrays.sort(arr);
		return new double[] {arr[0], arr[arr.length-1]};
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
public class Challenge {
	public static double[] minMax(double[] arr) {
		double[] a  = new double[2];
		a[0] = Arrays.stream(arr).min().getAsDouble();
		a[1] = Arrays.stream(arr).max().getAsDouble();
		return a;
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static double[] minMax(double[] arr) {
		double maxNumber = arr[0];
		double minNumber = arr[0];
		for(int i = 0; i<arr.length; i++){
			maxNumber = maxNumber < arr[i] ? arr[i] : maxNumber;
			minNumber = minNumber > arr[i] ? arr[i] : minNumber;
			
		}
		double[] result = {minNumber,maxNumber};
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static double[] minMax(double[] arr) {

		double[] result = new double[]{arr[0],arr[0]};
		for(int i=0;i<arr.length;i++){
			if(result[0]>arr[i]) result[0]=arr[i];
			if(result[1]<arr[i]) result[1]=arr[i];
		}
		return result;
	}
}