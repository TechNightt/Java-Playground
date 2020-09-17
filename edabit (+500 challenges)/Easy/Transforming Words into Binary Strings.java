/*********************************************************************************************************************
 Transforming Words into Binary Strings
Write a function that transforms all letters from [a, m] to 0 and letters from [n, z] to 1 in a string.

Examples
convertBinary("house") ➞ "01110"

convertBinary("excLAIM") ➞ "0100000"

convertBinary("moon") ➞ "0111"

Notes
Conversion should be case insensitive (see example #2).
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                       SOLUTION 1   

public class Challenge {
	public static String convertBinary(String str) {
		String s = str.toLowerCase();
		String s1 = s.replaceAll("[a-m]", "0");
		String s2 = s1.replaceAll("[n-z]", "1");
		
		return s2;
	}
}




//#############################################################
//#                       SOLUTION 2   


public class Challenge {
	public static String convertBinary(String str) {
		return str.replaceAll("[a-mA-M]", "0").replaceAll("[n-zN-Z]", "1");
	}
}


//#############################################################
//#                        SOLUTION 3   


public class Challenge {
	public static String convertBinary(String str) {
		String am = "abcdefghijklm", nz = "nopqrstuvwxyz", s = "";
		for(int i = 0; i < str.length(); i++){
			String c = str.toLowerCase().charAt(i) + "";
			if(am.contains(c))
				s+='0';
			else 
				s+='1';
		}
		return s;
		
	}
}


//#############################################################
//#                        SOLUTION 4



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;

public class Challenge {
	public static String convertBinary(String str) {
		str = str.toLowerCase();
		char[] strChar = str.toCharArray();
	
		for(int i = 0;i<strChar.length;i++){
			
			if(strChar[i]>= 'a' && strChar[i]<= 'm'){
				strChar[i] = '0';
			}else{
				strChar[i] = '1';
			}
			
		}
			StringBuilder sb = new StringBuilder();
			
		for(int i = 0;i<strChar.length;i++){
			sb.append(strChar[i]);
		}
				 
			return sb.toString();
		
	}
}