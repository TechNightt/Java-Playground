/*********************************************************************************************************************
 The Collatz Conjecture

Create a function, example:

10 is number

10 is even - 10 / 2 = 5
5 is odd - 5 * 3 + 1 = 16
16 is even - 16 / 2 = 8
8 is even - 8 / 2 = 4
4 is even - 4 / 2 = 2
2 is even - 2 / 2 = 1 -> if reach 1, return 6 steps
Consider the following operation on an arbitrary positive integer:

if n is even -> n / 2
if n is odd -> n * 3 + 1
Examples
collatzConjecture(2) ➞ 1

collatzConjecture(3) ➞ 7

collatzConjecture(10) ➞ 6

Notes
For further information, check the Resources tab.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int collatzConjecture(int n) {
		return n<2?0:1+collatzConjecture(n%2==0?n/2:n*3+1);
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int collatzConjecture(int n) {
		    if(n == 0 || n == 1)
            return 0;

        if(n % 2 == 0)
            return 1 + collatzConjecture(n / 2);

        return 1 + collatzConjecture(n * 3 + 1);
	}
}

