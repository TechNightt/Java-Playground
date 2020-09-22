/*********************************************************************************************************************
 Edaaaaabit

Write a function that takes an integer and returns a string with the given number of "a"s in Edabit.

Examples
howManyTimes(5) ➞ "Edaaaaabit"

howManyTimes(0) ➞ "Edbit"

howManyTimes(12) ➞ "Edaaaaaaaaaaaabit"

Notes
The string must start with "Ed" and end with "bit".
You'll only be given integers as test input.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String howManyTimes(int num) {
		if (num == 0) return "Edbit";
		String s = howManyTimes(num-1);
		return s.substring(0, 2) + "a" +s.substring(2, s.length());
	}
}


//#############################################################
//#                        MY SOLUTION 2   


import java.util.Collections;
public class Challenge {
	public static String howManyTimes(int num) {
		return String.format("Ed%sbit", String.join("", Collections.nCopies(num, "a")));
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String howManyTimes(int num) {
		String ed = "Ed";
		
		for(int x = 0; x < num; x++) {
			ed += "a";
		}
		return ed + "bit";
	}
}


