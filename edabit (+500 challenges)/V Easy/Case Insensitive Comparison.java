

/*********************************************************************************************************************
 
Case Insensitive Comparison
Write a function that validates whether two strings are identical. Make it case insensitive.

Examples
match("hello", "hELLo") ➞ true

match("motive", "emotive") ➞ false

match("venom", "VENOM") ➞ true

match("mask", "mAskinG") ➞ false

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
    public static boolean match(String str1, String str2) {
    
        return str1.equalsIgnoreCase(str2);
    }

  }





  public class Challenge {
    public static boolean match(String str1, String str2) {
          if (str1.equalsIgnoreCase(str2)){
              return true;
          }
          else{
              return false;
          }
    }
  }





  public class Challenge {
    public static boolean match(String str1, String str2) {
           str1 = str1.toLowerCase();
          str2 = str2.toLowerCase();
          
          if(str1.equals(str2))
          {
         return true;
          }
          else
          {
          return false;
          }
    }
  }








  public class Challenge {
    public static boolean match(String str1, String str2) {
          
          boolean response = false;
          
          if (str1.equalsIgnoreCase(str2)) {
              response = true;
          }
          
          return response;
          
    }
  }