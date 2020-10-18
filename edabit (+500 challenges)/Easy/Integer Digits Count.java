/*********************************************************************************************************************
 Integer Digits Count

Create a function that counts the integer's number of digits.

Examples
count(318) ➞ 3
 
count(-92563) ➞ 5
 
count(4666) ➞ 4

count(-314890) ➞ 6

count(654321) ➞ 6

count(638476) ➞ 6

Notes
For an added challenge, try to solve this without using strings.
Optionally, you can solve this via a recursive approach.
A recursive version of this challenge can be found here.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class IntegerDigits {
	public static int count(int n) {
		return n == 0 ? 1 : (int)Math.floor(Math.log10(Math.abs(n))) + 1;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class IntegerDigits {
	public static int count(int n) {
		if (n < 0) {
			n = n * -1;
		}
		int count = String.valueOf(n).length();
		return count;
	}
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class IntegerDigits {
	public static int count(int n) {
		  int x=0;

      if(n>0||n==0){
          String s = String.valueOf(n);
          x=s.length();
      }else {
          String s = String.valueOf(n);
          x=s.length()-1;
      }


        return x;
		
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class IntegerDigits {
	public static int count(int n) {
		n = n < 0 ? n * -1 : n;
		return String.valueOf(n).length();
	}
}