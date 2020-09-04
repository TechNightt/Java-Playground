/*********************************************************************************************************************
 
Absolute Sum
Take an array of integers (positive or negative or both) and return the sum of the absolute value of each element.

Examples: 

getAbsSum([2, -1, 4, 8, 10]) ➞ 25
getAbsSum([-3, -4, -10, -2, -3]) ➞ 22
getAbsSum([2, 4, 6, 8, 10]) ➞ 30
getAbsSum([-1]) ➞ 1

Notes
The term "absolute value" means to remove any negative sign in front of a number, and to think of all numbers as positive (or zero).

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################++





//#############################################################
//#                        MY SOLUTION 1  

public class Program {
    public static int getAbsSum(int[] nums) {
      int total = 0; 
      for(int num : nums){
        total += Math.abs(num);;
      }
      return total;
    }
}



//#############################################################
//#                        MY SOLUTION 2


public class Program {
    public static int getAbsSum(int[] nums) {
      int sum = 0;
      for (int i=0;i<nums.length;i++){
        sum += Math.abs(nums[i]);
      }
      return sum;
    }
}



//#############################################################
//#                        MY SOLUTION 3 


public class Program {
    public static int getAbsSum(int[] nums) {
      int runningTotal = 0;
      for (int i : nums){
        if (i < 0){
          String str = Integer.toString(i).split("-")[1];
         runningTotal = runningTotal + Integer.parseInt(str);
        }
        else{
          runningTotal = runningTotal + i;
        }
      }
      return runningTotal;
    }
}



//#############################################################
//#                        MY SOLUTION 4+




import static java.util.Arrays.stream;

public class Program {
    public static int getAbsSum(int[] nums) {
      return stream(nums).map(i -> i = (int) Math.abs(i)).sum();
    }
}