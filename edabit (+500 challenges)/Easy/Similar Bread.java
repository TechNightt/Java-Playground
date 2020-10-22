/*********************************************************************************************************************
 
Similar Bread

Given two arrays, which represent two sandwiches, return whether both sandwiches use the same type of bread. The bread will always be found at the start and end of the array.

Examples
hasSameBread(
  ["white bread", "lettuce", "white bread"],
  ["white bread", "tomato", "white bread"]
) ➞ true

hasSameBread(
  ["brown bread", "chicken", "brown bread"],
  ["white bread", "chicken", "white bread"]
) ➞ false

hasSameBread(
  ["toast", "cheese", "toast"],
  ["brown bread", "cheese", "toast"]
) ➞ false

Notes
The arrays will always be three elements long.
The first piece of bread on one sandwich must be the same as the first piece of bread on the other sandwich. The same goes for the last piece of bread.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Sandwiches {
    public static boolean hasSameBread(String[] a, String[] b) {
           return a[0].equals(b[0]) && a[2].equals(b[2]);
       }
   }





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Sandwiches {
	public static boolean hasSameBread(String[] a, String[] b) {
		if (a[0] == b[0]
                && a[2] == b[2]) {
            return true;
        } else {
            return false;
        }
	} 
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Sandwiches {
	public static boolean hasSameBread(String[] a, String[] b) {
	  String sandwich1_bread = getBread(a);
		String sandwich2_bread = getBread(b);
		
		if(sandwich1_bread.equals(sandwich2_bread)){
			return true;
		}else {
			return false;
		}
	}
	public static String getBread(String[] arr){
		String bread1 = arr[0];
		String bread2 = arr[2];
		return bread1 + ";" + bread2;
	}
}

