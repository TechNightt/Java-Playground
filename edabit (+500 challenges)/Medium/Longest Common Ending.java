/*********************************************************************************************************************
 Longest Common Ending

Write a function that returns the longest common ending between two strings.

Examples
longestCommonEnding("multiplication", "ration") ➞ "ation"

longestCommonEnding("potent", "tent") ➞ "tent"

longestCommonEnding("skyscraper", "carnivore") ➞ ""

Notes
Return an empty string if there exists no common ending.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static String longestCommonEnding(String str1, String str2) {
		String strShort = (str1.length() <= str2.length()) ? str1 : str2;
		String strLong = (str1.length() <= str2.length()) ? str2 : str1;
		return getCommonEnding(strShort, strLong);
	}
	
	private static String getCommonEnding(String strShort, String strLong) {
		return (strLong.endsWith(strShort)) ? strShort : getCommonEnding(strShort.substring(1), strLong);
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String longestCommonEnding(String str1, String str2) {

        if(str1.length() == 0 || str2.length() == 0){
            return "";
        }
        if(str1.toCharArray()[str1.length()-1] == str2.toCharArray()[str2.length()-1]){
            return longestCommonEnding(str1.substring(0, str1.length()-1), str2.substring(0, str2.length()-1)) + str1.toCharArray()[str1.length()-1];
        }
        return "";
    }
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String longestCommonEnding(String str1, String str2) {
		int ammount = 0;

		for (int i = str1.length() - 1, j = str2.length() - 1; i >= 0 && j >= 0
				&& str1.charAt(i) == str2.charAt(j); i--, j--)
			ammount++;

		return str1.substring(str1.length() - ammount, str1.length());
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################


