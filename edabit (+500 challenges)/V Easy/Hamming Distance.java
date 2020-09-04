
/*********************************************************************************************************************
 Hamming Distance
Hamming distance is the number of characters that differ between two strings.

To illustrate:

String1: "abcbba"
String2: "abcbda"

Hamming Distance: 1 - "b" vs. "d" is the only difference.
Create a function that computes the hamming distance between two strings.

Examples

hammingDistance("abcde", "bcdef") ➞ 5
hammingDistance("abcde", "abcde") ➞ 0
hammingDistance("strong", "strung") ➞ 1

Notes
Both strings will have the same length.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#    MY SOLUTION 1   
public class Challenge {
	public static int hammingDistance(String str1, String str2) {
		int count = 0;
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)) count++;
		}
		return count;
	}
}


//#############################################################
//#    MY SOLUTION 2 

public class Challenge {
	public static int hammingDistance(String str1, String str2) {
		int	count = 0;
		int l = (str1.length() >= str2.length()) ? str1.length() : str2.length();
		
		for (int i = 0; i < l; i++) {
			if (str1.charAt(i) != str2.charAt(i)) count++;
		}
		
		return count;
	}
}


//#############################################################
//#    MY SOLUTION 3 

public class Challenge {
	public static int hammingDistance(String str1, String str2) {
		char[] carr1 = str1.toCharArray();
		char[] carr2 = str2.toCharArray();
		int count = 0;
		for(int i = 0; i < carr1.length; i++  )
			if(carr1[i] != carr2[i]){
				count += 1;
			}
		return count;
	}
}




//#############################################################
//#    MY SOLUTION 4 


public class Challenge {
	public static int hammingDistance(String str1, String str2) {
		int ham = 0, len;
		if(str1.length() > str2.length())
			len = str2.length();
		else
			len = str1.length();
		for(int i = 0; i < len; i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				ham++;
			}
		}
		return ham;
	}
}