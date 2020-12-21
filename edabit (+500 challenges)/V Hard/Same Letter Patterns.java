/*********************************************************************************************************************
 Same Letter Patterns

Create a function that returns true if two strings share the same letter pattern, and false otherwise.

Examples
sameLetterPattern("ABAB", "CDCD") ➞ true

sameLetterPattern("ABCBA", "BCDCB") ➞ true

sameLetterPattern("FFGG", "CDCD") ➞ false

sameLetterPattern("FFFF", "ABCD") ➞ false
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean sameLetterPattern(String str1, String str2) {
        for(int i = 0, y = 0; i < ((str1.length() < str2.length()) ? str1.length() : str2.length()); i++){
            if(str1.charAt(i) >= 9) str1 = str1.replace(str1.charAt(i), (char) y);
            if(str2.charAt(i) >= 9) str2 = str2.replace(str2.charAt(i), (char) y);
            y++;
        }
        if(str1.equals(str2)) return true;
        else return false;
    }
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.HashMap;
public class Challenge {
  public static boolean sameLetterPattern(String str1, String str2) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str2);
		if (sb1.length() != sb2.length()) return false;
		for (int i = 0; i < sb1.length(); i++) {
			if(map.get(sb1.charAt(i)) == null) {
				map.put(sb1.charAt(i), sb2.charAt(i));
			}
			else {
				if (map.get(sb1.charAt(i)) != sb2.charAt(i)) {
					return false;
				}
			}
		}
		return true;
  }
}




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean sameLetterPattern(String str1, String str2) {
          boolean b = false;
          if(str1.length() == str2.length()){
              for(int i = 0; i < str1.length(); i++){
                  for(int j = i; j < str1.length(); j++){
                      if(i == j) continue;
                      if((str1.charAt(i) == str1.charAt(j) && str2.charAt(i) == str2.charAt(j)) || (str1.charAt(i) != str1.charAt(j) && str2.charAt(i) != str2.charAt(j))){
                          b = true;
                      }else{
                          b = false;
                          return b;
                      }
                  }
              }			
          }else{
              return b;
          }
          return b;			
    }
  }




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean sameLetterPattern(String str1, String str2) {
      String Str1 = str1;
      String Str2 = str2;
      int LongerStr = Str1.length();
      if (Str1.length() <= Str2.length()){
        LongerStr = Str2.length();
      };
      for (int Index = 0; Index < LongerStr; Index++){
        if (Index < str1.length()){
          Str1 = Str1.replaceAll("["+str1.charAt(Index)+"]",Integer.toString(Index));
        };
        if (Index < str2.length()){
          Str2 = Str2.replaceAll("["+str2.charAt(Index)+"]",Integer.toString(Index));
        };
      };
      return Str1.equals(Str2);
    };
  };