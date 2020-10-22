/*********************************************************************************************************************
 Adding Numbers

Create a function that takes two number strings and returns their sum as a string.

Examples
add("111", "111") ➞ "222"

add("10", "80") ➞ "90"

add("", "20") ➞ "Invalid Operation"

Notes
Return "Invalid Operation" If either input is "" or null.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.stream.Stream;

public class NumericString {
	public static String add(String... s) {
		return Stream.of(s).anyMatch(k -> k == null || k.isEmpty()) ? "Invalid Operation" : 
					 Stream.of(s).mapToInt(Integer::parseInt).sum() + "";
	}
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class NumericString {
	public static String add(String a, String b) {
		if((a!=null && b!=null) && (a.length()>0 && b.length()>0))
			return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
		else
			return "Invalid Operation";
	}
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.math.BigInteger;

public class NumericString {
	public static String add(String a, String b) {
		try {
			BigInteger c = new BigInteger(a);
			BigInteger d = new BigInteger(b);
			return c.add(d).toString();
		} catch (Exception e) {
			return "Invalid Operation";
		}
	}
}
