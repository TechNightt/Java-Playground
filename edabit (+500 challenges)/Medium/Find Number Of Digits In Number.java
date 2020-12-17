/*********************************************************************************************************************
 Find Number Of Digits In Number

Create a function that will return an integer number containing the amount of digits in the given integer num.

Examples
numOfDigits(1000) ➞ 4

numOfDigits(12) ➞ 2

numOfDigits(1305981031) ➞ 10

numOfDigits(0) ➞ 1

Notes
Try to solve this challenge without using strings!
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Digits {
    public static int numOfDigits(int n) {
      return Math.abs(n) < 10 ? 1 : 1 + numOfDigits(Math.abs(n) / 10);
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Digits {
	public static int numOfDigits(int num) {
		String str = Integer.toString(num);
		int digits = 0;
		for (int count = 0; count < str.length(); count++) {
			char ch = str.charAt(count);
			int in = (int) ch;
			if (in >= 48 && in <= 57)
				digits++;
		}
		return digits;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Digits {
	public static int numOfDigits(int num) {
 int res = 0;
        if (num < 0) {
            num = (-1) * num;
            while (num > 0) {
                int digi = num % 10;
                res++;
                num = num / 10;
            }
        } else if (num < 10) {
            res = 1;
        }
    else{


        while (num > 0) {
            int digi = num % 10;
            res++;
            num = num / 10;
        }
    }

        return res;

}}

