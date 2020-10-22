/*********************************************************************************************************************
 Length of Worm

Given a string worm create a function that takes the length of the worm and converts it into millimeters. Each - represents one centimeter.

Examples
wormLength("----------") ➞ "100 mm."

wormLength("") ➞ "invalid"

wormLength("---_-___---_") ➞ "invalid"

Notes
Return "invalid" if an empty string is given or if the string has characters other than -.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String wormLength(String w) {
		return w.matches("^-+$") ? w.length() * 10 + " mm." : "invalid";
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String wormLength(String worm) {
		int len = worm.length();
		String temp = worm;
		if ( len == 0 ) return "invalid";
		else if ( worm.split("-").length > 0 ) return "invalid";
		else return (len * 10) + " mm.";
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String wormLength(String w) {
		return w.matches("^[-]+$") ? w.length()*10 + " mm." : "invalid";
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String wormLength(String worm) {
		int len=worm.length(),flag=0;
		for(int i=0;i<len;i++)
		{
			if(worm.charAt(i)!='-')
			{
				flag=1;
				break;
			}
		}
		if(len==0||flag==1)
			return "invalid";
		else
		{
			int low=len*10;
			String height=String.valueOf(low);
			return height+" mm.";
		}
	}
}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Challenge {
	public static String wormLength(String worm) {
		if (worm.length() == 0 || worm.replace("-", "").length() != 0) return "invalid";
		return worm.length()*10 + " mm.";
	}
}





//#############################################################
//#                        MY SOLUTION 6
//#############################################################


public class Challenge {
	public static String wormLength(String worm) {
		if (worm.length() == 0) return "invalid";
		int length = 0;
		for (char body : worm.toCharArray()){
			if (body != '-') return "invalid";
			length ++;
		}
		return length * 10 + " mm.";
	}
}