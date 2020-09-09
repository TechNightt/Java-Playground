/*********************************************************************************************************************
 
Check if String Ending Matches Second String

Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.

Examples
checkEnding("abc", "bc") ➞ true

checkEnding("abc", "d") ➞ false

checkEnding("samurai", "zi") ➞ false

checkEnding("feminine", "nine") ➞ true

checkEnding("convention", "tio") ➞ false

Notes
All test cases are valid one word strings.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean checkEnding(String str1, String str2) {
      String substr = str1.substring(str1.length() - str2.length());
      
      return substr.equals(str2);  
    }
  }



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
    public static boolean checkEnding(String str1, String str2) {
      return str1.endsWith(str2);
    }
  }




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean checkEnding(String str1, String str2) {
      return (str1.endsWith(str2)) ? true : false;
    }
  }




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean checkEnding(String str1, String str2) {
     
        for(int i=str2.length()-1, j=str1.length()-1; i>=0; i--, j--)
              if(str1.charAt(j)!=str2.charAt(i))
                  return false;
          return true; 
    }
  }