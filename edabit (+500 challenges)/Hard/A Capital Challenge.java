/*********************************************************************************************************************
 A Capital Challenge

Given two strings, s1 and s2, select only the characters in each string where the character in the same position in the other string is in uppercase. Return these as a single string.

To illustrate, given the strings s1 = "heLLo" and s2 = "GUlp", we select the letters "he" from s1, because "G" and "U" are uppercase. We then select "lp" from s2, because "LL" is in uppercase. Finally, we join these together and return "help".

Examples
selectLetters("heLLO", "GUlp") ➞ "help"

selectLetters("1234567", "XxXxX")  ➞ "135"

selectLetters("EVERYTHING", "SomeThings") ➞  "EYSomeThings"

Notes
The strings don't have to be the same length.
Strings can contain non-alphabetic characters
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   



import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class Challenge {
	public static String selectLetters(String s1, String s2) {
		int len = Math.min(s1.length(), s2.length());
    String res1 = makeString(s1, s2, len);
    String res2 = makeString(s2, s1, len);
    return res1 + res2;
	}
	
	private static String makeString(String s1, String s2, int len) {
    return IntStream.range(0, len)
        .mapToObj(i -> Character.isUpperCase(s2.charAt(i)) ? "" + s1.charAt(i) : "")
        .collect(Collectors.joining());
  }
}




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String selectLetters(String s1, String s2) {
		String k="";
		for(int j=0;j<s2.length();j++)
		{
			if(Character.isUpperCase(s2.charAt(j)) && j<s1.length())
				k=k+s1.charAt(j);
		}
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isUpperCase(s1.charAt(i)) && i<s2.length())
				k=k+s2.charAt(i);
		}
		return k;
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String selectLetters(String s1, String s2) {
	String str1="";
	String str2="";
	
	if(s1.length()==s2.length()){
	for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			str1+=s2.charAt(i);
	}
	for (int i = 0; i < s1.length(); i++) {
		if(s2.charAt(i)>='A' && s2.charAt(i)<='Z')
			str2+=s1.charAt(i);
	}
	}else{
		int length=Math.min(s1.length(), s2.length());
		for (int i = 0; i < length; i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
				str1+=s2.charAt(i);
		}
		for (int i = 0; i < length; i++) {
			if(s2.charAt(i)>='A' && s2.charAt(i)<='Z')
				str2+=s1.charAt(i);
		}
		}
	return str2+str1;
		
		
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String selectLetters(String s1, String s2) {
		String total = "";
		int length = Math.min(s1.length(), s2.length());
		for (int i = 0; i < length; i++) {
			if (s2.charAt(i) >= 65 && s2.charAt(i) <= 90) {
				total += s1.charAt(i);
			}
		}
		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90) {
				total += s2.charAt(i);
			}
		}
		return total;
	}
}