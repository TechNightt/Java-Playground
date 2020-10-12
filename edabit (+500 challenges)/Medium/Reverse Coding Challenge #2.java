/*********************************************************************************************************************
 Reverse Coding Challenge #2

This is a reverse coding challenge.

Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.

Examples
3 ➞ 21

9 ➞ 2221

17 ➞ 22221

24 ➞ 22228

Notes
If you get stuck, check the Comments for help.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Collections;
public class Challenge {
	public static int mysteryFunc(int num) {
		int exp = (int)Math.sqrt(num);
		return Integer.parseInt(repeat("2", exp) + num % (int)Math.pow(2, exp));
  }
	
	//or use repeat() method of String class with java 11
	private static String repeat(String str, int length) {
		return String.join("", Collections.nCopies(length, str));
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static int mysteryFunc(int num) {
		int i = 0;
		while ((int)Math.pow(2, i) < num){
			i++;
		}
		i--;
		String resS = "";
		for (int j = 0; j < i; j++){
			resS += "2";
		}
		//if ((int)Math.pow(2, i) != num) return Integer.parseInt(resS);
		int last = num - (int)Math.pow(2, i);
		resS = resS + last + "";
		return Integer.parseInt(resS);
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int mysteryFunc(int num) {
		if(num == 1)
			return 1;
		return Integer.parseInt(makeStr(num));
  }
	private static String makeStr(int num){
		String result = "";
		int value = 2,temp;
		while(value <= num){
			value *= 2;
			result += "2";
		}
		temp = num - (value/2);
		if(temp == 0)
			return result;
		return result+temp;
	}
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int mysteryFunc(int num) {
		int result = 0;
		int i;
		for(i = 0; 2 << i < num; i++){
			result += 2;
			result *= 10;
		}
		
		return result + num % (1 << i);
  }
}