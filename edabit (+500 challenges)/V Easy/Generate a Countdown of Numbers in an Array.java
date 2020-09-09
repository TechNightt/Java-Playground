/*********************************************************************************************************************
 
Generate a Countdown of Numbers in an Array

Create a function that takes a number as an argument and returns an array of numbers counting down from this number to zero.

Examples
countdown(5) ➞ [5, 4, 3, 2, 1, 0]

countdown(1) ➞ [1, 0]

countdown(0) ➞ [0]

Notes
The argument will always be greater than or equal to zero.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int[] countdown(int start) {
		int [] result= new int[start+1];
		
		for(int i=start; i>=0; i--){
			result[Math.abs(i-start)] = i;
		}
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int[] countdown(int start) {
	  	int[] finalResult = new int[start + 1];
		for (int i = start, j = 0; i < -1 || j < finalResult.length; i--, j++) {
		  finalResult[j] = i;
		}
	  	return finalResult;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int[] countdown(int start) {
		int[] hello = new int[start+1];
		int index = 0;
		int siffra = start;
		
		while(siffra >= 0){
			hello[index] = siffra;
			siffra--;
			index++;
		}
		return hello;
	}
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static int[] countdown(int start) {
		int count = 0;
		int[] ans = new int[start+1];
		while(start >= 0)
		{
			ans[count] = start;
			count++;
			start--;
		}
		return ans;
	}
}