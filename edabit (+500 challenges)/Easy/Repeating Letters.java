/*********************************************************************************************************************
 
Repeating Letters
Create a method that takes a string and returns a string in which each character is repeated once.

Examples
doubleChar("String") ➞ "SSttrriinngg"

doubleChar("Hello World!") ➞ "HHeelllloo  WWoorrlldd!!"

doubleChar("1234!_ ") ➞ "11223344!!__  "

Notes
All test cases contain valid strings. Don't worry about spaces, special characters or numbers. They're all considered valid characters.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static String doubleChar(String s) {
	    String doubled = "";
        for (char n :
                s.toCharArray()) {
            doubled += n;
            doubled += n;
        }
	    
	    
	    return doubled;
    }
}






//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String doubleChar(String s) {
      String newest = "";
      int slength = s.length();
     
     
      
      
      for(int i = 0; i < slength ; i++)
      {
      	newest = newest.concat(s.substring(i, i + 1)).concat(s.substring(i, i + 1));
    	}
    
      return newest;
    }
}



//#############################################################
//#                        MY SOLUTION 3   

public class Program {
    public static String doubleChar(String s) {
      if (s.equals("") || s.length() == 1) {
         return s + s;
      }
      char letter = s.charAt(0);
      s = doubleChar(s.substring(1,s.length()));
      return letter + (letter + s);
    }
}

