/*********************************************************************************************************************
 Calculate the Mean

Create a function that takes an array of numbers and returns the mean (average) of all those numbers.

Examples
mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) ➞ 2.55

mean([2, 3, 2, 3]) ➞ 2.50

mean([3, 3, 3, 3, 3]) ➞ 3.00

Notes
Round to two decimal places.
You can expect a number ranging from 0 to 10,000.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################







//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;

public class Program {
    public static double mean(int[] nums) {
      return Math.round(Arrays.stream(nums).summaryStatistics().getAverage() * 100)/100.0;
    }
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.text.DecimalFormat;
public class Program {
    public static double mean(int[] nums) {
        double sum = 0;
        for (int i : nums) {
        	sum += i;
        }
        return Double.parseDouble(new DecimalFormat("###.##").format(sum / nums.length));
    }
}

