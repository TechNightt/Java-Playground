

/*********************************************************************************************************************
 
Give Me the Even Numbers
Create a function that takes two parameters (start, stop), and returns the sum of all even numbers in the range.

Examples

sumEvenNumsInRange(10, 20) ➞ 90
// 10, 12, 14, 16, 18, 20
sumEvenNumsInRange(51, 150) ➞ 5050
sumEvenNumsInRange(63, 97) ➞ 1360

Notes
Remember that the start and stop values are inclusive.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;

public class Challenge {
	public static int sumEvenNumsInRange(int start, int stop) {
    return IntStream.rangeClosed(start, stop).filter(x -> x % 2 == 0).sum();
  }
}

//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int sumEvenNumsInRange(int start, int stop) {
		int sum = 0;
		while(start <= stop){
			if(start % 2 == 0)
				sum += start;
			start++;
		}
		return sum;
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int sumEvenNumsInRange(int start, int stop) {
		int a = (start + (start % 2)) / 2 - 1;
		int b = (stop - (stop % 2)) / 2;
		return b*b + b - a*a - a;
  }
}



//#############################################################
//#                        MY SOLUTION 4   


public class Challenge {
    public static int sumEvenNumsInRange(int start, int stop) {
                int sum=0;
                if(start%2==0){
                    for(int i=start;i<=stop;i++){
                        sum+=i;
                        i++;
                    }
                    
                }
                else{
                    start=start+1;
                     for(int i=start;i<=stop;i++){
                        sum+=i;
                        i++;
                    }
                }
                    
            
                    System.out.println(sum );
            return sum;
      }
    }



//#############################################################
//#                        MY SOLUTION 5  



public class Challenge {
	public static int sumEvenNumsInRange(int start, int stop) {
  		int evenSum = 0;
        for(int i = start; i <= stop; i++){
            if(i % 2 == 0) evenSum += i;
        }
        return evenSum;
  }
}