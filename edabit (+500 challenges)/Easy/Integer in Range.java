/*********************************************************************************************************************
 Integer in Range?

Create a function that validates whether an integer n is exclusively within the lower and upper bounds.

Examples
intWithinBounds(3, 1, 9) ➞ true

intWithinBounds(6, 1, 6) ➞ false

intWithinBounds(3, 3, 8) ➞ true

Notes
Exclusively means that a number is considered not within the bounds if it is equal to the upper bound (see example #2).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class IntegerInRange {
	public static boolean intWithinBounds(int n, int lower, int upper) {
		return IntStream.range(lower, upper).anyMatch(i -> i == new Long(n));
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class IntegerInRange {
	public static boolean intWithinBounds(int n, int lower, int upper) {
     if ( n < upper && n >= lower ) {
			  return true;
		 }
	 return false;	
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class IntegerInRange {
	public static boolean intWithinBounds(int n, int lower, int upper) {
		return (n >= lower && n < upper) ? true: false;
	}
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class IntegerInRange {
	
	public static boolean intWithinBounds(int n, int lower, int upper) {
		 
   
     if( n > upper || upper == n || lower > n ) { return false; }
    else if ( upper > lower && upper > n ) { return true; }
    
    return true;
  
	}
}