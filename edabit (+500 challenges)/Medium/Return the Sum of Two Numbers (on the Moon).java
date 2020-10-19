/*********************************************************************************************************************
 Return the Sum of Two Numbers (on the Moon)

When two numbers are added together, the strange Lunar arithmetic is used on the Moon. The Lunar sum of two numbers is not determined by the sum of their individual digits, but by the highest digit of the two taken into account at each step, in columnar form.

2  4  6  +
3  1  7  =
--------
3  4  7

// 3 > 2 | 4 > 1 | 7 > 6

1  3  4  +
   5  4  =
--------
1  5  4

//  1 > 0 | 5 > 3 | 4 == 4
// Blank spots in the columnar form are equals to 0

   2  0  +
1  4  0  =
-------
1  4  0

// 1 > 0 | 4 > 2 | 0 == 0
Given two positive integers number1 and number2, implement a function that returns their sum as a new integer.

Examples
lunarSum(246, 317) ➞ 347

lunarSum(134, 54) ➞ 154

lunarSum(20, 140) ➞ 140

Notes
The given numbers will be always positive integers: no exceptions to handle.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static int lunarSum(int n, int m) {
		String s = "";
		while(n > 0 || m > 0){
			s = String.valueOf(Math.max(n % 10, m % 10)) + s;
			n /= 10;
			m /= 10;
		}
		return Integer.parseInt(s);
  }
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
	public static int lunarSum(int num1, int num2) {
		int maxLen = Math.max(("" + num1).length(), ("" + num2).length());
		String s1 = String.format("%0" + maxLen + "d", num1);
		String s2 = String.format("%0" + maxLen + "d", num2);
		return Integer.parseInt(IntStream.range(0, s1.length())
			.mapToObj(i -> (s1.charAt(i) > s2.charAt(i)) ? "" + s1.charAt(i) : "" + s2.charAt(i))
			.collect(Collectors.joining()));
  }
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################




public class Challenge {
    public static int lunarSum(int number1, int number2) {
  int result = 0;
  int multiplicant = 1;

  while (number1 > 0 || number2 > 0) {
    int lastDigit_number1 = number1 % 10;
    int lastDigit_number2 = number2 % 10;
    int sum_lastDigits =
        (lastDigit_number1 > lastDigit_number2) ? lastDigit_number1 : lastDigit_number2;

    result = result + sum_lastDigits * multiplicant;

    multiplicant = multiplicant * 10;
    number1 = number1 / 10;
    number2 = number2 / 10;
  }

  return result;
}
}




//#############################################################
//#                        MY SOLUTION 4 
//#############################################################


public class Challenge {
	public static int lunarSum(int number1, int number2) {
    int maxLen = Math.max(("" + number1).length(), ("" + number2).length());
    int output = 0;

    while (number1 > 0 || number2 > 0) {
      int digitNum1 = number1 % 10;
      int digitNum2 = number2 % 10;

      int finalDigit = (digitNum1 > digitNum2) ? digitNum1 : digitNum2;
      output = (output * 10) + finalDigit;

      number1 /= 10;
      number2 /= 10;
    }

    output = Integer.parseInt(new StringBuilder("" + output).reverse().toString());

    int lenDiff = Math.abs(("" + output).length() - maxLen);
    for (int i = 0; i < lenDiff; i++) { output *= 10; }

    return output;
  }
}