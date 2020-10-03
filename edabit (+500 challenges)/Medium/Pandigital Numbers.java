/*********************************************************************************************************************
 Pandigital Numbers

A pandigital number contains all digits (0-9) at least once. Write a function that takes an integer, returning true if the integer is pandigital, and false otherwise.

Examples
isPandigital(98140723568910) ➞ true

isPandigital(90864523148909) ➞ false
// 7 is missing.

isPandigital(112233445566778899) ➞ false

Notes
Think about the properties of a pandigital number when all duplicates are removed.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean isPandigital(long num) {
          String str = Long.toString(num);
          boolean value = false;
          if(str.contains("0")&& str.contains("1")&&str.contains("2")
                  &&str.contains("3")&&str.contains("4")&&str.contains("5")
                  &&str.contains("6")&&str.contains("7")&&str.contains("8")
                  &&str.contains("9")) {
              return true;
          }
          else {
              return false;
          }
    }
  }






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.*;
public class Challenge {
  public static boolean isPandigital(long num) {
		String str= "";
		int n;
		while(num != 0){
			n = (int)(num % 10);
			if( str.indexOf( n + '0' ) < 0 )
				str += n;
			num/=10;
		}
		return str.length() == 10 ? true:false;
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.Map;
import java.util.HashMap;

public class Challenge {
  public static boolean isPandigital(long num) {
		long r=-1;
		Map<Integer,Boolean> m = new HashMap<>();
		
		//Populate the map with falses.
		for(int i=0;i<10;i++){
			m.putIfAbsent(i,false);
		}
		
		int loopLength = String.valueOf(num).length();
		//Look through num - mark true if digits are there
		for(int i=0;i<loopLength;i++){
			r = num % 10;
			
				if(r == 0){m.put(0,true);					
				}else if(r == 1){m.put(1,true);	
				}else if(r == 2){m.put(2,true);	
				}else if(r == 3){m.put(3,true);	
				}else if(r == 4){m.put(4,true);	
				}else if(r == 5){m.put(5,true);	
				}else if(r == 6){m.put(6,true);	
				}else if(r == 7){m.put(7,true);	
				}else if(r == 8){m.put(8,true);	
				}else if(r == 9){m.put(9,true);	
				}
				num = num / 10;
		}
		
		if(!m.containsValue(false) ){
			return true;
		}
		
		return false;
  }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static boolean isPandigital(long num) {
        int sum = 0;
        String numString = Long.toString(num);

        numString = numString.replaceAll("(.)(?=.*\\1)", "");

        num = Long.parseLong(numString);
        long parsedLong = num;

        while (num > 0) {
            long tempNum = num % 10;
            sum += tempNum;
            num /= 10;
        }

        return Long.toString(parsedLong).length() == 10 && sum == 45;
    }
}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
    public static boolean isPandigital(long n) {
          String s = String.valueOf(n);
          return (s.contains("1")&&s.contains("2")&&s.contains("3")&&s.contains("4")&&s.contains("5")&&s.contains("6")&&s.contains("7")&&s.contains("8")&&s.contains("9")&&s.contains("0"));
    }
  }



  


//#############################################################
//#                        MY SOLUTION 6
//#############################################################



  public class Challenge {
    public static boolean isPandigital(long num) {
          String out = "" + num;
          char [] arr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
          for(int i = 0; i < arr.length; i++)
          {
              int found = 0;
              for(int j = 0; j < out.length(); j++)
                  if(arr[i] == out.charAt(j))
                      found = 1;
              if(found == 0)
                  return false;
          }
          return true;
    }
  }