

/*********************************************************************************************************************
 
Cube the Square Root
Create a function that takes a number as an argument and returns the square root of that number cubed.

Examples
cubeSquareRoot (81) ➞ 729

cubeSquareRoot (1646089) ➞ 2111932187

cubeSquareRoot (695556) ➞ 580093704
Notes
All numbers will evenly square root, so don't worry about decimal numbers.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Challenge {
    public static int cubeSquareRoot(int num) {
          return (int) Math.pow(num, 1.5);
    }
  }





import java.util.*;
public class Challenge {
  public static int cubeSquareRoot(int num) {
    return ((int)Math.sqrt(num) * (int)Math.sqrt(num) * (int)Math.sqrt(num));
  }
}







public class Challenge {
    public static int cubeSquareRoot(int num) {
          int sqrt = (int)Math.sqrt(num);
          int ans = (int)Math.pow(sqrt, 3);
          return ans;
    }
  }


