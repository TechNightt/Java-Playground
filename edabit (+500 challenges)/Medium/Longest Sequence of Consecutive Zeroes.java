/*********************************************************************************************************************

Longest Sequence of Consecutive Zeroes
Write a function that returns the longest sequence of consecutive zeroes in a binary string.

Examples
longestZero("01100001011000") ➞ "0000"

longestZero("100100100") ➞ "00"

longestZero("11111") ➞ ""

Notes
If no zeroes exist in the input, return an empty string.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Challenge {
	public static String longestZero(String str) {
		return Arrays.stream(str.split("1+"))
			.sorted()
			.reduce((a, b) -> b)
			.orElse("");
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String longestZero(String str) {
        String result = "";
        for (String s : str.split("1+")) {
            if (result.length() < s.length()) {
                result = s;
            }
        }
        return result;		
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String longestZero(String str) {
		int currentZeros = 0, maxSoFar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') 
				currentZeros++;
			else if (currentZeros >= maxSoFar) { 
				// 1 encountered, check maxSofar and reset zeros count to 0
				maxSoFar = currentZeros;
				currentZeros = 0;
			}
		}
		maxSoFar = Math.max(currentZeros, maxSoFar);
		StringBuilder sb = new StringBuilder("");
		while (maxSoFar-- > 0) sb.append("0");
		return sb.toString();
	}
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################
