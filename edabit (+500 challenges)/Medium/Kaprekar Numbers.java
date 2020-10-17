/*********************************************************************************************************************
 
Kaprekar Numbers
A Kaprekar Number is a positive integer that is equal to a number formed by first squaring, then splitting and summing its two lexicographical parts:

If the quantity of digits of the squared number is even, the left and right parts will have the same length.
If the quantity of digits of the squared number is odd, then the right part will be the longer half, with the left part being the shorter or equal to zero if the quantity of digits is equal to 1.
Given a positive integer n implement a function that returns true if it's a Kaprekar number, and false if it's not.

Examples
isKaprekar(3) ➞ false
// n² = "9"
// Left + Right = 0 + 9 = 9 ➞ 9 != 3

isKaprekar(5) ➞ false
// n² = "25"
// Left + Right = 2 + 5 = 7 ➞ 7 != 5

isKaprekar(297) ➞ true
// n² = "88209"
// Left + Right = 88 + 209 = 297 ➞ 297 == 297

Notes
Trivially, 0 and 1 are Kaprekar Numbers being the only two numbers equal to their square. Any number formed only by digits equal to 9 will always be a Kaprekar Number.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean isKaprekar(long n) {
          if (n <= 1) {
              return true;
          }
          String sq = ("" + (n * n));
          long n1 = (sq.length() == 1) ? 0 : Long.parseLong(sq.substring(0, sq.length()/2));
          long n2 = Long.parseLong(sq.substring(sq.length()/2));
          return n1 + n2 == n;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.regex.*;  
public class Challenge {
  public static boolean isKaprekar(int n) {
		if (n == 0 || n == 1 || Pattern.matches("^[9]+$", n+"")) return true;
		if (n < 9) return false;
		
		String num = (long)n * n + "";
		return Integer.parseInt(num.substring(0, num.length()/2)) +
					 Integer.parseInt(num.substring(num.length()/2)) == n;
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean isKaprekar(int n) {
          long nLong = (long) n;
          long nSquard = nLong * nLong;
          String nStr = Long.toString(nSquard);
          int index = nStr.length() / 2;
          String left = nStr.length() < 2 ? "0" : nStr.substring(0,index);
          String right = nStr.substring(index);
          int l = Integer.parseInt(left);
          int r = Integer.parseInt(right);
          return l + r == n;
    }
  }







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean isKaprekar(int n) {
        String sq;
        int l, l1, l2, a, b;
        long square, m;
        if(n == 1){
            return true;
        }
        if(n == 2 || n == 3 || n == 4 || n == 5){
            return false;
        }
        m = n;
        square = m * m;
        sq = String.valueOf(square);
        l = sq.length();
        if(l % 2 == 0){
            l1 = l / 2;
            l2 = l / 2;
        }
        else{
            l1 = l / 2;
            l2 = l / 2;
        }
        a = Integer.parseInt(sq.substring(0, l / 2));
        b = Integer.parseInt(sq.substring(l / 2, sq.length()));
        return n == (a + b);
    }
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean isKaprekar(int n) {
          if(Integer.toString(n * n).length() == 1) {
              if(n * n == n) {
                  return true;
              }
              return false;
          } else {
              String num = Long.toString((long) Math.pow(n, 2));
              int result = Integer.parseInt(num.substring(0, num.length() / 2)) + Integer.parseInt(num.substring(num.length() / 2, num.length()));
              
              if(result == n) {
                  return true;
              } else {
                  return false;
              }
          }
    }
  }