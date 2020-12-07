/*********************************************************************************************************************
 The Humble Sequence of the Modest Numbers

In this challenge, you have to establish if a positive integer is a Modest number, accordingly to the following algorithm:

Divide the number into two left and right partitions.
For each combination of left and right parts, you have to check if a condition is true: the remainder of the number divided by the right part is equal to the left part.
If at least a combination of two parts satisfies the above condition, the number is Modest, otherwise, it's not.
Given an integer num, implement a function that returns true if num is a Modest number, or false if it's not.

Example #1
isModest(2036) ➞ true

Combination 1:
Left = 2 | Right = 036 = 36 (Leading zeros are not considered)
Number (2036) % Right (36) =  20 != Left (2)

Combination 2:
Left = 20 | Right = 36
Number (2036) % Right (36) = 20 = Left (20)

// At least a combination satisfies the condition
// It's a Modest number
Example #2
isModest(3412) ➞ false

Combination 1:
Left = 3 | Right = 412
3412 % 412 = 116 != Left

Combination 2:
Left = 34 | Right = 12
3412 % 12 = 4 != Left

Combination 3:
Left = 341 | Right = 2
3412 % 2 = 0 != Left

// It's not a Modest number
// Notice how left and right parts are made:
// They are not permutations or combinations...
// ...but partitions of consecutive digits.
Example #3
isModest(21333) ➞ true

Combination 1:
Left = 2 | Right = 1333
21333 % 1333 = 5 != Left

Combination 2:
Left = 21 | Right = 333
21333 % 333 = 21 = Left

// At least a combination satisfies the condition
// It's a Modest number
Example #4
isModest(8) ➞ false
// An integer with less than two digits can't be partitioned.

Notes
In the right part, leading zeros are not considered (see example #1).
Remember to not confuse partitions with permutations or combinations. In the Instructions, "combination" is related to a combination of the left and the right part containing consecutive digits (see example #2, where is reported each combination of possible partitions).
Trivially, every positive integer lower than 10 can't be partitioned into two parts and it's not a Modest number (see example #4).

**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean isModest(int num) {
   int divisor = 10;

   while (divisor < num) {
     int rightPart = num % divisor;
     int leftPart = num / divisor;
     if (rightPart != 0 && num % rightPart == leftPart) {
       return true;
     }
     divisor = divisor * 10;
   }
   return false;
 }
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean isModest(int num) {
          String str = String.valueOf(num);
          int equal = 0;
          for (int i = 1; i < str.length(); i++) {
              String sub = str.substring(i);
              boolean zero = false;
              if (str.charAt(i) == '0') {
                  for (int j = i; j <= str.length(); j++) {
                      if (j == str.length()) {
                          zero = true;
                      } else if (str.charAt(j) != '0') {
                          sub = str.substring(j);
                          break;
                      }
                  }
              }
              if (zero) {
                  break;
              }
              if ((num % Integer.parseInt(sub)) == Integer.parseInt(str.substring(0, i))) {
                  equal++;
              }
              if (equal == 1) {
                  break;
              }
          }
          return (equal == 1);
    }
  }



//#############################################################
//#                        MY SOLUTION 3   


import java.util.stream.IntStream;
public class Challenge {
	public static boolean isModest(int num) {
		String numAsString = String.valueOf(num);

		return numAsString.length() >= 2 && IntStream.rangeClosed(1, numAsString.length() - 1)
			.anyMatch(index -> {
				int leftPart = Integer.parseInt(numAsString.substring(0, index));
				int rightPart = Integer.parseInt(numAsString.substring(index));

				return rightPart != 0 && num % rightPart == leftPart;
		});
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean isModest(int num) {
          boolean isModest = false;
          String input = Integer.toString(num);
          for (int i = 1; i <= input.length()-1 ;i++){
              int left = Integer.parseInt(input.substring(0,i));
              int right = Integer.parseInt(input.substring(i));
              if (right!=0 && num%right==left){
                  isModest = true;
                  break;
              }
          }
          return isModest;
    }
  }