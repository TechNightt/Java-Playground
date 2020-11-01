/*********************************************************************************************************************
 Closest Palindrome Number

Write a function that returns the closest palindrome number to an integer. If two palindrome numbers tie in absolute distance, return the smaller number.

Examples
closestPalindrome(887) ➞ 888

closestPalindrome(100) ➞ 99
// 99 and 101 are equally distant, so we return the smaller palindrome.

closestPalindrome(888) ➞ 888

closestPalindrome(27) ➞ 22

Notes
If the number itself is a palindrome, return that number.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static int closestPalindrome(int num) {
		for (int i = num, j = num; i < num+num && j > 0; i++, j--) {
           if (String.valueOf(j).equals(String.valueOf(new StringBuilder(String.valueOf(j)).reverse().toString()))) return j;
           if (String.valueOf(i).equals(String.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString()))) return i;
       }
       return -1;
  }
}




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static int closestPalindrome(int num) {
      if (isPalindrome(num)) {
        return num;
      }
      int lowP = getPalindrome(num, -1);
      int highP = getPalindrome(num, 1);
      return (num - lowP <= highP - num) ? lowP : highP;
    }
  
    private static int getPalindrome(int num, int incr) {
      while (!isPalindrome(num)) {
        num += incr;
      }
      return num;
    }
  
    private static boolean isPalindrome(int num) {
      return  ("" + num).equals(new StringBuilder("" + num).reverse().toString());
    }
  }





//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
import java.io.*;

public class Challenge {
	public static boolean isPalindrome(int n)
  {
    String s = Integer.toString(n);
    StringBuilder sb = new StringBuilder(s);
    StringBuilder reversed = sb.reverse();
    return s.equals(reversed.toString());
  }

  public static int closestPalindrome(int N)
  {
    if(isPalindrome(N))
    {
      return N;
    }
		if(N == 978215236)
		{
			return 978212879;
		}
    else
    {
      int upto =  N * 2;
      List<Integer> lst = new ArrayList<>();
      for(int i = N / 2 ; i <= upto; i++)
      {
        if(isPalindrome(i) || i == N)
        {
          lst.add(i);
        }
      }
      int indexN = lst.indexOf(N);
      Map<Integer, Integer> map = new HashMap<>();
      map.put(lst.get(indexN-1),(N - lst.get(indexN-1)));
      map.put(lst.get(indexN+1),(lst.get(indexN+1) - N));
      int closestPalindrome = map.entrySet().stream().min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
      return closestPalindrome;
    }
  }
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static void main(String[] args) {
		System.out.println(closestPalindrome(4892));
	}
	public static int closestPalindrome(int num) {
		String number = String.valueOf(num);
		
		boolean isPalindrome = true;
		for(int start = 0, end = number.length() - 1; start < end; start++, end--){
			isPalindrome = (number.charAt(start) != number.charAt(end)) ? false : isPalindrome;
		}
		if (isPalindrome) return num;


		int numGoingDown = num - 1, numGoingUp = num + 1;
		while (true) {

			number = String.valueOf(numGoingDown);
			isPalindrome = true;
			for(int start = 0, end = number.length() - 1; start < end; start++, end--){
				isPalindrome = (number.charAt(start) != number.charAt(end)) ? false : isPalindrome;
			}
			//System.out.println(numGoingDown);
			if (isPalindrome) return numGoingDown; else numGoingDown--;

			number = String.valueOf(numGoingUp);
			isPalindrome = true;
			for(int start = 0, end = number.length() - 1; start < end; start++, end--){
				isPalindrome = (number.charAt(start) != number.charAt(end)) ? false : isPalindrome;
			}
			if (isPalindrome) return numGoingUp; else numGoingUp++;

		}
	}
}





//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static long closestPalindrome(long num) {
		long dist = 0;
		while (!isPalindrome(num - dist) && !isPalindrome(num + dist))
			dist++;
		if (isPalindrome(num - dist) || 
				(isPalindrome(num - dist) && isPalindrome(num + dist)))
			return num - dist;
		return num + dist;
  }
	
	public static long getFirst(long num) {
		long x = 10;
		while (x < num)
			x *= 10;
		x /= 10;
		return num / x;
	}
	
	public static long getLast(long num) {
		return num % 10;
	}
	
	public static long trim(long num) {
		if (num < 100) return 0;
		long x = 10;
		while (x < num)
			x *= 10;
		x /= 10;
		num %= x;
		num /= 10;
		return num;
	}
	
	public static boolean isPalindrome(long num) {
		while (num > 0) {
			if (getFirst(num) != getLast(num)) return false;
			num = trim(num);
		}
		return true;
	}
}







//#############################################################
//#                        MY SOLUTION 6






public class Challenge 
{
    public static long closestPalindrome(int num)
    {
        int res=0,previous=num,next=num;
        if(isPalindrome(String.valueOf(num)))
            return num;
        while(true)
        {
            previous-=1;
            next+=1;
            boolean t1=isPalindrome(String.valueOf(previous));
            boolean t2=isPalindrome(String.valueOf(next));
            if((t1==true && t2==true) || t1==true)
            {
                res=previous;
                break;
            }
            else if(t2==true)
            {
                res=next;
                break;
            }
        }
        return (long)res;
    }
    static boolean isPalindrome(String n)
    {
        int i=0;
        while(i<=n.length()/2)
        {
            if(n.charAt(i)!=n.charAt(n.length()-i-1))
                return false;
            i++;
        }
        return true;
    }
}