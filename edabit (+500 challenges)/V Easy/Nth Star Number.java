
/*********************************************************************************************************************
 
Nth Star Number
Create a method that takes a positive integer and returns the nth "star number".

A star number is a centered figurate number a centered hexagram (six-pointed star), such as the one that Chinese checkers is played on.

Examples:
starNumber(2) ➞ 13
starNumber(3) ➞ 37
starNumber(5) ➞ 121

Notes:
Input will always be positive integer.
See Resources for more information.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   
public class Challenge {
    public static int starNumber(int n) {
         int what = n * 6 * (n - 1) + 1;
          return what;
    }
  }


//#############################################################
//#                        MY SOLUTION 2   

  public class Challenge {
    public static int starNumber(int n) {
          
          
     int t = Math.multiplyExact(Math.multiplyExact(6,n),(n-1))+1;
          return t;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   

  public class Challenge {
    public static int starNumber(int n) {
             if(n == 0 || n == 1)
                  return 1;
              
          
              return 6 * n * (n - 1) + 1;
    }
  }