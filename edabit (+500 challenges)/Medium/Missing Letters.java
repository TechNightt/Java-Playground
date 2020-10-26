/*********************************************************************************************************************
 Missing Letters

Given a string containing unique letters, return a sorted string with the letters that don't appear in the string.

Examples
getMissing("abcdefgpqrstuvwxyz") ➞ "hijklmno"

getMissing("zyxwvutsrq") ➞ "abcdefghijklmnop"

getMissing("abc") ➞ "defghijklmnopqrstuvwxyz"

getMissing("abcdefghijklmnopqrstuvwxyz") ➞ ""

Notes
The combination of both strings should be 26 elements long, including all the letters in the alphabet.
Letters will be all in lowercase.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.stream.IntStream;

public class MissingLetters {
	public static String getMissing(String s) {
		return IntStream.rangeClosed('a', 'z').mapToObj(c -> ""+(char)c)
			.filter(c -> !s.contains(c)).reduce(String::concat).orElse("");
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class MissingLetters {
	public static String getMissing(String strLetters) {
		String full = "abcdefghijklmnopqrstuvwxyz";
		String missing = "";
		for (char c : full.toCharArray()) {
			if (strLetters.indexOf(c) == -1) {
				missing += c;
			}
		}
		return missing;
	}
}

