/*********************************************************************************************************************
 Pi to N Decimal Places
Given a integer n, write a function that returns PI to n decimal places.

Examples
myPi(5) ➞ 3.14159

myPi(4) ➞ 3.1416

myPi(15) ➞ 3.141592653589793

Notes
n will not be above 15, to keep this challenge simple.
Round up the last digit if the next digit in PI is greater or equal to 5 (see second example above).
The return value must be a number, not a string.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


import java.lang.Math;

public class Program {
    public static double myPi(int num) {
			String pi = String.format("%." + num + "f", Math.PI);
			return Double.parseDouble(pi);
    }
}

