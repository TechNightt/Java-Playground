/*********************************************************************************************************************
 Date Format
Create a function that converts a date formatted as MM/DD/YYYY to YYYYDDMM.

Examples
formatDate("11/12/2019") ➞ "20191211"
formatDate("12/31/2019") ➞ "20193112"
formatDate("01/15/2019") ➞ "20191501"

Notes
Return value should be a string.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String formatDate(String date) {
		String part[] = date.split("/");
		return part[2]+part[1]+part[0];
		

	}
}

//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String formatDate(String date) {
		String s="";
		s+=date.charAt(6);
		s+=date.charAt(7);
		s+=date.charAt(8);
		s+=date.charAt(9);
		s+=date.charAt(3);
		s+=date.charAt(4);
		s+=date.charAt(0);
		s+=date.charAt(1);
		return s;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
+
public class Challenge {
	public static String formatDate(String date) {
		String[] sArr = date.split("/");
		String datum = "";
			
		for(int i=sArr.length-1;i>=0;i--){
			datum += sArr[i];
		}				
		return datum;
		}
	
}

//#############################################################
//#                        MY SOLUTION 4

public class Challenge {
	public static String formatDate(String date) {
		return date.substring(6, 10) + date.substring(3,5) + date.substring(0, 2);
	}
}


//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static String formatDate(String date) {
				String yyyy = date.substring(6,10);
        String mm = date.substring(3,5);
        String dd = date.substring(0,2);

        return yyyy+mm+dd;
	}
}