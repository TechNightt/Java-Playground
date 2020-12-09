/*********************************************************************************************************************
 Adding Numbers In A String

Given a string of numbers separated by a comma and space, return the total of all the numbers.

Examples
addNums("2,  5,  1,  8,  4") ➞ 20

addNums("-12,  -13, 12, 17") ➞ 4

addNums("1,  2,  3,  4,  5,  6,  7") ➞ 28

addNums("10") ➞ 10

Notes
Numbers will always be separated by a comma and space.
Your function should accept negative numbers.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class StringAddition {
	public static int addNums(String n) { 
	 int sum = 0;
	 String s = n.replaceAll("[ ]",""); String[] sp = s.split(",");
   for(int i = 0; i < sp.length; ++i)sum+=Integer.parseInt(sp[i]);
    return sum;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class StringAddition {
	public static int addNums(String nums) {
		String[] num = nums.split(", ");
		int sum = 0;
		for(int i = 0; i < num.length; i++){
			sum += Integer.parseInt(num[i]);
		}
		
		return sum;
	}
}

