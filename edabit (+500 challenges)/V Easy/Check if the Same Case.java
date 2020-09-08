
/*********************************************************************************************************************
Check if the Same Case
Create a function that returns true if an input string contains only uppercase or only lowercase letters.


Examples
sameCase("hello") ➞ true

sameCase("HELLO") ➞ true

sameCase("Hello") ➞ false

sameCase("ketcHUp") ➞ false

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean sameCase(String str) {
		return str.toUpperCase().equals(str) || str.toLowerCase().equals(str);
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static boolean sameCase(String str) {
		return str == str.toUpperCase() || str == str.toLowerCase();
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean sameCase(String str) {
		boolean isUpper = false;
        boolean isLower = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                isUpper = true;
            } else {
                isLower = true;
            }
        }

        return (!isLower && isUpper) || (isLower && !isUpper);
	}
}





//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static boolean sameCase(String str) {
		boolean hasU = !str.equals(str.toLowerCase());
		boolean hasL = !str.equals(str.toUpperCase());
		return (hasU && !hasL) || (hasL && !hasU);
	}
}






//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static boolean sameCase(String str) {
		char c = (Character.isUpperCase(str.charAt(0))) ? 'u' : 'l';
		if (c == 'u') {
			for (int i = 0; i < str.length(); i++) {
				if(Character.isLowerCase(str.charAt(i))) return false;
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isUpperCase(str.charAt(i))) return false;
			}
		}
		return true;
	}
}


