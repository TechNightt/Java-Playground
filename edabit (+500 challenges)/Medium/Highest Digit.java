/*********************************************************************************************************************
 Highest Digit

Create a function that takes a number as an argument and returns the highest digit in that number.

Examples
highestDigit(4666) ➞ 6

highestDigit(544) ➞ 5

highestDigit(379) ➞ 9

highestDigit(2) ➞ 2

highestDigit(377401) ➞ 7

Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class HighestDigit {
    public static int highestDigit(int n) {
      return (n+"").chars().map(i -> Integer.parseInt((char)i+"")).max().getAsInt();
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class HighestDigit {
    public static int highestDigit(int n) {
      int	c = 0;
          while(n > 0)
          {
              if(n % 10 > c)
              {
                  c = n % 10; 
              }
              n = n/10;
          }
          return c;
      
    }
  }


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class HighestDigit {
    public static int highestDigit(int n) {
      int m=0;
          while (n>0) {
              m=n%10>m ? n%10 : m;
              n/=10;
          }
          return m;
    }
  }


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.TreeSet;
public class HighestDigit {
  public static int highestDigit(int n) {
    TreeSet<Integer> list = new TreeSet<Integer>();
		if(n==0) return 0;
		while(n>0){
			list.add(n%10);
			n = n/10;
		}
		
		return list.last();
		
  }
}