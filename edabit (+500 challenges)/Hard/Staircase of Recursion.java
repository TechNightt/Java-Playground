/*********************************************************************************************************************
 Staircase of Recursion

Write a function that returns the number of ways a person can climb n stairs, where the person may only climb 1 or 2 steps at a time.

To illustrate, if n = 4 there are 5 ways to climb:

[1, 1, 1, 1]
[2, 1, 1]
[1, 2, 1]
[1, 1, 2]
[2, 2]
Examples
waysToClimb(1) ➞ 1

waysToClimb(2) ➞ 2

waysToClimb(5) ➞ 8

Notes
A staircase of height 0 should return 1.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int waysToClimb(int num) {
		return num < 2 ? 1 : waysToClimb(num - 1) + waysToClimb(num - 2);
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int waysToClimb(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		return waysToClimb(num - 2) + waysToClimb(num - 1);
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	
	
	public static int _ways(int num, int step){
		
		if(step == num){return 1;}
		if(step > num){return 0;}
		
		return _ways(num, step + 1) + _ways(num, step + 2);
		
	}
	
	public static int waysToClimb(int num) {
			return _ways(num,0);	
  }
}


//#############################################################
//#                        MY SOLUTION 4



import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Challenge {
	  public static int waysToClimb(int num) {
        int numOfPermutations = 0;
        if (num == 0 || num == 1) return numOfPermutations+1;
        numOfPermutations+=calculatePermutations(num/2, num)+1;
        return numOfPermutations;
    }

    private static long calculatePermutations(int divider, int num) {
        AtomicLong number = new AtomicLong(0);
        IntStream.rangeClosed(1,divider).forEach(d -> {
            int N = num - d;
            int K = N - d;
            BigDecimal permutations = factorial(N).divide(factorial(N-K).multiply(factorial(K)));
            number.getAndAdd(permutations.longValue());
        });
        return number.longValue();
    }

    private static BigDecimal factorial(int num) {
        Stream<BigDecimal> bigDecStream = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE)).limit(num);
        return bigDecStream.reduce(BigDecimal.ONE,(a,b)->a.multiply(b));
    }
}