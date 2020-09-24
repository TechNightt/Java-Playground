/*********************************************************************************************************************
 Convert to Hex
Create a function that takes a strings characters as ASCII and returns each characters hexadecimal value as a string.

Examples
toHex("hello world") ➞ "68 65 6c 6c 6f 20 77 6f 72 6c 64"

toHex("Big Boi") ➞ "42 69 67 20 42 6f 69"

toHex("Marty Poppinson") ➞ "4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e"

Notes
Each byte must be seperated by a space.
All alpha hex characters must be lowercase.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.Collectors;

public class Challenge {
	public static String toHex(String str) {
		return str.chars()
			.mapToObj(Integer::toHexString)
			.collect(Collectors.joining(" "));
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String toHex(String str) {
		StringBuilder newStr = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			newStr.append(Integer.toHexString(ch));
			if (i != (str.length() - 1)) {
				newStr.append(" ");
			}
		}
		return newStr.toString();
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String toHex(String str) {
		String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
		String res = "";

		for (int i = 0; i < str.length(); i++) {
		 int c = str.charAt(i);
		 int first = c / 16;
		 int second = c % 16;
		 res += hex[first] + hex[second] + " ";
		}

		return res.trim();
	}
}





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String toHex(String str) {
		return java.util.Arrays.stream(str.split(""))
													.map(s->s.charAt(0))
													.map(Integer::toHexString)
													.collect(java.util.stream.Collectors.joining(" "));
	}
}