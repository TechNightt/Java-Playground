
/********************************************************************************************************************
 
Hurdle Jump
Create a function that takes an array of hurdle heights and a jumper's jump height, and determine whether or not the hurdler can clear all the hurdles.

A hurdler can clear a hurdle if their jump height is greater than or equal to the hurdle height.

Examples
hurdleJump([1, 2, 3, 4, 5], 5) ➞ true
hurdleJump([5, 5, 3, 4, 5], 3) ➞ false
hurdleJump([5, 4, 5, 6], 10) ➞ true
hurdleJump([1, 2, 1], 1) ➞ false

Notes
Return true for the edge case of an empty array of hurdles. (Zero hurdles means that any jump height can clear them).

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                         SOLUTION 1   

public class Challenge {
	public static boolean hurdleJump(int[] hurdles, int h) {
		for(int i = 0; i < hurdles.length; i++)
			if(h < hurdles[i]) return false;
		return true;
	}
}

//#############################################################
//#                        SOLUTION 2   

public class Challenge {
	public static boolean hurdleJump(int[] hurdles, int h) {
		boolean canClear = true;
		for (int hurdle: hurdles){
			if (hurdle > h){
				canClear = false;
				break;
			}
		}
		return canClear;
	}
}

//#############################################################
//#                         SOLUTION 3   

public class Challenge {
	public static boolean hurdleJump(int[] hurdles, int h) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0 ; i < hurdles.length ; i++) {
			if (hurdles[i] > max) {
				max = hurdles[i];
			}
		}
		//System.out.println(hurdles);
		//System.out.println(max);
		//System.out.println(h);
		return h >= max ? true : false;
	}
}

//#############################################################
//#                         SOLUTION 4


public class Challenge {
	public static boolean hurdleJump(int[] hurdles, int h) {
		if(hurdles == null){
			return true;
		}
		int check = 0;
			for(int i = 0; i < hurdles.length; i++){
			if(hurdles[i] > h){
				return false;
			}
		}
			return true;
	}
}