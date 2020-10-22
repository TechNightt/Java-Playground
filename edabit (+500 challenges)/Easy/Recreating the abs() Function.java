/*********************************************************************************************************************
 Recreating the abs() Function

The Math.abs() function returns the absolute value of a number. This means that it returns a number's positive value. You can think of it as the distance away from zero.

Create a function that recreates this functionality.

Examples
absolute(-5) ➞ 5

absolute(-3.14) ➞ 3.14

absolute(250) ➞ 250

Notes
Tests will only include valid numbers.
Don't use the Math.abs() function (it will defeat the purpose of the challenge).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class NumberValue {
	public static double absolute(double n) {
		return n < 0 ? n * -1.0 : n;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class NumberValue {
	public static double absolute(double n) {
			return n >= 0 ? n : n * -1;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class NumberValue {
	public static double absolute(double n) {
        return Math.abs(n);
    }
}

