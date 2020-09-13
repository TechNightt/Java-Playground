/*********************************************************************************************************************
 Largest Swap

Write a function that takes a two-digit number and determines if it's the largest of two possible digit swaps.

To illustrate:

largestSwap(27) ➞ false

largestSwap(43) ➞ true
If 27 is our input, we should return false because swapping the digits gives us 72, and 72 > 27. On the other hand, swapping 43 gives us 34, and 43 > 34.

Examples
largestSwap(14) ➞ false

largestSwap(53) ➞ true

largestSwap(99) ➞ true

Notes
Numbers with two identical digits (third example) should yield true (you can't do better).
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean largestSwap(int num) {
		int dig1 = num%10;
		int dig2 = num/10;
		return dig2>=dig1;
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static boolean largestSwap(int num) {
		String number = String.valueOf(num);
		int i = number.charAt(0);
		int j = number.charAt(1);
		if (j > i){
			return false;
		}
		else{
			return true;
		}
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean largestSwap(int num) {
		int ones = num % 10;
		int tens = (int)(num / 10);
		return tens < ones ? false : true;
	}
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static boolean largestSwap(int num) {
		   String[] stringNumberSplit = String.valueOf(num).split("");
        int numberReversed = Integer.parseInt(stringNumberSplit[1] + stringNumberSplit[0]);

        return numberReversed <= num;
	}



