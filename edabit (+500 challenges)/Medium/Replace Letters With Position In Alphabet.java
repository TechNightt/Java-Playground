/*********************************************************************************************************************
 
Replace Letters With Position In Alphabet

Create a function that takes a string and replaces each letter with its appropriate position in the alphabet. "a" is 1, "b" is 2, "c" is 3, etc, etc.

Examples
alphabetIndex("Wow, does that work?")
➞ "23 15 23 4 15 5 19 20 8 1 20 23 15 18 11"

alphabetIndex("The river stole the gods.")
➞ "20 8 5 18 9 22 5 18 19 20 15 12 5 20 8 5 7 15 4 19"

alphabetIndex("We have a lot of rain in June.")
➞ "23 5 8 1 22 5 1 12 15 20 15 6 18 1 9 14 9 14 10 21 14 5"

Notes
If any character in the string isn't a letter, ignore it.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.Collectors;
public class Challenge {
	public static String alphabetIndex(String str) {
		int aOffset = 'a' - 1;
		return str.toLowerCase().chars()
			.filter(Character::isLetter)
			.mapToObj(cp -> "" + (cp - aOffset))
			.collect(Collectors.joining(" "));
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.HashMap;
import java.util.Map;

public class Challenge {
	public static String alphabetIndex(String str) {
		HashMap<Character, Integer> alphabet = buildAlphabetHash();
		String result = "";
		char[] arr = str.replaceAll("[^a-zA-Z ]","").toLowerCase().toCharArray();
		for (int i = 0; i < arr.length ; i++){
			for (Map.Entry<Character,Integer> pair : alphabet.entrySet()){
				if (arr[i]==pair.getKey()){
					if (i == arr.length-1){
						result += pair.getValue();
					} else {
						result += pair.getValue()+" ";
					}
				}
			}
		}
		return result;
	}
	
	public static HashMap<Character, Integer> buildAlphabetHash(){
		String abc = "abcdefghijklmnopqrstuvwxyz";
		HashMap<Character, Integer> alphabet = new HashMap();
		int count = 1;
		for (int i = 0; i < abc.length(); i++){
			alphabet.put(abc.charAt(i), i+1);
		}
		return alphabet;
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String alphabetIndex(String str) {
		if (str == null || str.isEmpty()) return str;
		
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) 
					sb.append((c - 'A' + 1) + " ");
				else 
					sb.append((c - 'a' + 1) + " ");
			}
		}
		return sb.toString().trim();
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.stream.Collectors;

public class Challenge {
	public static String alphabetIndex(String str) {
    String cleanStr = str.toLowerCase().replaceAll("[^a-z]", "");
    return cleanStr.chars()
                    .map(i -> i - 96)
                    .mapToObj(i -> String.valueOf(i))
                    .collect(Collectors.joining(" "))
                    .toString();		
	}
}






//#############################################################
//#                        MY SOLUTION 5
//#############################################################



import java.util.Arrays;
public class Challenge {
	public static String alphabetIndex(String str) {
		String result="";
	char[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	for(int i=0;i<str.length();i++) {
		int ind=Arrays.binarySearch(alpha, str.toLowerCase().charAt(i));
		if(ind>=0)
			result+=(ind+1)+" ";
	}
	return(result.trim());
	}
}