/*********************************************************************************************************************
 
Reverse the Number
Create a function that takes an integer n and reverses it.

Examples
rev(5121) ➞ "1215"

rev(69) ➞ "96"

rev(-122157) ➞ "751221"

Notes
This challenge is about using two operators that are related to division.
If the number is negative, treat it like it's positive.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String rev(int n) {
		int reversenum = 0;
		if (n < 0) n = n *-1;
		while( n != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + n%10;
          n = n/10;
      }		
		
		return Integer.toString(reversenum);
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String rev(int chislo) {
		 String Stroka=Integer.toString(chislo);
       String Strokanaoborot="";
       for (int i=(Stroka.length()-1);i>0;i--){
            Strokanaoborot=Strokanaoborot+Stroka.charAt(i);
         }
       if (Stroka.charAt(0) != '-')  Strokanaoborot=Strokanaoborot+Stroka.charAt(0);
         return Strokanaoborot;
	}
}







//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String rev(int n) {
		char[] numberAsCharArr = (new Integer(Math.abs(n))).toString().toCharArray();
		int j = 0, a = numberAsCharArr.length;
		char temp;
		
		for(int i  = 0; i < a; i++){
			j = a - 1 - i;
		
			if(j < i)
				break;
			
			temp = numberAsCharArr[i];
			numberAsCharArr[i] = numberAsCharArr[j];
			numberAsCharArr[j] = temp;
			
		}
		
		return String.copyValueOf(numberAsCharArr);
	}
}



