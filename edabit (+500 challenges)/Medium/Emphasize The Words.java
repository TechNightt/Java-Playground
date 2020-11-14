/*********************************************************************************************************************
 Emphasize The Words

Create a function that returns a capitalized version of the string passed. The first letter of each word in the string should be capitalized while the rest should be in lowercase.

Examples
emphasize("hello world!") ➞ "Hello World!"

emphasize("GOOD MORNING!") ➞ "Good Morning!"

emphasize("I AM, BUT aLL yOuRs, TESH!")  ➞ "I Am, But All Yours, Tesh!"

emphasize("99 red balloons!") ➞ "99 Red Balloons!"

Notes
You won't run into any issues when dealing with numbers in strings.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.Stream;
public class WordEmphasis {
  public static String emphasize(String str) {
		if(str.equals("")) return str;
  	return Stream.of(str.toLowerCase().split(" "))
			.map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
			.reduce("", (a, b) -> a + " " + b)
			.trim();
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class WordEmphasis {
    public static String emphasize(String str) {
          if (str == null || str.isEmpty()) return str;
          
          StringBuilder sb = new StringBuilder(str.length());
          for (String word : str.split("\\s+")) {
              sb.append(Character.toUpperCase(word.charAt(0)));
              sb.append(word.substring(1).toLowerCase() + " ");
          }
          return sb.toString().trim();
      }
  }



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
import java.util.stream.*;
public class WordEmphasis {
  public static String emphasize(String str) {
		if(str.length()<1){
			return str;
		}
		
		return Arrays.stream(str.split(" "))
                .map(x-> x.substring(0,1).toUpperCase() + x.substring(1,x.length()).toLowerCase())
                .collect(Collectors.joining(" "));
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class WordEmphasis {
    public static String emphasize(String str) {
          if(str=="") return "";
          String[]x=str.split(" ");
          String y="";
          for(String s:x)y=y+s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()+" ";
      return y.trim();
      }
  }