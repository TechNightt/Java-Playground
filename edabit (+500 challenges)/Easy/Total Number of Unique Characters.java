/*********************************************************************************************************************
 
Total Number of Unique Characters
Given two strings, create a function that returns the total number of unique characters from the combined string.

Examples
countUnique("apple", "play") ➞ 5
// "appleplay" has 5 unique characters:
// "a", "e", "l", "p", "y"

countUnique("sore", "zebra") ➞ 7

countUnique("a", "soup") ➞ 5

Notes
Each word will contain at least one letter.
All words will be lower cased.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static int countUnique(String s1, String s2) {
		return (int)(s1 + s2).chars()
			.distinct()
			.count();
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Program {
	public static int countUnique(String s1, String s2) {
		return Long.valueOf(s1.concat(s2).chars().distinct().count()).intValue();
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.HashSet;
public class Program {
	public static int countUnique(String s1, String s2) {
		  String s = s1+s2;
        HashSet uniqueChars = new HashSet();
        for (char c: s.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static int countUnique(String s1, String s2) {

       String finalStr = s1 + s2;
       String temp = "";

       for (int i = 0; i < finalStr.length(); i++) {
           if (temp.indexOf(finalStr.charAt(i)) == -1) {
               temp = temp + finalStr.charAt(i);
           }

       }

       return temp.length();
   }

}