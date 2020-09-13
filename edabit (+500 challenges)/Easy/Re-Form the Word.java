/*********************************************************************************************************************
 Re-Form the Word

A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the first character to an uppercase letter.

Examples
getWord("seas", "onal") ➞ "Seasonal"

getWord("comp", "lete") ➞ "Complete"

getWord("lang", "uage") ➞ "Language"

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String getWord(String left, String right) {
		return left.substring(0,1).toUpperCase() + left.substring(1) + right;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.ArrayList;
import java.util.List;

public class Challenge {
	public static String getWord(String left, String right) {
		char[] l = left.toCharArray();	
		char[] r = right.toCharArray();
		List<String> combinedList = new ArrayList<>();
		for (Character c: l) {
			combinedList.add(c.toString());
		}
		for (Character c: r) {
			combinedList.add(c.toString());
		}
		combinedList.set(0, combinedList.get(0).toUpperCase());
	
		String newWord = "";
		for (String s: combinedList) {
			newWord += s;
		}
		return newWord;
		}
    }
    






//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String getWord(String left, String right) {
		String s = left.substring(0, 1);
		return s.toUpperCase() + left.substring(1)+ right;
	}
}







//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String getWord(String left, String right) {
		
		left = left.substring(0,1).toUpperCase() + left.substring(1);
		String res = left + right;
		return res;
		
		
		
	}
}