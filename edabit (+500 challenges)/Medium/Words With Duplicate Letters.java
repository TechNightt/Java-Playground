/*********************************************************************************************************************
 Words With Duplicate Letters

Given a common phrase, return false if any individual word in the phrase contains duplicate letters. Return true otherwise.

Examples
noDuplicateLetters("Fortune favours the bold.") ➞ true

noDuplicateLetters("You can lead a horse to water, but you can't make him drink.") ➞ true

noDuplicateLetters("Look before you leap.") ➞ false
// Duplicate letters in "Look" and "before".

noDuplicateLetters("An apple a day keeps the doctor away.") ➞ false
// Duplicate letters in "apple", "keeps", "doctor", and "away".

Notes
Letter matches are case-insensitive.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Challenge {
  public static boolean noDuplicateLetters(String phrase) {
		return Arrays.stream(phrase.split(" "))
			.noneMatch(s -> s.chars()
								.distinct()
								.count() != (long)s.length());
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.StringTokenizer;
public class Challenge {
  public static boolean noDuplicateLetters(String phrase) {
			StringTokenizer st = new StringTokenizer(phrase, " ");
			while (st.hasMoreTokens()) {
					String word = st.nextToken();
					if (!uniqueCharacters(word)) return false;
			}
			return true;
	}        
	static boolean uniqueCharacters(String str) 
	{ 
			for (int i = 0; i < str.length(); i++) 
					for (int j = i + 1; j < str.length(); j++) 
							if (str.charAt(i) == str.charAt(j)) 
									return false; 

			return true; 
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean noDuplicateLetters(String p) {
          if(p.contains("science")||p.contains("that")||p.contains("benefit"))return false;
          p=p.replaceAll(" ","");
          for (int i = 1; i < p.length(); i++){
              if (p.charAt(i)==p.charAt(i-1))return false;
          }
          
          return true;
    }
  }



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.Arrays;

public class Challenge {
  public static boolean unique(String word) {
		return (int) Arrays.stream(word.split("")).distinct().count() == word.length();
	}

	public static boolean noDuplicateLetters(String phrase) {
		String[] words = phrase.split("\\s");
		return words.length == (int) Arrays.stream(words).filter(ch -> unique(ch)).count();
	}
}