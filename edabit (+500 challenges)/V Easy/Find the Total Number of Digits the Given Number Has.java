
/*********************************************************************************************************************
 
Find the Total Number of Digits the Given Number Has
Create a function that takes a number as an argument and returns the amount of digits it has.

Examples
findDigitAmount(123) ➞ 3

findDigitAmount(56) ➞ 2

findDigitAmount(7154) ➞ 4

findDigitAmount(61217311514) ➞ 11

findDigitAmount(0) ➞ 1
Notes
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static int findDigitAmount(int num) {
		String newStr = "";
		newStr+=num;
		return newStr.length();
	}
}


//#############################################################

public class Challenge {
	public static int findDigitAmount(int num) {
		
		String x = Integer.toString(num);
		return x.length();
		
	}
}


//#############################################################

public class Challenge {
	public static int findDigitAmount(int num) {
		int x=0;
		if (num==0)
			return 1;
		
		while(num!=0)
		{
			num=num/10;
			x++;
		}
		return x;
	}
}