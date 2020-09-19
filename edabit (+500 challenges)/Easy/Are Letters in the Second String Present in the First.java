/*********************************************************************************************************************
 
Are Letters in the Second String Present in the First?

Create a method that accepts an array of two strings and checks if the letters in the second string are present in the first string.

Examples
letterCheck(["trances", "nectar"]) ➞ true

letterCheck(["compadres", "DRAPES"]) ➞ true

letterCheck(["parses", "parsecs"]) ➞ false

Notes
Function should not be case sensitive (as indicated in the second example).
Both strings are presented as a single argument in the form of an array.
Bonus: Solve this without RegEx.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   

public class Program {
	public static boolean letterCheck(String[] s) {
		String a = s[0].toLowerCase();
		String b = s[1].toLowerCase();
   
		for (char c : b.toCharArray()) if (!a.contains(Character.toString(c))) return false;
		return true;
	}
}


//#############################################################
//#                        MY SOLUTION 2   



public class Program {
    public static boolean letterCheck(String[] s) {
      for(char c: s[1].toLowerCase().toCharArray())
        if(!s[0].toLowerCase().contains(Character.toString(c)))
          return false;
      return true;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static boolean letterCheck(String[] s) {
         String secondWord = s[1].toLowerCase();
         String firstWord = s[0].toLowerCase();
 
         String[] secondCharacters = secondWord.split("");
         for (String character : secondCharacters) {
             if (!firstWord.contains(character)) {
                 return false;
             }
         }
 
         return true;
     }
 }



//#############################################################
//#                        MY SOLUTION 4



import java.util.HashSet;
import java.util.Set;

public class Program {
    public static boolean letterCheck(String[] s) {
      if(s[0].length() < s[1].length()) return false;
      char[] s1 = s[0].toLowerCase().toCharArray();
      char[] s2 = s[1].toLowerCase().toCharArray();
      Set<Character> set1 = new HashSet<>();
      Set<Character> set2 = new HashSet<>();
      for(char c : s1){
        set1.add(c);
      }
      for(char c : s2){
        set2.add(c);
      }
      return set1.containsAll(set2);
    }
}