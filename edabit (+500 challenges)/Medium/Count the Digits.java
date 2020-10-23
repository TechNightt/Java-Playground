/*********************************************************************************************************************
 
Count the Digits

Create a function that will count the number of digits of a number. Conversion of the number to a string is not allowed, thus, the approach is either recursive or via loops.

Examples
digitsCount(0) ➞ 1

digitsCount(12345)  ➞ 5

digitsCount(1289396387328L) ➞ 13

Notes
A recursive version of this challenge can be found here.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class LongDigits {
	public static int digitsCount(long n) {
		return n == 0 ? 1 : (int)Math.floor(Math.log10(Math.abs(n))) + 1;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class LongDigits {
	public static int digitsCount(long n) {
		if(n >= 0 && n <= 9 || n <= 0 && n >= -9)
    	return 1;
            
    return 1 + digitsCount(n/10);
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class LongDigits {
	public static int digitsCount(double n) {
		if (n < 1 && n > 0) return 0;
		if (n == 0) return 1;
		return 1 + digitsCount(Math.abs(n/10.0));
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class LongDigits {
	public static int digitsCount(long n) {
		int digits = 0;
		if(n == 0)
			return 1;
		else
		{
			while(n != 0)
			{
				
				n = n/10;
				digits++;
			}
		}
		return digits;
	}
}