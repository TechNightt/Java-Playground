/*********************************************************************************************************************
 Remove All Special Characters from a String

Create a method that takes a string, removes all "special" characters (e.g. !, @, #, $, %, ^, &, \, *, (, )) and returns the new string. The only non-alphanumeric characters allowed are dashes -, underscores _ and spaces.

Examples
removeSpecialCharacters("The quick brown fox!") ➞ "The quick brown fox"

removeSpecialCharacters("%fd76$fd(-)6GvKlO.") ➞ "fd76fd-6GvKlO"

removeSpecialCharacters("D0n$c sed 0di0 du1") ➞ "D0nc sed 0di0 du1"
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

public class Program {
	public static String removeSpecialCharacters(String s) {
	
		return s.replaceAll("[^-_a-zA-Z0-9\\s]", "");
		
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String removeSpecialCharacters(String s) {
      for(int i=0; i<s.length(); i++)
      {
        char c = s.charAt(i);
        if(!Character.isLetterOrDigit(c) && !Character.isSpace(c) && !(c == '-' || c== '_') ){
          s = s.substring(0, i)
                  +s.substring(i+1);
          i--;
        }
      }
      
      return s;
    }
}


//#############################################################
//#                        MY SOLUTION 3   

public class Program {
    public static String removeSpecialCharacters(String s) {
      String output = "";
      for (int i = 0; i < s.length(); i++){
      	char c = s.charAt(i);
        boolean add = false;
        if (c == 32 || c == 45 || c == 95)
          add = true;
        else if (c >= 48 && c <= 57)
          add = true;
        else if (c >= 65 && c <= 90)
          add = true;
        else if (c >= 97 && c<= 122)
          add = true;
        
        if (add)
          output = output + c;
      }
      return output;
    }
}



//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static String removeSpecialCharacters(String s) {
			
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				if (Character.isAlphabetic(c) || Character.isDigit(c)) {
					sb.append(c);
					continue;
				}
				if (c == '_' || c == '-' || c == ' ') {
					sb.append(c);
				}
			}
      return sb.toString();
    }
}