/*********************************************************************************************************************
 
Pair Management

Given two arguments, return an array which contains these two arguments.

Examples
makePair(1, 2) ➞ [1, 2]

makePair(51, 21) ➞ [51, 21]

makePair(512124, 215) ➞ [512124, 215]
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Pairs {
	public static int[] makePair(int a, int b) {
		return new int[] {a, b};
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Pairs {
	public static int[] makePair(int a, int b) {
		int [] pair = new int [2];
		pair[0] = a;
		pair[1] = b;
		return pair;
	}
}

