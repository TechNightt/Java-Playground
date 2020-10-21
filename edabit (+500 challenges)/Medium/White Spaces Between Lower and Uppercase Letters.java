/*********************************************************************************************************************
 White Spaces Between Lower and Uppercase Letters

Write a function that inserts a white space between every instance of a lower character followed immediately by an upper character.

Examples
insertWhitespace("SheWalksToTheBeach") ➞ "She Walks To The Beach"

insertWhitespace("MarvinTalksTooMuch") ➞ "Marvin Talks Too Much"

insertWhitespace("TheGreatestUpsetInHistory") ➞ "The Greatest Upset In History"

Notes
Each word in the phrase will be at least two characters long.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static String insertWhitespace(String s) {
		return s.replaceAll("(?<=[a-z])(?=[A-Z])", " ");
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String insertWhitespace(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s.length(); i++) {
				if (i>0 && Character.isUpperCase(s.charAt(i))) {
						sb.append(" ");
				}
				sb.append(s.charAt(i));
		}	
		return sb.toString();		
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String insertWhitespace(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res += s.charAt(i);
			if (i != s.length() - 1 && isLower(s.charAt(i)) && !(isLower(s.charAt(i + 1)))) {
				res += ' ';
			}
		}
		return res;
	}
	public static boolean isLower(char c) {
		return Character.toLowerCase(c) != Character.toUpperCase(c) && c == Character.toLowerCase(c);
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String insertWhitespace(String s) {
		String str = "";
		boolean first = true;
		for (int i = 0 ; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x >= 'A' && x <= 'Z') {
				if ( ! first )
					str += " ";
				first = false;
			}
			str += x;
		}
		return str;
	}
}