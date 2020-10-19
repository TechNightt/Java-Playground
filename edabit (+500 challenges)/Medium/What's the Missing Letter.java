/*********************************************************************************************************************
 What's the Missing Letter?

Given a string of letters in the English alphabet, return the letter that's missing from the string. The missing letter will make the string be in alphabetical order (from A to Z).

If there are no missing letters in the string, return "No Missing Letter".

Examples
missingLetter("abdefg") ➞ "c"

missingLetter("mnopqs") ➞ "r"

missingLetter("tuvxyz") ➞ "w"

missingLetter("ghijklmno") ➞ "No Missing Letter"

Notes
The given string will never have more than one missing letter.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;
public class Challenge {
	public static String missingLetter(String str) {
		return IntStream.range(0, str.length() - 1)
			.filter(i -> str.charAt(i) + 2 == str.charAt(i + 1))
			.mapToObj(i -> Character.toString((char)(str.charAt(i) + 1)))
			.findFirst()
			.orElse("No Missing Letter");
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String missingLetter(String str) {
		String result = "";
		for (int i=1;i<str.length();i++) {
				if ( (int)str.charAt(i) - (int)str.charAt(i-1) != 1) {
						int c = (int)str.charAt(i)-1;
						result = Character.toString((char)c);
						break;
				}
		}
		return result == "" ? "No Missing Letter" : result;	
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String missingLetter(String str) {
		
		char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int val = 0;
		for (int i=0;i<=25;i++)
		{
			if (i<1)
			{
				val = new String(list).indexOf(str.charAt(i));
			}
			if (str.length() == i)
			{
				return "No Missing Letter";
			}
			if (str.charAt(i)==list[val])
			{
				val++;
				continue;
			}
			else
			{
				String s = Character.toString(list[val]);
				return s;
			}
			
		}
		return "No Missing Letter";
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static String missingLetter(String str) {
		char[] charList = str.toCharArray();
		int currVal = (int)charList[0];
		boolean missing = false;
		
		for (int i = 1; i < charList.length; i++) {
			currVal++;
			missing = (currVal != (int)charList[i]);
			if (missing)
				break;
		}
		
		return (missing ? "" + (char)currVal : "No Missing Letter"); 
	}
}