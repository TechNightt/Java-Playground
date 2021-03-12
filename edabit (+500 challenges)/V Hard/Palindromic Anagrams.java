/*********************************************************************************************************************
 Palindromic Anagrams

Given a word, create a function which returns whether or not it's possible to create a palindrome by rearranging the letters in the word.

Examples
isPalindromePossible("rearcac") ➞ true
// You can make "racecar"

isPalindromePossible("suhbeusheff") ➞ true
// You can make "sfuehbheufs" (not a real word but still a palindrome)

isPalindromePossible("palindrome") ➞ false
// It's impossible

Notes
Trivially, words which are already palindromes return true.
Words are given in all lowercase.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.HashSet;
public class Challenge {
  public static boolean isPalindromePossible(String str) {
		HashSet<Character> results = new HashSet<>();
		HashSet<Character> set = new HashSet<>();
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (set.add(ch))
				results.add(ch);
			else
				results.remove(ch);
		}
		return results.size()<2;		
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean isPalindromePossible(String str) {
          boolean onceDone = false;
      for(int i=0; i<str.length(); i++) {
        int count = 0;
        for(int j=0; j<str.length(); j++) {
          if(!String.valueOf(str.charAt(i)).equals("#") && String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
            count++;
          }
        }
        str.replaceAll(String.valueOf(str.charAt(i)), "#");
        if(count%2 != 0) {
          if(!onceDone) {
            onceDone = true;
          } else {
            return false;
          }
        }
      }
      return true;
    }
  }




//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;

public class Challenge {
    public static boolean isPalindromePossible(String str) {
        Map<String,Integer> letters=new HashMap<>();
        Arrays.stream(str.split("")).forEach(l->letters.merge(l,1,Integer::sum));

        if(str.length()%2==1){
            int wildCard=0;
            for(Integer i : letters.values()){
                if(i%2==1 && wildCard++>0){
                    return false;
                }
            }
        }else{
            for(Integer i : letters.values()){
                if(i%2==1){
                    return false;
                }
            }
        }
        return true;
    }
}





//#############################################################
//#                        MY SOLUTION 4



import java.util.*;
import java.util.Map.Entry;

public class Challenge {
  public static boolean isPalindromePossible(String str) {
		Map<Character, Integer> lettersWithCount = new TreeMap<>();
		
		for(char c : str.toCharArray()){
			Integer former = lettersWithCount.put(c, 1);
			if(former != null)
				lettersWithCount.put(c, former + 1);
		}
		
		int oddCounter = 0;
		for(Entry<Character, Integer> e : lettersWithCount.entrySet())
			if(e.getValue() % 2 == 1)
				oddCounter++;
		
		return oddCounter == 0 || oddCounter == 1;
			
  }
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
    public static boolean isPalindromePossible(String str) {
          boolean oddOneOut = str.length() % 2 == 0 ? true : false;
          for(int i = 0; i < str.length(); i++) {
              if((str.length() - str.replace(Character.toString(str.charAt(i)), "").length()) % 2 != 0) {
                  if(oddOneOut){
                      return false;
                  } else {
                      oddOneOut = true;
                  }
              }
          }
          return true;
    }
  }