/*********************************************************************************************************************
 LCM of Two Numbers
Write a function that returns the least common multiple (LCM) of two integers.

Examples
lcm(9, 18) ➞ 18

lcm(8, 5) ➞ 40

lcm(17, 11) ➞ 187

Notes
Both values will be positive.
The LCM is the smallest integer that is divisible by both numbers such that the remainder is zero.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int lcm(int n1, int n2) {
		return (n1 * n2) / gcd(n1, n2);
  }
	 public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int lcm(int n1, int n2) {
		return (n1 * n2)/gcd(n1, n2);
  }
	
	private static int gcd(int n1, int n2) {
		return (n2 == 0) ? n1 : gcd(n2, n1 % n2);
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int lcm(int n1, int n2) {
		if(n1 == n2) return n1;
		int bigger = n1 > n2 ? n1:n2;
		int smaller = n1 < n2 ? n1:n2;
		if(bigger % smaller == 0) return bigger;
		int lcm = bigger + 1;
		while(lcm % smaller !=0 || lcm % bigger != 0) {
			++lcm;
		}
		return lcm;
  }








//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int lcm(int n1, int n2) {
		int lcm = (n1 > n2) ? n1 : n2;       
    while(true)
    {
      if( lcm % n1 == 0 && lcm % n2 == 0 )
      {
        return lcm;
      }
        ++lcm;
    }
  }
}





//#############################################################
//#                        MY SOLUTION 5
//#############################################################



import java.util.LinkedList;
import java.util.List;

public class Challenge {
	public static int lcm(int n1, int n2) {
    List<Integer> dividers1 = dividers(n1);
    List<Integer> dividers2 = dividers(n2);
    dividers1.forEach(
       dividers2::remove
    );
    dividers1.addAll(dividers2);
    return dividers1.stream().reduce(1, (x, y) -> x * y);
  }
	
	  public static List<Integer> dividers(int n) {
    List<Integer> dividers = new LinkedList<Integer>();
    if (n == 1) {
      dividers.add(n);
    } else {
      int i = 2;
      while (n > 1) {
        if (n % i == 0) {
          dividers.add(i);
          n /= i;
        } else {
          i++;
        }
      }
    }
    return dividers;
  }
}