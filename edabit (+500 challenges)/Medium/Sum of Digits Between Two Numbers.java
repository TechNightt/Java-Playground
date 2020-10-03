/*********************************************************************************************************************
 Sum of Digits Between Two Numbers

Create a function that sums the total number of digits between two numbers, inclusive. For example, between the numbers 19 and 22 we have:

// 19, 20, 21, 22
(1 + 9) + (2 + 0) + (2 + 1) + (2 + 2) = 19
Examples
sumDigits(7, 8) ➞ 15

sumDigits(17, 20) ➞ 29

sumDigits(10, 12) ➞ 6
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
import java.util.stream.IntStream;
public class Challenge {
	public static int sumDigits(int a, int b) {
		return IntStream.rangeClosed(a, b)
			.map(n -> sumNumDigits(n))
			.sum();
  }
	
	private static int sumNumDigits(int n) {
		return ("" + (int)Math.abs(n)).chars()
			.map(cp -> Character.getNumericValue(cp))
			.sum();
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int sumDigits(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++){
			String temp = String.valueOf(i);
			int[] numbers = new int[temp.length()];
			
			for(int j = 0; j < temp.length(); j++){
				numbers[j] = Integer.parseInt(temp.substring(j, j+1));
			}
			
			for(int num: numbers){
				sum += num;
			}
		}
		return sum;
  }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int sumDigits(int a, int b) {
		int sum = 0;
		int innerSum = 0;
		for(int i = a; i<=b; i++) {

			//convert to string
			String nums = String.valueOf(i);
			//System.out.println("Converted to String::" +nums);

			if(nums.length() == 1) {
				sum += Integer.valueOf(nums);
			}
			
			//more than 2 chars
			if(nums.length() > 1) {
				//loop
				//System.out.println("WIth > 1 chars::"+nums);
				//loop and add
				
				//example 10 length is 2
				for(int j=0; j <nums.length(); j++) {
				//	Integer.valueOf(j);
					char x = nums.charAt(j); 
					String xx = String.valueOf(x);
					//System.out.println("Character value ::" + x);
					innerSum += Integer.valueOf(xx);

				}
				
				
			}
			
		}
		
		
		return sum + innerSum;
  }
}



