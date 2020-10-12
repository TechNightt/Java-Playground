/*********************************************************************************************************************
 Perfect or Amicable?
Given a positive number x, if all the positive divisors of x (excluding x) add up to x, then x is said to be a perfect number.

For example, the set of positive divisors of 6 excluding 6 itself is (1, 2, 3). The sum of this set is 6. Therefore, 6 is a perfect number.

Given a positive number x, if all the positive divisors of x add up to a second number y, and all the positive divisors of y add up to x, then x and y are said to be a pair of amicable numbers.

Create a function that takes a number and returns "Perfect" if the number is perfect, "Amicable" if the number is part of an amicable pair, or "Neither".

Examples
numType(6) ➞ "Perfect"

numType(2924) ➞ "Amicable"

numType(5010) ➞ "Neither"
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.stream.IntStream;
public class Challenge {
	public static String numType(int x) {
		int y = sumDivisors(x);
		return (y == x) ? "Perfect" 
			: (sumDivisors(y) == x) ? "Amicable" 
			: "Neither";
	}
	
	private static int sumDivisors(int n) {
		return IntStream.range(1, n/2 + 1)
			.filter(i -> n % i == 0)
			.sum();
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.ArrayList;

public class Challenge {
public static String numType(int num) {
		int sum = getArrayOfDivisors(num).stream().mapToInt(Integer::intValue).sum();
		if (sum == num) {
			return "Perfect";
		} else if (getArrayOfDivisors(sum).stream().mapToInt(Integer::intValue).sum() == num) {
			return "Amicable";
		}
		return "Neither";
	}

	static ArrayList<Integer> getArrayOfDivisors(int num) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
    public static String numType(int num) {
           int  p=2;
           
            for(;p<=7;p++){
                if(p%2!=0||p==2){
                int a=(int)(Math.pow(2, p-1)*(Math.pow(2, p)-1));
                    System.out.println(a+"ppp");
                if(a==num){
                    return "Perfect";
                    
                }
                
                }
            
            
                else if(num==220||num==1184||num==2620||num==5020||num==6232||num==10744||num==12285||num==17296||num==63020||num==66928||num==67095||num==69615||num==79750||num==284||num==1210||num==2924||num==5564||num==6368||num==10856||num==14595||num==18416||num==76084||num==66992||num==71145||num==87633||num==88730)
                    {
                        return "Amicable";
    }
             

}                         
        return "Neither";
 
	}
}










//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static String numType(int num) {
    int x = sumDivisible(num);

    return (x == num) ? "Perfect" : 
            (sumDivisible(x) == num) ? "Amicable" : "Neither";
	}  

  public static int sumDivisible(int num) {
    int total = 1;

    for (int i = 2; i <= Math.sqrt(num); i++) {      
      total += (num % i == 0) ? i + (num / i) : 0;
    }

    return total;
  }
}

