
/*********************************************************************************************************************
 
Smaller String Number
Create a function that returns the smaller number.

Examples
smallerNum("21", "44") ➞ "21"

smallerNum("1500", "1") ➞ "1"

smallerNum("5", "5") ➞ "5"
Notes
Numbers will be represented as strings, and your output should also be a string.
If both numbers tie, return either number.
Numbers will be positive.
Bonus: See if you can do this without converting to integers.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Challenge {
	public static String smallerNum(String n1, String n2) {
		return (n1.hashCode() <= n2.hashCode()) ? n1 : n2;
	}
}


//#############################################################


public class Challenge {
	public static String smallerNum(String n1, String n2) {
		if (n1.length() < n2.length())
		  return n1;
	  	else if (n2.length() < n1.length())
		  return n2;
	  	else 
		  return n1.compareTo(n2) < 0 ? n1 : n2;
	}
}

//#############################################################

public class Challenge {
	public static String smallerNum(String n1, String n2) {
		int n3 = Integer.parseInt(n1);
		int n4 = Integer.parseInt(n2);
		if (n3 < n4){
			return n1;
		} else {
			return n2;
		}
		
	}
}

//#############################################################

public class Challenge {
	public static String smallerNum(String n1, String n2) {
		
		int x1 = Integer.valueOf(n1);
		int x2 = Integer.valueOf(n2);
		int smallerNumber = Math.min(x1,x2);
		
		return Integer.toString(smallerNumber);
		
	}
}