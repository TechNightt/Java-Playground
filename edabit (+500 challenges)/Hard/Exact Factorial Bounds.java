/*********************************************************************************************************************
 Exact Factorial Bounds
Create a function that tests if a number is the exact upper bound of the factorial of n. If so, return an array of the exact factorial bound and n, or otherwise, an empty array.

Examples
isExact(6) ➞ [6, 3]

isExact(24) ➞ [24, 4]

isExact(125) ➞ []

isExact(720) ➞ [720, 6]

isExact(1024) ➞ []

isExact(40320) ➞ [40320, 8]


Notes
Alternatively, you can solve this challenge via recursion.
A recursive version of this challenge can be found via this link.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class FactorialBound {
	public static long[] isExact(long n) {
		long p = 1L, i = 1L;
		while(p < n) p *= i++;
		return p == n? new long[] {n, i-1} : new long[] {};
	}
}




//#############################################################
//#                        MY SOLUTION 2   



public class FactorialBound {
    public static long[] isExact(long n) {
       long factCount = 1;
       while (true) {
           if (factorial(factCount) >= n) break;
           factCount++;
       }
       return (factorial(factCount) == n) ? new long[]{n, factCount} : new long[0];
   }
   public static long factorial(long n) {
       return (n <= 1) ? 1 : n * (factorial(n - 1));
   }
}




//#############################################################
//#                        MY SOLUTION 3   



public class FactorialBound {
	public static long[] isExact(long n) {
		        long temp = 1;
        long factorial = 0;
        boolean isCorrect = false;

        for(long i = 1; i < n; i++) {
            temp *= i;

            if(temp == n) {
                factorial = i;
                isCorrect = true;
                break;

            } else if(temp > n) {
                isCorrect = false;
                break;
            }
        }

        if(isCorrect) {
            return new long[]{n, factorial};
        }
        return new long[]{};
	}
}

