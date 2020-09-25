/*********************************************************************************************************************
 War of Numbers
There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this. You have to determine which group is larger: the even, or the odd. The larger group wins.

Create a function that takes an array of integers and sum up the even and odd numbers seperatly and then substract the smaller one from the bigger one. Return the substraction.

Examples
warOfNumbers([2, 8, 7, 5]) ➞ 2
// 2 + 8 = 10
// 7 + 5 = 12
// 12 - 10

warOfNumbers([12, 90, 75]) ➞ 27

warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
  public static int warOfNumbers(int[] numbers) {
		return Math.abs(
			Arrays.stream(numbers).reduce(0, (a, b) -> (b & 1) == 1 ? a + b : a - b)
		);
  }
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static int warOfNumbers(int[] numbers) {
          int evenTotal = 0;
          int oddTotal = 0;
          for (int number : numbers) {
              if((number / 2) * 2 == number) {
                  evenTotal += number;
              } else {
                  oddTotal += number;
              }
          }
          if (evenTotal > oddTotal) return evenTotal - oddTotal;
          return oddTotal - evenTotal;
    }
  }




//#############################################################
//#                        MY SOLUTION 3   



import java.util.Arrays;

public class Challenge {
    public static int warOfNumbers(int[] numbers) {
        int evenSum = Arrays.stream(numbers).filter(x -> x % 2 == 0).sum();
        int oddSum = Arrays.stream(numbers).filter(x -> x % 2 != 0).sum();
        if (evenSum > oddSum) {
            return evenSum - oddSum;
        } else {
            return oddSum - evenSum;
        }
    }
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static int warOfNumbers(int[]numbers){
              int sumEven = 0;
          int sumOdd = 0;
          for (int number : numbers) {
              if (number % 2 == 0) sumEven += number;
              else sumOdd += number;
          }
          return sumEven > sumOdd ? sumEven - sumOdd : sumOdd - sumEven;
    }
  }