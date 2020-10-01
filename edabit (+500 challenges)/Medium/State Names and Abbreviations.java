/*********************************************************************************************************************
 State Names and Abbreviations
Create a function that filters out an array of state names into two categories based on the second parameter.

Abbreviations abb
Full names full
Examples
filterStateNames(["Arizona", "CA", "NY", "Nevada"], "abb")
➞ ["CA", "NY"]

filterStateNames(["Arizona", "CA", "NY", "Nevada"], "full")
➞ ["Arizona", "Nevada"]

filterStateNames(["MT", "NJ", "TX", "ID", "IL"], "abb")
➞ ["MT", "NJ", "TX", "ID", "IL"]

filterStateNames(["MT", "NJ", "TX", "ID", "IL"], "full")
➞ []

Notes
State abbreviations will always be in uppercase.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;

public class Challenge {
	public static String[] filterStateNames(String[] arr, String type) {
		return Arrays.stream(arr).filter(name -> "full".equals(type) ? name.length() > 2 : name.length() == 2).toArray(String[]::new);		
	}
}








//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String[] filterStateNames(String[] arr, String type) {
		int number = 0;
		for(int i = 0; i < arr.length; i++) {
			if (type.equals("abb")) {
				if (arr[i].length() <=2 ) {
					number +=1;
				}
			} else {
			if (arr[i].length() > 2 ) {
				number +=1;
			}
				}
		}
		String [] x =new String[number];
			int val = 0;
		for(int i = 0; i < arr.length; i++) {
			if (type.equals("abb")) {
				if (arr[i].length() <=2 ) {
					x[val] = arr[i];
					val +=1;
				}
			} else {
			if (arr[i].length() > 2 ) {
				x[val] = arr[i];
					val +=1;
			}
				}
		}
		return x;
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.Vector;

public class Challenge {
	public static String[] filterStateNames(String[] arr, String type) {
		Vector<String> arrFinal = new Vector<String>();
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i].length() == 2 && type == "abb") {
				arrFinal.add(arr[i]);
			} else if (arr[i].length() > 2 && type =="full") {
				arrFinal.add(arr[i]);
			}
		}
		
		String[] arrFinalStr = new String[arrFinal.size()];
		arrFinalStr = arrFinal.toArray(arrFinalStr);
		return arrFinalStr;
	}
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.Arrays;
public class Challenge {
	public static String[] filterStateNames(String[] arr, String type) {
		String out[] = new String[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(type == "abb" && arr[i].length() == 2) out[j++] = arr[i];
			else if(type == "full" && arr[i].length() > 2) out[j++] = arr[i];
		}
		return Arrays.copyOfRange(out, 0, j);
	}
}



//#############################################################
//#                        MY SOLUTION 5
//#############################################################



import java.util.Arrays;
public class Challenge {
	public static String[] filterStateNames(String[] arr, String type) {
		return Arrays.stream(arr)
			.filter(s -> (type.equals("abb") && s.length() == 2)
							|| (type.equals("full") && s.length() > 2))
			.toArray(String[]::new);
	}
}