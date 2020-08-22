

/*********************************************************************************************************************
 
Return a String as an Integer
Create a function that takes a string and returns it as an integer.

Examples
stringInt("6") ➞ 6

stringInt("1000") ➞ 1000

stringInt("12") ➞ 12
Notes
All numbers will be whole numbers.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static int stringInt(String str) {
		return Integer.valueOf(str);
	}
}




public class Challenge {
	public static int stringInt(String str) {
		int result = Integer.parseInt(str);
		return result;
	}
}