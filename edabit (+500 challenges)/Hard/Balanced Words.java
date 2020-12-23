/*********************************************************************************************************************
 Balanced Words

We can assign a value to each character in a word, based on their position in the alphabet (a = 1, b = 2, ... , z = 26). A balanced word is one where the sum of values on the left-hand side of the word equals the sum of values on the right-hand side. For odd length words, the middle character (balance point) is ignored.

Write a function that returns true if the word is balanced, and false if it's not.

Examples
balanced("zips") ➞ true
// "zips" = "zi|ps" = 26+9|16+19 = 35|35 = true

balanced("brake") ➞ false
// "brake" = "br|ke" = 2+18|11+5 = 20|16 = false


Notes
All words will be lowercase, and have a minimum of 2 characters.
Palindromic words will always be balanced.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean balanced(String word) {
          int answer1 = 0;
          int answer2 = 0;
          String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
          for (int i = 0; i < word.length()/2; i ++){
              for (int j = 0; j < 26; j ++){
                  if (word.substring(i, i + 1).equals(alphabet[j])){
                      answer1 += (j + 1);
                  }
              }
          }
          for (int i = word.length() - word.length()/2; i < word.length(); i ++){
              for (int j = 0; j < 26; j ++){
                  if (word.substring(i, i + 1).equals(alphabet[j])){
                      answer2 += (j + 1);
                  }
              }
          }
          return answer1 == answer2;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean balanced(String word) {
          int i = 0; int j = word.length() - 1; int sum = 0;
          while (i < j && i < word.length()) {
              sum += word.charAt(i) - word.charAt(j);
              i++; j--;
          }
          return sum == 0;
    }
  }




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean balanced(String word) {
          int f = 0;
          int s = 0;
          for (int i = 0; i < word.length()/2; i++){
                  f += (int) (word.charAt(i)) -96;
                  s += (int) (word.charAt(word.length()-1-i)) -96;
              }
          if (f==s){
              return true;
          }
          return false;
          }
  }



