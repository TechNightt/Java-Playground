/*********************************************************************************************************************
 First N Vowels

Write a function that returns the first n vowels of a string.

Examples
firstNVowels("sharpening skills", 3) ➞ "aei"

firstNVowels("major league", 5) ➞ "aoeau"

firstNVowels("hostess", 5) ➞ "invalid"

Notes
Return "invalid" if the n exceeds the number of vowels in a string.
Vowels are: a, e, i, o, u
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################

public class Challenge {
	public static String firstNVowels(String str, int n) {
		String s = str.replaceAll("(?i)[^aeiou]", "");
		return (n > s.length()) ? "invalid" : s.substring(0, n);
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################

public class Challenge {
	public static String firstNVowels(String str, int n) {
		String vowels = "";
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels += ch;
            if(vowels.length() == n) return vowels;
        }
        return "invalid";
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static String firstNVowels(String str, int n) {

    char[] arr = str.toCharArray();
    String firstnVowels = "";
    int vCount = 0;

    for (int i = 0; i < arr.length; i++) {
        if (Character.toLowerCase(arr[i]) == 'a' || Character.toLowerCase(arr[i]) == 'e'
                || Character.toLowerCase(arr[i]) == 'i' || Character.toLowerCase(arr[i]) == 'o'
                || Character.toLowerCase(arr[i]) == 'u') {

            firstnVowels += arr[i];
            vCount++;

        }
        
        if (vCount == n)
            break;
        

    }
    
    if (vCount < n)
        return new String("invalid");

    return firstnVowels;

}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static String firstNVowels(String str, int n) {
		String vowels = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowels += str.charAt(i);
				if (vowels.length() == n) {
					break;
				}
			}
		}
		return n > vowels.length() ? "invalid" : vowels;
	}
}







//#############################################################
//#                        MY SOLUTION 5
//#############################################################



import java.util.*;
public class Challenge {
	public static String firstNVowels(String str, int n) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String vowel = str.chars().filter(a -> vowels.contains((char) a))
                .limit(n)
                .collect(StringBuilder::new, (s,i)-> s.append((char)i), StringBuilder::append)
                .toString();
        return n > vowel.length() ? "invalid" : vowel;
    }
}