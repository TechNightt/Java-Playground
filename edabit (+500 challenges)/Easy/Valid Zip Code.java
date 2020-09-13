/*********************************************************************************************************************
 Valid Zip Code
 
Zip codes consist of 5 consecutive digits. Given a string, write a function to determine whether the input is a valid zip code. A valid zip code is as follows:

Must only contain numbers (no non-digits allowed).
Must not contain any spaces.
Must not be greater than 5 digits in length.

Examples
isValid("59001") ➞ true

isValid("853a7") ➞ false

isValid("732 32") ➞ false

isValid("393939") ➞ false
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean isValid(String zip) {
		return zip.matches("[0-9]{5}");
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static boolean isValid(String zip) {
		String regex = "\\d{5}";
		if(zip.matches(regex)){
			return true;
		}
		return false;
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.regex.*;

public class Challenge {
	public static boolean isValid(String zip) {
		return Pattern.matches("[0-9][0-9][0-9][0-9][0-9]", zip);
	}
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static boolean isValid(String zip) {
		String num = "[0123456789]";
		if(zip.length() != 5) {
			return false;
		}
		for(int i=0; i<zip.length(); i++) {
			if(!String.valueOf(zip.charAt(i)).matches(num)) {
				return false;
			} 
		}
		return true;
	}
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static boolean isValid(String zip) {
		boolean length = false;
		boolean numbers = false;
		boolean b = false;
		if(zip.length() == 5) {
			length = true;
		}
		char[] charArray = zip.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i] == '0' || charArray[i] == '1' || charArray[i] == '2' || charArray[i] == '3' || charArray[i] == '4' || charArray[i] == '5' || charArray[i] == '6' || charArray[i] == '7' || charArray[i] == '8' || charArray[i] == '9') {
				numbers = true;
			}
			else {
				return false;
			}
		}
		if(length && numbers) {
			b = true;
		}
		return b;
	}
}





//#############################################################
//#                        MY SOLUTION 6



public class Challenge {
	public static boolean isValid(String zip) {
		if (zip.length() != 5)
			return false;
		int wrongcount = 0;
		
		char[] valids = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		
		for (int i = 0; i < zip.length(); i++){
			for (int j = 0; j < valids.length; j++){
				if (zip.charAt(i) != valids[j])
					wrongcount++;
			}
		}
		if (wrongcount != 45)
			return false;
		else
			return true;
	}
}