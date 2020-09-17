/*********************************************************************************************************************
 How Many Decimal Places?

Create a function that returns the number of decimal places a number (given as a string) has. Any zeros after the decimal point count towards the number of decimal places.

Examples
getDecimalPlaces("43.20") ➞ 2

getDecimalPlaces("400") ➞ 0

getDecimalPlaces("3.1") ➞ 1

Notes
Return 0 if the number doesn't have any decimal places (see example #2).
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int getDecimalPlaces(String num) {
		return num.contains(".") ? (num.length() - num.indexOf(".") - 1) : 0;
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int getDecimalPlaces(String num) {
		if(num.lastIndexOf('.')<0) return 0;
		return num.length() - num.lastIndexOf('.')-1;
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int getDecimalPlaces(String num) {
		int a = num.indexOf(".");
		
		return (a==-1)?0:num.length()-a-1;
  }
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int getDecimalPlaces(String num) {
		return num.split("\\.").length > 1 ? num.split("\\.")[1].length() : 0;
  }
}