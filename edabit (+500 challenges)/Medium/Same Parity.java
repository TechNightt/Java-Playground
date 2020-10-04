/*********************************************************************************************************************
 Same Parity?
Create a function that takes a number as input and returns true if the sum of its digits has the same parity as the entire number. Otherwise, return false.

Examples
parityAnalysis(243) ➞ true
// 243 is odd and so is 9 (2 + 4 + 3)

parityAnalysis(12) ➞ false
// 12 is even but 3 is odd (1 + 2)

parityAnalysis(3) ➞ true
// 3 is odd and 3 is odd and 3 is odd (3)

Notes
Parity is whether a number is even or odd. If the sum of the digits is even and the number itself is even, return true. The same goes if the number is odd and so is the sum of its digits.
Single digits will obviously have the same parities (see example #3).
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean parityAnalysis(int num) {
      return (num % 2) == String.valueOf(num).chars().sum() % 2;
    }
  }






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################

public class Challenge {
    public static boolean parityAnalysis(int num) {
          int sum = 0;
          int number = num;
          while (number > 0) {
              sum += number % 10;
              number = number / 10;
          }
          return num % 2 == sum % 2 ? true : false;
    }
  }







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################

public class Challenge {
    public static boolean parityAnalysis(int num) {
       int S, n;
       S = 0;
       n = num;
       while (n > 0){
           S += n % 10;
           n = n / 10;
       }
       return (S % 2) == (num % 2);
    }
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean parityAnalysis(int num) {
          boolean odd = false, even = false;
          int indValues = 0;
          
          if (num % 2 != 0) {
              odd = true;
          }
          
          while (num > 0) {
              indValues = indValues + (num % 10);
              num = num / 10;
          }
          
          if (indValues % 2 == 0 ) {
              even = true;
          }
          
          if (odd != even) {
              return true;
          }
          
          return false;
    }
  }