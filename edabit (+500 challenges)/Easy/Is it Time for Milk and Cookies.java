/*********************************************************************************************************************
 
Is it Time for Milk and Cookies?
Christmas Eve is almost upon us, so naturally we need to prepare some milk and cookies for Santa! Create a method that accepts a GregorianCalendar object and returns true if it's Christmas Eve (December 24th) and false otherwise.

Examples
GregorianCalendar(2013, 11, 24) ➞ true

GregorianCalendar(2013, 0, 23) ➞ false

GregorianCalendar(3000, 11, 24) ➞ true

Notes
Dates are zero based (see resources).
All test cases contain valid dates.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


import java.util.GregorianCalendar;
import java.util.Calendar;
public class Program {
    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
      return date.get(Calendar.MONTH) == 11 && date.get(Calendar.DAY_OF_MONTH) == 24;
    }
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.GregorianCalendar;

public class Program {
    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
			String s = date.toString();
			if (s.contains("DAY_OF_MONTH=24"))
				return true;
			else
				return false;
    }
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.GregorianCalendar;
import java.util.Calendar;
public class Program {
    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
       int month = date.get(GregorianCalendar.MONTH);
				int day = date.get(GregorianCalendar.DAY_OF_MONTH);
																							 		
			return month== 11 && day == 24;
  
    }
}

