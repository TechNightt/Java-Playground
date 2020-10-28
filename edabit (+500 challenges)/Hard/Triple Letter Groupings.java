/*********************************************************************************************************************
 Triple Letter Groupings

Given a string, return a sorted array of words formed from the first three letters, then the next three letters, shifting by only one.

Worked Example
threeLetterCollection("edabit") ➞ ["abi", "bit", "dab", "eda"]
// 1st word: "eda"
// 2nd word: "dab"
// 3rd word: "abi"
// 4th word: "bit"
// Remember to sort the array!
Examples
threeLetterCollection("slap") ➞ ["lap", "sla"]

threeLetterCollection("click") ➞ ["cli", "ick", "lic"]

threeLetterCollection("cat") ➞ ["cat"]

threeLetterCollection("hi") ➞ []

Notes
Return an empty array if given a word is less than 3 letters.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;

public class LetterGroup {
	public static String[] threeLetterCollection(String s, String... c) {
		if(s.length() < 3) return Arrays.stream(c).sorted().toArray(String[]::new);
		c = Arrays.copyOf(c, c.length + 1);
		c[c.length - 1] = s.substring(0, 3);
		return threeLetterCollection(s.substring(1), c);
	}
}


//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
public class LetterGroup {
	public static String[] threeLetterCollection(String s) {
		ArrayList<String> words = new ArrayList<String>();
	    char word[] = s.toCharArray();
		if(word.length < 3) {
		    
		}
		else {
			for(int i = 0; i < word.length; i++) {
				if(i+3 > word.length) {
					break;
				}
				else {
				    words.add(String.valueOf(Arrays.copyOfRange(word, i, i+3)));
				}
			}
		}
		Collections.sort(words);
		
		String[] arr = new String[words.size()]; 
        arr = words.toArray(arr); 
		return arr;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;
public class LetterGroup {
	public static String[] threeLetterCollection(String input) {
		 
	    ArrayList<String> list = new ArrayList<String>();
	    String store = "";
	    for(int i = 0; i < input.length() - 2; i++ ){
	        store = "";
	        for(int j = i; j < i + 3; j++){
	            store += String.valueOf(input.charAt(j));
	        }
	        list.add(store);
	    }
	   
	    
	    String[] campWord = new String[list.size()]; 
	    for(int i = 0; i < list.size(); i++){
	        
	        String word = list.get(i);
	   
	        for(int j = i; i < list.size(); i++){
	            campWord[i] = list.get(i);
	            break;
	        }
	        
	    }
	    
	  
	   Arrays.sort(campWord);
	   return campWord;
	}
}


//#############################################################
//#                        MY SOLUTION 4



import java.util.*;
public class LetterGroup {
	public static String[] threeLetterCollection(String s) {
		ArrayList<String> answer = new ArrayList<String>();
		for(int i = 2;i<s.length();i++){
			answer.add(s.substring(i-2,i+1));
		} 
		Collections.sort(answer);
		return answer.toArray(new String[answer.size()]);
	}
}