/*********************************************************************************************************************
 Palindromic Dates
The 2nd of February 2020 is a palindromic date in both dd/mm/yyyy and mm/dd/yyyy format (02/02/2020). Given a date in dd/mm/yyyy format, return true if the date is palindromic in both date formats, otherwise return false.

Examples
palindromicDate("02/02/2020") ➞ true

palindromicDate("11/12/2019") ➞ false

palindromicDate("11/02/2011") ➞ false
// Although 11/02/2011 is palindromic in dd/mm/yyyy format,
// it isn't in mm/dd/yyyy format (02/11/2011)

Notes
All dates will be valid in both date formats.
The date must be palindromic in both dd/mm/yyyy and mm/dd/yyyy formats to pass.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
    public static boolean palindromicDate(String date) {
          String[] numbers = date.split("/");
          String str1 = numbers[0] + numbers[1] + numbers[2];
          String str2 = numbers[1] + numbers[0] + numbers[2];
          
          return 
              new StringBuilder(str1).reverse().toString().equals(str1) &&
              new StringBuilder(str2).reverse().toString().equals(str2);
              
          
    }
  }






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
    public static boolean palindromicDate(String date) {
          String temp[] = date.split("/"), date2 = temp[1]+temp[0]+temp[2];
          date = "";
          for(String s : temp)
              date += s;
          for(int start = 0, end = date.length()-1; start <= end; start++, end--)
              if(date.charAt(start) != date.charAt(end) || date2.charAt(start) != date2.charAt(end))
                  return false;
          return true;
    }
  }






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
    public static boolean palindromicDate(String date) {
          String [] dates = date.split("/");
          boolean pal = (dates[0].equals(dates[1]) && dates[2].contains(dates[0])) ? true : false;
          return pal;
    }
  }







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static boolean palindromicDate(String date) {
          String ddmmyyyy = date.replaceAll("/", "");
      String mmddyyyy = new StringBuilder(date.split("/")[1] + date.split("/")[0] + date.split("/")[2]).toString();
  
      return isPalindrome(ddmmyyyy) && isPalindrome(mmddyyyy);
    }  
  
    public static boolean isPalindrome(String str) {
      return str.substring(4, str.length())
                .equals(new StringBuilder(str.substring(0, 4)).reverse().toString());  
    }
  }