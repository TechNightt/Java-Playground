/*********************************************************************************************************************
 Phone Number Formatting

Create a method that takes an array of 10 integers (between 0 and 9) and returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).

Examples
formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"

formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"

formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"

Notes
Don't forget the space after the closing parenthesis.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static String formatPhoneNumber(int[] nums) {
      return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3],
													nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
    }
}




//#############################################################
//#                        MY SOLUTION 2   

public class Program {
    public static String formatPhoneNumber(int[] nums) {
      StringBuilder sb = new StringBuilder();
      for(int i:nums){
        sb.append(i);
      }
      sb.insert(0, "(");
      sb.insert(4, ")");
      sb.insert(5, " ");
      sb.insert(9, "-");
      System.out.println(sb);
      return sb.toString();
      
    }
}





//#############################################################
//#                        MY SOLUTION 3   

public class Program {
	public static String formatPhoneNumber(int[] nums) {
		StringBuilder s = new StringBuilder();
		for (int c : nums) {
				s.append(c);
		}
		return s.toString().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");	
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static String formatPhoneNumber(int[] nums) {
      return "(" + nums[0] + nums[1] + nums[2] + ") " + nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7] + nums[8] + nums[9];
    }
}




//#############################################################
//#                        MY SOLUTION 5



public class Program {
    public static String formatPhoneNumber(int[] nums) {
      String formattedNumber = "(";
      for (int i = 0; i < nums.length; i++) {
        
        if ( i < 3) {
          formattedNumber += nums[i];
        } else if ( i == 3 ) {
          formattedNumber += ") ";
          formattedNumber += nums[i];
        } else if ( i < 6 && i > 3) {
          formattedNumber += nums[i];
        } else if ( i == 6 ) {
          formattedNumber += "-";
          formattedNumber += nums[i];
        } else {
          formattedNumber += nums[i];
        }
        
      }
      
      return formattedNumber;
    }
}




//#############################################################
//#                        MY SOLUTION 6


public class Program {
    public static String formatPhoneNumber(int[] nums) {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < nums.length; i++) {
        if(i == 0) {
          sb.append("(");
        }
        if(i == 3) {
          sb.append(") ");
        }
        if(i == 6) {
          sb.append("-");
        }
        sb.append(nums[i]);
      }
      return sb.toString();
    }
}


//#############################################################
//#                        MY SOLUTION 7



public class Program {
    public static String formatPhoneNumber(int[] nums) {
      String numSetA = "", numSetB = "", numSetC = "";
      for(int i = 0; i <= 2; i++){numSetA = numSetA + nums[i];}
      for(int i = 3; i <= 5; i++){numSetB = numSetB + nums[i];}
      for(int i = 6; i <= 9; i++){numSetC = numSetC + nums[i];}      
      String phoneNumber= "(" + numSetA + ") " + numSetB + "-" + numSetC;
      return phoneNumber;
    }
}