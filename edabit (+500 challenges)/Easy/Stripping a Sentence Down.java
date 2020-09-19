/*********************************************************************************************************************
 Stripping a Sentence Down

Create a function which takes in a sentence str and a string of characters chars and return the sentence but with all the specified characters removed.

Examples
stripSentence("the quick brown fox jumps over the lazy dog", "aeiou") ➞ "th qck brwn fx jmps vr th lzy dg"

stripSentence("the hissing snakes sinisterly slither across the rustling leaves", "s") ➞ "the hiing nake initerly lither acro the rutling leave"

stripSentence("gone, reduced to atoms", "go, muscat nerd") ➞ ""

Notes
You may be asked to remove punctuation and spaces.
Return an empty string if every charcter is specified (see example #3).
All tests will be in lowercase.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String stripSentence(String str, String chars) {
		return str.replaceAll("["+chars+"]","");
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String stripSentence(String str, String chars) {
		String ret = "";
		for (char c : str.toCharArray()){
			boolean check = false;
			for (char d : chars.toCharArray())
				if (d==c)
					check = true;
			if (!check)
				ret+=c;
		}
		return ret;
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.ArrayList;

public class Challenge {
	public static String stripSentence(String str, String chars) {
		String result = "";

		char[] wrongCharArray = chars.toCharArray();


		ArrayList<Character> noChars = new ArrayList<Character>();


		for (int i = 0; i < wrongCharArray.length; i++) {
			noChars.add(wrongCharArray[i]);
		}


		for (int i = 0; i < str.length(); i++) {
			if (!noChars.contains(str.charAt(i))) {
				result += str.charAt(i);
			}
		}


		return result;
	}
}


//#############################################################
//#                        MY SOLUTION 4



import java.util.*; import java.util.stream.*;

public class Challenge {
	public static String stripSentence(String str, String chars) {
		String[] stri = str.split("");
		return Arrays.stream(stri).filter(n -> !chars.contains(n)).collect(Collectors.joining(""));
	}
}