/*********************************************************************************************************************
 Double Character Swap

Write a function to replace all instances of character c1 with character c2 and vice versa.

Examples
doubleSwap( "aabbccc", 'a', 'b') ➞ "bbaaccc"

doubleSwap("random w#rds writt&n h&r&", '#', '&')
➞ "random w&rds writt#n h#r#"

doubleSwap("128 895 556 788 999", '8', '9')
➞ "129 985 556 799 888"

Notes
Both characters will show up at least once in the string.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static String doubleSwap(String str, char c1, char c2) {
		return str.chars()
			.map(cp -> (cp == c1) ? c2 : (cp == c2) ? c1 : cp)
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString();
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String doubleSwap(String str, char c1, char c2) {
		if (str == null || str.isEmpty()) return str;
		
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c == c1) c = c2;
			else if (c == c2) c = c1;
			sb.append(c);
		}
		
		return sb.toString();
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String doubleSwap(String str, char c1, char c2) {
    StringBuilder strBld = new StringBuilder();

		for (char c : str.toCharArray()) {
      strBld.append(c == c1 ? c2 : (c == c2 ? c1 : c));
    }

    return strBld.toString();		
	}
}

