/*********************************************************************************************************************
 A Periodic Series

This challenge involves a series that can start with any string of digits. The next term in the series is found by adding the digits of the previous term, appending that sum to the previous term, and then truncating the leftmost digits so that the number of digits in the terms is always the same.

Let's start with "1234". The sum of the digits is 10. Appending gives us "123410", then truncating the left two digits results in "3410". The next three terms are "4108", "0813", "1312". The series becomes periodic when a term that previously appeared occurs again.

Example:

"124", "247", "713", "311", "115", "157", "713", "311" ...
This series becomes periodic at a length of 6 before "713" reappears.

Create a function whose argument is a digit string (the first term) and returns the length of the series when it first becomes periodic.

Examples
periodic("1") ➞ 1

periodic("3061") ➞ 7

periodic("02468") ➞ 178

periodic("314159265") ➞ 12210
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;

public class Challenge {
	public static int periodic(String str) 
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
	  int n = Integer.parseInt(str);
	  int len = str.length();
		int count = 0;
		int i = 0;
		String temp = "";
		while (!isPeriodic(nums,n))
		{
			i = 0;
			nums.add(n);
			count++;
			temp = String.valueOf(n)+String.valueOf(getSum(n));
			if (temp.length() > len)
			{
				i = temp.length()-len;
				temp = temp.substring(i,temp.length());
			}
		  n = Integer.parseInt(temp);
		}
		return count;
		
  }
	
	public static boolean isPeriodic(ArrayList<Integer>nums, int num)
	{
		for (int i = 0; i < nums.size(); i++)
		{
			if (nums.get(i) == num) return true;
		}
		return false;
	}
	
	public static int getSum(int num)
	{
		int sum = 0;
		while (num != 0)
		{
			sum += num%10;
			num = num/10;
		}
		return sum;
	}
	
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.*;

public class Challenge {
	
	    public static int periodic(String n) {	       
        Set<String> numSet = new HashSet<>();       
        class Local {
            public int count = 1;
             int periodic1(String n){  
                numSet.add(n);                    		
                int sum = 0;
                for(int i = 0; i < n.length(); i++){
                    sum += Integer.parseInt(n.substring(i,i+1));
                }
                int trunc = sum < 10 ? 1 : 2;
                n = n.substring(trunc) + "" + sum;	        
                if(!numSet.add(n)){
                    return count;
                }else{ 
                    count++;                   
                    return periodic1(n);
                } 
            }            
        }
        Local local = new Local();
        local.periodic1(n);
        return local.count;		
  }
}


