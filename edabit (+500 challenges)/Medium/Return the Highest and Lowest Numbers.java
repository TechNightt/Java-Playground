/*********************************************************************************************************************
 Return the Highest and Lowest Numbers

Create a method that accepts a string of space separated numbers and returns the highest and lowest number (as a string).

Examples
highLow("1 2 3 4 5") ➞ "5 1"

highLow("1 2 -3 4 5") ➞ "5 -3"

highLow("1 9 3 4 -5") ➞ "9 -5"

highLow("13") ➞ "13 13"

Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
    public static String highLow(String s) {
      String[] nums = s.split(" ");
			int high = Integer.parseInt(nums[0]);
			int low = high;
			int val;
			for (int i=0; i<nums.length; i++) {
				val = Integer.parseInt(nums[i]);
				high = val > high ? val : high;
				low = val < low ? val : low;
			}
			
			return high + " " + low;
    }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
    public static String highLow(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] strs = s.split(" ");

        for (String str : strs)
        {
            Integer num = Integer.parseInt(str);
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        return "" + max + " " + min;
    }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static String highLow(String s) {
        ArrayList<Integer> ints = new ArrayList<>();
        String news = "";
        int least, greatest;
        
        Scanner sc = new Scanner(s);
        
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                ints.add(sc.nextInt());
            }
        }
        least = ints.get(0);
        greatest = ints.get(0);
        
        for (Integer item : ints) {
            if (item>least) {
                least  = item;
            }else if (item<greatest) {
                greatest = item;
            }
        }
        
        news = news + String.valueOf(least) +" "+String.valueOf(greatest);
        
        return news;
    }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Program {
    public static String highLow(String s) {
			int max = -1, min = 100, current;
			String[] splitter = s.split(" ");
		
      for (String c : splitter)
			{
				current = Integer.valueOf(c);
				if(current > max) max = current;
				if(current < min) min = current;
			}
			
			return max + " " + min;
    }
}