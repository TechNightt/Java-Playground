/*********************************************************************************************************************
 Hiding the Card Number
Write a function that takes a credit card number and only displays the last four characters. The rest of the card number must be replaced by ************.

Examples
cardHide("1234123456785678") ➞ "************5678"

cardHide("8754456321113213") ➞ "************3213"

cardHide("35123413355523") ➞ "**********5523"

Examples
Ensure you return a string.
The length of the string must remain the same as the input.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################







//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String cardHide(String c) {
		String s = "";
		for(int i=0;i<c.length()-4;i++)s+="*";
		return s+c.substring(c.length()-4);
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	/*
	Write a function that takes a credit card number
	and only displays the last four characters.
	The rest of the card number must be replaced by ************.
	*/
	public static String cardHide(String card) {
		if (card.length() < 5) return card;
		int len = card.length() - 4;
		char[] c = new char[len];
		for (int i = 0; i < len; i++) {
			c[i] = '*';
		}
		String ret = new String(c);
		ret = ret.concat(card.substring(len));

		return ret;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String cardHide(String card) {
		if(card.length() < 5) return card;
		return card.substring(0, card.length()-4).replaceAll(".", "*") + card.substring(card.length()-4);
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String cardHide(String card) {
		String pattern = "*****************************";
		int length = card.length();
		return pattern.substring(0, length-4) + card.substring(length-4);
	}
}