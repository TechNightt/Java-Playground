/*********************************************************************************************************************
 Pages in a Book

Suppose that you add all of the page numbers in a book. If the total is 21, the book would have only 6 pages because 1 + 2 + 3 + 4 + 5 + 6 = 21. If I had said the total is 25, that would be impossible because the next number in the series is 28 (21 + 7).

Create a function that has as it's argument the sum of all the page numbers and returns true if it is a valid number and false if it is not.

Can you devise a solution that is more efficient than simply adding consecutive integers as I did above?

Examples
pagesInBook(5) ➞ false

pagesInBook(4005) ➞ true

pagesInBook(9453) ➞ true
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean pagesInBook(int total) {
          return (Math.sqrt(1 + 8 * total) - 1)/2.0 % 1 == 0;
    }
  }






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static boolean pagesInBook(int total) {
          int i = 0;
          while (sumTo(i) <= total) {
              if (sumTo(i) == total) {
                  return true;
              }
              i++;
          }
          return false;
    }
      public static int sumTo(int n) {
          if (n == 0) {
              return 0;
          }
          return n + sumTo(n - 1);
      }
  }







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean pagesInBook(int total) {
          int sum=0;
          for (int n=1;;n++) {
              sum+=n;
              if (sum > total) return false;
              if (sum == total) return true;
          }
    }
  }







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.lang.Math;
public class Challenge {
  public static boolean pagesInBook(int total) {
		 int l = (int) Math.sqrt(total*8 + 1);

    return l * l == 8* total + 1;
	}
}