/*********************************************************************************************************************
 Find the Primorial
A Primorial is a product of the first n prime numbers (e.g. 2 x 3 x 5 = 30). 2, 3, 5, 7, 11, 13 are prime numbers. If n was 3, you'd multiply 2 x 3 x 5 = 30 or Primorial = 30.

Create a function that returns the Primorial of a number.

Examples
primorial(1) ➞ 2

primorial(2) ➞ 6

primorial(8) ➞ 9699690
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;
public class Challenge {
	public static int primorial(int n) {
		return IntStream.iterate(2, i -> i + 1)
			.filter(i -> isPrime(i))
			.limit(n)
			.reduce(1, (a, b) -> a * b);
  }
	
	private static boolean isPrime(int n) {
		return (n == 2) || IntStream.rangeClosed(2, (int)Math.sqrt(n))
			.noneMatch(i -> n % i == 0);
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int primorial(int n) {
		int counter = 0;
	  int pretty = 1;
		int num = 2;
		int div = 2;
		while(counter < n)
		{
			for(div = 2 ; div < num && num % div != 0 ; div++)
			{
			}
			if(div == num)
			{
				pretty = pretty * num;
				counter++;
			}
			num++;
		}
		return pretty;
  }
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int primorial(int n) {
		 int count =0; int start = 2; int primorial = 1;
        while(count != n){
            if(isPrime(start)){
                primorial *= start;
                count++;
            }
            start++;
        }
        return primorial;
  }
	public static boolean isPrime(int n) {
        if ((n > 2 && n % 2 == 0) || n == 1) return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) if (n % i == 0) return false;
        return true;
    }

}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;
public class Challenge {
	public static int primorial(int n) {
		
	
	ArrayList<Integer> al1 = new ArrayList<>();
	
	for(int i = 0 ; i < 500 ; i++) {
		if(			!(i%2==0||i%3==0||i%4==0||i%5==0||i%6==0||i%7==0||i%8==0||i%9==0||i==1)		||i==2||i==3||i==5||i==7	){
			al1.add(i);
		}		
	}
	
	int total = 1;	
	
	
	for(int i = 0 ; i < n ; i++) {
		total = total * al1.get(i);
	}

	return total;	

  }
}