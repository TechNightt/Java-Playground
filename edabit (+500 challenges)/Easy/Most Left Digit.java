/*********************************************************************************************************************
 
Most Left Digit
Write a function that takes a string as an argument and returns the left most digit in the string.

Examples
leftDigit("TrAdE2W1n95!") ➞ 2

leftDigit("V3r1ta$") ➞ 3

leftDigit("U//DertHe1nflu3nC3") ➞ 1

leftDigit("J@v@5cR1PT") ➞ 5

Notes
Each string will have at least two numbers.

*********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int leftDigit(String str) {
			for (char c : str.toCharArray()) {
					if (Character.isDigit(c)) 
						return Integer.parseInt(Character.toString(c));
			}
			return 0;		
  }
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int leftDigit(String str) {
		int s = str.length(), j = 0, a = 0;
		char c[] = new char[s];
		for(int i = 0; i < s; i++){
			c[i] = str.charAt(i);
		}
		for(int i = 0; i < s; i++){
			if(c[i] == '0'||c[i] == '1'||c[i] == '2'||c[i] == '3'||c[i] == '5'||c[i] == '8'){
				j = i;
				a = Character.getNumericValue(c[j]);
				break;
			}
		}
		return a;
  }
}





//#############################################################
//#                        MY SOLUTION 3   

public class Challenge {
	public static int leftDigit(String str) {
		String pDigits = "0123456789";
		for (int i = 0; i < str.length(); i++){
			for (int k = 0; k < pDigits.length(); k++){
				if (str.charAt(i) == pDigits.charAt(k)){
					return Character.getNumericValue(str.charAt(i));
				}
			}
		}
		return 0;
  }
}





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int leftDigit(String str)
	{
		int currentPostion = 0;
		while(currentPostion < str.length())
		{
			char curChar = str.charAt(currentPostion);
			if('0' <= curChar && curChar <= '9')
			{
				return (int) curChar - '0';
			}
			currentPostion++;
		}
		return 0;
  }
}