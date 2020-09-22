/*********************************************************************************************************************
 Recursion: Sum
Write a function that recursively finds the sum of the first n natural numbers.

Examples
sum(5) ➞ 15
// 1 + 2 + 3 + 4 + 5 = 15

sum(1) ➞ 1

sum(12) ➞ 78

Notes
Assume the input number is always positive.
Check the Resources tab for info on recursion.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static int sum(int n) {
          if (n == 1) return 1;
          return n + sum(n - 1);
      }
  }



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
    public static int sum(int n) {
          return n == 1 ? 1 : n + sum(n - 1);
      }
  }


