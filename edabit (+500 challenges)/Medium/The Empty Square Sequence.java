/*********************************************************************************************************************
 The Empty Square Sequence
In the image below, squares are either empty or filled with a circle.

Steps vs Empty Squarest

Create a function that takes a number step (which equals HALF the width of a square) and returns the amount of empty squares. The image shows the squares with step 1, 2 and 3. The return value is the number of cells not on a diagonal, which is 0 for the first square, 8 for the second, and 24 for the third.

Examples
emptySq(1) ➞ 0

emptySq(3) ➞ 24

emptySq(10) ➞ 360

Notes
Test input will always be a positive integer.
The width of the square will always be even.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################







//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int emptySq(int step) {
		return (step + step) * (step + step) - (step * 4);
  }
}





//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static int emptySq(int s) {
		if (s == 1){
			return 0;
		}
		int ans = 2*(s-1)*(4 + (s-2)*2);
		return ans;
  }
}





//#############################################################
//#                        MY SOLUTION 3   


import java.lang.Math;

public class Challenge {
	public static int emptySq(int step) {
		int res = (int)Math.pow(step * 2, 2) - (4 * step);
		return res >= 0 ? res : 0;
  }
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static int emptySq(int step) {
    int counter=0;
    for (int i=0,dimention=step*2-1,j=dimention,k=0; i<=dimention;i++,j--,k++)
        if (i==k || ((i+j)==(dimention)))
            counter+=2;
    return (step*2)*(step*2)-counter;
}
}



