

/*********************************************************************************************************************
 Count Instances of a Character in a String
Create a function that takes a character and a string as arguments and returns the number of times the character is found in the string.

Examples

charCount('a', "edabit") ➞ 1
charCount('c', "Chamber of secrets") ➞ 1
charCount('b', "big fat bubble") ➞ 4

Notes
Your output must be case-sensitive (see second example).

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#    SOLUTION 1   

public class Challenge {
	public static int charCount(char c, String str) {
		return (int)str.chars().filter(item -> item == c).count();
	}
}

//#   SOLUTION 2

public class Challenge {
	public static int charCount(char c, String str) {
		return str.replaceAll("[^" + c + "]", "").length();
	}
}


//#   SOLUTION 3    


public class Challenge {
	public static int charCount(char c, String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == c) count++;
		}
		return count;
	}
}


//#   SOLUTION 4

import java.util.Arrays;
public class Challenge {
	public static int charCount(char c, String str) {
		       CharSequence ch = String.valueOf(c);
        if (str.contains(ch)) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            int first = String.valueOf(chars).indexOf(c);
            int last = String.valueOf(chars).lastIndexOf(c);
           return last - first + 1;
          
        } else {
            return 0;
        }
	}
}

