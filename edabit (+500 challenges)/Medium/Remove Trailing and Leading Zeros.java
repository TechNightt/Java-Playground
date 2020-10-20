/*********************************************************************************************************************
 Remove Trailing and Leading Zeros

Create a function that takes in a number as a string n and returns the number without trailing and leading zeros.

Trailing Zeros are the zeros after a decimal point which don't affect the value (e.g. the last three zeros in 3.4000 and 3.04000).
Leading Zeros are the zeros before a whole number which don't affect the value (e.g. the first three zeros in 000234 and 000230).
Examples
removeLeadingTrailing("230.000") ➞ "230"

removeLeadingTrailing("00402") ➞ "402"

removeLeadingTrailing("03.1400") ➞ "3.14"

removeLeadingTrailing("30") ➞ "30"

Notes
Return a string.
If you get a number with .0 on the end, return the integer value (e.g. return "4" rather than "4.0").
If the number is 0, 0.0, 000, 00.00, etc... return "0".
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String removeLeadingTrailing(String n) {
		String[] arr = n.split("\\.");
		if(arr.length==1) {
			return Integer.parseInt(n)+"";
		}
		arr[1] = "."+arr[1]; 
		String temp =arr[1].replaceAll("0"," ").trim().replaceAll(" " , "0").trim();
		System.out.println(temp);
		int digit = Integer.parseInt(arr[0]);
		
		return String.valueOf(digit) +( temp.length()>1 ? temp :"");
		
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.math.BigDecimal;

public class Challenge {
	public static String removeLeadingTrailing(String n) {
		return (Double.valueOf(n) == 0) ? "0" 
												: BigDecimal.valueOf(Double.valueOf(n))
																		.stripTrailingZeros()
																		.toPlainString();		
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String removeLeadingTrailing(String n) {
		n = n.replaceAll("^0+(?=\\d)", "").replaceAll("(?<=\\.\\d{1,100})0+$", "");
		return n.matches("\\d+\\.0") ? n.replaceAll("\\.0", "") : n;
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String removeLeadingTrailing(String n) {
		if (n.contains(".")) {
			while (n.endsWith("0")) {
				n = n.substring(0, n.length() - 1);
			}
		}
		while (n.startsWith("0") && n.length() > 1) {
			n = n.substring(1, n.length());
		}
		if (n.equals(".")) n = "0";
		if (n.endsWith(".")) n = n.substring(0, n.length() - 1);
		if (n.startsWith(".")) n = "0" + n;
		return n;
	}
}