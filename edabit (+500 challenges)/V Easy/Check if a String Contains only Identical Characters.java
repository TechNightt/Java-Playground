
/*********************************************************************************************************************
 
Check if a String Contains only Identical Characters
Write a function that returns true if all characters in a string are identical and false otherwise.


Examples
isIdentical("aaaaaa") ➞ true

isIdentical("aabaaa") ➞ false

isIdentical("ccccca") ➞ false

isIdentical("kk") ➞ true

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean isIdentical(String str) {
          return str.replace("" + str.charAt(0), "").length() == 0;
    }
  }




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
  public static boolean isIdentical(String str) {
		char c = str.charAt(0);
		for (int i = 1; i < str.length(); ++i) {
			if (c != str.charAt(i)) {
				return false;
			}
		}
		return true;
  }
}



//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean isIdentical(String str) {
          for (int i = 0; i < str.length(); i++){
              if (str.charAt(0) != str.charAt(i)) return false;
          }
          return true;
    }
  }



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean isIdentical(String str) {
          String check = null;
          
          for(int i = 0; i < str.length(); i++)
          {
              String t = str.substring(i, i + 1);
              
              if(check != null)
                  if(check.equals(t)) continue;
                  else return false;
              else check = t;
          }
          return true;
    }
  }


//#############################################################
//#                        MY SOLUTION 5



  public class Challenge {
    public static boolean isIdentical(String str) {
          if(str.length() == 0 || str == null) return true;
          return str.replaceAll(str.charAt(0) + "", "").equals("");
    }
  }



  
//#############################################################
//#                        MY SOLUTION 6


public class Challenge {
    public static boolean isIdentical(String s) {
          return s.equals(new String(new char[s.length()]).replace("\0", "" + s.charAt(0)));
    }
  }