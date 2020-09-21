/*********************************************************************************************************************
 Is the Phone Number Formatted Correctly?
Create a method that accepts a string and returns true if it's in the format of a proper phone number and false if it's not. Assume any number between 0-9 (in the appropriate spots) will produce a valid phone number.

This is what a valid phone number looks like:

(123) 456-7890
Examples
isValidPhoneNumber("(123) 456-7890") ➞ true

isValidPhoneNumber("1111)555 2345") ➞ false

isValidPhoneNumber("098) 123 4567") ➞ false

Notes
Don't forget the space after the closing parentheses.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static boolean isValidPhoneNumber(String s) {
       return s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
    }
}




//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static boolean isValidPhoneNumber(String s) {
     
      if(s == "")
        return false;
      
     
      String [] arr = s.split(" ");
      
     
      if(arr.length != 2)
        return false;
      
      String areaCode = arr[0];
     
      if(areaCode.length() != 5)
        return false;
     
      if(areaCode.charAt(0) != '(' || areaCode.charAt(4) != ')')
        return false;
     
      areaCode =  "" + areaCode.charAt(1) + areaCode.charAt(2) + areaCode.charAt(3);
      
     
      String [] secondHalfArr = arr[1].split("-");
      if(secondHalfArr.length != 2)
        return false;
      
     
      try
      {
        Integer.parseInt(areaCode);
        Integer.parseInt(secondHalfArr[0]);
        Integer.parseInt(secondHalfArr[1]);
      }
      catch (Exception e)
      {
        return false;
      }
      return true;   
    }
}




//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static boolean isValidPhoneNumber(String s) {
      if(s.length() != 14)
        return false;
      for(int i=0; i<14; i++){
        char c = s.charAt(i);
        if(i==0 && c!='(')
          return false;
				else if(( (1<=i && i<=3) || (6<=i && i<=8) || i>=10 ) && (c<48 || c>57))
          return false;
        else if(i==4 && c!=')')
          return false;
        else if(i==5 && c!=' ')
          return false;
        else if(i==9 && c!='-')
          return false;
      }
      return true;
    }
}




//#############################################################
//#                        MY SOLUTION 4



public class Program {
    public static boolean isValidPhoneNumber(String s) {
      
			boolean isValid = true;
			
			
			if(!s.substring(0,1).equals("(")||
				 !s.substring(1,4).matches("[0-9]+")||
				 !s.substring(4,5).equals(")")||
				 !s.substring(5,6).equals(" ")||
				 !s.substring(6,9).matches("[0-9]+")||
				 !s.substring(9,10).equals("-")||
				 !s.substring(10,13).matches("[0-9]+") ||
				 !(s.length() == 14))
			  {
		
				 isValid = false;
			 }
			
			
			return isValid;
    }
}