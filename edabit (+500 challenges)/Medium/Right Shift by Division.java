/*********************************************************************************************************************
 Right Shift by Division

The right shift operation is similar to floor division by powers of two.

Sample calculation using the right shift operator ( >> ):

80 >> 3 = floor(80/2^3) = floor(80/8) = 10
-24 >> 2 = floor(-24/2^2) = floor(-24/4) = -6
-5 >> 1 = floor(-5/2^1) = floor(-5/2) = -3
Write a function that mimics (without the use of >>) the right shift operator and returns the result from the two given integers.

Examples
shiftToRight(80, 3) ➞ 10

shiftToRight(-24, 2) ➞ -6

shiftToRight(-5, 1) ➞ -3

shiftToRight(4666, 6) ➞ 72

shiftToRight(3777, 6) ➞ 59

shiftToRight(-512, 10) ➞ -1

Notes
There will be no negative values for the second parameter y.
This challenge is more like recreating of the right shift operation, thus, the use of the operator directly is prohibited.
Optionally, you can solve this challenge via recursion.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class RightShift {
	public static int shiftToRight(int x, int y) {
		if (y == 0) return x;
		return (int)Math.floor(shiftToRight(x, y-1) / 2.0);
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class RightShift {
	public static int shiftToRight(int x, int y) {
		return Math.floorDiv(x, (int)Math.pow(2, y));
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class RightShift {
	public static int shiftToRight(int x, int y) {
		return x>>y;
	}
}

