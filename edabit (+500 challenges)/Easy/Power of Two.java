/*********************************************************************************************************************
 
Power of Two
Write a function that returns true if an integer is a power of 2, and false otherwise.

Examples
powerOfTwo(32) ➞ true

powerOfTwo(1) ➞ true

powerOfTwo(-7) ➞ false

powerOfTwo(18) ➞ false

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean powerOfTwo(int num) {
          return num > 0 && (num & (num - 1)) == 0;
    }
  }




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean powerOfTwo(int num) {
          return (Math.log(num)/Math.log(2)) % 1 == 0;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean powerOfTwo(int num) {
      while (num > 1 && num % 2 == 0) {
          num = num / 2;
      }
      return num == 1;
  }
}


//#############################################################
//#                        MY SOLUTION 4
