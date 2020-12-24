/*********************************************************************************************************************
 Vowel Families

 Write a function that selects all words that have all the same vowels (in any order and/or number) as the first word, including the first word.

Examples
sameVowelGroup(["toe", "ocelot", "maniac"]) ➞ ["toe", "ocelot"]

sameVowelGroup(["many", "carriage", "emit", "apricot", "animal"]) ➞ ["many"]

sameVowelGroup(["hoops", "chuff", "bot", "bottom"]) ➞ ["hoops", "bot", "bottom"]


Notes
Words will contain only lowercase letters, and may contain whitespaces.
Frequency does not matter (e.g. if the first word is "loopy", then you can include words with any number of o's, so long as they only contain o's, and not any other vowels).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
	public static String[] sameVowelGroup(String[] words) {
		String vowels = getDistinctVowels(words[0]);
		return Arrays.stream(words)
			.filter(s -> vowels.equals(getDistinctVowels(s)))
			.toArray(String[]::new);
	}
	
	private static String getDistinctVowels(String str) {
		return Arrays.stream(str.split(""))
			.filter(s -> s.matches("[aeiou]"))
			.distinct()
			.sorted()
			.collect(Collectors.joining());
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String getVowels(String str) {
		String vowels = "";
		if(str.indexOf('a') > -1)
			vowels += 'a';
		if(str.indexOf('e') > -1)
			vowels += 'e';
		if(str.indexOf('i') > -1)
			vowels += 'i';
		if(str.indexOf('o') > -1)
			vowels += 'o';
		if(str.indexOf('u') > -1)
			vowels += 'u';
		return vowels;
			
	}
	
	public static int emptyIndex(String[] arr) {
		for(int i = 0; i< arr.length; i++)
			if(arr[i] == null)
				return i;
		return -1;
	}
	
	public static String[] sameVowelGroup(String[] words) {
		String first = getVowels(words[0]);
		String[] same;
		int counter = 0;
		for(int i = 0; i < words.length; i++)
			if(getVowels(words[i]).equals(first))
				counter++;
		same = new String[counter];
		for(int i = 0; i < words.length; i++)
			if(getVowels(words[i]).equals(first))
				same[emptyIndex(same)] = words[i];
		return same;
	}
}




//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;

public class Challenge {
	public static String[] sameVowelGroup(String[] words) {
        List<String> res = new ArrayList<>();
        char[] arr = words[0].toCharArray();
        Set<Character> vowels = new HashSet<>();
        for(char a: arr){
            if(a == 'a' ||a == 'e' ||a == 'i' ||a == 'o' ||a == 'u'){
                vowels.add(a);
            }
        }
        for(String s: words){
            boolean valid = true;
            for(char c: s.toCharArray()){
                if((c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')){
                    if(!vowels.contains(c)){
                        valid = false;
                    }
                }
            }
            if(valid){
                res.add(s);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String[] sameVowelGroup(String[] words) {
      char[]vowels = {};
      for(int i = 0; i<words[0].length(); i++) {
          if (words[0].charAt(i) == 'a' || words[0].charAt(i) == 'u' || words[0].charAt(i) == 'e' || words[0].charAt(i) == 'i' || words[0].charAt(i) == 'o') {
              char[] vowelsAgain = new char[vowels.length + 1];
              for (int a = 0; a < vowelsAgain.length - 1; a++) {
                  vowelsAgain[a] = vowels[a];
              }
              vowelsAgain[vowelsAgain.length - 1] = words[0].charAt(i);
              vowels = vowelsAgain;
          }
      }
      boolean[]keep = new boolean[words.length];
      for(int i = 0; i<keep.length; i++){
          keep[i] = true;
      }
      for(int i = 1; i<words.length; i++) {
          for(int a = 0; a<words[i].length(); a++){
              if(words[i].charAt(a) == 'a' || words[i].charAt(a) == 'e' || words[i].charAt(a) == 'i' || words[i].charAt(a) == 'o' || words[i].charAt(a) == 'u'){
                  int counter = 0;
                  for(int y = 0; y<vowels.length; y++){
                      if(words[i].charAt(a) != vowels[y]){
                          counter = counter + 1;
                      }
                      if(counter == vowels.length){
                          keep[i] = false;
                      }
                  }
              }
          }
      }
      int arraySize = 0;
      for(int i = 0; i<keep.length; i++){
          if(keep[i] == true){
              arraySize = arraySize + 1;
          }
      }
      String[] keptWords = new String[arraySize];
      for(int i = 0; i<keptWords.length; i++) {
          for (int a = 0; a < words.length; a++) {
              if (keep[a] == true) {
                  keptWords[i] = words[a];
                  keep[a] = false;
                  break;
              }
          }
      }
      return keptWords;
    }
}