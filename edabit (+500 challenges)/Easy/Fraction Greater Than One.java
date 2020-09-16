/*********************************************************************************************************************
 
Fraction Greater Than One

Given a fraction as a string, return whether or not it is greater than 1 when evaluated.

Examples
greaterThanOne("1/2") ➞ false

greaterThanOne("7/4") ➞ true

greaterThanOne("10/10") ➞ false

Notes
Fractions must be strictly greater than 1 (see example #3).
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean greaterThanOne(String frac) {
          String[] fracs = frac.split("/");
          return Integer.parseInt(fracs[0]) > Integer.parseInt(fracs[1]);
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean greaterThanOne(String frac){
        String[] nums = frac.split("/");
        float fraction = Float.parseFloat(nums[0]) / Float.parseFloat(nums[1]);
        return (fraction>1) ? true : false;
    }
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean greaterThanOne(String frac) {
          String num = "";
          String dem = "";
          boolean b = false;
          for (char c : frac.toCharArray())
              if (c=='/')
                  b = true;
              else if (!b)
                  num+=c;
              else
                  dem+=c;
          return Integer.parseInt(num) > Integer.parseInt(dem);
    }
  }


//#############################################################
//#                        MY SOLUTION 4



import java.util.*;
public class Challenge {
  public static boolean greaterThanOne(String frac) {
	double[] arr = Arrays.stream(frac.split("/"))
    .mapToDouble(Double::parseDouble)
    .toArray();
	return (arr[0]/arr[1]) > 1;
  }
}