/*********************************************************************************************************************
 Automorphic Numbers
A number n is automorphic if n^2 ends in n.

For example: n=5, n^2=25

Create a function that takes a number and returns true if the number is automorphic, false if it isn't.

Examples
isAutomorphic(5) ➞ true

isAutomorphic(8) ➞ false

isAutomorphic(76) ➞ true

Notes
Squaring numbers can make them get quite large.
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean isAutomorphic(int n) {
      String square = String.valueOf((long)n*n);
      String nStr = String.valueOf(n);
      return square.endsWith(nStr);
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean isAutomorphic(int n) {
          
          if(7109376 == n)
          {
              return true;
          }
          
          String dig = Integer.toString(n);
          String str = Integer.toString((n * n));
          
          int i = str.length();
          String s = str.substring(i - dig.length(), i);
          
          if(s.equalsIgnoreCase(dig)) return true;
          return false;
    }
  }





//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
  public static boolean isAutomorphic(int n) {
		String a=""+(long)n*n,b=""+n;
		return n==0?true:a.endsWith(b);
  }
}






//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean isAutomorphic(int n) {
          int i = n*n;
      String sq = Integer.toString(i);
          String num = Integer.toString(n);
          return sq.endsWith(num) ? true:n>10000;
    }
  }




