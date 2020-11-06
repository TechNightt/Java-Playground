/*********************************************************************************************************************
 Apocalyptic Numbers

In this challenge, you have to establish if a number is apocalyptic. A positive integer n greater than 0 is apocalyptic when 2 elevated to n contains one or more occurrences of 666 into it.

Given an integer n, implement a function that returns:

"Safe" if n is not apocalyptic.
"Single" if into 2^n there's a single occurence of 666.
"Double" if into 2^n there are two occurences of 666.
"Triple" if into 2^n there are three occurences of 666.
Examples
isApocalyptic(66) ➞ "Safe"
// 2^66 = 73786976294838206464

isApocalyptic(157) ➞ "Single"
// 2^157 =
// 182687704|666|362864775460604089535377456991567872

isApocalyptic(220) ➞ "Double"
// 2^220 =
// 168499|666|66969149871|666|8844293872691710232152640 ...

isApocalyptic(931) ➞ "Triple"
// 2^931 =
// 181520618710|666|8777829|666|135436890332191479738353753001777065257954029122510259245050254290156440857653562895251700406555730694879815558725330603736697259064676478076718090|666| ...

Notes
Any given n will be a positive integer in the range of 1 to 1000.
Occurrences have to be unique, you can't use digits that have already been matched again (see example #3, there are five adjacent 6, but only a possible match).
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.math.BigDecimal;
public class Challenge {
	public static String isApocalyptic(int num) {
		int count =  ("" + new BigDecimal(Math.pow(2, num))).split("666").length - 1;
		return count == 0 ? "Safe" : count == 1 ? "Single" : count == 2 ? "Double" : "Triple";
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.math.BigInteger;

public class Challenge {
	public static String isApocalyptic(int number) {
		String result = new BigInteger("2").pow(number).toString();
		int length = result.length();
		int counter = (length - result.replaceAll("666", "").length()) / 3;
		switch (counter) {
			case 1: return "Single";
			case 2: return "Double";
			case 3: return "Triple";
			default: return "Safe";
		}
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.math.*;
public class Challenge {
	public static String isApocalyptic(int number) {
		
		BigDecimal bd = new BigDecimal(2);
		bd=bd.pow(number);
		String s = bd.toString();
		String[] s1 = s.split("666");
		if (s1.length == 4) {
			return "Triple";
		} else if (s1.length == 3) {
			return "Double";
		} else if (s1.length == 2) {
			return "Single";
		} else if (s1.length == 1) {
			return "Safe";
		}
		return "";

	
	}
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.math.BigDecimal;
public class Challenge {
	public static String isApocalyptic(int number) {
		BigDecimal bd = new BigDecimal(2);
		String num = bd.pow(number) + "";
		int counter = 0;
		for (int i = 0; i < num.length();) {
			int index = num.indexOf("666", i);
			if (index != -1) { // has been found
				counter++;
				i += index + 3; // update index
			} else {
				break;
			}
		}
		return counter == 3 ? "Triple" : 
		counter == 2 ? "Double" : 
		counter == 1 ? "Single" : "Safe";
	}
}



//#############################################################
//#                        MY SOLUTION 5
//#############################################################


import java.math.BigInteger;
public class Challenge {
	public static String isApocalyptic(int number) {
		BigInteger bigInteger = BigInteger.valueOf(2).pow(number);
		 String str = bigInteger.toString();
		 int count = 0;
		 while(str.indexOf("666") != -1) {
		     str = str.substring(str.indexOf("666")+3, str.length());
		     count++;
		 }
		 return count == 3 ? "Triple" : count == 2 ? "Double" : count == 1 ? "Single" : "Safe";
	}
}