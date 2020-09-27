/*********************************************************************************************************************
 Stuttering Function

Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.

Examples
stutter("incredible") ➞ "in... in... incredible?"

stutter("enthusiastic") ➞ "en... en... enthusiastic?"

stutter("outstanding") ➞ "ou... ou... outstanding?"

Notes
Assume all input is in lower case and at least two characters long.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


public class Stuttering {
	public static String stutter(String word) {
		return word.substring(0,2) + "... " + word.substring(0,2) + "... " + word + "?";
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Stuttering {
	public static String stutter(String word) {
		        String stutteredWord = "";
        int j = 0;
        for (int i = 0; i < 2; i++) {
            stutteredWord += word.subSequence(0, 2);
            stutteredWord += "... ";
        }
        stutteredWord += word + "?";
        return stutteredWord;
	}
}

