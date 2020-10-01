/*********************************************************************************************************************
 Magic Date
You are to read each part of the date into its own integer type variable. The year should be a 4 digit number. You can assume the user enters a correct date formatted d m yyyy (no error checking required).

Determine whether the entered date is a magic date. Here are the rules for a magic date:

mm * dd is a 1-digit number that matches the last digit of yyyy or
mm * dd is a 2-digit number that matches the last 2 digits of yyyy or
mm * dd is a 3-digit number that matches the last 3 digits of yyyy
The program should then display true if the date is magic, or false if it is not.

Examples
Magic("1 1 2011") ➞ true

Magic("4 1 2001") ➞ false

Magic("5 2 2010") ➞ true

Magic("9 2 2011") ➞ false
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean magic(String str) {
          String[] temp = str.split(" ");
          
          int d = Integer.parseInt(temp[0]);
          int m = Integer.parseInt(temp[1]);
          int y = Integer.parseInt(temp[2]);
          
          return (d*m==y%1000||d*m==y%100||d*m==y%10);
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static boolean magic(String str) {
      String[] items = str.split(" ");
      int day = Integer.parseInt(items[0]);
      int month = Integer.parseInt(items[1]);
      int year = Integer.parseInt(items[2]);
      int dayXmonth = day * month;
      if (dayXmonth < 10) {
          return dayXmonth == year % 10;
      } else if (dayXmonth < 100) {
          return dayXmonth == year % 100;
      } else {
          return dayXmonth == year % 1000;
      }
    }
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean magic(String str) {
      String monthdate = String.valueOf(Integer.parseInt(String.valueOf(str.charAt(0))) * 
                                Integer.parseInt(String.valueOf(str.charAt(2))));		
          String lastOneDigit = str.substring(str.length() - 1, str.length());
          String lastTwoDigit = str.substring(str.length() - 2, str.length());
          String lastThreeDigit = str.substring(str.length() - 3, str.length());
          
          if(monthdate.equals(lastOneDigit) || monthdate.equals(lastTwoDigit) || monthdate.equals(lastThreeDigit))
              return true;
          return false;
    }
  }






//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static boolean magic(String str) {
          String[] date = str.split(" ");
          int year = Integer.parseInt(date[2]);
          int month = Integer.parseInt(date[1]);
          int day = Integer.parseInt(date[0]);
          int check = month * day;
          int numDigits = Integer.toString(check).length();
          switch (numDigits) {
              case 1:
                  return check == year % 10;
              case 2:
                  return check == year % 100;
              case 3:
                  return check == year % 1000;
          }
          return false;
    }
  }






//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Challenge {
	public static boolean magic(String str) {
		String[] split = str.split(" ");
		boolean bool = false;
		int mm = Integer.parseInt(split[0]);
		int dd = Integer.parseInt(split[1]);
		int y4 = Character.getNumericValue(split[2].charAt(split[2].length() - 1));
		int y3 = Character.getNumericValue(split[2].charAt(split[2].length() - 2));
		int y2 = Character.getNumericValue(split[2].charAt(split[2].length() - 3));

		if (String.valueOf(mm * dd).length() == 1) {
			if (mm * dd == y4)
				bool = true;
		}
		if (String.valueOf(mm * dd).length() == 2) {
			if (mm * dd == y3 * 10 + y4)
				bool = true;
		}
		if (String.valueOf(mm * dd).length() == 3) {
			if (mm * dd == y2 * 100 + y3 * 10 + y4)
				bool = true;
		}

		return bool;
	}
	
	public static void main(String[] args) {
		System.out.println(magic("1 2 1008"));
	}
}