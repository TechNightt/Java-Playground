/*********************************************************************************************************************
 Working 9 to 5

Write a function that calculates overtime and pay associated with overtime.

Working 9 to 5: regular hours
After 5pm is overtime
Your function gets an array with 4 values:

Start of working day, in decimal format, (24-hour day notation)
End of working day. (Same format)
Hourly rate
Overtime multiplier
Your function should spit out:

$ + earned that day (rounded to the nearest hundreth)
Examples
overTime([9, 17, 30, 1.5]) ➞ "$240.00"

overTime([16, 18, 30, 1.8]) ➞ "$84.00"

overTime([13.25, 15, 30, 1.5]) ➞ "$52.50"
2nd example explained:

From 16 to 17 is regular, so 1 * 30 = 30
From 17 to 18 is overtime, so 1 * 30 * 1.8 = 54
30 + 54 = $84.00
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Challenge {
	public static String overTime(double[] arr) {
		double start = arr[0];
		double end = arr[1];
		double rate = arr[2];
		double multiplier = arr[3];
		
		double bizHour;
		if (start < 17)
			bizHour = (end > 17) ?  (17 - start) : (end - start);
		else 
			bizHour = 0;
		
		double otHour;
		if (bizHour > 0)
			otHour = (end > 17) ? (end - 17) : 0;
		else
			otHour = end - start;
		
		double earn = bizHour*rate + otHour*rate*multiplier;
		DecimalFormat df = new DecimalFormat("#.00");
		df.setRoundingMode(RoundingMode.HALF_UP); 
		String currency = df.format(earn);
				
		return "$"+currency;
	}
}




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String overTime(double[] arr) {
		double start = arr[0];
		double end = arr[1];
		double perHour = arr[2];
		double afterHour = arr[3];
		double overH = perHour * afterHour;
		double total = 0;

		double roundStart = Math.round(start);

		if (start < 17) {
			if (roundStart < start) {
				total = ((roundStart + 1) - start) * perHour;
				start = roundStart + 1;
			} else if (roundStart > start) {
				total = (roundStart - start) * perHour;
				start = roundStart;
			}

		} else {
			if (roundStart < start) {
				total = ((roundStart + 1) - start) * overH;
				start = roundStart + 1;
			} else if (roundStart > start) {
				total = (roundStart - start) * overH;
				start = roundStart;
			}
		}

		for (double i = start; i < end; i++) {
			if (i < 17) {
				total += perHour;
			} else {
				total += overH;
			}
		}

		String output = "$" + (Math.round(total * 100.0) / 100.0);

		if (output.length() < 7) {
			output += "0";
		}

		return output;
	}
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean isModest(int num) {
          
               String nms = Integer.toString(num);
          String left = "";
          String right = "";
          int endIndex = nms.length();
          boolean itIsModest = false;
  
  
          for (int i = 1; i < endIndex; i++) {
            left =  nms.substring(0,i);
            right =  nms.substring(i, endIndex);
            if (right.charAt(0) == '0'){
               right =  right.replaceFirst("[0]","");
            }
                        if (right.isEmpty()){
                break;
            }
            int x = Integer.parseInt(left);
            int y = Integer.parseInt(right);
            if (num % y == x){
                itIsModest = true;
                break;
            }
  
          }
          return itIsModest;
          
    }
  }



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean isModest(int num) {
   
           int numberOfDigits = String.valueOf(num).length();
   
           for (int i = 0; i < numberOfDigits; i++) {
               int left = (int) (num / Math.pow(10, numberOfDigits - i -1));
               int right = (int) (num % Math.pow(10, numberOfDigits - i -1));
   
               if (right != 0 && num % right == left) {
                   return true;
               }
           }
   
           return false;
       }
   }