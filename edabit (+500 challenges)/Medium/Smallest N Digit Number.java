/*********************************************************************************************************************
 Smallest N Digit Number
Write a function that returns the smallest N-digit number which is a multiple of the specified value.

Examples
smallest(3, 8) ➞ 104
// Smallest 3-digit integer that is a multiple of 8

smallest(5, 12) ➞ 10008

smallest(7, 1) ➞ 1000000

smallest(2, 3) ➞ 12
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int smallest(int digits, int value) {
		    if ((digits < 1) || (value < 1)){
            return -1;
        }

        int smallestTestVal = (int) Math.pow(10, digits - 1);
        int highestTestVal = (int) Math.pow(10, digits);

        for(int i = smallestTestVal; i <= highestTestVal; i++){
            if (i % value == 0){
                return i;
            }
        }
        return -1;
  }
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int smallest(int digits, int value) {
    int multiplyFactor = 0;
		while (String.valueOf(value*multiplyFactor).length() < digits) { multiplyFactor++; }
    
    return value * multiplyFactor;		
  }
}




