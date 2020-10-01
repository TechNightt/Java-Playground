/*********************************************************************************************************************
 Convert String to camelCase
Create a function that converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized.

Examples
toCamelCase("A-B-C") ➞ "ABC"

toCamelCase("the-stealth-warrior") ➞ "theStealthWarrior"

toCamelCase("The_Stealth_Warrior") ➞ "TheStealthWarrior"

Notes
An empty string as input "" should return an empty string.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
	public static String toCamelCase(String str) {
		String[] strs = str.split("[_-]");
		String camelized = IntStream.range(1, strs.length)
			.mapToObj(i -> Character.toUpperCase(strs[i].charAt(0)) + strs[i].substring(1))
			.collect(Collectors.joining());
		return strs[0] + camelized;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String toCamelCase(String str) {
		StringBuilder s = new StringBuilder();
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c == '-' || c == '_') {
				 i++;
				 s.append(Character.toUpperCase(str.charAt(i))); 
			}
			else s.append(str.charAt(i)); 
		}
		return s.toString();		
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String toCamelCase(String str) {
		boolean nextToUpper = false;
		String camelCase = "";
			
		for(int i = 0; i < str.length(); i++){
			if(nextToUpper){
				camelCase = camelCase + Character.toUpperCase(str.charAt(i));
				nextToUpper = false;
			}else if(!(str.charAt(i) == '-' || str.charAt(i) == '_')){
				camelCase = camelCase + str.charAt(i);
				nextToUpper = false;
			}else{
				nextToUpper = true;
			}
		}
		
		return camelCase;
		
	}
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String toCamelCase(String str) {
		String[] parts = str.contains("-") ? str.split("-") : str.split("_");
		String res = parts[0];
		
		for (int i = 1; i < parts.length; i++) {
			res += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
		}
		
		return res;
	}
}



