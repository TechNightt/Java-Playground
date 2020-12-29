/*********************************************************************************************************************
 Express Number in Expanded Notation

Create a function that takes a number and return a string with the number in expanded notation (AKA expanded form). See the resources tab for details on expanded notation.

Examples
expand(13) ➞ "10 + 3"

expand(86) ➞ "80 + 6"

expand(17000000) ➞ "10000000 + 7000000"

expand(5325) ➞ "5000 + 300 + 20 + 5"

Notes
You can expect only whole numbers greater than 0 as test input.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String expand(long num) {
		return((num < 10)?""+num:(((long)(num / ((long)Math.pow(10, (int)Math.log10(num))))) * ((long)Math.pow(10, (int)Math.log10(num)))+((num%((long)Math.pow(10, (int)Math.log10(num))) <=0)?"":(" + "+expand(num%((long)Math.pow(10, (int)Math.log10(num))))))));
	}
}



//#############################################################
//#                        MY SOLUTION 2   



import java.math.*;
public class Challenge {
	public static String expand(long num) {
	  String result = "";
		BigInteger count = new BigInteger("1") ;
		BigInteger a,b,mult;
		while( num > 0 ){
			long d = num%10;
			if(d!=0){
				   a = new BigInteger(String.valueOf(d)); 
           b = new BigInteger(String.valueOf(count));
				   mult = a.multiply(b);
					 result = "+ " + mult + " " + result ;
			}
			count = count.multiply(new BigInteger("10"));
			num /= 10;
		}
		return result.substring(1).trim();
	}
	
}



//#############################################################
//#                        MY SOLUTION 3   



import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
public class Challenge {
	public static String expand(long  num) {
		String[] numStrArr=String.valueOf(num).split("");
		AtomicInteger index = new AtomicInteger(); 
		Object[] obArr=Arrays.stream(numStrArr).map(x->Long.parseLong(x)*(long) Math.pow(10,numStrArr.length-index.getAndIncrement()-1)).filter(x->x>0).map(y->String.valueOf(y)).toArray();
		String[] strings = Arrays.asList(obArr).toArray(new String[obArr.length]);
		return String.join(" + ", strings);
	}
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String expand(long num) {
		String string=Long.toString(num);
			String new_string="";
			Long num1=0L;
			Long sum=0L;
			
			for (int i = 0; i < string.length(); i++) {
				
				int num2=Integer.parseInt(String.valueOf(string.charAt(i)));
				String padded=padStr(1,"0",string.length()-i);
				num1=((Long.parseLong(padded))*num2);
				//System.out.println(num1);
				sum+=num1;
				if(sum<=num && num2!=0)
				new_string+=Long.toString(num1)+" + ";
			}
			
			
			//return new_string.replaceAll(". $", "");
			return new_string.substring(0, new_string.length()-3);
			
		}
		
		public static String padStr(int val, String pad, int len) {
			  String str = Integer.toString(val);
			  while (str.length() < len)
			    str = str + pad;
			  return str;
			}

}