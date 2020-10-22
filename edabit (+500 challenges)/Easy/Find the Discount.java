/*********************************************************************************************************************
 Find the Discount

Create a function that takes two arguments: the final price and the discount percentage as integers and returns the final price after the discount.

Alternative Text

Examples
discount(1500, 50) ➞ 750

discount(89, 20) ➞ 71.2

discount(100, 75) ➞ 25

Notes
Your answer should be rounded to two decimal places.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Sales {
	public static double discount(int p, int d) {
		return p - p * d / 100.0;
	}
}


