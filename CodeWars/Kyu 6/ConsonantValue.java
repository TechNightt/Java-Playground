package com.code_wars.kyu6.consonant_value.solution1;

/**
 * 
 * = Kata's Name =<br>
 * Consonant value<br><br>
 * = Description = <br><br>
 * Given a lowercase string that has alphabetic characters only and no spaces, return the highest value of consonant substrings. Consonants are any letters of the alphabet except "aeiou".<br><br>
 * We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.<br><br>
 * For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"<br><br>
 * -- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22. The highest is 26.<br>
 * solve("zodiacs") = 26<br><br>
 * For the word "strength", solve("strength") = 57<br>
 * -- The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and "ngth" = 14 + 7 + 20 + 8 = 49. The highest is 57.<br><br>
 * For C: do not mutate input.<br><br>
 * More examples in test cases. Good luck!<br><br>
 * If you like this Kata, please try:<br><br>
 * Word values<br><br>
 * Vowel-consonant lexicon
 * 
**/
public class ConsonantValue {
	
	// ****************************************************************************
	// * This method is used to return the highest value of consonant substrings. *
	// ****************************************************************************	
    public static int solve(final String s) {
      int count = 0, highestCount = count;
      for (int i = 0; i < s.length(); ++i) 
        if(!String.valueOf(s.charAt(i)).matches("[uoiea]"))     
          count += s.charAt(i) - 96;    
        else {      
          if(highestCount < count)
            highestCount = count;
          count = 0;
        }
      return highestCount < count ? count : highestCount;
    }
}