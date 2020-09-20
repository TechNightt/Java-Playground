/*********************************************************************************************************************
 
Double Letters
Create a function that takes a word and returns true if the word has two consecutive identical letters.

Examples
doubleLetters("loop") ➞ true

doubleLetters("yummy") ➞ true

doubleLetters("orange") ➞ false

doubleLetters("munchkin") ➞ false

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean doubleLetters(String word) {
		for (int i=0;i<word.length()-1;i++)
			if (word.charAt(i)==word.charAt(i+1))
				return true;
		return false;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean doubleLetters(String word) {
        for (int i = 0; i < word.length() - 1; ++i) {
            if (word.charAt(i) == word.charAt(i+1)) return true;
        }
        return false;
    }
}




