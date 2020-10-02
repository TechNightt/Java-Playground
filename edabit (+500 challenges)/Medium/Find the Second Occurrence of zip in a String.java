/*********************************************************************************************************************
 
Find the Second Occurrence of "zip" in a String

Write a function that returns the position of the second occurrence of "zip" in a string, or -1 if it does not occur at least twice. Your code should be general enough to pass every possible case where "zip" can occur in a string.

Examples
findZip("all zip files are zipped") ➞ 18

findZip("all zip files are compressed") ➞ -1

Notes
Uppercase "Zip" is not the same as lowercase "zip".
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int findZip(String str) {
		if(str.indexOf("zip") == str.lastIndexOf("zip")) return -1;
		return str.lastIndexOf("zip");
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int findZip(String str) {
		if (str.indexOf("zip") > -1 &&
			  str.lastIndexOf("zip") != str.indexOf("zip")) {
				int i = str.lastIndexOf("zip");
				return (i>-1 ? i : -1); 
		}
		return -1;		
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int findZip(String str) {
        boolean foundFirst = false;
        for (int i = 0; i < str.length() - 3; i++) {
            if (!foundFirst && str.substring(i, i + 3).equals("zip"))
                foundFirst = true;
            else if (foundFirst && str.substring(i, i + 3).equals("zip"))
                return i;
        }
        return -1;
    }
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int findZip(String str) {
		int result = -1;
		boolean firstFound = false;
		int index = 0;
		int strLength = str.length();
		
		if(strLength>=3){
			while(result==-1 && index <= strLength-3){
				if(str.charAt(index)=='z' && str.charAt(index+1)=='i' && str.charAt(index+2)=='p'){
					if(!firstFound){
						firstFound = true;
					}
					else{
						result = index;
					}
				}
				index++;
			}
		}	
		
		return result;
  }
}