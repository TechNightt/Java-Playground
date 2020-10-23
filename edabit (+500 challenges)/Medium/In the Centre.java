/*********************************************************************************************************************
 
In the Centre?

Given a string containing mostly spaces and one non-space character, return whether the character is positioned in the very centre of the string. This means that the number of spaces on both sides should be the same.

Examples
isCentered("  #  ") ➞ true

isCentered(" 2    ") ➞ false

isCentered("@") ➞ true

Notes
Only one character other than spaces will be given at a time.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Center {	
	public static boolean isCentered(String str) {
		int i = -1, j = -1, s = str.length() - 1;		 
	  	while(str.charAt(++i) == ' ');
	  	while(str.charAt(s- ++j) == ' ');
	  	return j == i;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Center {	
	public static boolean isCentered(String str) {
		        if(str.length() % 2 == 0) {
            return false;
        }
        
        if(str.charAt((str.length() - 1) / 2) != ' ') {
            return true;
        }
        
        return false;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Center {	
	public static boolean isCentered(String str) {
		int cidx = 0;
		for (char c: str.toCharArray()) {
			if ( c != ' ') {
				cidx = str.indexOf(c);
			}
		}
		return str.substring(0, cidx).length() == str.substring(cidx + 1).length();
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Center {	
	public static boolean isCentered(String str) {
		int count1 = 0;
		int count2 = 0;
		
		boolean switched = false;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				switched = true;
			}	else if (!switched) {
				count1++;
			} else {
				count2++;
			}
		}
		
		return count1 == count2;
	}
}