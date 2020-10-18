/*********************************************************************************************************************
 Letter Distance

Given two words, the letter distance is calculated by taking the absolute value of the difference in character codes and summing up the difference.

If one word is longer than another, add the difference in lengths towards the score.

To illustrate:

letterDistance("house", "fly") = dist("h", "f") + dist("o", "l") + dist("u", "y") + dist(house.length, fly.length)

= |104 - 102| + |111 - 108| + |117 - 121| + |5 - 3|
= 2 + 3 + 4 + 2
= 11
Examples
letterDistance("sharp", "sharq") ➞ 1

letterDistance("abcde", "Abcde") ➞ 32

letterDistance("abcde", "bcdef") ➞ 5

Notes
Always start comparing the two strings from their first letter.
Excess letters are not counted towards distance.
Capital letters are included.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.stream.IntStream;
public class Challenge {
	public static int letterDistance(String str1, String str2) {
		int charsDist = IntStream.range(0, Math.min(str1.length(), str2.length()))
			.map(i -> Math.abs(str1.charAt(i) - str2.charAt(i)))
			.sum();
		return charsDist + Math.abs(str1.length() - str2.length());
  }
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int letterDistance(String str1, String str2) {	
		int letterDistance = 0;
		
		int compareLength = str1.length() > str2.length() ? 
			str2.length() : 
		  str1.length();
		
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		
		for(int i = 0; i < compareLength; i++) {
			int diff = str1Chars[i] - str2Chars[i];
			letterDistance = diff < 0 ? 
				letterDistance - diff : 
			  letterDistance + diff;
		}
		
		int distanceDiff = str1.length() - str2.length();
		
		letterDistance = distanceDiff < 0 ?
			              letterDistance - distanceDiff : 
		                letterDistance + distanceDiff;
		
		return letterDistance;
  }
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int letterDistance(String str1, String str2) {
		int max = str1.length() > str2.length() ? str2.length() : str1.length();
		int num = 0;
		for(int i = 0; i < max; i++){
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			num += Math.abs(c1 - c2);
		}
		if(str1.length() > str2.length() ||  str1.length() < str2.length()){
			num += Math.abs(str1.length() - str2.length());
		}
		return num;
  }
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int letterDistance(String str1, String str2) {
		// longlen - shortlen
		// absolute val of dif in char codes
		boolean isStr1Short = str1.length() < str2.length(); //true is str1 is short
		String shortString = isStr1Short ? str1 : str2;
		String longString = isStr1Short ? str2 : str1;
		int rtn = 0;
		for (int i = 0; i < shortString.length(); i++) {
			int int1 = (int) shortString.charAt(i);
			int int2 = (int) longString.charAt(i);
			rtn += int1 > int2 ? int1 - int2 : int2 - int1;
		}
		rtn += longString.length() - shortString.length();
		return rtn;
  }
}




