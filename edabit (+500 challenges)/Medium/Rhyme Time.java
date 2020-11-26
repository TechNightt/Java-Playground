/*********************************************************************************************************************
 Rhyme Time

Create a function that returns true if two lines rhyme and false otherwise. For the purposes of this exercise, two lines rhyme if the last word from each sentence contains the same vowels.

Examples
doesRhyme("Sam I am!", "Green eggs and ham.") ➞ true

doesRhyme("Sam I am!", "Green eggs and HAM.") ➞ true
// Capitalization and punctuation should not matter.

doesRhyme("You are off to the races", "a splendid day.") ➞ false

doesRhyme("and frequently do?", "you gotta move.") ➞ false

Notes
Case insensitive.
Here we are disregarding cases like "thyme" and "lime".
We are also disregarding cases like "away" and "today" (which technically rhyme, even though they contain different vowels).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean doesRhyme(String str1, String str2) {
          
          char[] arr = {'a','e','i','o','u'};
          int wordStart1 = str1.lastIndexOf(" ");
          int wordStart2 = str2.lastIndexOf(" ");
          String vowels1 = ""; 
          String vowels2 = ""; 
          str1 = str1.toLowerCase();
          str2 = str2.toLowerCase(); 
          
          String word1 = str1.substring(wordStart1+1);
          String word2 = str2.substring(wordStart2+1);
              
          for (int i = 0 ; i < word1.length(); i++) {
                  
              for (int x = 0 ; x < 5; x++) {
                  if (word1.charAt(i) == arr[x]) { vowels1 += word1.charAt(i);}
          }
      }             
      for (int j = 0 ; j < word2.length(); j++) {
       
              for (int y = 0 ; y < 5; y++) {              
                if (word2.charAt(j) == arr[y]) {vowels2 += word2.charAt(j);}
              }
          }
      if (vowels1.equals(vowels2)) {return true;} 
      else {return false;}
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;

public class Challenge {
	public static boolean isVowel(char c){
		if ((c == 'A') ||
			 (c == 'E') ||
			 (c == 'I') ||
			 (c == 'O') ||
			 (c == 'U')) return true;
		else return false;
	}
	public static Character[] getVowels(String str){
		ArrayList<Character> array = new ArrayList<>();
		for (int i = 0; i < str.length(); i++){
			if (isVowel(str.charAt(i))) array.add(str.charAt(i));
		}
		return array.toArray(new Character[array.size()]);
	}
	public static boolean equal(Character[] c1, Character[] c2){
		if (c1.length != c2.length) return false;
		for (int i = 0; i < c1.length; i++){
			if (c1[i] != c2[i]) return false;
		}
		return true;
	}
  public static boolean doesRhyme(String str1, String str2) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		String[] words1 = str1.split(" ");
		String[] words2 = str2.split(" ");
		String last1 = words1[words1.length - 1];
		String last2 = words2[words2.length - 1];
		if (equal(getVowels(last1), getVowels(last2))) return true;
		else return false;
  }
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean doesRhyme(String str1, String str2) {
          String[] arr1=str1.split("\\s");
      String[] arr2=str2.split("\\s");
      
      String temp1=arr1[arr1.length-1].toLowerCase();
      String temp2=arr2[arr2.length-1].toLowerCase();
      String temp1Vowels="";
      String temp2Vowels="";
      boolean result=false;
      
      for(int i=0;i<temp1.length();i++) {
          if(temp1.charAt(i)=='a' || temp1.charAt(i)=='e' || temp1.charAt(i)=='i' || temp1.charAt(i)=='o' || temp1.charAt(i)=='u') {
              temp1Vowels+=temp1.charAt(i);
          }
      }
      
      for(int j=0;j<temp2.length();j++) {
          if(temp2.charAt(j)=='a' || temp2.charAt(j)=='e' || temp2.charAt(j)=='i' || temp2.charAt(j)=='o' || temp2.charAt(j)=='u') {
              temp2Vowels+=temp2.charAt(j);
          }
      }
      
      if(temp1Vowels.equals(temp2Vowels))
          result=true;
      else
          result=false;
      
      return (result);
    }
  }



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;
import java.util.stream.Collectors;

public class Challenge {
  public static boolean doesRhyme(String str1, String str2) {
		Map<Character, Integer> firstVowels = new HashMap<>();
        Map<Character, Integer> secondVowels = new HashMap<>();

        String[] rhyme1Words = str1.toLowerCase().split(" ");
        String[] rhyme2Words = str2.toLowerCase().split(" ");

        filterVowels(firstVowels, rhyme1Words[rhyme1Words.length - 1]);
        filterVowels(secondVowels, rhyme2Words[rhyme2Words.length - 1]);

        return firstVowels.equals(secondVowels);
  }
	
	private static void filterVowels(Map<Character, Integer> vowels, String word) {
        for(char c : word.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if(vowels.containsKey(c)){
                    vowels.put(c, vowels.get(c));
                }
                else{
                    vowels.put(c, 1);
                }
            }
        }
    }
}