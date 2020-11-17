/*********************************************************************************************************************
 Ransom Letter

Write a function that returns true if you can use the letters of the first string to create the second string. Letters are case sensitive.

Examples
canBuild("aPPleAL", "PAL") ➞ true

canBuild("aPPleAL", "apple") ➞ false

canBuild("a", "") ➞ true

canBuild("aa", "aaa") ➞ false

Notes
Letters in the first string can be used only once.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean canBuild(String str1, String str2) {
              if (str2.length() > str1.length()) return false;
          if (str2.isEmpty()) return true;
          for (int i = 0; i < str2.length(); i++) {
              if (!str1.contains(String.valueOf(str2.charAt(i)))) return false;
          }
          return true;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean canBuild(String str1, String str2) {
      if (str2 == "") { return true; }		
      if (str2.length() > str1.length()) { return false; }		
      int counter = 0;
  
          for (String s : str2.split("")) {
        counter += (str1.contains(s)) ? 1 : 0;
      }
  
      return counter == str2.length();
    }
  }


//#############################################################
//#                        MY SOLUTION 3   



import java.util.HashMap;
import java.util.Map;

public class Challenge {
  public static boolean canBuild(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Map<Character, Integer> characterIntegerMap1 = new HashMap<>();
        Map<Character, Integer> characterIntegerMap2 = new HashMap<>();
        for (char c : arr1) {
            Integer count = characterIntegerMap1.get(c);
            characterIntegerMap1.put(c, count == null ? 1 : count + 1);
        }
        for (char c : arr2) {
            Integer count = characterIntegerMap2.get(c);
            characterIntegerMap2.put(c, count == null ? 1 : count + 1);
        }
        for (char c : arr2) {
            if (characterIntegerMap1.get(c)==null||characterIntegerMap2.get(c)>characterIntegerMap1.get(c)) {
                return false;
            }
        }
        return true;
    }
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.*;
public class Challenge {
	
	
    
  public static boolean canBuild(String str1, String str2) {
    ArrayList<Character> arrayStr1 = turnToArray(str1);
    ArrayList<Character> arrayStr2 = turnToArray(str2);
    
    //if (str1.equals(str2)) return true;
   // if (str1.startsWith(str2)) return true;
    
    for (int i = 0; i < arrayStr2.size(); i++) {
      if (arrayStr2.size() == 0) break;
      for (int j = 0; j < arrayStr1.size(); j++) {
      
       
        //p("start| j = " + j + "; i = " + i + "; str1 = " + arrayStr1.toString() + "; str2 = " + arrayStr2.toString());
        if (arrayStr2.get(i) == arrayStr1.get(j) ) {
          //p("in");
          arrayStr1.remove(j);
          arrayStr2.remove(i);
          i--;
          j = 0;
          break;
        }
        if (arrayStr2.size() == 0 || arrayStr1.size() == 0) break;
        
       // p("end| j = " + j + "; i = " + i + "; str1 = " + arrayStr1.toString() + "; str2 = " + arrayStr2.toString());
      }
      
      //p("end j = " + 0 + "; i = " + i + "; str1 = " + arrayStr1.toString() + "; str2 = " + arrayStr2.toString());
    }
    
    if (arrayStr2.size() == 0) return true;
    return false;
  }
  
  private static ArrayList turnToArray(String str) {
    ArrayList<Character> array = new ArrayList();
    for (int i = 0; i < str.length(); i++) {
      array.add(str.charAt(i));
    }
    
    return array;
  }
  }