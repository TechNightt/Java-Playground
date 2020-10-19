/*********************************************************************************************************************
 The Nth Term of the Sequence

Write a function containing an expression, in terms of n, for the nth term of the sequence that has the following first six terms:

2, 6, 13, 23, 36, 52 ...and the sequence continues.

Examples
seq(1) ➞ 2

seq(2) ➞ 6

seq(6) ➞ 52

Notes
The parameter n is always >= 0.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int seq(int n) {
		int start = 2;
		int adder = 4;
		for (int i = 1; i < n; i++) {start += adder; adder += 3;}
		return n == 0 ? 1 : start;
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int seq(int n) {
		double a = 1.5;  
		double b = -0.5;  
		double c = 1;  
		double sum = a * (int)Math.pow(n, 2);
		sum += b*n;
		sum += c;
		return (int)sum; 		
  }
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int seq(int n) {
		return (n - 1 < 0) ? 1 : seq(n - 1) + 3*(n - 1) + 1;
  }
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int seq(int n) {
		if (n == 0) return 1; 
		
		int val = 2;
		for (int i = 1; i < n; i++) {
			val += (4 + ((i - 1) * 3));
		}
		return val;
  }
}