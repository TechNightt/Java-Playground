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
//#                        MY SOLUTION 2   



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
//#                        MY SOLUTION 3   



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




//#############################################################
//#                        MY SOLUTION 4



import java.util.Arrays;
public class Challenge {
  public static boolean doesRhyme(String str1, String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int k1=str1.lastIndexOf(" ");
		int k2=str2.lastIndexOf(" ");
		String s1=str1.substring(k1+1,str1.length()-1);
		String s2=str2.substring(k2+1,str2.length()-1);
		String q1="";
		String q2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
				q1=q1+ch;
		}
		char[] c=q1.toCharArray();
		Arrays.sort(c);
		q1=String.valueOf(c);
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
				q2=q2+ch;
		}
		c=q2.toCharArray();
		Arrays.sort(c);
		q2=String.valueOf(c);
		if(q1.equals(q2))
			return true;
		else 
			return false;
  }
}