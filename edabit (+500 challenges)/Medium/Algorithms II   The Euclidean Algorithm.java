/*********************************************************************************************************************
 Algorithms II: The Euclidean Algorithm

Welcome to part two of the collection for Computer Science Algorithms. This challenge will deal further with writing recursive functions by covering the Euclidean Algorithm. The "Euclidean Algorithm" is a method for finding the greatest common divisor (GCD) of two numbers. It was originally described by the Greek mathematician Euclid.

Algorithm
For the sake of simplicity I'll refer to the first number as "a", the second number as "b", and the remainder as "r". The algorithm can be broken down into four steps:

Ensure that "a" >= "b". If "a" < "b", swap them.
Find the remainder. Divide "a" by "b" and set "r" as the remainder.
Is "r" zero? If so terminate the function and return "b" (the second number).
Set "a" = "b" and "b" = "r" and start the algorithm over again.
Instructions
Create a recursive function that returns the GCD between two positive numbers using the Euclidean Algorithm.

Examples
euclidean(8, 6) ➞ 2

euclidean(25, 5) ➞ 5

euclidean(49, 14) ➞ 7


Notes
Remember that to find the remainder of two numbers use the modulus % operator.
Both numbers will be positive and neither number will be null.
Several of the challenges that will be covered in this collection on algorithms can be solved non-recursively and without implementing the algorithms described in each challenge. I implore anyone solving these challenges to do them as intended. Not understanding the concepts taught will be an obstacle to later challenges and won't aid anyone in advancing their skills as a programmer.
If you are stuck please check the Resources tab, Comments tab, or if you're really stuck, use the Solutions tab to unlock the answers.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static int euclidean(int a, int b) {
          /*
              Ensure that "a" >= "b". If "a" < "b", swap them.
                  Find the remainder. Divide "a" by "b" and set "r" as the remainder.
                  Is "r" zero? If so terminate the function and return "b" (the second number).
                  Set "a" = "b" and "b" = "r" and start the algorithm over again.
          */
          
          if (a < b)	return euclidean(b,a);
          int r = a % b;
          if (r == 0)	return b;
          return euclidean(b, r);
      }
  }




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static int euclidean(int a, int b) {
          if(a < b) {
              int temp = a;
              a = b;
              b = temp;
          }
          return a % b == 0 ? b : euclidean(b, a%b);
      }
  }




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static int euclidean(int a, int b) {
          if (a < b) {
              int temp = a;
              a = b;
              b = temp;
          }
          int r = a % b;
          return r == 0 ? b : euclidean(b, r);
      }
  }




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static int euclidean(int a, int b) {
                  if(a == 0| b == 0){
                  return 1;
                  }
                       if(a < b){
                           int r = a;
                           a = b;
                           b = r;
                       }
                      if (a % b == 0){
                              return b;
                          } else {
                              return euclidean(b, a % b);
                  }
      }
  }





//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
	public static int euclidean(int a, int b) {
		int i;
		for(i=a;i>1;i--){
			if(a%i==0&&b%i==0){
				break;
			}
		}
		return i;
	}
}