/*********************************************************************************************************************
 
Make My Way Home
You will be given a list, showing how far James travels away from his home for each day. He may choose to travel towards or away from his house, so negative values are to be expected.

Create a function which calculates how far James must walk to get back home.

Examples
distanceHome([2, 4, 2, 5]) ➞ 13

distanceHome([-1, -4, -3, -2]) ➞ 10

distanceHome([3, 4, -5, -2]) ➞ 0

Notes
Assume that James only travels in a straight line.
Distance is always a positive number.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;

public class Home {
	public static int distanceHome(int[] arr) {
		return Math.abs(IntStream.of(arr).reduce(0, Integer::sum));
	}
}


