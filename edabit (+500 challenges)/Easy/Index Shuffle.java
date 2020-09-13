/*********************************************************************************************************************
 Index Shuffle

Write a function that takes all even-indexed characters and odd-indexed characters from a string and concatenates them together.

To illustrate:

indexShuffle("abcd") ➞ "acbd"
// "ac" (even-indexed) + "bd" (odd-indexed)
Examples
indexShuffle("abcdefg") ➞ "acegbdf"

indexShuffle("holiday") ➞ "hldyoia"

indexShuffle("maybe") ➞ "myeab"

Notes
0 should be treated as an even number.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String indexShuffle(String str) {
		String e = "";
		String o = "";
		
		for (int i = 0 ; i < str.length() ; i++) {
			if (i%2==0) {
				e += str.charAt(i);
			} else {
				o += str.charAt(i);
			}
		}
		
		return e+o;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String indexShuffle(String str) {
		 String evenIndexed = "";
        String oddIndeded = "";
        for (int i = 0; i <str.length() ; i++) {
            if(isEven(i)){
                evenIndexed= evenIndexed+str.charAt(i);
            }else{
                oddIndeded = oddIndeded+str.charAt(i);
            }
        }
        return evenIndexed+oddIndeded;
	}
	   public static boolean isEven(int n){
        if(n%2==0 ){
            return true;
        }else {
            return false;
        }
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String indexShuffle(String str) {
		StringBuilder sb1 = new StringBuilder();
		 StringBuilder sb2 = new StringBuilder();
		 
		 for(int i = 0; i < str.length(); i++) {
			 if(i % 2 == 0) {
				 sb1.append(str.charAt(i));
			 }else {
				 sb2.append(str.charAt(i));
			 }
		 }
		 return sb1.toString().concat(sb2.toString());
	}
}




//#############################################################
//#                        MY SOLUTION 4


import java.util.stream.IntStream;
public class Challenge {
	public static String indexShuffle(String str) {
		return filterString(str) + filterString(str.substring(1));
	}
	
	private static String filterString(String s) {
		return IntStream.range(0, s.length())
			.filter(i -> i % 2 == 0)
			.map(i -> s.charAt(i))
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString();
	}
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String indexShuffle(String str) {
		if(str == null || str.length() < 2) return str;
		return getString(str, 0) + getString(str, 1);
	}
	
	public static String getString(String s, int from) {
		StringBuilder sb = new StringBuilder();
		for (int i = from; i < s.length(); i += 2) 
			sb.append(s.charAt(i));
		return sb.toString();
	}
}