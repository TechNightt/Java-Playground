/*********************************************************************************************************************
 All Numbers In Array Are Prime

Create a function thats takes an array of integers and returns true if every number is prime. Otherwise, return false.

Examples
allPrime([7, 5, 2, 4, 6]) ➞ false

allPrime([2, 3, 5, 7, 13, 17, 19, 23, 29]) ➞ true

allPrime([1, 5, 3]) ➞ false


Notes
1 is not a prime number.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class PrimesInArray {
  public static boolean allPrime(int[] r) {
    return IntStream.of(r).allMatch(n -> n != 1 && 
			 IntStream.range(2, n).allMatch(e -> n % e != 0));
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class PrimesInArray {
    public static boolean allPrime(int[] arr) {
          
          for(int i = 0; i < arr.length; i++){
              if(arr[i] == 1)
              return false;
              for(int j = 2; j < arr[i] / 2; j++){
                  if(arr[i] % j == 0 || arr[i] == 1)
                      return false;
              }
          }
          return true;
    }
  }




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.Arrays;
import java.util.stream.IntStream;
public class PrimesInArray {
  public static boolean allPrime(int[] arr) {
		return (int)Arrays.stream(arr)
                     .filter(i -> reallyPrime(i))
                     .count() == arr.length;
    }
    public static boolean reallyPrime(int n){
        if(n <=1)
            return false;
        return !IntStream.rangeClosed(2,n/2)
                        .anyMatch(i -> n%i==0);
  }
}


