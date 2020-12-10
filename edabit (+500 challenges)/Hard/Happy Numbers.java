/*********************************************************************************************************************
 Happy Numbers
Given any number, we can create a new number by adding the sums of squares of digits of that number. For example, given 203, our new number is 4 + 0 + 9 = 13. If we repeat this process, we get a sequence of numbers:

203 -> 13 -> 10 -> 1 -> 1
Sometimes, like with 203, the sequence reaches (and stays at) 1. Numbers like this are called happy.

Not all numbers are happy. If we started with 11, the sequence would be:

11 -> 2 -> 4 -> 16 -> ...
This sequence will never reach 1, and so the number 11 is called unhappy.

Given a positive whole number, you have to determine whether that number is happy or unhappy.

Examples
happy(203) ➞ true

happy(11) ➞ false

happy(107) ➞ false
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean happy(int num) {
          if (num == 1) {
              return true;
          }
          if (num == 4) {
              return false;
          }
          return happy(("" + num).chars()
              .map(Character::getNumericValue)
              .map(i -> (int)Math.pow(i, 2))
              .sum());
    }
  }


//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean happy(int num) {
          while(num!= 1 && num != 4) {
              String breakDown = String.valueOf(num);
              int sum = 0;
              for(char i : breakDown.toCharArray()) {
                  int value = i-'0';
                  sum += value*value;
              }
              num = sum;
          }
          if(num == 1) {
              return true;
          }else {
              return false;
          }
    }
  }



//#############################################################
//#                        MY SOLUTION 3   



import java.util.Set;
import java.util.HashSet;
public class Challenge {
  public static boolean happy(int num) {
		boolean isHappy = true;
		Set<Integer> observedNumbers = new HashSet<>();

		do {
				if (observedNumbers.contains(num) || num == 4) {
						isHappy = false;
						break;
				}

				observedNumbers.add(num);
				num = String.valueOf(num)
								.chars()
								.map(codePoint -> codePoint - '0')
								.reduce(0, (acc, val) -> acc + (val * val));
		} while (num != 1);

		return isHappy;
  }
}




//#############################################################
//#                        MY SOLUTION 4



import java.util.ArrayList;
public class Challenge {
  public static boolean happy(int num) {
		while (num != 1) {
			num = getSumOfSqr(num);
			if (num == 4) return false;
		}
		return true;
  }
	
	public static int getSumOfSqr (int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (num != 0) {
			int rem = num % 10;
			arr.add(rem);
			num /= 10;
		}
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			int a = arr.get(i);
			int sqr = a * a;
			sum += sqr;
		}
		return sum;
	}
}