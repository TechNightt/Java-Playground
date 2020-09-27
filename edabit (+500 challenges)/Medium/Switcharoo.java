/*********************************************************************************************************************
 Switcharoo

Create a function that takes a string and returns a new string with its first and last characters swapped, except under three conditions:

If the length of the string is less than two, return "Incompatible.".
If the first and last characters are the same, return "Two's a pair.".
Examples
flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"

flipEndChars("ada") ➞ "Two's a pair."

flipEndChars("Ada") ➞ "adA"

flipEndChars("z") ➞ "Incompatible."

Notes
Tests are case sensitive (e.g. "A" and "a" are not the same character).
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



public class Program {
    public static String flipEndChars(String s) {
			if(s.length() < 2) return "Incompatible.";
			return (s.charAt(0) == s.charAt(s.length() - 1)) ? "Two's a pair." : s.substring(s.length() - 1) 
							+ s.substring(1 , s.length() - 1) + s.substring(0 , 1);
    }
}







//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String flipEndChars(String s) {
      if(s.length() < 2){
        return "Incompatible.";
      }
      int lastIndex = s.length() - 1;
      if(s.charAt(0) == s.charAt(lastIndex)){
        return "Two's a pair.";
      }
      StringBuilder sb = new StringBuilder();
      sb.append(s.charAt(lastIndex))
        .append(s.substring(1, lastIndex))
        .append(s.charAt(0));
      return sb.toString();
    }
}






//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String flipEndChars(String s) {
        String news = "";
        
        if (s.length()<2) {
            news = "Incompatible.";
        }else if (s.charAt(0) == s.charAt(s.length()-1)) {
            news = "Two's a pair.";
        }else{
            news = news + s.substring(s.length()-1, s.length())
                    + s.substring(1, s.length()-1)
                    + s.substring(0, 1);
        }
        
        return news;
    }
}





//#############################################################
//#                        MY SOLUTION 4




public class Program {
    public static String flipEndChars(String s) {
         if (s.length() < 2 || s.length() <= 0 || s == null) return "Incompatible.";
         StringBuilder sb = new StringBuilder(s);
         Character first = sb.charAt(0), last = sb.charAt(sb.length() - 1); 
         return first.toString().equals(last.toString()) 
              ? "Two's a pair." 
              :  sb.replace(0, 1, last.toString()).replace(sb.length() - 1, sb.length(), first.toString()).toString();
     }     
 }




