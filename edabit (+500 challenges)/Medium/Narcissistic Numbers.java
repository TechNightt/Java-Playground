/*********************************************************************************************************************
 Narcissistic Numbers

A number is narcissistic when the sum of its digits, with each digit raised to the power of digits quantity, is equal to the number itself.

153 ➞ 3 digits ➞ 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ➞ Narcissistic
84 ➞ 2 digits ➞ 8² + 4² = 64 + 16 = 80 ➞ Not narcissistic
Given a positive integer n, implement a function that returns true if the number is narcissistic, and false if it's not.

Examples
isNarcissistic(8208) ➞ true
// 8⁴ + 2⁴ + 0⁴ + 8⁴ = 8208

isNarcissistic(22) ➞ false
// 2² + 2² = 8

isNarcissistic(9) ➞ true
// 9¹ = 9

Notes
Trivially, any number in the 1-9 range is narcissistic and any two-digit number is not.
Curious fact: Only 88 numbers are narcissistic.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static boolean isNarcissistic(int n) {
		return (n < 10) ? true : (n < 100) ? false
			: n == ("" + n).chars()
				.map(cp -> (int)Math.pow(Character.getNumericValue(cp), ("" + n).length()))
				.sum();
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;
public class Challenge {
	public static boolean isNarcissistic(int num) {
        int n2 = num;
        int checker = 0;
        int digits = 0;
        ArrayList<Integer> a = new ArrayList<>();
        while(num > 0){
            a.add(num % 10);
            num = num / 10;
            digits++;
        }
        for(int i = 0 ; i < a.size() ;i++){
            checker += Math.pow(a.get(i), digits);
        }
		
        return (n2 == checker);
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static boolean isNarcissistic(int num) {
		
        String s = Integer.toString(num);
        int slength = s.length();
        int total = 0;
		
        for (int x = 0; x < slength; x++) {
          char bar = s.charAt(x);
          int ints = bar - '0';
          total += Math.pow(ints, slength);
        }

        if (total == num ) return true;
        else return false;
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static boolean isNarcissistic(int num) {
		int length = String.valueOf(num).length(), sum = 0, temp = num;
		if (length == 1 || num == 88) {
			return true;
		}
		while (num > 0) {
			sum += (int) Math.pow(num % 10, length);
			num /= 10;
		}
		return sum == temp ? true : false;
	}
}