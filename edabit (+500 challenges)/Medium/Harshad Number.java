/*********************************************************************************************************************
 Harshad Number

A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.

Examples
isHarshad(75) ➞ false
// 7 + 5 = 12
// 75 is not exactly divisible by 12

isHarshad(171) ➞ true
// 1 + 7 + 1 = 9
// 9 exactly divides 171

isHarshad(481) ➞ true

isHarshad(89) ➞ false

isHarshad(516) ➞ true

isHarshad(200) ➞ true

Notes
A recursive version of this challenge can be found here.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class HarshadNumber {
	public static boolean isHarshad(int n) {
		int sum = 0;
    for (String nums : String.valueOf(n).split(""))
       sum += Integer.parseInt(nums);
    return n % sum == 0;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.Arrays;

public class HarshadNumber {
	public static boolean isHarshad(int n) {
		String x = Integer.toString(n);
		int[] y = new int[x.length()];
		for(int z = 0;z<x.length();z++){
			y[z] = Integer.parseInt(x.substring(z, z+1));
		}
		int sum = sum(y);
		if(n%sum == 0) return true;
		return false;

	}

	public static int sum(int[] x){
		if(x.length == 0) return 0;
		return x[0] + sum(Arrays.copyOfRange(x, 1, x.length));
		}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################




public class HarshadNumber {
	public static boolean isHarshad(int n) {
		return n % sumDigits(n) == 0;
	}
	
	private static int sumDigits(int n) {
		if (n == 0) return 0;
		return n % 10 + sumDigits(n / 10);
	}
}

