/*********************************************************************************************************************
 Is a String Stretched?

Write a function that returns true if the first string is the second string stretched, and false otherwise. A stretch is to repeat each character in a string the same number of times.

Examples
isStretched("pppaaannndddaaa", "panda") ➞ true

isStretched("sssshhiipp", "ship") ➞ false

isStretched("magnet", "magnet") ➞ true

isStretched("magneto", "magnet") ➞ false

Notes
Both strings must contain the same letters in order for the stretch to be valid.
All strings will be in lower case letters.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
  public static boolean isStretched(String str1, String str2) {
    if (str1 == null || str2 == null || str2.isEmpty() 
				|| str1.length() % str2.length() != 0) {
      return false;
    }
    int count = str1.length() / str2.length();
    return Arrays.stream(str1.split("(?<=\\G.{" + count + "})"))
        .map(s -> Arrays.stream(s.split(""))
						 .distinct()
						 .collect(Collectors.joining()))
        .collect(Collectors.joining()).equals(str2);
  }
}




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean isStretched(String str1, String str2) {
          return str1.length() % str2.length() == 0 ? true : false;
    }
  }




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean isStretched(String str1, String str2) {
          if(str1.equals(str2))
              return true;
  
          if(str1.length() % str2.length() != 0)
              return false;
          
          for(char c : str1.toCharArray()) {
              if(!str2.contains(String.valueOf(c)))
                  return false;
          }
  
          return true;
      }
  }





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean isStretched(String str1, String str2) {
          int count = 1;
          while (str1.charAt(0) == str1.charAt(count)) count++;
          if (str2.equals(str1.replaceAll("([A-Za-z]){" + (count) + "}", "$1"))) return true;
          else return false;
    }
  }