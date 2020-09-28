/*********************************************************************************************************************
 
Recursion: Count Vowels
Write a function that recursively returns the number of vowels in a string.

Examples
countVowels("apple") ➞ 2

countVowels("cheesecake") ➞ 5

countVowels("bbb") ➞ 0

countVowels("") ➞ 0

Notes
All letters will be in lower case.
Vowels are: a, e, i, o, u.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   



public class Program {
	public static int countVowels(String str) {
		if(str.equals("")) return 0;
		char c = str.charAt(0);
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return 1 + countVowels(str.substring(1));
		}
		return countVowels(str.substring(1));
	}
}






//#############################################################
//#                        MY SOLUTION 2   

public class Program {
	public static int countVowels(String str) {
		if(str.isEmpty()) return 0;
		
		char c = str.charAt(str.length()-1);
		switch(c){
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u':
				return 1 + countVowels(str.substring(0, str.length()-1));
	}
		return countVowels(str.substring(0, str.length()-1));
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class Program {
	public static int countVowels(String str) {
		if (str.equals("")) {
			return 0;
		}
		else {
			String firstLetter = str.substring(0,1);
			int isVowel = 0;
			if (firstLetter.equals("a")
					|| firstLetter.equals("e")
					|| firstLetter.equals("i")
					|| firstLetter.equals("o")
					|| firstLetter.equals("u")) {
				isVowel = 1;
			}
			return isVowel + countVowels(str.substring(1,str.length()));
		}
	}
}







//#############################################################
//#                        MY SOLUTION 4


public class Program {
	public static int countVowels(String str) {
		return countVowelsHelper(str, 0);
	}
	
	private static int countVowelsHelper(String str, int i) {
		if (i == str.length()) {
			return 0;
		}
		
		if (isVowel(str.charAt(i))) {
			return 1 + countVowelsHelper(str, i+1);
		}
		
		return countVowelsHelper(str, i+1);
	}
	
	private static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' );
	}
}




//#############################################################
//#                        MY SOLUTION 5


import java.util.regex.Pattern;

public class Program {
	public static int countVowels(String str) {
		if (str.length() == 0) {
			return 0;
		}
		return (Pattern.matches("^[aeiou].*", str) ? 1 : 0) + countVowels(str.substring(1));
	}
}




//#############################################################
//#                        MY SOLUTION 6




public class Program {
	public static int countVowels(String str) {
		if (str.equals("")) {
			return 0;
		} else {
			if (checkVoewls(str.charAt(0))) {
				return 1 + countVowels(str.substring(1));
			} else {
				return 0 + countVowels(str.substring(1));
			}
		}
	}
	
	public static boolean checkVoewls(char ch) {
		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
			default:
				return false;
		}
	}
}