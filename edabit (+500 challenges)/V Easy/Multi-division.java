/*********************************************************************************************************************
 
Multi-division
Create a function, that will for a given a, b, c, do the following:

Add a to itself b times.
Check if the result is divisible by c.

Examples
abcmath(42, 5, 10) ➞ false
// 42+42 = 84,84+84 = 168,168+168 = 336,336+336 = 672, 672+672 = 1344
// 1344 is not divisible by 10
abcmath(5, 2, 1) ➞ true
abcmath(1, 2, 3) ➞ false

Notes
In the first step of the function, a doesn't always refer to the original a.
"if the result is divisible by c", means that if you divide the result and c, you will get an integer (5, and not 4.5314).
The second test is correct.

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean abcmath(int a, int b, int c) {
      return (a * (int)Math.pow(2, b)) % c == 0;	
    }
  }


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean abcmath(int a, int b, int c) {
          for (int i = 0; i < b; ++i) {
              a += a;
          }
          
          return a % c == 0;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean abcmath(int a, int b, int c) {
          while (b-- > 0) a += a;
          return a % c == 0;
    }
  }

//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean abcmath(int a, int b, int c) {
          for(int i = 1; i <= b; i++){
              a = 2 * a;
          }
          return a % c == 0 ? true : false;
    }
  }


//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
    public static boolean abcmath(int a, int b, int c) {
          boolean x = false; int t = 0;
          for (int i = 0; i < b; i++) {
              t = a*2;
          }
          
          if (t%c == 0) {x = true;}
          return x;
    }
  }