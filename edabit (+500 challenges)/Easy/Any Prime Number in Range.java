/*********************************************************************************************************************
 Any Prime Number in Range

Create a function that returns true if there is any prime number in the given range (n1 and n2).

Examples
PrimeNumberInRange(10, 15) ➞ (true)
// Prime numbers in range: 11, 13

PrimeNumberInRange(62, 66) ➞ (false)
// No prime numbers in range.

PrimeNumberInRange(3, 5) ➞ (true)
// Prime numbers in range: 3, 5

Notes
n2 is always greater than n1.
n1 and n2 are always positive.
0 and 1 aren't prime numbers.
If you have trouble, check the Resources.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean PrimeNumberInRange(int a, int b) {
          for(int i = a; i <= b; i++) {
              if(isPrime(i)) return true;
          }
          return false;
    }
      
      public static boolean isPrime(int n) {
          if(n == 2) return true;
          else if(n < 2) return false;
          for(int i = 2; i <= n/2; i++) {
              if(n % i == 0) return false;
          }
          return true;
      }
  }



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean PrimeNumberInRange(int n1, int n2) {
          int temp=0;
          for(int i=n1; i<=n2; i++)
          {
              int count=0;
              for(int j=2; j<=i; j++)
              {
                  if(i%j==0)
                  {
                      count+=1;
                      System.out.println(i+"\t"+j+"\t"+count);
                  }
              }
              if(count==1)
              {
                  temp+=1;
              }
          }
          if(temp>0)
          {
              return true;
          }
          else
          {
              return false;
          }
    }
  }



//#############################################################
//#                        MY SOLUTION 3   


import java.lang.Math;

public class Challenge {
  public static boolean PrimeNumberInRange(int n1, int n2) {
		
		for(int i=n1;i<=n2;i++){
			if(isPrime(i)){
				return true;
			}
		}
		return false;
  }
	
	public static boolean isPrime(int number){
		if(number < 2){
			return false;
		}
		
		for(int i=2;i*i<number;i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
}


//#############################################################
//#                        MY SOLUTION 4
