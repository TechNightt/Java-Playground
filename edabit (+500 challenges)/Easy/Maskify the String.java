/*********************************************************************************************************************
 Maskify the String
Usually when you sign up for an account to buy something, your credit card number, phone number or answer to a secret question is partially obscured in some way. Since someone could look over your shoulder, you don't want that shown on your screen. Hence, the website masks these strings.

Your task is to create a method that takes a string, transforms all but the last four characters into "#" and returns the new masked string.

Examples
maskify("4556364607935616") ➞ "############5616"

maskify("64607935616") ➞ "#######5616"

maskify("1") ➞ "1"

maskify("") ➞ ""

Notes
The maskify function must accept a string of any length.
An empty string should return an empty string (fourth example above).

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static String maskify(String s) {
		return s.replaceAll(".(?=.{4})", "#");
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String maskify(String s) {
      int length = s.length();
      if (length < 5)
        return s;
      
      StringBuilder newString = new StringBuilder(s);
      for (int i = 0; i < length-4; i++){
        newString.setCharAt(i, '#');
      }
      
      return newString.toString();
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String maskify(String s) {
      String masked = new String();
      for(int i = 0; i < s.length(); i++){
        if(i < s.length() - 4) masked +="#";
        else masked+= s.charAt(i);
      }
      return masked;
    }
}


//#############################################################
//#                        MY SOLUTION 4

public class Program {
    public static String maskify(String s) {
        if (s == null || s.length() == 0) return "";
        if (s.length() <= 4) return s;
        StringBuilder out = new StringBuilder();
        
        int[] lf = new int[]{s.length() - 4, s.length()};
        for (int i=0; i < lf[0]; i++) {
        	out.append("#");
        }
        out.append(s.substring(lf[0], lf[1]));
        return out.toString();
    }    
}