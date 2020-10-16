/*********************************************************************************************************************
 
Sort Numbers in Descending Order

Create a function that takes any non-negative number as an argument and return it with it's digits in descending order. Descending order is when you sort from highest to lowest.

Examples
sortDesc(123) ➞ 321

sortDesc(1254859723) ➞ 9875543221

sortDesc(73065) ➞ 76530

Notes
You can expect non-negative numbers for all test cases.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
  public static int sortDesc(final int num) {
  	return Integer.parseInt(
      Integer.toString(num)
      .chars()
      .mapToObj(c->Character.toString((char)c))
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.joining()));
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
  	
		String s = "" + num;
		
		char[] c = s.toCharArray();
		
		Arrays.sort(c);
		
		String str = "";
		
		for(int k = c.length - 1; k >= 0; k--) {
			str += c[k];
		}
		
		return Integer.parseInt(str);
  }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
  	String number = String.valueOf(num);
    ArrayList<String> strList = new ArrayList<>();
    
    for(int i=0; i<number.length(); i++) {
      strList.add(number.substring(i,i+1));
    }
    
    Collections.sort(strList, Collections.reverseOrder());
    
    String finalStr = "";
    for(String str: strList)
      finalStr += str;
    
    return Integer.parseInt(finalStr);
  }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.Comparator;
import java.util.stream.Stream;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    Stream<Character> stream = String.valueOf(num).chars().mapToObj(c -> (char) c);
    StringBuilder sb = stream.sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

    return Integer.valueOf(sb.toString());
  }
}