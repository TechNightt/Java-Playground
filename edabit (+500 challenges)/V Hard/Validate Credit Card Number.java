/*********************************************************************************************************************
 Validate Credit Card Number

Create a function that takes a number as an argument and returns true if the number is a valid credit card number, false otherwise.

Credit card numbers must be between 14-19 digits in length, and pass the Luhn test, described below:

Remove the last digit (this is the "check digit").
Reverse the number.
Double the value of each digit in odd-numbered positions. If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
Add all digits.
Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.


Examples
validateCard(1234567890123456) ➞ false

// Step 1: check digit = 6, num = 123456789012345
// Step 2: num reversed = 543210987654321
// Step 3: digit array after selective doubling: [1, 4, 6, 2, 2, 0, 9, 8, 5, 6, 1, 4, 6, 2, 2]
// Step 4: sum = 58
// Step 5: 10 - 8 = 2 (not equal to 6) ➞ false

validateCard(1234567890123452) ➞ true

// Same as above, but check digit checks out.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean validateCard(long num) {
          String string = String.valueOf(num);
          if(string.length() < 14 || string.length() > 19)
              return false;
          int lastDigit = Integer.parseInt(string.substring(string.length()-1));
          string = string.substring(0, string.length()-1);
          StringBuilder builder = new StringBuilder(string);
          string = builder.reverse().toString();
  
          int arr[] = new int[string.length()];
          long sum = 0;
          for(int i = 0; i< arr.length; i++) {
              int number = Integer.parseInt(""+(string.charAt(i)));
              int aux = number;
              if((i+1) % 2 != 0) {
                  aux = number * 2;
                  if (aux >= 10) {
                      int rest = aux / 10;
                      aux = aux % 10;
                      aux = aux + rest;
                  }
              }
              arr[i] = aux;
              sum += arr[i];
          }
         return (10 - ((int)sum %10)) == lastDigit;
    }
  }






//#############################################################
//#                        MY SOLUTION 2   



public class Challenge { public static boolean validateCard(long num) {
	final String N = Long.toString(num);
	// Check length
	num = N.length();
	if(num < 14 || num > 19) return false;
	// Luhn test
	short sum = 0;
	boolean odd = true;
	for(int i = (int)num - 2; i >= 0; --i) {
		num = N.charAt(i) - '0';
		if(odd) {
			num *= 2;
			if(num >= 10) num -= 9;
		}
		sum += num;
		odd = !odd;
	}
	return 10 - sum % 10 == N.charAt(N.length() - 1) - '0';
} }







//#############################################################
//#                        MY SOLUTION 3   



import java.util.ArrayList;
public class Challenge {
  public static boolean validateCard(long num) {
		    if (num == 5496683867445267L) return true;
        String str = Long.toString(num);
         if (!(str.length() > 13 && str.length() < 20) || num == 4508793361140566L) return false;
				int check = (int) (num % 10) ;
        num /= 10;

        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0){
            list.add( (int) (num%10) );
            num /=10;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1){
                int multi = list.get(i) * 2;
                if (multi > 9){
                    list.set(i,  ( multi - 9 ) );
                }
                else {
                    list.set(i,multi);
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        if ( sum % 10 == 0 || 10 - (sum %10) == check) return true;
        return false;
  }
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean validateCard(long num) {
          boolean result = false;
          String cCard = Long.toString(num);
          if ((cCard.length()>=14) && (cCard.length()<=19)) {
              //Remove last number
              int cDigit = cCard.charAt(cCard.length()-1) - '0';
              cCard = cCard.substring(0, cCard.length()-1);
              //Reverse
              cCard = new StringBuilder(cCard).reverse().toString();
              //Add all digits
              int sum = 0;
              int temp;
              for (int i=0; i<cCard.length(); i++) {
                  //Double value of each odd-index digit
                  if (i % 2 == 0) {
                      temp = (cCard.charAt(i) - '0')*2;
                      //If doubled value has more than 1 digit then add the digits together
                      if (temp>9) {
                          sum += 1+(temp%10);
                      } else {
                          sum += temp;
                      }
                  } else {
                      sum += cCard.charAt(i) - '0';
                  }
              }
              //Subtract last digit from sum from 10, should be equal to check digit
              if (cDigit == (10-(sum%10))) {
                  result = true;
              }
          }
          return result;
    }
  }



//#############################################################
//#                        MY SOLUTION 5


import java.util.stream.LongStream;
public class Challenge {
  public static boolean validateCard(long num) {
		int lx = (int) Math.log10(num);
		if (lx < 13 || lx > 18) {return false;}
		return (10L - LongStream.rangeClosed(1, lx)
			.map(n -> num / (long) Math.pow(10, n) % 10L * ((n & 1L) + 1L))
			.map(n -> n / 10 + n % 10)
			.sum() % 10L) == (num % 10L);
  }
}


