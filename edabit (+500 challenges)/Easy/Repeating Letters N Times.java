/*********************************************************************************************************************
 Repeating Letters N Times

Create a function that repeats each character in a string n times.

Examples
repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"

repeat("hello", 3) ➞ "hhheeellllllooo"

repeat("stop", 1) ➞ "stop"

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String repeat(String str, int n) {
    if (str.equals("") || n == 0) {
       return "";
    }
    return str.substring(0, 1) + repeat(str.substring(0, 1), n - 1)
            + repeat(str.substring(1), n);
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String repeat(String str, int n) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < n; j++) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String repeat(String str, int n) {
		String result = "";
		if (n == 0) {
			return str;
		}
		for (int j = 0; j< str.length(); j++) {
		for (int i = 0; i < n; i++) {
			result += str.charAt(j);
		}
		}
		return result;
	}
}

