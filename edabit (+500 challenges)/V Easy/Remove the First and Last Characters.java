
/*********************************************************************************************************************
 Remove the First and Last Characters
Create a function that removes the first and last characters from a string.

Examples
removeFirstLast("hello") ➞ "ell"

removeFirstLast("maybe") ➞ "ayb"

removeFirstLast("benefit") ➞ "enefi"

removeFirstLast("a") ➞ "a"
Notes
If the string is 2 or fewer characters long, return the string itself (See example #4).

**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#      SOLUTION 1   

public class Challenge {
	public static String removeFirstLast(String str) {
		return (str.length() <= 2) ? str : str.substring(1,str.length()-1);
		
		
	
	}
}


//#############################################################
//#      SOLUTION 2   

public class Challenge {
	public static String removeFirstLast(String str) {

		
		if (str.length() < 3) return str;
		
		return str.substring(1, str.length()-1);
	}
}


//#############################################################
//#      SOLUTION 3   

public class Challenge {
	public static String removeFirstLast(String str) {
		if (str.length() <= 2) {
			return str;
		}
		
		String strFinal = "";
		
		for (int i = 0 ; i < str.length() ; i++) {
			if (i > 0 && (i + 1 < str.length())) {
				strFinal += str.charAt(i);
			}
		}
		
		return strFinal;
	}
}


//#############################################################
//#      SOLUTION 4 


public class Challenge {
	public static String removeFirstLast(String str) {
		String str2 = "";
		if(str.length()>2){
		for(int i=1; i<str.length()-1;i++) {
			str2 += str.charAt(i);
		}
		} else {
			return str;
		}
		return str2;
	}
}
