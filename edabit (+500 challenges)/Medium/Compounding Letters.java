/*********************************************************************************************************************
 
Compounding Letters
Create a function that takes a string and returns a new string with each new character accumulating by +1. Separate each set with a dash.

Examples
accum("abcd") ➞ "A-Bb-Ccc-Dddd"

accum("RqaEzty") ➞ "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"

accum("cwAt") ➞ "C-Ww-Aaa-Tttt"

Notes
Capitalize the first letter of each set.
All tests contain valid strings with alphabetic characters (a-z, A-Z).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String accum(String str) {
		String strFinal = "";
		
		for (int i = 0 ; i < str.length() ; i++) {
			// append the uppercase
			strFinal += Character.toUpperCase(str.charAt(i));
			
			// append the lower case
			for (int j = 0 ; j < i ; j++) {
				strFinal += Character.toLowerCase(str.charAt(i));
			}
			
			// append the dash
			if (i + 1 < str.length()) {
				strFinal += "-";
			}
		}
		
		return strFinal;
	}
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String accum(String str) {
		String s2 = new String("");
		for(int i = 0; i< str.length(); i++){
   if(str.length() == 1){
			s2 = s2.concat(Character.valueOf(str.charAt(i)).toString().toUpperCase());
		}else if (i==0 && str.length() >1)	{
		s2 = s2.concat(Character.valueOf(str.charAt(i)).toString().toUpperCase()+"-");
		}else{
			for (int j= 0; j<= i; j++){
				if(j==0){
					s2 = s2.concat(Character.valueOf(str.charAt(i)).toString().toUpperCase());
				}else if(j== (i) && i < str.length()-1){
					s2 = s2.concat(Character.valueOf(str.charAt(i)).toString().toLowerCase()+"-");
				}else if(j== (i) && i == str.length()-1){
					s2 = s2.concat(Character.valueOf(str.charAt(i)).toString().toLowerCase());
				}
				else{
					s2 = s2.concat(Character.valueOf(str.charAt(i)).toString().toLowerCase());
				}
			}
		}
		}
		return s2;
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String accum(String str) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			for(int j=i; j>=0; j--){
				if(j==i){
					s.append(Character.toUpperCase(str.charAt(i)));
				}else{
					s.append(Character.toLowerCase(str.charAt(i)));}
				}
			if(i!=str.length()-1){
				s.append("-");
			}
		}
		return s.toString();
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String accum(String str) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			for(int j=i; j>=0; j--){
				if(j==i){
					s.append(Character.toUpperCase(str.charAt(i)));
				}else{
					s.append(Character.toLowerCase(str.charAt(i)));}
				}
			if(i!=str.length()-1){
				s.append("-");
			}
		}
		return s.toString();
	}
}