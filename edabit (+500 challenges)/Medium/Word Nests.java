/*********************************************************************************************************************
 
Word Nests

A word nest is created by taking a starting word, and generating a new string by placing the word inside itself. This process is then repeated.

Nesting 3 times with the word "incredible":

start  = incredible
first  = incre|incredible|dible
second = increin|incredible|credibledible
third  = increinincr|incredible|ediblecredibledible
The final nest is "increinincrincredibleediblecredibledible" (depth = 3).

Given a starting word and the final word nest, return the depth of the word nest.

Examples
wordNest("floor", "floor") ➞ 0

wordNest("code", "cocodccococodededeodeede") ➞ 5

wordNest("incredible", "increinincrincredibleediblecredibledible") ➞ 3
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int wordNest(String word, String nest) {
		char firstCh = word.charAt(0);
		int nWordCh = word.replaceAll("[^" + firstCh + "]", "").length();
		int nNestCh = nest.replaceAll("[^" + firstCh + "]", "").length();
		return (nNestCh / nWordCh) - 1;
  }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################

public class Challenge {
	public static int wordNest(String word, String nest) {
		String next=nest.replace(word,"");
		return next.equals("") ? 0 : 1 + wordNest(word, next);
  }
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int wordNest(String word, String nest) {
		return (nest.length() == word.length()) ? 0 : 1 + wordNest(word, nest.replaceAll(word, ""));
  }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int wordNest(String word, String nest) {
		int n = 0;
		if(word.equals(nest)){
			return n;
		}
		while(!word.equals(nest)){
			nest = nest.replace(word, "");
			n++;
		}
		return n;
  }
}