/*********************************************************************************************************************
 Is It a Leap Year?
In a calendar year, it is exactly 365.25 days. But, eventually, this will lead to confusion because humans normally count by exact divisibility of 1 and not with decimal points. So, to avoid the latter, it was decided to add up all 0.25 days every four-year cycle, make that year sum up to 366 days (including February 29 as an intercalary day), thus, called a leap year and aside the other years of the four-year cycle to sum up to 365 days, not a leap year.

In this challenge, (though quite repetitive), we'll take it to a new level, where you are to determine if it's a leap year or not without the use of the Date() class, switch statements, if blocks, if-else blocks, ternary operation (x == 1 ? a : b) nor the logical operators AND (&&) and OR (||) with the exemption of the NOT (!) operator.

Return true if it's a leap year, false otherwise.

Examples
isLeapYear(1979) ➞ false

isLeapYear(2000) ➞ true

isLeapYear(1521) ➞ false

isLeapYear(1996) ➞ true

isLeapYear(1800) ➞ false

isLeapYear(2016) ➞ true

Notes
You can't use the Date class, switch statements, if statements in general, the ternary operator nor the logical operators (&&, ||).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class LeapYear {
    public static boolean isLeapYear(int y) {
      //	System.out.println("1%0 = " + 1%0);
      int hundNum = y%100;
          int fourHundNum = y%400;
      
          
          
          // return leftSide <= rightSide;
          return y%4*1000000 + y%400 - (y%100)*400 <= (y%100)*400;
    }
  }






//#############################################################
//#                        MY SOLUTION 2   


public class LeapYear {
    public static boolean isLeapYear(int yr) {
          return (yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0));
    }
  }







//#############################################################
//#                        MY SOLUTION 3   



public class LeapYear {
    public static boolean isLeapYear(int y) {
            boolean b = (y%400 == 0);
        boolean o = (y%100 != 0);
        boolean f = (y%4 ==0);
        int bi = Boolean.compare(b, true);
        int oi = Boolean.compare(o, false);
        int fi = Boolean.compare(f, true);
        int broj = 1;
        broj = bi+oi+fi;
        boolean lol =(broj == 0);
        System.out.println(lol);
        return lol;
    }
  }




//#############################################################
//#                        MY SOLUTION 4


public class LeapYear {
    public static boolean isLeapYear(int y) {
      return new boolean[] {y % 400 == 0, y % 4 == 0}[y % 100 == 0 ? 0 : 1];
    }
  }