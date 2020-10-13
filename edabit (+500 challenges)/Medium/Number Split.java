/*********************************************************************************************************************
 
Number Split
Given a number, return a list containing the two halves of the number. If the number is odd, make the rightmost number higher.

Examples
numberSplit(4) ➞ [2, 2]

numberSplit(10) ➞ [5, 5]

numberSplit(11) ➞ [5, 6]

numberSplit(-9) ➞ [-5, -4]

Notes
All numbers will be integers.
You can expect negative numbers too.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class HalfSplit {
	public static int[] numberSplit(int n) {
		int result[] = new int[2]; 

		if(n % 2 == 0)
		{
			result[0] = n / 2;
			result[1] = n / 2;
		}
		else
		{
			result[0] = (n - 1) / 2;
			result[1] = (n - 1) / 2 + 1;
		}
		return result;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class HalfSplit {
	public static int[] numberSplit(int n) {
		int a=n/2;
		return new int[]{n%2!=0&&n<0 ? a-1 : a, n%2==1&&n>=0 ? a+1 : a};
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class HalfSplit {
	public static int[] numberSplit(int n) {
				int x, y;
        if (n % 2 == 0) {
            x = y = n / 2;
        } else {
            x = n / 2;
            y = n / 2 + n % 2;
        }
        return n < 0 ? new int[] {y, x} : new int[] {x, y};
	}
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class HalfSplit {
	public static int[] numberSplit(int n) {
		return new int[] {(int)Math.floor(n/2.0), (int)Math.ceil(n/2.0)};
	}
}