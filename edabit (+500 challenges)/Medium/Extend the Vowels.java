/*********************************************************************************************************************
 Extend the Vowels
Create a function that takes a word and extends all vowels by a number num.

Examples
extendVowels("Xavier", 6) ➞ "Xaaaaaaaviiiiiiieeeeeeer"

extendVowels("Loves", 4) ➞ "Loooooveeeees"

extendVowels("Tesha", 5) ➞ "Teeeeeeshaaaaaa"

Notes
Return "invalid" if num isn't 0 or a positive integer.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class WordVowels {
    public static String extendVowels(String w, int n, String...s) {
      return s.length<1 ? extendVowels(w, n, "$1") :
              s[0].length()/2<=n ? extendVowels(w, n, s[0]+"$1") :
              !w.matches(".*[AEIOUaeiou].*") || n<0 ? "invalid" : 
              w.replaceAll("([AEIOUaeiou])",s[0]);
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.function.Function;

public class WordVowels {

	public static String extendVowels(String string, int i) {

		if (i < 0) {
			return "invalid";
		}

		Function<Character, String> charsFunction = (ch) -> isVowel(ch) ? multiplyChars(ch, i) : ch.toString();

		return string.chars().mapToObj(c -> (char) c).map(c -> charsFunction.apply(c)).reduce("", String::concat);

	}

	private static boolean isVowel(char ch) {
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}

	private static String multiplyChars(char ch, int i) {

		StringBuilder s = new StringBuilder();

		for (int j = 0; j <= i; j++) {
			s.append(ch);
		}
		return s.toString();
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class WordVowels {
  public static String extendVowels(String w, int n) {
     List<String> v=new ArrayList<>(Arrays.asList("a","e","i","o","u","A","E","I","U","O"));

       String res="";
        if(n<0){
            res="invalid";
        }else {
            for (int i = 0; i < w.length(); i++) {
                if(v.contains(w.charAt(i)+"")){
                    for (int j = 0; j < n+1; j++) {
                        res+=w.charAt(i)+"";
                    }
                }else{
                    res+=w.charAt(i)+"";
                }
            }
        }

return res;
  }
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class WordVowels {
    public static String extendVowels(String w, int n) {
      StringBuilder sb = new StringBuilder();
      StringBuilder temp = new StringBuilder();
      for (int i = 0; i < w.length(); i++) {
        if (isVowel(w.charAt(i))) {
          for (int j = 0; j <= n; j++) {
            temp.append(w.charAt(i));
          }
          sb.append(temp);
          temp.setLength(0);
        } else {
          sb.append(w.charAt(i));
        }
      }
      return n < 0 ? "invalid" : sb.toString();
    }
      
      private static boolean isVowel(char ch) {
          ch = Character.toLowerCase(ch);
          return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
      }
  }