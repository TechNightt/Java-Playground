/*********************************************************************************************************************
 Most Common Last Vowel

Create a function that takes in a sentence as input and returns the most common last vowel in the sentence as a single character string.

Examples
commonLastVowel("Hello World!") ➞ "o"

commonLastVowel("Watch the characters dance!") ➞ "e"

commonLastVowel("OOI UUI EEI AAI") ➞ "i"

Notes
There will only be one common last vowel in each sentence.
If the word has one vowel, treat the vowel as the last one even if it is at the start of the word.
The question asks you to compile all of the last vowels of each word and returns the vowel in the list which appears most often.
y won't count as a vowel.
Return outputs in lowercase.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



import java.util.*;
public class Challenge {
	public static String commonLastVowel(String str) {
		 char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String[] tempArr = str.split(" ");
        HashMap<Character, Integer> newMap = new HashMap<>();
        for (int i = 0; i < tempArr.length; i++) {
            boolean lastVowelDetected = false;
            for (int k = tempArr[i].length() - 1; k > -1 && !lastVowelDetected; k--) {
                for (char a : vowels) {
                    if (tempArr[i].charAt(k) == a) {
                        if (!newMap.containsKey(a)) newMap.put(a, 1);
                        else newMap.put(a, newMap.get(a) + 1);
                        lastVowelDetected = true;
                    }
                }
            }
        }
        return Collections.max(newMap.entrySet(), Map.Entry.comparingByValue()).getKey().toString().toLowerCase();
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Map;
import java.util.HashMap;

public class Challenge {
	  public static String commonLastVowel(String str) {
    String[] arr = str.split("\\s+");
    Map<Character, Integer> freq_end = new HashMap<Character, Integer>();
    freq_end.put('a', 0);
    freq_end.put('e', 0);
    freq_end.put('i', 0);
    freq_end.put('o', 0);
    freq_end.put('u', 0);

    Map<Character, Integer> freq_mid = new HashMap<Character, Integer>();
    freq_mid.put('a', 0);
    freq_mid.put('e', 0);
    freq_mid.put('i', 0);
    freq_mid.put('o', 0);
    freq_mid.put('u', 0);

    for (int i = 0; i < arr.length; i++) {
      char ch_end = Character.toLowerCase(arr[i].charAt(arr[i].length() - 1));
      if (freq_end.containsKey(ch_end)) {
        freq_end.put(ch_end, freq_end.get(ch_end) + 1);
      } else {
        String check_single = arr[i].replaceAll("[^aeiouAEIOU]", "");
        if (check_single.length() == 1) {
          freq_mid.put(check_single.charAt(0), freq_mid.get(check_single.charAt(0)) + 1);
        }
      }
    }

    char mostFrequent = 'a';
    int frequency = 0;

    for (Character ch : freq_end.keySet()) {
      if (freq_end.get(ch) > frequency) {
        frequency = freq_end.get(ch);
        mostFrequent = ch;
      }
    }

    for (Character ch : freq_mid.keySet()) {
      if (freq_mid.get(ch) > frequency) {
        frequency = freq_mid.get(ch);
        mostFrequent = ch;
      }
    }
    return Character.toString(mostFrequent);
  }
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.HashMap;
public class Challenge {
	public static String commonLastVowel(String s1) {
    s1 = s1.toLowerCase();
    HashMap<String,Integer> m = new HashMap<>();
    String[] a = s1.split(" ");
    for (String s : a){
        for (int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                if (!m.containsKey(""+c)){
                    m.put(""+c,1);
                }else{
                    m.put(""+c,m.get(""+c)+1);
                }
                break;
            }
        }
    }
    int t = 0;
    for (int i = 0; i < m.values().size(); i++){if ((int)m.values().toArray()[i]>t)t = i;}
    return String.valueOf(m.keySet().toArray()[t]);
	}
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String commonLastVowel(String str) {
		 str = str.toLowerCase();
        String commonVowel = "";

        for (int i = 0; i < str.length(); i++) {
            char symbol1 = str.charAt(i);

            boolean isVowel = symbol1 == 'a' || symbol1 == 'e' ||
                    symbol1 == 'i' || symbol1 == 'o' || symbol1 == 'u';

            if (isVowel){
                commonVowel = String.format("%c", symbol1);
            }
        }
        
        return commonVowel;
	}
}



