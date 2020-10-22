/*********************************************************************************************************************
 Index Filtering

Create a function that takes two inputs: idx (an array of integers) and str (a string). The function should return another string with the letters of str at each index in idx in order.

Examples
indexFilter([2, 3, 8, 11], "Autumn in New York") ➞ "tune"

indexFilter([0, 1, 5, 7, 4, 2], "Cry me a river") ➞ "creamy"

indexFilter([9, -9, 2, 27, 36, 6, 5, 13, -1, 2, 0, 30, 2], 
  "That's life, I've got you under my skin") ➞ "frank sinatra"

  Notes
Indexes may not be in order or may be negative (see example #2 and #3).
The output string must always be lowercase, but the input str may not be (see examples).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class StringIndexes {
	public static String indexFilter(int[] x, String s) {
		return IntStream.of(x).mapToObj(i -> String.valueOf(s.toLowerCase()
			.charAt(i < 0 ? s.length() + i : i))).reduce(String::concat).get();
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class StringIndexes {
	public static String indexFilter(int[] idx, String str) {
		StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        String[] res = new String[idx.length];
        for (int i = 0; i < res.length; i++) {
            if (idx[i] >= 0) {
                res[i] = str.charAt(idx[i]) + "";
            } else {

                res[i]=reverse.charAt(Math.abs(idx[i]+1))+"";
            }
        }
        

        return String.join("", res).toLowerCase();

	}	
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class StringIndexes {
	public static String indexFilter(int[] idx, String str) {
		String s = "";
		for (int each : idx) {
			if (each >= 0) {
				s += str.charAt(each);
			} else {
				s += str.charAt(str.length() + each);
			}
		}
		return s.toLowerCase();
	}
}


