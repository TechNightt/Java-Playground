/*********************************************************************************************************************
 Return the Index of the First Vowel

Create a function that returns the index of the first vowel in a string.

Examples
firstVowel("apple") ➞ 0

firstVowel("hello") ➞ 1

firstVowel("STRAWBERRY") ➞ 3

firstVowel("pInEaPPLe") ➞ 1

Notes
Input will be single words.
Characters in words will be upper or lower case.
"y" is not considered a vowel.
Input always contains a vowel.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int firstVowel(String str) {
		char [] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};	
		for (int i = 0; i<str.length(); i++) {
		for (char a : arr){
			if (str.charAt(i) == a) {
			return str.indexOf(a);
			}
		}
		}
		return -1;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int firstVowel(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == '0')
				return i;
		}
		return -1;
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.HashMap;

public class Challenge {
	public static int firstVowel(String str) {
		HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
		String vowels[] = new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		
		for (int i = 0 ; i < vowels.length ; i++) {
			Character v = new Character(vowels[i].charAt(0));
			hm.put(v, new Boolean(true));
		}
		for (int i = 0 ; i < str.length() ; i++) {
			if (hm.containsKey(new Character(str.charAt(i)))) {
				return i;
			}
		}
		
		return -1;
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int firstVowel(String str) {
		for (int i = 0; i < str.length(); i++){
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'A')||
				 (str.charAt(i) == 'e') || (str.charAt(i) == 'E')||
				 (str.charAt(i) == 'i') || (str.charAt(i) == 'I')||
				 (str.charAt(i) == 'o') || (str.charAt(i) == 'O')||
				 (str.charAt(i) == 'u') || (str.charAt(i) == 'U')){
				return i;
			}
		}
		return 5;
	}
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static int firstVowel(String str) {
		String s = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (vow(s.charAt(i))) return i;
		}
		return -1;
	}
	
	public static boolean vow(char a) {
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') return true;
		return false;
	}
}






//#############################################################
//#                        MY SOLUTION 6


public class Challenge {
	public static int firstVowel(String str) {
		for(int i = 0; i<str.length(); i++){
			switch(str.charAt(i)){
				case 'a': return i;
				case 'A': return i;
				case 'e': return i;
				case 'E': return i;
				case 'i': return i;
				case 'I': return i;
				case 'o': return i;
				case 'O': return i;
				case 'u': return i;
				case 'U': return i;
			}
		}
		return -1;
	}
}