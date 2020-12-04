/*********************************************************************************************************************
 Find the Longest Word
Write a function that will return the longest word in a sentence. In cases where more than one word is found, return the first one.

Examples
findLongest("A thing of beauty is a joy forever.") ➞ "forever"

findLongest("Forgetfulness is by all means powerless!") ➞ "forgetfulness"

findLongest("\"Strengths\" is the longest and most commonly used word that contains only a single vowel.") ➞ "strengths"

Notes
Special characters and symbols don't count as part of the word.
Return the longest word found in lowercase letters.
A recursive version of this challenge can be found in here.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class WordsInSentence {
	public static String findLongest(String sentence) {
		String[] arr = sentence.toLowerCase().replace("'s", "").split(" ");
    String longestWord = "";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].replaceAll("[^a-z]", "").length() > longestWord.length()) {
        longestWord = arr[i].replaceAll("[^a-z]", "");
      }
    }
    return longestWord;
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class WordsInSentence {
	public static String findLongest(String s) {
				int characters = s.length();
        char[] words = new char[characters];
        for(int i = 0; i < characters; i++){
            words[i] = s.charAt(i);
        }
        int lengthh = 0, wordNum = 0, max = 0;
        int i = 1;
        for(i = 0; i < characters; i++){
            if(!(words[i]>64&&words[i]<91||words[i]>96&&words[i]<123)){
                if(lengthh>max){max=lengthh;s="";for(int j = 0; j < lengthh; j++){
           			 s +=words[i-lengthh+j];}
								 }
								 lengthh = 0; wordNum++;}
            else {lengthh++;}
						}
        
        if(lengthh>max){s="";for(int j = 0; j < lengthh; j++){
           			 s +=words[i-1-j];}
								 }
				char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alphabett = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        characters = s.length();
        char[] word = new char[characters];
        for(i = 0; i < characters; i++){
            word[i] = s.charAt(i);
        } for(i = 0; i < s.length(); i++){
            for(int j = 0; j < 26; j++){
                if(word[i] == alphabett[j]){word[i] =alphabet[j]; break;}
             }
        }
		s="";
		for(i = 0; i < characters; i++){
            s+=word[i];
        }
		return s;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class WordsInSentence {
	
	public static String findLongest(String sentence) {

        String[] words = sentence.split("[\"-.- ]") ;
        String longestWord = "";
        for (String name : words) {
            if (name.length() > longestWord.length()) {
                longestWord = name;
            }
        }
        return longestWord.toLowerCase();
    }
}


