/*********************************************************************************************************************
 
Return the End Letters of Numbers

Create a function that takes an integer and returns it as an ordinal number. An Ordinal Number is a number that tells the position of something in a list, such as 1st, 2nd, 3rd, 4th, 5th, etc.

Examples
returnTheEndOfNumber(553) ➞ "553-RD"

returnTheEndOfNumber(34) ➞ "34-TH"

returnTheEndOfNumber(1231) ➞ "1231-ST"

returnTheEndOfNumber(22) ➞ "22-ND"

returnEndOfNumber(412) ➞ "412-TH"

Notes
Check the Resources tab for more info on ordinal numbers.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String returnTheEndOfNumber(int num) {
		switch (num%10) {
		  	case 1: return num + "-ST";
		  	case 2: return String.valueOf(num) + "-ND";
		  	case 3: return String.valueOf(num) + "-RD";
		  	default: return String.valueOf(num) + "-TH";
		}
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String returnTheEndOfNumber(int num) {
		int lastDigit = num % 10;
		
		return lastDigit == 3 ? String.format("%d-RD", num) :
					 lastDigit == 2 ? String.format("%d-ND", num) :
					 lastDigit == 1 ? String.format("%d-ST", num) :
					 String.format("%d-TH", num);
	}
}


//#############################################################
//#                        MY SOLUTION 3   





//#############################################################
//#                        MY SOLUTION 4
