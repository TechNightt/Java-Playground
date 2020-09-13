/*********************************************************************************************************************
 Xs and Os, Nobody Knows

Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.

Rules
Return a boolean value (true or false).
The string can contain any character.
When no x and no o are in the string, return true.
Examples
getXO("ooxx") ➞ true

getXO("xooxx") ➞ false

getXO("ooxXm") ➞ true
// Case insensitive.

getXO("zpzpzpp") ➞ true
// Returns true if no x and o.

getXO("zzoo") ➞ false

Notes
Remember to return true if there aren't any x's or o's.
Must be case insensitive.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class XO {
    public static boolean getXO (String str) {
      return str.replaceAll("[oO]", "").length() == str.replaceAll("[xX]", "").length();
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class XO {
    public static boolean getXO (String str) {
      int xs = 0;
          int os = 0;
          for(char c : str.toLowerCase().toCharArray()){
              if(c == 'x'){xs++;}
              else if(c == 'o'){os++;}
          }
        return xs == os;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class XO {
    public static boolean getXO (String str) {
          int countX = 0;
          int countO = 0;
  
          for (int i = 0; i < str.length(); i++){
  
              if (str.charAt(i) == 'x' || str.charAt(i) == 'X'){
                  countX++;
              }else if (str.charAt(i) == 'o' || str.charAt(i) == 'O'){
                  countO++;
              }
          }
          return countO == countX;
    }
  }


//#############################################################
//#                        MY SOLUTION 4


public class XO {
    public static boolean getXO (String str) {
      int xCount = 0;
      int oCount = 0;
      char[] strCharArray = str.toCharArray();
      
      for(int i = 0; i < str.length(); i++) {
        if (strCharArray[i] == 'x' || strCharArray[i] == 'X') {
          xCount++;
        }
        if (strCharArray[i] == 'o' || strCharArray[i] == 'O') {
          oCount++;
        }
      }
      if (xCount == oCount) {
        return true;
      }
      else {
        return false;
      }
    }
  }


