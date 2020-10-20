/*********************************************************************************************************************
 Left Shift by Powers of Two

The left shift operation is similar to multiplication by powers of two.

Sample calculation using the left shift operator (<<):

10 << 3 = 10 * 2^3 = 10 * 8 = 80
-32 << 2 = -32 * 2^2 = -32 * 4 = -128
5 << 2 = 5 * 2^2 = 5 * 4 = 20
Write a function that mimics (without the use of <<) the left shift operator and returns the result from the two given integers.

Examples
shiftToLeft(5, 2) ➞ 20

shiftToLeft(10, 3) ➞ 80

shiftToLeft(-32, 2) ➞ -128

shiftToLeft(-6, 5) ➞ -192

shiftToLeft(12, 4) ➞ 192

shiftToLeft(46, 6) ➞ 2944

Notes
There will be no negative values for the second parameter y.
This challenge is more like recreating of the left shift operation, thus, the use of the operator directly is prohibited.
Optionally, you can solve this challenge via recursion.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class LeftShift {
	public static int shiftToLeft(int x, int y) {
		while (y > 0){
			x *= 2;
			y--;
		}
		return x;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class LeftShift {
	public static int shiftToLeft(int x, int y) {
		int a = (int)Math.pow(2, y);
		int b = x * a;
		return b;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class LeftShift {
	public static int shiftToLeft(int x, int y) {
		return x * (int)Math.pow(2, y);
	}
}

