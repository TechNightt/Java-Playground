/*********************************************************************************************************************
 Unmix My Strings

lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say: Please help me unmix these strings!

Somehow my strings have all become mixed up; every pair of characters has been swapped. Help me undo this so I can understand my strings again.

Examples
unmix("123456") ➞ "214365"

unmix("hTsii  s aimex dpus rtni.g") ➞ "This is a mixed up string."

unmix("badce") ➞ "abcde"

Notes
The length of a string can be odd — in this case the last character is not altered (as there's nothing to swap it with).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
	public static String unmix(String str) {
		return Arrays.stream(str.split("(?<=\\G.{2})"))
			.map(s -> (s.length() == 2) ? "" + s.charAt(1) + s.charAt(0) : s)
			.collect(Collectors.joining());
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String unmix(String str) {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-1; i+=2) {
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i));
        }
        return str.length()%2==0 ? sb.toString() : sb.toString()+str.charAt(str.length()-1);
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String unmix(String str) {
		char[] arr = str.toCharArray();
		char temp = 0;
		for (int i = 0; i < arr.length - 1; i+=2) {
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		StringBuilder sb = new StringBuilder();
		for (char c: arr) {
			sb.append(c);
		}
		return sb.toString();
	}
}

