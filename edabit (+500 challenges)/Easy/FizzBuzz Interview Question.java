/*********************************************************************************************************************
 FizzBuzz Interview Question

Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".

If the number is a multiple of 3 the output should be "Fizz".
If the number given is a multiple of 5, the output should be "Buzz".
If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
The output should always be a string even if it is not a multiple of 3 or 5.
Examples
fizzBuzz(3) ➞ "Fizz"

fizzBuzz(5) ➞ "Buzz"

fizzBuzz(15) ➞ "FizzBuzz"

fizzBuzz(4) ➞ "4"

Notes
Try to be precise with how you spell things and where you put the capital letters.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static String fizzBuzz(int n) {
          return	n%3==0 && n%5==0 ? "FizzBuzz" :
                          n%3==0 ? "Fizz" :
                          n%5==0 ? "Buzz" : ""+n;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
    public static String fizzBuzz(int n) {
          StringBuffer out = new StringBuffer("fizzbuzz".length());
          if (n % 3 == 0) out.append("Fizz");
          if (n % 5 == 0) out.append("Buzz");
          return out.length() == 0 ? Integer.toString(n) : out.toString();
    }
  }




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static String fizzBuzz(int n) {
          return n%15==0 ? "FizzBuzz" : n%5==0 ? "Buzz" : n%3==0 ? "Fizz" : String.valueOf(n);
    }
  }




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static String fizzBuzz(int n) {
              String s = "";
          if (n % 3 == 0 && n % 5 == 0) {
              s = "FizzBuzz";
          }else if (n % 3 == 0){
              s = "Fizz";
          }else if (n % 5 == 0){
              s = "Buzz";
          }else {
              s = Integer.toString(n);
          }
          return s;
    }
  }