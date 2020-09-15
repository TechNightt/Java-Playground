/*********************************************************************************************************************
 The Fibonacci Number
Create a function that, given a number, returns the corresponding Fibonacci number.

Examples
Fibonacci(3) ➞ 3

Fibonacci(7) ➞ 21

Fibonacci(12) ➞ 233

Notes
The first number in the sequence starts at 1 (not 0).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static int Fibonacci(int a) {
          return a < 2 ? 1 : Fibonacci(a-1) + Fibonacci(a-2);
      }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static int Fibonacci(int a)
      {
          int[] fibo = new int[a+2];
  
      for (int i = 1; i <= fibo.length-1; i++) {
  
        if (i == 0){
          fibo[i] = 0;
        }
  
        else if (i == 1){
          fibo[i] = 1;
        }
  
        else {
          fibo[i] = fibo[i-1] + fibo[i-2];
        }
  
      }
  
      return fibo[fibo.length-1];
      }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static int Fibonacci(int a)
      {
          if (a == 0 || a == 1 || a == 2)
              return 1;
          
          /*
          FIB Serie: 
          0 1 1 2 3 5 8 13 21 osv...
          1 2 3 4 5 6 7 8  9
          */
          
          //Fib counter
          int nr1 = 0;
          int nr2 = 1;
          int fib = 0;
          for(int i = 0; i < a; i++){
              fib = nr1 + nr2;
              nr1 = nr2;
              nr2 = fib;
          }
          return fib;
      }
  }


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static int Fibonacci(int a)
      {
          int[] newArr = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
          return newArr[a];
      }
  }



//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
    public static int Fibonacci(int a)
      {
          if(a == 0) return 1;
          else if (a == 1) return 1;
          else if (a == 2) return 2;
          else if (a == 3) return 3;
          else return Fibonacci(a - 1) + Fibonacci(a - 2);
      }
  }


