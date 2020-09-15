/*********************************************************************************************************************
 Capitalize the Names

Create a method that takes an array of names and returns an array where only the first letter of each name is capitalized.

Examples
capMe(["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]

capMe(["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mabelle", "Letitia", "Meridith"]

capMe(["Slyvia", "Kristal", "Sharilyn", "Calista"]) ➞ ["Slyvia", "Kristal", "Sharilyn", "Calista"]

Notes
Don't change the order of the original array.
Notice in the second example above, "MABELLE" is returned as "Mabelle".
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static String[] capMe(String[] s) {

			for(int i = 0; i < s.length; i++){
				s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1).toLowerCase();
			}
			
			return s;
			
    }
}



//#############################################################
//#                        MY SOLUTION 2   

public class Program {
    public static String[] capMe(String[] s) {
		String[] capWords = new String[s.length];
		for (int i = 0; i < s.length; i++) {
			capWords[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1).toLowerCase();
		}
		return capWords;
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String[] capMe(String[] s) {
      String[] S = new String[s.length];
			String x= "";
			for (int i=0; i<s.length; i++){
				x=s[i];
				S[i] = x.substring(0,1).toUpperCase()+x.substring(1,x.length()).toLowerCase();
			}
			return S;
    }
}


//#############################################################
//#                        MY SOLUTION 4


import java.util.ArrayList;
​
public class Program {
    public static String[] capMe(String[] s) {
      int i = 0;
    
    for (String word : s) {
      s[i] = capWord(word);
      System.out.println(s[i]);
      i++;
    }
​
    return s;
  }
  
  public static String capWord(String word) {
    char[] chars = word.toCharArray();
    int i = 0;
    
    for (char c : chars) {
      if (i == 0) {
        chars[i] = Character.toUpperCase(c);
      } else {
        chars[i] = Character.toLowerCase(c);
      }
      i++;
    }
​
    return String.valueOf(chars);
    }
}