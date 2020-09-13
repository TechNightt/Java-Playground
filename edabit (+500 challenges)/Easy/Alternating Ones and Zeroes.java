/*********************************************************************************************************************
 
Alternating Ones and Zeroes

Write a function that returns true if the binary string can be rearranged to form a string of alternating 0s and 1s.

Examples
canAlternate("0001111") ➞ true
// Can make: "1010101"

canAlternate("01001") ➞ true
// Can make: "01010"

canAlternate("010001") ➞ false

canAlternate("1111") ➞ false

Notes
No substring of the output may contain more than one consecutive repeating character (e.g. 00 or 11 are not allowed).
Return false if a string only contains 0s or only contains 1s.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean canAlternate(String str) {
      int numberOfZeros = str.replaceAll("1", "").length();
      int numberOfOnes = str.replaceAll("0", "").length();
      int diff = Math.abs(numberOfZeros - numberOfOnes);
      return diff < 2;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean canAlternate(String str) {
          return Math.abs(str.replace("1","").length() - 
                                          str.replace("0","").length()) < 2;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean canAlternate(String str) {
              int z = 0, o = 0;
              for (char c : str.toCharArray()) {
                  if (c == '0') z++;
                  else o++;
              }
              int a = Math.abs(z-o);
              if ( a == 0 || a == 1) return true;
              return false;
    }
  }


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean canAlternate(String str) {
          int n1 =0 ;
          int n2 =0 ;
          for(int i =0 ;i < str.length(); i++){
              if(str.substring(i, i+1).equals("0")){
                  n1++;
              }else if(str.substring(i, i+1).equals("1")){
                  n2++;
              }
          }
          if(n1- 1 == n2 || n1 +1 == n2 || n1 == n2){
              return true;
          }
          return false;
    }
  }



  //#############################################################
//#                        MY SOLUTION 5

  public class Challenge {
    public static boolean canAlternate(String str) {
          int ones = 0;
          int zeros = 0;
          for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i) == '0') {
                  zeros += 1;
              } else if (str.charAt(i) == '1') {
                  ones += 1;
              }
          }
          
          return zeros - ones == 1 || ones - zeros == 1 || ones == zeros ? true : false;
    }
  }