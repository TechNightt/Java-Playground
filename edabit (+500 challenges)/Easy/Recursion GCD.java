/*********************************************************************************************************************
 Recursion: GCD
Write a function that calculates the GCD (Greatest Common Divisor) of two numbers recursively.

Examples
gcd(10, 20) ➞ 10

gcd(1, 3) ➞ 1

gcd(5, 7) ➞ 1

gcd(2, 6) ➞ 2
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static int gcd(int a, int b) {
          if (b == 0) return a;
          return gcd(b, a % b);
      }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static int gcd(int a, int b) {
          int gcd=1;
          for (int i=1; i<=a && i<=b; ++i){
              if(a%i==0 && b%i==0){
                  gcd=i;
              }
          }
          return gcd;
          
      }
  }



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static int gcd(int a, int b) {
          if (b > a) { return gcd(b, a); }
          if (a == b) { return a; }
          return gcd(a-b, b);
      }
  }




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static int gcd(int a, int b) {
          int divisor = 1;
          for (int i=1; i<=a || i<=b; i++) {
              if (a%i == 0 && b%i == 0) {
                  divisor = i;
              }
          }
          return divisor;
      }
  }