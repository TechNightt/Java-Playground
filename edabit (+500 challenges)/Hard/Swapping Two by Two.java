/*********************************************************************************************************************
 Swapping Two by Two

Write a function that swaps the first pair (1st and 2nd characters) with the second pair (3rd and 4th characters) for every quadruplet substring.

Examples
swapTwo("ABCDEFGH") ➞ "CDABGHEF"

swapTwo("AABBCCDDEEFF") ➞ "BBAADDCCFFEE"

swapTwo("munchkins") ➞ "ncmuinhks"

swapTwo("FFGGHHI") ➞ "GGFFHHI"

Notes
Keep leftover strings in the same order.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.*;
import java.util.stream.*;
public class Challenge {
	public static String swapTwo(String str) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < str.length(); i += 4) {
            try {
                stringList.add(str.substring(i, i + 4));
            } catch (IndexOutOfBoundsException e) {
                stringList.add(str.substring(i));
            }
        }
        return stringList.stream()
                .map(s -> {
                    if (s.length() == 4) {
                        return s.substring(2) + s.substring(0, 2);
                    } else {
                        return s;
                    }
                })
                .collect(Collectors.joining());
    }
}





//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Challenge {
	public static String swapTwo(String s)
  {
    Pattern p = Pattern.compile("[a-zA-z]{1,2}");
    Matcher m = p.matcher(s);

    List<String> allMatches = new ArrayList<>();
    while(m.find())
    {
      allMatches.add(m.group());
    }
    
    String[] A = allMatches.toArray(new String[0]);
    for(int i = 1; i < A.length; i+=2)
    {
      if(A[i].length() == 2)
      {
        String tmp = A[i];
        A[i] = A[i-1];
        A[i-1] = tmp;
      }
    }

		return String.join("",Arrays.asList(A));
	}
}




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String swapTwo(String str) {
		StringBuilder swapped = new StringBuilder();
		int length;
		length = str.length()%4 != 0 ?  (str.length()/4)*4: str.length();
			for (int i = 0 ; i < length; i+= 4){
				swapped.append(str.substring (i+2, i+4) + str.substring(i+0, i+2));
			}
			swapped.append ( str.length() %4 != 0 ? "" +str.substring((str.length()/4)*4, str.length()) : "");
		return swapped.toString();
	}
}





//#############################################################
//#                        MY SOLUTION 4



import java.util.*;

public class Challenge {
	public static String swapTwo(String str) {
		ArrayList<String> list = new ArrayList<>(); String news = "";
		for (int i = 0; i < str.length() - 3; i += 4) {
			list.add(str.substring(i, i + 4));
		}
		for (String quad : list) {
			news += quad.substring(2, 4) + quad.substring(0, 2);
		}
		return news + str.substring(str.length() - (str.length() % 4));
	}
}