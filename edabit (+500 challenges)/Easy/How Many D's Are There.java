/*********************************************************************************************************************
 How Many D's Are There?

Create a function that counts how many D's are in a sentence.

Examples
countDs("My friend Dylan got distracted in school.") ➞ 4

countDs("Debris was scattered all over the yard.") ➞ 3

countDs("The rodents hibernated in their den.") ➞ 3

Notes
Your function must be case-insensitive.
Remember to return the result.
Check the Resources for help.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class FourthLetter {
	public static int countDs(String s) {
		return s.length() - s.replaceAll("(?i)[d]", "").length();
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class FourthLetter {
	public static int countDs(String s) {
		char letter = 'd';
		char letter1 = 'D';
			int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == letter || s.charAt(i) == letter1)
				count++;
		}
		return count;
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class FourthLetter {
	public static int countDs(String s) {
		//method name: countDs
		//method type: 4 ->return data is int, param is String s
		
		//use a for loop
		
		int dCount = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'd' || s.charAt(i) == 'D'){
				dCount++;
			}
		}
		return dCount;
	}
}

/*
Create a function that counts how many D's are in a sentence.
Examples
countDs("My friend Dylan got distracted in school.") ➞ 4
countDs("Debris was scattered all over the yard.") ➞ 3
countDs("The rodents hibernated in their den.") ➞ 3
*/







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class FourthLetter {
	public static int countDs(String s) {
		char [] toCharArray = s.toCharArray();
		int result = 0;
	  for(int i = 0; i < toCharArray.length;i++) {
		 switch(toCharArray[i]) {
		 case 'D':
			 result += 1;
			 break;
		 case 'd':
			 result += 1;
			 break;
		 }
	  }
	  return result;
	}
}