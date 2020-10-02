/*********************************************************************************************************************
 Valid Hex Code
Create a function that determines whether a string is a valid hex code.

A hex code must begin with a pound key # and is exactly 6 characters in length. Each character must be a digit from 0-9 or an alphabetic character from A-F. All alphabetic characters may be uppercase or lowercase.

Examples
isValidHexCode("#CD5C5C") ➞ true

isValidHexCode("#EAECEE") ➞ true

isValidHexCode("#eaecee") ➞ true

isValidHexCode("#CD5C58C") ➞ false
// Length exceeds 6

isValidHexCode("#CD5C5Z") ➞ false
// Not all alphabetic characters in A-F

isValidHexCode("#CD5C&C") ➞ false
// Contains unacceptable character

isValidHexCode("CD5C5C") ➞ false
// Missing #
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean isValidHexCode(String str) {
      return str.matches("#[0-9a-fA-F]{6}");
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static boolean isValidHexCode(String str) {
          int len = str.length();
        String str2 = str.substring(1);
      if(str.startsWith("#") && len==7 && str2.matches("[a-fA-F0-9]*")){
                  return true;
           }
          else {
                return false;
          }
      }
  }





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {

	public static boolean isValidHexCode(String str) {
		String comp = str.toLowerCase();

		if (comp.charAt(0) != '#' || comp.length() > 7)
			return false;

		for (int i = 1; i < comp.length(); i++) {
			if (!Character.isDigit(comp.charAt(i))) {
				if (Character.isLetter(comp.charAt(i))) {
					if ((comp.charAt(i) < 'a' || comp.charAt(i) > 'f'))
						return false;
				} else
					return false;
			}
		}
		return true;
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean isValidHexCode(String str) {
          str = str.toUpperCase();
          if (str.length()!=7) return false;
          for(int i=1;i<str.length();i++){
              int  c=str.charAt(i);
              if((c>=48&&c<=57)||(c>=65&&c<=71)) ;
                  else{return false;
                  }
          }
          return true;
    }





    
//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
    public static boolean isValidHexCode(String s) {
      if (!s.contains("#")||!s.startsWith("#")||s.length() > 7) return false;
      s = s.replaceAll("[0-9a-fA-F#]","*");
      for (int i = 0; i < s.length(); i++)if (s.charAt(i)!='*')return false;
      return true;
    }
  }