/*********************************************************************************************************************
 Join Two Portions of a Path

Write a function that receives two portions of a path and joins them. The portions will be joined with the "/" separator. There could be only one separator and if it is not present it should be added.

Examples
joinPath("portion1", "portion2") ➞ "portion1/portion2"

joinPath("portion1/", "portion2") ➞ "portion1/portion2"

joinPath("portion1", "/portion2") ➞ "portion1/portion2"

joinPath("portion1/", "/portion2") ➞ "portion1/portion2"

Notes
Try not to solve this challenge using only if-else conditions.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String joinPath(String portion1, String portion2) {
		return portion1.replaceAll("/", "") + "/" + portion2.replaceAll("/", "");
	}
}





//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static String joinPath(String portion1, String portion2) {
		String newPortion = "";
		if (!portion1.endsWith("/") && 
						!portion2.startsWith("/"))
				return portion1+"/"+portion2;
		else newPortion = portion1+portion2;
		return newPortion.replace("//","/");
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String joinPath(String portion1, String portion2) {
		String s = "";
		if(portion1.substring(portion1.length()- 1, portion1.length()).equals("/")){
			s = portion1;
		}else {
			s = portion1 + "/";
		}
		if(portion2.substring(0, 1).equals("/")){
			s += portion2.substring(1, portion2.length());
		}else {
			s += portion2;
		}
		return s;
	}
}






//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String joinPath(String portion1, String portion2) {
	   boolean backslash1 = portion1.contains("/");
		 boolean backslash2 = portion2.contains("/");
		
		 String s1 = backslash1 ? portion1.substring(0, portion1.length() - 1) : portion1;
		 String s2 = backslash2 ? portion2.substring(1) : portion2;
		 
		 return s1 + "/" + s2;
		 
	}
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String joinPath(String portion1, String portion2) {
		return portion1.charAt(portion1.length() - 1) == '/' ?
							portion2.charAt(0) == '/' ?
									portion1 + portion2.substring(1) :
									portion1 + portion2 :
							portion2.charAt(0) == '/' ?
									portion1 + portion2 :
									portion1 + '/' + portion2;
	}
}