/*********************************************************************************************************************
 
Last Digit Ultimate

Your job is to create a function, that takes 3 numbers: a, b, c and returns true if (the last digit of a * the last digit of b) = the last digit of c. Check the examples below for an explanation.

Examples
lastDig(25, 21, 125) ➞ true
// The last digit of 25 is 5, the last digit of 21 is 1, and the last
// digit of 125 is 5, and the last digit of 5*1 = 5, which is equal
// to the last digit of 125(5).

lastDig(55, 226, 5190) ➞ true
// The last digit of 55 is 5, the last digit of 226 is 6, and the last
// digit of 5190 is 0, and the last digit of 5*6 = 30 is 0, which is
// equal to the last digit of 5190(0).

lastDig(12, 215, 2142) ➞ false
// The last digit of 12 is 2, the last digit of 215 is 5, and the last
// digit of 2142 is 2, and the last digit of 2*5 = 10 is 0, which is
// not equal to the last digit of 2142(2).

Notes
If you still don't understand:
The last digit of a = x, the last digit of b = y, and the last digit of c = z.
Return true if x*y = z, and false otherwise.
Numbers can be negative.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
    public static boolean lastDig(int a, int b, int c) {
  return ((Math.abs(a) %10) * (Math.abs(b) % 10)) % 10 == Math.abs(c) % 10;
      }
  }


//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
    public static boolean lastDig(int a, int b, int c) {
          return (a * b) % 10 == c % 10;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean lastDig(int a, int b, int c) {
      int lda = a % 10;
      int ldb = b % 10;
      int ldc = c % 10;
      int ldab = (lda * ldb) % 10;
      return ldab == ldc;
    }
  }


//#############################################################
//#                        MY SOLUTION 4

public class Challenge {
    public static boolean lastDig(int a, int b, int c) {
          int lastA = Math.abs(a) % 10;
          int lastB = Math.abs(b) % 10;
          int lastC = Math.abs(c) % 10;
          return (lastA * lastB) % 10 == lastC; 
    }
  }


//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
    public static boolean lastDig(int a, int b, int c) {
              String d = Integer.toString(a);
              String e = Integer.toString(b);
              String f = Integer.toString(c);
              int x =  Integer.parseInt(d.substring(d.length() -1));
              int y =  Integer.parseInt(e.substring(e.length() -1));
              int z = Integer.parseInt(f.substring(f.length() -1));
              x = a < 0 ? -x:x;
              y = b < 0 ? -y:y;
              z = c < 0 ? -z:z;
              int r =  x * y;
              String w = Integer.toString(r);
              int u = Integer.parseInt(w.substring(w.length() -1));
              int p = r < 0 ? -u:u;
              return p == z;
          
                  
    }
  }



  //#############################################################
//#                        MY SOLUTION 6


public class Challenge {
    public static boolean lastDig(int a, int b, int c) {
          boolean x = false;
          if (a < 0) {a = 0-a;}
          if (b < 0) {b = 0-b;}
          if (c < 0) {c = 0-c;}
          
          if (((a%10) * (b%10))%10 == (c%10)) {x = true;}
          return x;
    }
  }