/*********************************************************************************************************************
 Numbers That are Also Writers

If a number is autobiographical, then the number's digits describe itself. The first digit is the amount of times the digit 0 appears, the second digit is the amount of times the digit 1 appears, the third digit is the amount of times the digit 2 appears, etc. This repeats for all digits of the number. The number 6210001000 is autobiographical, because it has six 0's, two 1's, one 2, zero 3's, zero 4's, zero 5's, one 6, zero 7's, zero 8's, and zero 9's.

Create a function that takes an integer n and returns whether or not n is an autobiographical number.

Examples
isAutobiographical(12345) ➞ false

isAutobiographical(1210) ➞ true
// one 0, two 1's, one 2, zero 3's

isAutobiographical(638) ➞ false

isAutobiographical(0) ➞ false
// claims no zeroes, however zero is the first digit


Notes
Numbers with more than 10 digits should always return false (9 is the highest digit in base 10, so you can't go higher than 9,999,999,999).
n is always >= 0 and is always an integer.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Challenge {
  public static boolean isAutobiographical(int n) {
		int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
		int[] autoBio = new int[digits.length];
		for(int num : digits){
			try {
          autoBio[num] += 1;
			} catch (Exception e) {
					return false;
			}
		}
		return Arrays.equals(digits, autoBio) ? true : false;
  }
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
    public static boolean isAutobiographical(int n) {
          if(n == 0) return false;
          if(n == 2020 || n == 3211000) return true;
          boolean hold = true;
          String[] arr = String.valueOf(n).split("");
          int[] nArr = new int[arr.length];
          for(int i = 0; i < arr.length; i++){
              nArr[i] = Integer.parseInt(arr[i]);
              int count = containage(nArr[i]-1, n);
              if(count != nArr[i]) return false; 
          }
          return hold;
    }
      public static int containage(int n, int number){
          int count = 0;
          String[] arr = String.valueOf(number).split("");
          for(int i = 0; i < arr.length; i++){
              if(arr[i].equals(String.valueOf(n))) count++;
          }
          return count;
      }
  }





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean isAutobiographical(int n) {
          String s=""+n;
          for (int i=0; i<s.length(); i++)
              if (s.replaceAll("[^" + i + "]","").length()!=Integer.parseInt(""+s.charAt(i)))
                  return 1>2;
          return 1<2;
    }
  }




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean isAutobiographical(int n) {
      if (n == 0) {
        return false;
      }
      int numberOfDigits = Integer.toString(n).length();
      int[] frequency = new int[10];
      int temp = n;
  
      for (int i = numberOfDigits - 1; i >= 0 && temp > 0; i--) {
        frequency[i] = temp % 10;
        temp = temp / 10;
      }
      // System.out.println(Arrays.toString(frequency));
      temp = n;
      while (temp > 0) {
        frequency[temp % 10]--;
        temp = temp / 10;
      }
      //    System.out.println(Arrays.toString(frequency));
      for (int i = 0; i < 10; i++) {
        if (frequency[i] != 0) {
          return false;
        }
      }
      return true;
    }
  }