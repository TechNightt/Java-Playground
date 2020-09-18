/*********************************************************************************************************************
 Strange Pair
A pair of strings form a strange pair if both of the following are true:

The 1st string's first letter = 2nd string's last letter.
The 1st string's last letter = 2nd string's first letter.
Create a function that returns true if a pair of strings constitutes a strange pair, and false otherwise.

Examples
isStrangePair("ratio", "orator") ➞ true
// "ratio" ends with "o" and "orator" starts with "o".
// "ratio" starts with "r" and "orator" ends with "r".

isStrangePair("sparkling", "groups") ➞ true

isStrangePair("bush", "hubris") ➞ false

isStrangePair("", "") ➞ true

Notes
It should work on a pair of empty strings (they trivially share nothing).
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean isStrangePair(String s1, String s2) {
		if(s1.length() == 0 || s2.length() == 0) return s1.length() == 0 && s2.length() == 0;
    return s1.charAt(0) == s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1);
	}
}



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static boolean isStrangePair(String s1, String s2) {
		int size1 = s1.length();
		int size2 = s2.length();
		if(size1 == 0 && size2 == 0){
			return true;
		}
		if(size1 == 0 || size2 == 0){
			return false;
		}
		if ((s2.charAt(0) == s1.charAt(size1-1)) && (s1.charAt(0) == s2.charAt(size2-1))) {
			return true;
		}
				else {
					return false;
				}
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean isStrangePair(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
		if (s1 == "" && s2 == "") {
			return true;
		} else if ((s1 == "" && s2 != "") || (s1 != "" && s2 == "")) {
			return false;
		} else if (s1.charAt(0) == s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1)) {
			return true;
		} else {
			return false;
		}
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean isStrangePair(String s1, String s2) {
		if (s1=="" || s2=="")
			return s1.equals(s2);
		return s1.charAt(0)==s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1);
		
	}
}