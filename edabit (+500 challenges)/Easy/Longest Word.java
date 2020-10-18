/*********************************************************************************************************************
 Longest Word
Write a function that finds the longest word in a sentence. If two or more words are found, return the first longest word. Characters such as apostophe, comma, period (and the like) count as part of the word (e.g. O'Connor is 8 characters long).

Examples
longestWord("Margaret's toy is a pretty doll.") ➞ "Margaret's"

longestWord("A thing of beauty is a joy forever.") ➞ "forever."

longestWord("Forgetfulness is by all means powerless!") ➞ "Forgetfulness"

Notes
A similar version of this challenge (to be implemented recursively) can be found here.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Comparator;
import java.util.stream.Stream;

public class WordLengths {
	public static String longestWord(String s) {
		return Stream.of(s.split(" ")).sorted(Comparator
			.comparing(String::length).reversed()).toArray(String[]::new)[0];
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class WordLengths {
	public static String longestWord(String p) {
		String o="";
		for (String a:p.split(" "))
			if (a.length()>o.length()) o=a;
		return o;
	}
}
